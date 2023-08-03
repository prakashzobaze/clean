package com.zobaze.mealsearch.shared.data.remote

import com.zobaze.mealsearch.shared.data.model.MealsDTO


interface MealSearchAPI {


    suspend fun getSearchMealList(
        query: String
    ): MealsDTO


    suspend fun getMealDetails(
        i: String
    ): MealsDTO


}