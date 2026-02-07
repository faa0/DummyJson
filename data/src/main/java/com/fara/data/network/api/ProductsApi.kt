package com.fara.data.network.api

import com.fara.data.network.model.response.ProductsResponse
import retrofit2.http.GET

internal interface ProductsApi {

    @GET(ProductsNetwork.GET_PRODUCTS)
    suspend fun getProducts(): ProductsResponse
}