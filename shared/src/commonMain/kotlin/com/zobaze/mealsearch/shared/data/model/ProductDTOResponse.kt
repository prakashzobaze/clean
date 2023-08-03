package com.zobaze.mealsearch.shared.data.model

import com.zobaze.mealsearch.shared.data.model.ProductDTO
import kotlinx.serialization.Serializable

@Serializable
data class ProductDTOResponse(
    val total: Int,
    val skip: Int,
    val limit: Int,
    val products: List<ProductDTO>
)