package com.zobaze.mealsearch.data.model

import com.zobaze.mealsearch.domain.model.Quote

data class QuoteDTO(
    val id: Int,
    val title: String,
    val description: String,
    val price: Double,
    val discountPercentage: Double,
    val rating: Double,
    val stock: Int,
    val brand: String,
    val category: String,
    val thumbnail: String,
    val images: List<String>
)

fun QuoteDTO.toDomainQuote(): Quote {
    return Quote(
        title = this.title,
        description = this.description ?: ""
    )
}