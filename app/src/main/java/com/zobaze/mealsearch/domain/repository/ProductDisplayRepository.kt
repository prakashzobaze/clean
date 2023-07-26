package com.zobaze.mealsearch.domain.repository

import com.zobaze.mealsearch.data.model.ProductDTOResponse

interface ProductDisplayRepository {
    suspend fun getProducts(): ProductDTOResponse
}