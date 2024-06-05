package com.example.keuangan.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp, bottom = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(com.example.keuangan.R.drawable.profile_image),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(180.dp)
                .width(150.dp)
                .padding(bottom = 16.dp, top = 16.dp)
                .clip(shape = CircleShape),
            contentDescription = stringResource(id = com.example.keuangan.R.string.image_profile),
        )
        Text(
            "Dios",
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(8.dp))
        Column(modifier = Modifier.padding(horizontal = 20.dp)) {
            OutlinedTextField(
                value = "Dios",
                label = { Text(stringResource(id = com.example.keuangan.R.string.email), color = Color.Black) },
                onValueChange = {},
                readOnly = true,
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = Color.Black, // Warna teks input
                    focusedBorderColor = Color.Black, // Warna border saat fokus
                    unfocusedBorderColor = Color.Black // Warna border saat tidak fokus
                ),
                textStyle = TextStyle(color = Color.Black)
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = "Jl. Setiabudhi",
                label = { Text(stringResource(id = com.example.keuangan.R.string.address), color = Color.Black) },
                onValueChange = {},
                readOnly = true,
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = Color.Black, // Warna teks input
                    focusedBorderColor = Color.Black, // Warna border saat fokus
                    unfocusedBorderColor = Color.Black // Warna border saat tidak fokus
                ),
                textStyle = TextStyle(color = Color.Black)
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = "08132045729",
                label = { Text(stringResource(id = com.example.keuangan.R.string.phone), color = Color.Black) },
                onValueChange = {},
                readOnly = true,
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = Color.Black, // Warna teks input
                    focusedBorderColor = Color.Black, // Warna border saat fokus
                    unfocusedBorderColor = Color.Black // Warna border saat tidak fokus
                ),
                textStyle = TextStyle(color = Color.Black)
            )
        }
    }
}
