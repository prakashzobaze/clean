package com.zobaze.mealsearch.data.remote

import com.zobaze.mealsearch.data.model.QuotesDTOResponse
import retrofit2.http.GET

interface QuoteDisplayAPI {

    @GET("products")
    suspend fun getDisplayQuotes(
    ): QuotesDTOResponse

}