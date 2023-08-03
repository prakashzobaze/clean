package com.zobaze.mealsearch.shared.data.model

import kotlinx.serialization.Serializable

@Serializable
data class ConfigData(
    val data: List<FirebaseUserInfo> = listOf()
)
