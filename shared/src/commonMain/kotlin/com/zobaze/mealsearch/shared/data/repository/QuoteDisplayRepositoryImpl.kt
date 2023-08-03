package com.zobaze.mealsearch.shared.data.repository

import com.zobaze.mealsearch.shared.data.remote.ProductDisplayAPI
import com.zobaze.mealsearch.shared.domain.repository.ProductDisplayRepository


class QuoteDisplayRepositoryImpl(private val quoteDisplayAPI: ProductDisplayAPI) :
    ProductDisplayRepository {
    override suspend fun getProducts() = quoteDisplayAPI.getProducts()
}