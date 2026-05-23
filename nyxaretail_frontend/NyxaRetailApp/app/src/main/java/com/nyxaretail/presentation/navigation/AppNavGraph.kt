package com.nyxaretail.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nyxaretail.core.constants.Routes
import com.nyxaretail.presentation.screens.checkout.CheckoutScreen
import com.nyxaretail.presentation.screens.home.HomeScreen
import com.nyxaretail.presentation.screens.payment.PaymentScreen

@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ) {

        composable(Routes.HOME) {

            HomeScreen()
        }

        composable(Routes.CHECKOUT) {

            CheckoutScreen(

                onMpesaClick = {
                    navController.navigate(Routes.PAYMENT)
                },

                onCashClick = {
                    navController.navigate(Routes.PAYMENT)
                }
            )
        }

        composable(Routes.PAYMENT) {

            PaymentScreen()
        }
    }
}