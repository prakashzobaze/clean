package com.zobaze.mealsearch.domain.use_case

import com.zobaze.mealsearch.common.Resource
import com.zobaze.mealsearch.data.model.toDomainProduct
import com.zobaze.mealsearch.domain.model.Product
import com.zobaze.mealsearch.domain.repository.ProductDisplayRepository
import java.io.IOException
import javax.inject.Inject

class ProductsDisplayUseCase @Inject constructor(private val repository: ProductDisplayRepository) {

    suspend operator fun invoke(): Resource<List<Product>> = try {
        val data = repository.getProducts()
        val domainData = data.products.map { it.toDomainProduct() }
        Resource.Success(data = domainData)
    } catch (e: IOException) {
        Resource.Error(message = e.localizedMessage ?: "Check Connectivity")
    } catch (e: Exception) {
        Resource.Error(message = "Unknown error occurred")
    }
}