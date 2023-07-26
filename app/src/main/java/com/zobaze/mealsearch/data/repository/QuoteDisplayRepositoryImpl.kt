package com.zobaze.mealsearch.data.repository

import com.zobaze.mealsearch.data.remote.QuoteDisplayAPI
import com.zobaze.mealsearch.domain.repository.QuoteDisplayRepository

class QuoteDisplayRepositoryImpl(private val quoteDisplayAPI: QuoteDisplayAPI) : QuoteDisplayRepository {
    override suspend fun getQuotes() = quoteDisplayAPI.getDisplayQuotes()
}