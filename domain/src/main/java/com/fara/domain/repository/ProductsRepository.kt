package com.fara.domain.repository

import com.fara.domain.model.response.Products

interface ProductsRepository {

    suspend fun getProducts(): Result<Products>
}