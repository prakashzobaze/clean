package com.zobaze.mealsearch.presentation.products

import com.zobaze.mealsearch.shared.domain.model.Product

data class ProductsDetailsState(
    val isLoading: Boolean = false,
    val data: List<Product>? = null,
    val error: String = ""
)