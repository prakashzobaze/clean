package com.zobaze.mealsearch.shared.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val title: String,
    val description: String
)