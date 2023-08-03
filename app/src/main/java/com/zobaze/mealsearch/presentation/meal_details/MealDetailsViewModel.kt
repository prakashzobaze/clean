package com.zobaze.mealsearch.presentation.meal_details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zobaze.mealsearch.shared.core.Resource
import com.zobaze.mealsearch.shared.domain.usecase.GetMealDetailsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.io.IOException

class MealDetailsViewModel constructor(private val mealDetailsUseCase: GetMealDetailsUseCase) :
    ViewModel() {

    private val _mealDetails = MutableStateFlow(MealDetailsState())
    val mealDetails: StateFlow<MealDetailsState> = _mealDetails

    fun getMealDetails(id: String) {
        viewModelScope.launch {
            try {
                _mealDetails.value = MealDetailsState(isLoading = true)
                when (val resource = mealDetailsUseCase.invoke(id)) {
                    is Resource.Success -> {
                        _mealDetails.value = MealDetailsState(data = resource.data?.get(0))
                    }
                    is Resource.Error -> {
                        _mealDetails.value = MealDetailsState(error = resource.message ?: "")
                    }

                    else -> {}
                }
            } catch (e: IOException) {
                _mealDetails.value = MealDetailsState(error = e.localizedMessage ?: "Check Connectivity")
            } catch (e: Exception) {
                _mealDetails.value = MealDetailsState(error = "Unknown error occurred")
            }
        }
    }
}