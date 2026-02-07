package com.fara.domain.di.compoenent

import com.fara.domain.di.module.useCaseModule
import org.koin.core.module.Module

val domainComponent = mutableListOf<Module>().apply {
    add(useCaseModule)
}