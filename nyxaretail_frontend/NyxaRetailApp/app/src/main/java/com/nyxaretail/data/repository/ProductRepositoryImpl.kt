package com.nyxaretail.data.repository

import com.nyxaretail.domain.model.Product
import com.nyxaretail.domain.repository.ProductRepository

class ProductRepositoryImpl : ProductRepository {

    override suspend fun getProducts(): List<Product> {

        return listOf(
            Product(1, "Milk", 65.0),
            Product(2, "Bread", 55.0),
            Product(3, "Sugar", 180.0)
        )
    }
}