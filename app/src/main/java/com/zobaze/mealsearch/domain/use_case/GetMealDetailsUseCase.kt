package com.zobaze.mealsearch.domain.use_case

import com.zobaze.mealsearch.common.Resource
import com.zobaze.mealsearch.data.model.toDomainMealDetails
import com.zobaze.mealsearch.domain.model.MealDetails
import com.zobaze.mealsearch.domain.repository.MealDetailsRepository
import java.io.IOException
import javax.inject.Inject

class GetMealDetailsUseCase @Inject constructor(private val repository: MealDetailsRepository) {

    suspend operator fun invoke(id: String): Resource<List<MealDetails>> = try {
        val data = repository.getMealDetails(id)
        val domainData = data.meals?.map { it.toDomainMealDetails() } ?: emptyList()
        Resource.Success(data = domainData)
    } catch (e: IOException) {
        Resource.Error(message = e.localizedMessage ?: "Check Connectivity")
    } catch (e: Exception) {
        Resource.Error(message = "Unknown error occurred")
    }
}