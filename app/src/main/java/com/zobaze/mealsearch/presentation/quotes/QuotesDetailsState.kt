package com.zobaze.mealsearch.presentation.quotes

import com.zobaze.mealsearch.domain.model.Quote

data class QuotesDetailsState(
    val isLoading: Boolean = false,
    val data: List<Quote>? = null,
    val error: String = ""
)