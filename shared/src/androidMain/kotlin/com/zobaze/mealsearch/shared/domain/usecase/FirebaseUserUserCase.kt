package com.zobaze.mealsearch.shared.domain.usecase

import com.zobaze.mealsearch.shared.core.Resource
import com.zobaze.mealsearch.shared.data.model.toUserData
import com.zobaze.mealsearch.shared.domain.model.User
import com.zobaze.mealsearch.shared.domain.repository.FirebaseDataSourceRepository
import java.io.IOException

actual class FirebaseUserUserCase(private val repository: FirebaseDataSourceRepository) {

    actual suspend operator fun invoke(): Resource<List<User>> {
        return try {
            val data = repository.getFirebaseUsers()
            val domainData = data.data.map { it.toUserData() }
            Resource.Success(data = domainData)
        } catch (e: IOException) {
            Resource.Error(message = e.localizedMessage ?: "Check Connectivity")
        } catch (e: Exception) {
            Resource.Error(message = "Unknown error occurred")
        }
    }
}