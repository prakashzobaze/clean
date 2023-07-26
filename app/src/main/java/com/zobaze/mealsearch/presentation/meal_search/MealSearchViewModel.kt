package com.zobaze.mealsearch.presentation.meal_search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zobaze.mealsearch.common.Resource
import com.zobaze.mealsearch.domain.use_case.SearchMealsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class MealSearchViewModel @Inject constructor(
    private val mealSearchMealsUseCase: SearchMealsUseCase
) : ViewModel() {


    private val _mealSearchList = MutableStateFlow(MealSearchState())
    val mealSearchList: StateFlow<MealSearchState> = _mealSearchList

    fun getSearchMeals(s: String) {
        viewModelScope.launch {
            try {
                _mealSearchList.value = MealSearchState(isLoading = true)
                when (val resource = mealSearchMealsUseCase.invoke(s)) {
                    is Resource.Success -> {
                        _mealSearchList.value = MealSearchState(data = resource.data)
                    }
                    is Resource.Error -> {
                        _mealSearchList.value = MealSearchState(error = resource.message ?: "")
                    }

                    else -> {}
                }
            } catch (e: IOException) {
                _mealSearchList.value = MealSearchState(error = e.localizedMessage ?: "Check Connectivity")
            } catch (e: Exception) {
                _mealSearchList.value = MealSearchState(error = "Unknown error occurred")
            }
        }
    }


}