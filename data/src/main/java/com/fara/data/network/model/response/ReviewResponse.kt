package com.fara.data.network.model.response

data class ReviewResponse(
    val comment: String?,
    val date: String?,
    val rating: Int?,
    val reviewerEmail: String?,
    val reviewerName: String?
)