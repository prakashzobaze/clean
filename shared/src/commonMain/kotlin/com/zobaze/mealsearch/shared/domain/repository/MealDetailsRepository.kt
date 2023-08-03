package com.zobaze.mealsearch.shared.domain.repository

import com.zobaze.mealsearch.shared.data.model.MealsDTO


interface MealDetailsRepository {

    suspend fun getMealDetails(id:String): MealsDTO

}