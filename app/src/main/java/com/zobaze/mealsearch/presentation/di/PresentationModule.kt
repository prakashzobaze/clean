package com.zobaze.mealsearch.presentation.di

import com.zobaze.mealsearch.presentation.firebase_users.UserViewModel
import com.zobaze.mealsearch.presentation.meal_details.MealDetailsViewModel
import com.zobaze.mealsearch.presentation.meal_search.MealSearchViewModel
import com.zobaze.mealsearch.presentation.products.ProductViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val PresentationModule = module {
    viewModel {
        UserViewModel(get())
    }
    viewModel {
        MealDetailsViewModel(get())
    }
    viewModel {
        MealSearchViewModel(get())
    }
    viewModel {
        ProductViewModel(get())
    }
}