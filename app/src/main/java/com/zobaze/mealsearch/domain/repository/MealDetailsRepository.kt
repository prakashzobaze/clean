package com.zobaze.mealsearch.domain.repository

import com.zobaze.mealsearch.data.model.MealsDTO

interface MealDetailsRepository {

    suspend fun getMealDetails(id:String):MealsDTO

}