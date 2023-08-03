package com.zobaze.mealsearch.shared.data.remote

import com.zobaze.mealsearch.shared.Constants.BASE_URL
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.serialization.gson.gson
import okhttp3.logging.HttpLoggingInterceptor

// creates Ktor client with OkHttp engine
actual val Ktor: HttpClient = HttpClient(OkHttp) {
    // default validation to throw exceptions for non-2xx responses
    expectSuccess = true

    engine {
        // add logging interceptor
        addInterceptor(HttpLoggingInterceptor().apply {
            setLevel(
                HttpLoggingInterceptor.Level.BODY
            )
        })
    }

    // set default request parameters
    defaultRequest {
        // add base url for all request
        url(BASE_URL)
    }

    // use gson content negotiation for serialize or deserialize
    install(ContentNegotiation) {
        gson()
    }
}