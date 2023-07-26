package com.zobaze.mealsearch.data.model

import com.zobaze.mealsearch.domain.model.Meal
import com.zobaze.mealsearch.domain.model.User

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