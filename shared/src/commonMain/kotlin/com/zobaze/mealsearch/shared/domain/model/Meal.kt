package com.zobaze.mealsearch.shared.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Meal(
    val id: String,
    val name: String,
    val image: String
)