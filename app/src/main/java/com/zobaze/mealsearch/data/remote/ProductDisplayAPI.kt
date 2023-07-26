package com.zobaze.mealsearch.data.remote

import com.zobaze.mealsearch.data.model.ProductDTOResponse
import retrofit2.http.GET

interface ProductDisplayAPI {

    @GET("products")
    suspend fun getProducts(
    ): ProductDTOResponse

}