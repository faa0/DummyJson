package com.fara.data.di.component

import com.fara.data.di.module.networkModule
import com.fara.data.di.module.remoteMapperModule
import com.fara.data.di.module.repositoryModule
import com.fara.domain.di.compoenent.domainComponent
import org.koin.core.module.Module

val dataComponent = mutableListOf<Module>().apply {
    addAll(domainComponent)
    add(networkModule)
    add(remoteMapperModule)
    add(repositoryModule)
}