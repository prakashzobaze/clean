package com.zobaze.mealsearch.shared.domain.di

import com.zobaze.mealsearch.shared.domain.usecase.GetMealDetailsUseCase
import com.zobaze.mealsearch.shared.domain.usecase.ProductsDisplayUseCase
import com.zobaze.mealsearch.shared.domain.usecase.SearchMealsUseCase
import org.koin.core.module.Module
import org.koin.dsl.module

val DomainModule = module {
    single {
        GetMealDetailsUseCase(get())
    }
    single {
        ProductsDisplayUseCase(get())
    }
    single {
        SearchMealsUseCase(get())
    }
}