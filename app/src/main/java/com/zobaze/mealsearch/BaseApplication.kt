package com.zobaze.mealsearch

import android.app.Application
import com.zobaze.mealsearch.di.setupKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        setupKoin(this)
    }
}