package com.fara.data.di.module

import com.fara.data.network.repository.ProductsRepositoryImpl
import com.fara.domain.repository.ProductsRepository
import org.koin.dsl.module

internal val repositoryModule = module {
    factory<ProductsRepository> { ProductsRepositoryImpl(get(), get()) }
}