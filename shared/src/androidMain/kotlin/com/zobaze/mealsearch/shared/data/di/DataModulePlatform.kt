package com.zobaze.mealsearch.shared.data.di

import com.google.firebase.firestore.FirebaseFirestore
import com.zobaze.mealsearch.shared.Constants
import com.zobaze.mealsearch.shared.data.repository.FirebaseDataSourceImpl
import com.zobaze.mealsearch.shared.domain.repository.FirebaseDataSourceRepository
import org.koin.dsl.module

actual val DataModulePlatform = module {
    single<FirebaseDataSourceRepository> {
        FirebaseDataSourceImpl(FirebaseFirestore.getInstance().collection(Constants.CONFIG))
    }
}