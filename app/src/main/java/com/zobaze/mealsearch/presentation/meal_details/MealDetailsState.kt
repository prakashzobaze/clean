package com.zobaze.mealsearch.presentation.meal_details

import com.zobaze.mealsearch.domain.model.MealDetails

data class MealDetailsState(
    val isLoading: Boolean = false,
    val data: MealDetails? = null,
    val error: String = ""
) {
}