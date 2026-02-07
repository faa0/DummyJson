package com.fara.presentation.ui.screen.home

import com.fara.presentation.ui.base.BaseViewModel
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow

internal abstract class HomeViewModel : BaseViewModel() {

    abstract val uiState: StateFlow<HomeState>
    abstract val error: SharedFlow<Int>

    abstract fun getProducts()
}