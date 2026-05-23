package com.nyxaretail.presentation.screens.cart

import androidx.lifecycle.ViewModel
import com.nyxaretail.domain.model.CartItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CartViewModel : ViewModel() {

    private val _cart = MutableStateFlow<List<CartItem>>(emptyList())
    val cart: StateFlow<List<CartItem>> = _cart

    fun addItem(item: CartItem) {
        _cart.value = _cart.value + item
    }

    fun getTotal(): Double {

        return _cart.value.sumOf {
            it.product.price * it.quantity
        }
    }
}