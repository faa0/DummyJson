package com.fara.presentation.ui.screen.home

import androidx.lifecycle.viewModelScope
import com.fara.domain.usecase.products.getProducts.GetProductsUseCase
import com.fara.presentation.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

internal class HomeViewModelImpl(
    val getProductsUseCase: GetProductsUseCase,
) : HomeViewModel() {

    private val _uiState = MutableStateFlow(HomeState())
    override val uiState: StateFlow<HomeState> = _uiState

    private val _error = MutableSharedFlow<Int>()
    override val error: SharedFlow<Int> = _error

    override fun getProducts() {
        viewModelScope.launch(Dispatchers.IO) {
            getProductsUseCase().fold(
                onSuccess = { products ->
                    _uiState.update { it.copy(products = products.products ?: emptyList()) }
                },
                onFailure = {
                    _error.emit(R.string.oops)
                },
            )
        }
    }
}