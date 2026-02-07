package com.fara.presentation.navigation

import cafe.adriel.voyager.core.registry.ScreenProvider

sealed class SharedScreen : ScreenProvider {
    object HomeScreen : SharedScreen()
}