package com.zobaze.mealsearch.shared.data.repository

import com.zobaze.mealsearch.shared.data.model.ConfigData
import com.zobaze.mealsearch.shared.domain.repository.FirebaseDataSourceRepository

actual class FirebaseDataSourceImpl : FirebaseDataSourceRepository {
    override suspend fun getFirebaseUsers(): ConfigData {
        TODO("Not yet implemented")
    }

}