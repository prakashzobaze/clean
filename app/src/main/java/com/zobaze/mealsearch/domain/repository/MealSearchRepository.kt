package com.zobaze.mealsearch.domain.repository

import com.zobaze.mealsearch.data.model.MealsDTO

interface MealSearchRepository {

    suspend fun getMealSearch(s:String): MealsDTO

}