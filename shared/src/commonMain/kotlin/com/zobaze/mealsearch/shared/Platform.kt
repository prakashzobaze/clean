package com.zobaze.mealsearch.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform