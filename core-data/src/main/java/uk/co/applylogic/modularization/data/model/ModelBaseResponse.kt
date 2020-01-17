package uk.co.applylogic.modularization.data.model

data class ModelBaseResponse(
    val code: Int?,
    val status: String?,
    val copyright: String?,
    val attributionText: String?,
    val attributionHTML: String?,
    val etag: String?,
    val data: ModelData?
)

data class ModelData(
    val offset: Int?,
    val limit: Int?,
    val total: Int?,
    val count: Int?,
    val results: ArrayList<ModelResult>?
)

data class ModelResult(
    val id: Int?,
    val digitalId: Int?,
    val title: String?,
    val issueNumber: Int?,
    val description: String?,
    val thumbnail: ModelThumbnail?
)

data class ModelThumbnail(
    val path: String?,
    val extension: String?
)


