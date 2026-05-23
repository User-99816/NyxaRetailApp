package com.nyxaretail.presentation.screens.checkout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CheckoutScreen(
    onMpesaClick: () -> Unit,
    onCashClick: () -> Unit
) {

    Column(
        modifier = Modifier.padding(16.dp)
    ) {

        Text(text = "Choose Payment Method")

        Button(
            onClick = onMpesaClick,
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(text = "Pay with M-Pesa")
        }

        Button(
            onClick = onCashClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        ) {

            Text(text = "Pay with Cash")
        }
    }
}