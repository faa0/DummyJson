package com.fara.data.network.mapper.remoteToDomain

import com.fara.data.network.model.response.ProductsResponse
import com.fara.domain.model.response.Products

internal class ProductsResponseToProductsMapper : (ProductsResponse?) -> Products {

    override fun invoke(productsResponse: ProductsResponse?): Products {
        return Products(
            products = productsResponse?.products?.map(ProductResponseToProductMapper())
        )
    }
}