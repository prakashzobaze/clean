package com.zobaze.mealsearch.shared.utils

import android.util.Log

actual object Logger {
    actual fun d(tag: String, message: String, error: Throwable?) {
        Log.d( tag, message, error)
    }
}