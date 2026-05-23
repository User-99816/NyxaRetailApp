package com.nyxaretail.presentation.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.nyxaretail.presentation.components.ProductCard

@Composable
fun HomeScreen() {

    val viewModel: HomeViewModel = viewModel()
    val products = viewModel.products.collectAsStateWithLifecycle()

    Column {

        Text(text = "NyxaRetail")

        LazyColumn {

            items(products.value) { product ->

                ProductCard(
                    product = product,
                    onClick = {}
                )
            }
        }
    }
}