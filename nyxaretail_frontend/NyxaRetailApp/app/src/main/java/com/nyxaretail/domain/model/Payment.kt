package com.nyxaretail.domain.model

enum class PaymentMethod {
    MPESA,
    CASH
}

data class Payment(
    val orderId: String,
    val amount: Double,
    val method: PaymentMethod,
    val status: String
)