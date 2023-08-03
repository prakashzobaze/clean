package com.zobaze.mealsearch.shared.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val name: String,
    val age: String
)