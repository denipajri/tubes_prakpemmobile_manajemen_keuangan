package com.example.keuangan

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object HistoryPayment : Screen("history_payment")
    object Profile : Screen("profile")
}