package com.example.data.remote.datasource

import android.util.Log
import com.example.data.remote.api.ReviewApi
import com.example.data.remote.request.toRequest
import com.example.data.remote.response.toEntity
import com.example.data.remote.util.miTalkApiCall
import com.example.domain.entity.CheckReviewStateEntity
import com.example.domain.param.ReviewParam
import java.util.*
import javax.inject.Inject

class RemoteReviewDataSourceImpl @Inject constructor(
    private val reviewApi: ReviewApi
) : RemoteReviewDataSource {
    override suspend fun postReview(reviewParam: ReviewParam) = miTalkApiCall {
        reviewApi.postReview(reviewParam.toRequest())
    }

    override suspend fun checkReviewState(): CheckReviewStateEntity = miTalkApiCall {
        reviewApi.checkReviewState().toEntity()
    }
}