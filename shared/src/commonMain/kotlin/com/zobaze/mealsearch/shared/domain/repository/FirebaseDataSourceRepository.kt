package com.zobaze.mealsearch.shared.domain.repository

import com.zobaze.mealsearch.shared.data.model.ConfigData


interface FirebaseDataSourceRepository {
    suspend fun getFirebaseUsers() : ConfigData
}