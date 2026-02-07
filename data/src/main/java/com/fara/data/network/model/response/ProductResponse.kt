package com.fara.data.network.model.response

data class ProductResponse(
    val availabilityStatus: String?,
    val brand: String?,
    val category: String?,
    val description: String?,
    val dimensions: DimensionsResponse?,
    val discountPercentage: Double?,
    val id: Int?,
    val images: List<String?>?,
    val meta: MetaResponse?,
    val minimumOrderQuantity: Int?,
    val price: Double?,
    val rating: Double?,
    val returnPolicy: String?,
    val reviews: List<ReviewResponse?>?,
    val shippingInformation: String?,
    val sku: String?,
    val stock: Int?,
    val tags: List<String?>?,
    val thumbnail: String?,
    val title: String?,
    val warrantyInformation: String?,
    val weight: Int?
)