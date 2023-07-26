package com.zobaze.mealsearch.data.repository

import android.util.Log
import com.google.firebase.firestore.CollectionReference
import com.google.gson.Gson
import com.zobaze.mealsearch.data.model.ConfigData
import com.zobaze.mealsearch.domain.repository.FirebaseDataSourceRepository
import javax.inject.Inject
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine


class FirebaseDataSourceImpl @Inject constructor(
    private val usersRef : CollectionReference
) : FirebaseDataSourceRepository {

    override suspend fun getFirebaseUsers(): ConfigData {
        return suspendCoroutine { continuation ->
            val docRef = usersRef.document("users")
            docRef.get()
                .addOnSuccessListener { documentSnapshot ->
                    if (documentSnapshot.exists()) {
                        val configData = documentSnapshot.toObject(ConfigData::class.java)
                        if (configData != null) {
                            Log.d("DebuggingCode:", "data: " + Gson().toJson(configData))
                            continuation.resume(configData)
                        } else {
                            continuation.resumeWithException(IllegalStateException("ConfigData is null"))
                        }
                    } else {
                        continuation.resumeWithException(IllegalStateException("Document does not exist"))
                    }
                }
                .addOnFailureListener { exception ->
                    continuation.resumeWithException(exception)
                }
        }
    }
}