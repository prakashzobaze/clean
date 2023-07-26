package com.zobaze.mealsearch.domain.use_case

import com.zobaze.mealsearch.common.Resource
import com.zobaze.mealsearch.data.model.toDomainMeal
import com.zobaze.mealsearch.domain.model.Meal
import com.zobaze.mealsearch.domain.repository.MealSearchRepository
import java.io.IOException
import javax.inject.Inject

class SearchMealsUseCase @Inject constructor(private val repository: MealSearchRepository) {

    suspend operator fun invoke(id: String): Resource<List<Meal>> = try {
        val data = repository.getMealSearch(id)
        val domainData = data.meals?.map { it.toDomainMeal() } ?: emptyList()
        Resource.Success(data = domainData)
    } catch (e: IOException) {
        Resource.Error(message = e.localizedMessage ?: "Check Connectivity")
    } catch (e: Exception) {
        Resource.Error(message = "Unknown error occurred")
    }
}