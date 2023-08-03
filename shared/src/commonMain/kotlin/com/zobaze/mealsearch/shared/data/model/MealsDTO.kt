package com.zobaze.mealsearch.shared.data.model

import com.zobaze.mealsearch.shared.data.model.MealDTO
import kotlinx.serialization.Serializable

@Serializable
data class MealsDTO(
    val meals: List<MealDTO>?
)