package com.zobaze.mealsearch.shared.data.model

import com.zobaze.mealsearch.shared.domain.model.User
import kotlinx.serialization.Serializable

@Serializable
data class FirebaseUserInfo(
    val age: String = "",
    val name: String = "",
    var role: String = ""
)

fun FirebaseUserInfo.toUserData(): User {
    return User(
        name = this.name,
        age = this.age
    )
}