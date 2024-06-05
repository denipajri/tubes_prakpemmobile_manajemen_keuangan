package com.example.keuangan

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.keuangan.ui.HistoryPaymentScreen
import com.example.keuangan.ui.HomeScreen
import com.example.keuangan.ui.ProfileScreen

@Composable
fun UangkuApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {

    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        bottomBar = {
            BottomNavBar(navController)
        }


    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(paddingValues)
        ) {
            composable(Screen.Home.route) {
                HomeScreen()
            }
            composable(Screen.HistoryPayment.route) {
                HistoryPaymentScreen()
            }
            composable(Screen.Profile.route) {
                ProfileScreen()
            }

        }


    }
}