package com.zobaze.mealsearch.shared.data.remote

import com.zobaze.mealsearch.shared.data.model.ProductDTOResponse


interface ProductDisplayAPI {

    suspend fun getProducts(
    ): ProductDTOResponse

}