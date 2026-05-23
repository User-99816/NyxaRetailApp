package com.nyxaretail.presentation.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nyxaretail.data.repository.ProductRepositoryImpl
import com.nyxaretail.domain.model.Product
import com.nyxaretail.domain.usecase.GetProductsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val repository = ProductRepositoryImpl()
    private val getProductsUseCase = GetProductsUseCase(repository)

    private val _products = MutableStateFlow<List<Product>>(emptyList())
    val products: StateFlow<List<Product>> = _products

    init {
        loadProducts()
    }

    private fun loadProducts() {

        viewModelScope.launch {
            _products.value = getProductsUseCase()
        }
    }
}