package com.udeh.markethub.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.udeh.markethub.ui.screens.about.AboutScreen
import com.udeh.markethub.ui.screens.auth.LoginScreen
import com.udeh.markethub.ui.screens.auth.RegisterScreen
import com.udeh.markethub.ui.screens.home.HomeScreen
import com.udeh.markethub.ui.screens.onboarding.OnboardingScreen
import com.udeh.markethub.ui.screens.payment.PaymentScreen
import com.udeh.markethub.ui.screens.services.ServiceScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_ONBOARDING
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUT_REGISTER) {
            RegisterScreen(navController)
        }
        composable(ROUT_ONBOARDING) {
            OnboardingScreen(navController)
        }
        composable(ROUT_SERVICES) {
            ServiceScreen(navController)
        }
        composable(ROUT_PAYMENT) {
            PaymentScreen(navController)
        }


    }
}



