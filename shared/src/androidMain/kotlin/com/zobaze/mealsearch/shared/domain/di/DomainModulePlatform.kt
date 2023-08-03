package com.zobaze.mealsearch.shared.domain.di

import com.zobaze.mealsearch.shared.domain.usecase.FirebaseUserUserCase
import org.koin.core.module.Module
import org.koin.dsl.module

actual val DomainModulePlatform: Module = module {
    single {
        FirebaseUserUserCase(get())
    }
}