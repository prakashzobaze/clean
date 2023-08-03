package com.zobaze.mealsearch.shared.data.repository

import com.zobaze.mealsearch.shared.data.model.MealsDTO
import com.zobaze.mealsearch.shared.data.remote.MealSearchAPI
import com.zobaze.mealsearch.shared.domain.repository.MealSearchRepository


class MealSearchRepistoryImpl(private val mealSearchAPI: MealSearchAPI) : MealSearchRepository {

    override suspend fun getMealSearch(s: String): MealsDTO {
        return mealSearchAPI.getSearchMealList(s)
    }
}