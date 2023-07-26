package com.zobaze.mealsearch.domain.use_case

import com.zobaze.mealsearch.common.Resource
import com.zobaze.mealsearch.data.model.toUserData
import com.zobaze.mealsearch.domain.model.User
import com.zobaze.mealsearch.domain.repository.FirebaseDataSourceRepository
import java.io.IOException
import javax.inject.Inject

class FirebaseUserUserCase @Inject constructor(private val repository: FirebaseDataSourceRepository) {

    suspend operator fun invoke(): Resource<List<User>> = try {
        val data = repository.getFirebaseUsers()
        val domainData = data.data.map { it.toUserData() }
        Resource.Success(data = domainData)
    } catch (e: IOException) {
        Resource.Error(message = e.localizedMessage ?: "Check Connectivity")
    } catch (e: Exception) {
        Resource.Error(message = "Unknown error occurred")
    }
}