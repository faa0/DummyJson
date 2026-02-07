package com.fara.data.di.module

import com.fara.data.network.mapper.remoteToDomain.DimensionsResponseToDimensionsMapper
import com.fara.data.network.mapper.remoteToDomain.ProductResponseToProductMapper
import com.fara.data.network.mapper.remoteToDomain.ProductsResponseToProductsMapper
import com.fara.data.network.mapper.remoteToDomain.ReviewResponseToReviewMapper
import org.koin.dsl.module

internal val remoteMapperModule = module {
    factory { DimensionsResponseToDimensionsMapper() }
    factory { ProductResponseToProductMapper() }
    factory { ProductsResponseToProductsMapper() }
    factory { ReviewResponseToReviewMapper() }
}