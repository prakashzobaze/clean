package com.zobaze.mealsearch.di

import android.app.Application
import com.zobaze.mealsearch.presentation.di.PresentationModule
import com.zobaze.mealsearch.shared.data.di.DataModule
import com.zobaze.mealsearch.shared.data.di.DataModulePlatform
import com.zobaze.mealsearch.shared.data.remote.di.RemoteModule
import com.zobaze.mealsearch.shared.domain.di.DomainModule
import com.zobaze.mealsearch.shared.domain.di.DomainModulePlatform
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

fun setupKoin(application: Application) = startKoin {
    androidLogger()
    androidContext(application)
    modules(
        RemoteModule,
        DataModule,
        DataModulePlatform,
        DomainModule,
        DomainModulePlatform,
        PresentationModule,
    )
}