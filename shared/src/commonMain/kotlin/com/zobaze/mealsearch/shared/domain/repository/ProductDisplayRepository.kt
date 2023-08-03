package com.zobaze.mealsearch.shared.domain.repository

import com.zobaze.mealsearch.shared.data.model.ProductDTOResponse


interface ProductDisplayRepository {
    suspend fun getProducts(): ProductDTOResponse
}