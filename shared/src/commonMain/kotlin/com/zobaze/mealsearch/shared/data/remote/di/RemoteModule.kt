package com.zobaze.mealsearch.shared.data.remote.di

import com.zobaze.mealsearch.shared.data.remote.Ktor
import com.zobaze.mealsearch.shared.data.remote.MealSearchAPI
import com.zobaze.mealsearch.shared.data.remote.MealSearchAPIImpl
import com.zobaze.mealsearch.shared.data.remote.ProductDisplayAPI
import com.zobaze.mealsearch.shared.data.remote.ProductDisplayAPIImpl
import org.koin.dsl.module

val RemoteModule = module {

    single { Ktor }

    single<MealSearchAPI> {
        MealSearchAPIImpl(get())
    }

    single<ProductDisplayAPI> {
        ProductDisplayAPIImpl(get())
    }
}