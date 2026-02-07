package com.fara.domain.di.module

import com.fara.domain.usecase.products.getProducts.GetProductsUseCase
import com.fara.domain.usecase.products.getProducts.GetProductsUseCaseImpl
import org.koin.dsl.module

internal val useCaseModule = module {

    factory<GetProductsUseCase> { GetProductsUseCaseImpl(get()) }
}