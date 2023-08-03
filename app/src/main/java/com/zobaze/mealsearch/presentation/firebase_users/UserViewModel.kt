package com.zobaze.mealsearch.presentation.firebase_users

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zobaze.mealsearch.shared.core.Resource
import com.zobaze.mealsearch.shared.domain.usecase.FirebaseUserUserCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.io.IOException

class UserViewModel constructor(
    private val firebaseUserUserCase: FirebaseUserUserCase
) : ViewModel() {


    private val _usersList = MutableStateFlow(UserDetailState())
    val usersList: StateFlow<UserDetailState> = _usersList

    init {
        viewModelScope.launch {
            getUsersList()
        }
    }

    private fun getUsersList() {
        viewModelScope.launch {
            try {
                _usersList.value = UserDetailState(isLoading = true)
                when (val resource = firebaseUserUserCase.invoke()) {
                    is Resource.Success -> {
                        _usersList.value = UserDetailState(data = resource.data)
                    }
                    is Resource.Error -> {
                        _usersList.value = UserDetailState(error = resource.message ?: "")
                    }

                    else -> {}
                }
            } catch (e: IOException) {
                _usersList.value = UserDetailState(error = e.localizedMessage ?: "Check Connectivity")
            } catch (e: Exception) {
                _usersList.value = UserDetailState(error = "Unknown error occurred")
            }
        }
    }


}