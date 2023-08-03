package com.zobaze.mealsearch.shared.domain.usecase

import com.zobaze.mealsearch.shared.core.Resource
import com.zobaze.mealsearch.shared.data.model.toDomainProduct
import com.zobaze.mealsearch.shared.domain.model.Product
import com.zobaze.mealsearch.shared.domain.repository.ProductDisplayRepository
import io.ktor.utils.io.errors.IOException


class ProductsDisplayUseCase constructor(private val repository: ProductDisplayRepository) {

    suspend operator fun invoke(): Resource<List<Product>> = try {
        val data = repository.getProducts()
        val domainData = data.products.map { it.toDomainProduct() }
        Resource.Success(data = domainData)
    } catch (e: IOException) {
        Resource.Error(message = e.message ?: "Check Connectivity")
    } catch (e: Exception) {
        Resource.Error(message = "Unknown error occurred")
    }
}