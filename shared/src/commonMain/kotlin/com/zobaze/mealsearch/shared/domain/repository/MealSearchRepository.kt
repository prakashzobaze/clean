package com.zobaze.mealsearch.shared.domain.repository

import com.zobaze.mealsearch.shared.data.model.MealsDTO


interface MealSearchRepository {

    suspend fun getMealSearch(s:String): MealsDTO

}