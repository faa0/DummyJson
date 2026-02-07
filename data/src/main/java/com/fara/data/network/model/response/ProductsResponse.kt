package com.fara.data.network.model.response

data class ProductsResponse(
    val limit: Int?,
    val products: List<ProductResponse?>?,
    val skip: Int?,
    val total: Int?
)