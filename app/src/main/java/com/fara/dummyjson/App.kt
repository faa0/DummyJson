package com.fara.dummyjson

import android.app.Application
import cafe.adriel.voyager.core.registry.ScreenRegistry
import com.fara.dummyjson.di.component.main.appComponent
import com.fara.presentation.navigation.navigationCoordinator
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level

internal class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initAppComponent()
        initGlobalNavigation()
    }

    private fun initAppComponent() {
        startKoin {
            androidContext(this@App)
            androidLogger(level = Level.ERROR)
            modules(appComponent)
        }
    }

    private fun initGlobalNavigation() {
        ScreenRegistry {
            navigationCoordinator()
        }
    }
}