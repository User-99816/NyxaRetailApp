package com.nyxaretail.domain.usecase

import com.nyxaretail.domain.repository.ProductRepository

class GetProductsUseCase(
    private val repository: ProductRepository
) {

    suspend operator fun invoke() = repository.getProducts()
}