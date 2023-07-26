package com.zobaze.mealsearch.data.repository

import com.zobaze.mealsearch.data.model.MealsDTO
import com.zobaze.mealsearch.data.remote.MealSearchAPI
import com.zobaze.mealsearch.domain.repository.MealSearchRepository

class MealSearchRepistoryImpl(private val mealSearchAPI: MealSearchAPI) : MealSearchRepository {

    override suspend fun getMealSearch(s: String): MealsDTO {
        return mealSearchAPI.getSearchMealList(s)
    }
}