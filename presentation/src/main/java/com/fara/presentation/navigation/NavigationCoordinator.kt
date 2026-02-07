package com.fara.presentation.navigation

import cafe.adriel.voyager.core.registry.screenModule
import com.fara.presentation.ui.screen.home.HomeScreen

val navigationCoordinator = screenModule {
    register<SharedScreen.HomeScreen> { HomeScreen() }
}