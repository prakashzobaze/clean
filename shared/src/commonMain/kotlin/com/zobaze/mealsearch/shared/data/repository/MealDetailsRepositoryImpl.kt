package com.zobaze.mealsearch.shared.data.repository

import com.zobaze.mealsearch.shared.data.model.MealsDTO
import com.zobaze.mealsearch.shared.data.remote.MealSearchAPI
import com.zobaze.mealsearch.shared.domain.repository.MealDetailsRepository


class MealDetailsRepositoryImpl(private val mealSearchAPI: MealSearchAPI) : MealDetailsRepository {

    override suspend fun getMealDetails(id: String): MealsDTO {
        return mealSearchAPI.getMealDetails(id)
    }
}