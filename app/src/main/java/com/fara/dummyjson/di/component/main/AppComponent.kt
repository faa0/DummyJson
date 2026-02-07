package com.fara.dummyjson.di.component.main

import com.fara.data.di.component.dataComponent
import com.fara.presentation.di.component.presentationComponent
import org.koin.core.module.Module

val appComponent = mutableListOf<Module>().apply {
    addAll(presentationComponent)
    addAll(dataComponent)
}