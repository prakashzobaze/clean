package com.zobaze.mealsearch.domain.repository

import com.zobaze.mealsearch.data.model.ConfigData


interface FirebaseDataSourceRepository {
    suspend fun getFirebaseUsers() : ConfigData
}