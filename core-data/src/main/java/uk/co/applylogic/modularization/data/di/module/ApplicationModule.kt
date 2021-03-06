package uk.co.applylogic.modularization.data.di.module

import android.app.Application
import android.content.Context
import uk.co.applylogic.modularization.data.di.qualifier.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val context: Context) {

    @Provides
    @Singleton
    @ApplicationContext
    fun provideContext(): Context {
        return context
    }

    @Provides
    @Singleton
    internal fun provideApplicationContext(): Application {
        return context.applicationContext as Application
    }
}
