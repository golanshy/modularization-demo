package uk.co.applylogic.modularization.data.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uk.co.applylogic.modularization.data.di.scope.ContentRetrofit
import uk.co.applylogic.modularization.data.interceptors.CacheInterceptor
import uk.co.applylogic.modularization.data.interceptors.NonAuthInterceptor
import uk.co.applylogic.modularization.android.handler.NetworkErrorHandler
import uk.co.applylogic.modularization.android.handler.NetworkErrorHandlerInterface
import uk.co.applylogic.modularization.data.BuildConfig
import uk.co.applylogic.modularization.data.repository.ContentInterface
import uk.co.applylogic.modularization.data.repository.ContentRepository
import uk.co.applylogic.modularization.data.repository.ContentRepositoryContract
import uk.co.applylogic.modularization.data.di.qualifier.HttpCache
import uk.co.applylogic.modularization.data.di.qualifier.HttpLogging
import uk.co.applylogic.modularization.data.di.qualifier.UnauthorizedInterceptor
import uk.co.applylogic.modularization.data.di.qualifier.UnauthorizedOkHttpClient

import java.io.File
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

const val TEN_MB: Long = 10 * 1024 * 1024
const val BASE_URL: String = "https//api.your-domain.com"

@Module
class NetworkModule(val context: Context) {

    @Provides
    @Singleton
    internal fun provideContext(): Context {
        return context
    }

    @Provides
    @Singleton
    internal fun provideNetworkErrorHandler(context: Context): NetworkErrorHandlerInterface {
        return NetworkErrorHandler(context)
    }

    @Provides
    @Singleton
    internal fun provideContentRepository(): ContentRepositoryContract {
        return ContentRepository()
    }

    @Provides
    @Singleton
    fun provideContentInterface(@ContentRetrofit retrofit: Retrofit): ContentInterface {
        return retrofit.create(ContentInterface::class.java)
    }

    @Provides
    @Singleton
    @ContentRetrofit
    fun provideRetrofit(@UnauthorizedOkHttpClient okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    @UnauthorizedOkHttpClient
    internal fun provideOkHttpClient(
        @HttpLogging logger: HttpLoggingInterceptor,
        @UnauthorizedInterceptor unAuthorizedInterceptor: NonAuthInterceptor,
        @Named("cache_interceptor") cacheInterceptor: CacheInterceptor,
        @HttpCache cache: Cache?
    ): OkHttpClient {
        return getOkHttpClient(
            logger, unAuthorizedInterceptor, cacheInterceptor, cache
        )
    }

    private fun getOkHttpClient(
        logger: HttpLoggingInterceptor,
        unAuthorizedInterceptor: NonAuthInterceptor,
        cacheInterceptor: CacheInterceptor,
        cache: Cache?
    ): OkHttpClient {

        val okHttpBuilder = OkHttpClient.Builder()
        okHttpBuilder
            .addInterceptor(unAuthorizedInterceptor)
            .addInterceptor(cacheInterceptor)
            .connectTimeout(20, TimeUnit.SECONDS)
            .readTimeout(20, TimeUnit.SECONDS)
            .writeTimeout(20, TimeUnit.SECONDS)
            .followRedirects(true)
            .followSslRedirects(true)
            .retryOnConnectionFailure(true)

        if (BuildConfig.DEBUG) {
            okHttpBuilder.addInterceptor(logger)
        }
        return okHttpBuilder.build().newBuilder().cache(cache).build()
    }

    @Provides
    @Singleton
    @UnauthorizedInterceptor
    internal fun provideNonAuthInterceptor(): NonAuthInterceptor {
        return NonAuthInterceptor()
    }

    @Provides
    @Singleton
    @HttpCache
    internal fun provideCache(): Cache? {
        try {
            return Cache(File(context.cacheDir, "http-cache"), TEN_MB)
        } catch (e: RuntimeException) {
            e.printStackTrace()
        }
        return null
    }

    @Provides
    @Singleton
    @HttpLogging
    internal fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
        val logger = HttpLoggingInterceptor()
        logger.level = HttpLoggingInterceptor.Level.BODY
        return logger
    }


    @Provides
    @Singleton
    @Named("cache_interceptor")
    internal fun provideCacheInterceptor(): CacheInterceptor {
        return CacheInterceptor(context)
    }
}
