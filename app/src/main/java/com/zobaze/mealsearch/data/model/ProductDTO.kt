package com.zobaze.mealsearch.data.model

import com.zobaze.mealsearch.domain.model.Product

data class ProductDTO(
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

fun ProductDTO.toDomainProduct(): Product {
    return Product(
        title = this.title,
        description = this.description ?: ""
    )
}