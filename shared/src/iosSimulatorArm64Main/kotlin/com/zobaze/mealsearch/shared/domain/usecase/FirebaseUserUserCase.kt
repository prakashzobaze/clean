package com.zobaze.mealsearch.shared.domain.usecase

import com.zobaze.mealsearch.shared.core.Resource
import com.zobaze.mealsearch.shared.domain.model.User

actual class FirebaseUserUserCase {
    actual suspend operator fun invoke(): Resource<List<User>> {
        TODO("Not yet implemented")
    }
}