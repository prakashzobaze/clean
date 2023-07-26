package com.zobaze.mealsearch.presentation.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zobaze.mealsearch.common.Resource
import com.zobaze.mealsearch.domain.use_case.QuotesDisplayUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class QuoteViewModel @Inject constructor(
    private val quotesDisplayUseCase: QuotesDisplayUseCase
) : ViewModel() {


    private val _quotesDisplay = MutableStateFlow(QuotesDetailsState())
    val quotesDisplay: StateFlow<QuotesDetailsState> = _quotesDisplay
    
    init {
        viewModelScope.launch { 
            getQuotesList()
        }
    }

    private fun getQuotesList() {
        viewModelScope.launch {
            try {
                _quotesDisplay.value = QuotesDetailsState(isLoading = true)
                when (val resource = quotesDisplayUseCase.invoke()) {
                    is Resource.Success -> {
                        _quotesDisplay.value = QuotesDetailsState(data = resource.data)
                    }
                    is Resource.Error -> {
                        _quotesDisplay.value = QuotesDetailsState(error = resource.message ?: "")
                    }

                    else -> {}
                }
            } catch (e: IOException) {
                _quotesDisplay.value = QuotesDetailsState(error = e.localizedMessage ?: "Check Connectivity")
            } catch (e: Exception) {
                _quotesDisplay.value = QuotesDetailsState(error = "Unknown error occurred")
            }
        }
    }


}