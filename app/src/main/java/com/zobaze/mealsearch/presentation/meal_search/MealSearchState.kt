package com.zobaze.mealsearch.presentation.meal_search

import com.zobaze.mealsearch.shared.domain.model.Meal


data class MealSearchState(
    val isLoading: Boolean = false,
    val data: List<Meal>? = null,
    val error: String = ""
)