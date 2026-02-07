package com.fara.presentation.ui.screen.home

import androidx.compose.runtime.Immutable
import com.fara.domain.model.response.Product

@Immutable
data class HomeState(
    val products: List<Product?> = emptyList(),
)