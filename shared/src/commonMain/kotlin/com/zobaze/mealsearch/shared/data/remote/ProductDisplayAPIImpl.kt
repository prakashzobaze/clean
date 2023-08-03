package com.zobaze.mealsearch.shared.data.remote

import com.zobaze.mealsearch.shared.data.model.ProductDTOResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

class ProductDisplayAPIImpl(private val ktor: HttpClient) : ProductDisplayAPI {
    override suspend fun getProducts(): ProductDTOResponse {
        return ktor.get("products") {

        }.body()
    }
}