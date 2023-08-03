package com.zobaze.mealsearch.shared.domain.usecase

import com.zobaze.mealsearch.shared.core.Resource
import com.zobaze.mealsearch.shared.domain.model.User
import com.zobaze.mealsearch.shared.domain.repository.FirebaseDataSourceRepository

expect class FirebaseUserUserCase {
    suspend operator fun invoke(): Resource<List<User>>
}