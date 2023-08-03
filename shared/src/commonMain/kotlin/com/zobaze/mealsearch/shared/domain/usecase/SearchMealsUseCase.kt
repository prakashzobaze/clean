package com.zobaze.mealsearch.shared.domain.usecase

import com.zobaze.mealsearch.shared.core.Resource
import com.zobaze.mealsearch.shared.data.model.toDomainMeal
import com.zobaze.mealsearch.shared.domain.model.Meal
import com.zobaze.mealsearch.shared.domain.repository.MealSearchRepository
import io.ktor.utils.io.errors.IOException

class SearchMealsUseCase constructor(private val repository: MealSearchRepository) {

    suspend operator fun invoke(id: String): Resource<List<Meal>> = try {
        val data = repository.getMealSearch(id)
        val domainData = data.meals?.map { it.toDomainMeal() } ?: emptyList()
        Resource.Success(data = domainData)
    } catch (e: IOException) {
        Resource.Error(message = e.message ?: "Check Connectivity")
    } catch (e: Exception) {
        Resource.Error(message = "Unknown error occurred")
    }
}