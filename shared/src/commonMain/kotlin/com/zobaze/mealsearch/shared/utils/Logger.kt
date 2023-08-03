package com.zobaze.mealsearch.shared.utils

expect object Logger {
    fun d(tag: String = "Logger", message: String, error: Throwable? = null)
}