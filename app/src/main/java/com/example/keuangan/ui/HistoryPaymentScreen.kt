package com.example.keuangan.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.keuangan.R
import com.example.keuangan.Transaction

@Composable
fun HistoryPaymentScreen() {
    Column {
        Text(
            text = "History Transactions",
            style = MaterialTheme.typography.h1,
            color = Color.Black,
            modifier = Modifier.padding(start= 24.dp, top = 24.dp, bottom = 10.dp)
        )
        TransactionsSection(
            listOf(
                Transaction(
                    title = "KFC Payment",
                    date = "June 26",
                    payment = "+$2,010",
                    iconId = R.drawable.ic_burger
                ),
                Transaction(
                    title = "Paypal",
                    date = "June 28",
                    payment = "+$12,010",
                    iconId = R.drawable.ic_paypal
                ),
                Transaction(
                    title = "Car Repair",
                    date = "Aug 12",
                    payment = "+$232,010",
                    iconId = R.drawable.ic_repair
                ),
                Transaction(
                    title = "McDonald Payment",
                    date = "Aug 29",
                    payment = "+50,010",
                    iconId = R.drawable.ic_burger
                ),
                Transaction(
                    title = "Motorcycle Repair",
                    date = "Sep 12",
                    payment = "+$2,010",
                    iconId = R.drawable.ic_repair
                ),
                Transaction(
                    title = "PIZZA HUT Payment",
                    date = "Oct 7",
                    payment = "+$200,010",
                    iconId = R.drawable.ic_burger
                ),
                Transaction(
                    title = "AC Repairment",
                    date = "Oct 16",
                    payment = "+$102,010",
                    iconId = R.drawable.ic_repair
                ),
                Transaction(
                    title = "Food Payment",
                    date = "Nov 19",
                    payment = "+$302,010",
                    iconId = R.drawable.ic_paypal
                )
            )
        )
    }
}