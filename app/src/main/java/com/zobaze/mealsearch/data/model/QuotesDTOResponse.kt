package com.zobaze.mealsearch.data.model

data class QuotesDTOResponse(
    val total: Int,
    val skip: Int,
    val limit: Int,
    val products: List<QuoteDTO>
)