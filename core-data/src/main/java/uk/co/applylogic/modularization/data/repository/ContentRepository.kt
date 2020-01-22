package uk.co.applylogic.modularization.data.repository

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import uk.co.applylogic.modularization.data.model.ModelData
import uk.co.applylogic.modularization.data.model.ModelBaseResponse

interface ContentInterface {
    @GET("v1/public/comics")
    suspend fun getContent(@Query("title") title: String?): Response<ModelBaseResponse>?
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

