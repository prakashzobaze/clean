package com.zobaze.mealsearch.domain.repository

import com.zobaze.mealsearch.data.model.QuotesDTOResponse

interface QuoteDisplayRepository {
    suspend fun getQuotes(): QuotesDTOResponse
}