package com.zobaze.mealsearch.shared.data.di

import com.zobaze.mealsearch.shared.data.repository.MealDetailsRepositoryImpl
import com.zobaze.mealsearch.shared.data.repository.MealSearchRepistoryImpl
import com.zobaze.mealsearch.shared.data.repository.QuoteDisplayRepositoryImpl
import com.zobaze.mealsearch.shared.domain.repository.MealDetailsRepository
import com.zobaze.mealsearch.shared.domain.repository.MealSearchRepository
import com.zobaze.mealsearch.shared.domain.repository.ProductDisplayRepository
import org.koin.core.module.Module
import org.koin.dsl.module

val DataModule = module {
    single<MealDetailsRepository> {
        MealDetailsRepositoryImpl(get())
    }
    single<MealSearchRepository> {
        MealSearchRepistoryImpl(get())
    }
    single<ProductDisplayRepository> {
        QuoteDisplayRepositoryImpl(get())
    }
}