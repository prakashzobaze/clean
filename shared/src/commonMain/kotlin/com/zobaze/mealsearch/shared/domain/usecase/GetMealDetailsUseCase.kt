package com.zobaze.mealsearch.shared.domain.usecase

import com.zobaze.mealsearch.shared.core.Resource
import com.zobaze.mealsearch.shared.data.model.toDomainMealDetails
import com.zobaze.mealsearch.shared.domain.model.MealDetails
import com.zobaze.mealsearch.shared.domain.repository.MealDetailsRepository
import io.ktor.utils.io.errors.IOException

class GetMealDetailsUseCase constructor(private val repository: MealDetailsRepository) {

    suspend operator fun invoke(id: String): Resource<List<MealDetails>> = try {
        val data = repository.getMealDetails(id)
        val domainData = data.meals?.map { it.toDomainMealDetails() } ?: emptyList()
        Resource.Success(data = domainData)
    } catch (e: IOException) {
        Resource.Error(message = e.message ?: "Check Connectivity")
    } catch (e: Exception) {
        Resource.Error(message = "Unknown error occurred")
    }
}