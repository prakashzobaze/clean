package com.zobaze.mealsearch.presentation.products

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zobaze.mealsearch.shared.core.Resource
import com.zobaze.mealsearch.shared.domain.usecase.ProductsDisplayUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.io.IOException


class ProductViewModel constructor(
    private val productsDisplayUseCase: ProductsDisplayUseCase
) : ViewModel() {


    private val _productsDisplay = MutableStateFlow(ProductsDetailsState())
    val productsDisplay: StateFlow<ProductsDetailsState> = _productsDisplay
    
    init {
        viewModelScope.launch { 
            getProducts()
        }
    }

    private fun getProducts() {
        viewModelScope.launch {
            try {
                _productsDisplay.value = ProductsDetailsState(isLoading = true)
                when (val resource = productsDisplayUseCase.invoke()) {
                    is Resource.Success -> {
                        _productsDisplay.value = ProductsDetailsState(data = resource.data)
                    }
                    is Resource.Error -> {
                        _productsDisplay.value = ProductsDetailsState(error = resource.message ?: "")
                    }

                    else -> {}
                }
            } catch (e: IOException) {
                _productsDisplay.value = ProductsDetailsState(error = e.localizedMessage ?: "Check Connectivity")
            } catch (e: Exception) {
                _productsDisplay.value = ProductsDetailsState(error = "Unknown error occurred")
            }
        }
    }


}