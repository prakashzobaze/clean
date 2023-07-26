package com.zobaze.mealsearch.data.repository

import com.zobaze.mealsearch.data.remote.ProductDisplayAPI
import com.zobaze.mealsearch.domain.repository.ProductDisplayRepository

class QuoteDisplayRepositoryImpl(private val quoteDisplayAPI: ProductDisplayAPI) : ProductDisplayRepository {
    override suspend fun getProducts() = quoteDisplayAPI.getProducts()
}