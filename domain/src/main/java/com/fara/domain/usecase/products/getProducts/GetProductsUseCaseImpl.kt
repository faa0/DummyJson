package com.fara.domain.usecase.products.getProducts

import com.fara.domain.model.response.Products
import com.fara.domain.repository.ProductsRepository

internal class GetProductsUseCaseImpl(
    private val repository: ProductsRepository
): GetProductsUseCase {

    override suspend fun invoke(): Result<Products> {
        return repository.getProducts()
    }
}