package com.fara.domain.usecase.products.getProducts

import com.fara.domain.model.response.Products

interface GetProductsUseCase {

    suspend operator fun invoke(): Result<Products>
}