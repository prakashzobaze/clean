package com.zobaze.mealsearch.data.model

data class ProductDTOResponse(
    val total: Int,
    val skip: Int,
    val limit: Int,
    val products: List<ProductDTO>
)