package com.zobaze.mealsearch.presentation

sealed class APIExceptionEvent {
    object Unauthorized : APIExceptionEvent()
    object Forbidden : APIExceptionEvent()
    class Unknown(val message: String) : APIExceptionEvent()
}