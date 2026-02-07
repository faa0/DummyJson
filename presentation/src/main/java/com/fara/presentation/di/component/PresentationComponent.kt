package com.fara.presentation.di.component

import com.fara.domain.di.compoenent.domainComponent
import com.fara.presentation.di.module.viewModelModule
import org.koin.core.module.Module

val presentationComponent = mutableListOf<Module>().apply {
    addAll(domainComponent)
    add(viewModelModule)
}