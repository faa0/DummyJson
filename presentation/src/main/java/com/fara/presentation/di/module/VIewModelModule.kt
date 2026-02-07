package com.fara.presentation.di.module

import com.fara.presentation.ui.screen.home.HomeViewModel
import com.fara.presentation.ui.screen.home.HomeViewModelImpl
import org.koin.dsl.module

internal val viewModelModule = module {

    factory<HomeViewModel> { HomeViewModelImpl(get()) }
}