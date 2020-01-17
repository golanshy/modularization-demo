package uk.co.applylogic.modularization.data.repository

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import uk.co.applylogic.modularization.android.ktx.md5
import uk.co.applylogic.modularization.data.BuildConfig
import uk.co.applylogic.modularization.data.model.ModelData
import uk.co.applylogic.modularization.data.model.ModelBaseResponse

const val LOAD_SIZE = 25
const val TS = "1" // Force const timestamp to allow http caching

interface ContentInterface {

    @GET("v1/public/comics")
    suspend fun getContent(
        @Query("ts") ts: String = TS,
        @Query("apikey") apikey: String = BuildConfig.MARVEL_PUBLIC_API_KEY,
        @Query("hash") hash: String =
            "$ts${BuildConfig.MARVEL_PRIVATE_API_KEY}${BuildConfig.MARVEL_PUBLIC_API_KEY}".md5(),
        @Query("limit") limit: Int = LOAD_SIZE,
        @Query("offset") offset: Int,
        @Query("title") title: String?,
        @Query("orderBy") orderBy: String? = "-onsaleDate"
    )
            : Response<ModelBaseResponse>?

    @GET("v1/public/comics/{comicId}")
    suspend fun getComicById(
        @Path("comicId") comicId: Int?,
        @Query("ts") ts: String = TS,
        @Query("apikey") apikey: String = BuildConfig.MARVEL_PUBLIC_API_KEY,
        @Query("hash") hash: String =
            "$ts${BuildConfig.MARVEL_PRIVATE_API_KEY}${BuildConfig.MARVEL_PUBLIC_API_KEY}".md5()
    )
            : Response<ModelBaseResponse>?
}

interface ContentRepositoryContract {
    suspend fun cacheContent(data:ModelData?)
    suspend fun getCachedContent(): ModelData?
    suspend fun getCachedContentById(comicId: Int): ModelData?
}

class ContentRepository : ContentRepositoryContract {

    override suspend fun cacheContent(data: ModelData?) {
    }

    override suspend fun getCachedContent(): ModelData? {
        return null
    }

    override suspend fun getCachedContentById(comicId: Int): ModelData? {
        return null
    }
}

