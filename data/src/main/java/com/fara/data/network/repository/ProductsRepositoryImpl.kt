package com.fara.data.network.repository

import com.fara.data.network.api.ProductsApi
import com.fara.data.network.mapper.remoteToDomain.ProductsResponseToProductsMapper
import com.fara.data.network.utils.safeApiCall
import com.fara.domain.model.response.Products
import com.fara.domain.repository.ProductsRepository

internal class ProductsRepositoryImpl(
    private val productsApi: ProductsApi,
    private val productsResponseToProductsMapper: ProductsResponseToProductsMapper,
) : ProductsRepository {

    override suspend fun getProducts(): Result<Products> {
        return safeApiCall {
            Result.success(productsApi.getProducts().run(productsResponseToProductsMapper))
        }
    }
}