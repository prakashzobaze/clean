package com.zobaze.mealsearch.shared.data.remote

import com.zobaze.mealsearch.shared.data.model.MealsDTO
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.client.request.request

class MealSearchAPIImpl(private val ktor: HttpClient) : MealSearchAPI {
    override suspend fun getSearchMealList(query: String): MealsDTO {
        return ktor.get("api/json/v1/1/search.php"){
            parameter("s", query)
        }.body()
    }

    override suspend fun getMealDetails(i: String): MealsDTO {
        return ktor.get("api/json/v1/1/lookup.php"){
            parameter("i", i)
        }.body()
    }
}