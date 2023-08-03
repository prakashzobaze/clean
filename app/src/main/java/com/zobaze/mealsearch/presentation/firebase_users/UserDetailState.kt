package com.zobaze.mealsearch.presentation.firebase_users

import com.zobaze.mealsearch.shared.domain.model.User


data class UserDetailState(
    val isLoading: Boolean = false,
    val data: List<User>? = null,
    val error: String = ""
)