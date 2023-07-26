package com.zobaze.mealsearch.domain.use_case

import com.zobaze.mealsearch.common.Resource
import com.zobaze.mealsearch.data.model.toDomainQuote
import com.zobaze.mealsearch.domain.model.Quote
import com.zobaze.mealsearch.domain.repository.QuoteDisplayRepository
import java.io.IOException
import javax.inject.Inject

class QuotesDisplayUseCase @Inject constructor(private val repository: QuoteDisplayRepository) {

    suspend operator fun invoke(): Resource<List<Quote>> = try {
        val data = repository.getQuotes()
        val domainData = data.products.map { it.toDomainQuote() }
        Resource.Success(data = domainData)
    } catch (e: IOException) {
        Resource.Error(message = e.localizedMessage ?: "Check Connectivity")
    } catch (e: Exception) {
        Resource.Error(message = "Unknown error occurred")
    }
}