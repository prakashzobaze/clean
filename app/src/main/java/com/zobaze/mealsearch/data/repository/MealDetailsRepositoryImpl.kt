package com.zobaze.mealsearch.data.repository

import com.zobaze.mealsearch.data.model.MealsDTO
import com.zobaze.mealsearch.data.remote.MealSearchAPI
import com.zobaze.mealsearch.domain.repository.MealDetailsRepository

class MealDetailsRepositoryImpl(private val mealSearchAPI: MealSearchAPI) : MealDetailsRepository {

    override suspend fun getMealDetails(id: String): MealsDTO {
        return mealSearchAPI.getMealDetails(id)
    }
}