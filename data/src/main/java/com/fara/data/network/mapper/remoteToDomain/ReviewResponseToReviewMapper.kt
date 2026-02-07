package com.fara.data.network.mapper.remoteToDomain

import com.fara.data.network.model.response.ReviewResponse
import com.fara.domain.model.response.Review

internal class ReviewResponseToReviewMapper : (ReviewResponse?) -> Review {

    override fun invoke(reviewResponse: ReviewResponse?): Review {
        return Review(
            comment = reviewResponse?.comment,
            date = reviewResponse?.date,
            rating = reviewResponse?.rating,
            reviewerEmail = reviewResponse?.reviewerEmail,
            reviewerName = reviewResponse?.reviewerName,
        )
    }
}