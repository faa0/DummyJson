package com.fara.data.network.mapper.remoteToDomain

import com.fara.data.network.model.response.ProductResponse
import com.fara.domain.model.response.Product

internal class ProductResponseToProductMapper : (ProductResponse?) -> Product {

    override fun invoke(productResponse: ProductResponse?): Product {
        return Product(
            availabilityStatus = productResponse?.availabilityStatus,
            brand = productResponse?.brand,
            category = productResponse?.category,
            description = productResponse?.description,
            dimensions = productResponse?.dimensions?.run(DimensionsResponseToDimensionsMapper()),
            discountPercentage = productResponse?.discountPercentage,
            id = productResponse?.id,
            images = productResponse?.images,
            minimumOrderQuantity = productResponse?.minimumOrderQuantity,
            price = productResponse?.price,
            rating = productResponse?.rating,
            returnPolicy = productResponse?.returnPolicy,
            reviews = productResponse?.reviews?.map(ReviewResponseToReviewMapper()),
            shippingInformation = productResponse?.shippingInformation,
            sku = productResponse?.sku,
            stock = productResponse?.stock,
            tags = productResponse?.tags,
            thumbnail = productResponse?.thumbnail,
            title = productResponse?.title,
            warrantyInformation = productResponse?.warrantyInformation,
            weight = productResponse?.weight
        )
    }
}