package com.example.freeplatz.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun MyProfileScreen(navController: NavHostController) {

    //plug. Will make it work via ViewModel w/ DB
    Scaffold(topBar = {
        TopAppBar(title = { Text("Мой профиль") }, backgroundColor = Color.White)
    }) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFF667EEA),
                                Color(0xFF764BA2)
                            )
                        )
                    )
            )
            //Image(
            //    painter = painterResource(R.drawable.profile_pic),
            //    contentDescription = null,
            //    modifier = Modifier
            //        .size(90.dp)
            //        .clip(CircleShape)
            //)
            Spacer(modifier = Modifier.width(8.dp))
            Text("редактировать профиль", Modifier.clickable { })
            Box(
                Modifier
                    .background(Color.Cyan)
                    .fillMaxWidth()
                    .fillMaxHeight(0.1f)
            ) {}
            Box(
                Modifier
                    .background(Color.Cyan)
                    .fillMaxWidth()
                    .fillMaxHeight(0.1f)
            ) {}
            Text("выход из аккаунта", Modifier.clickable { })
        }
    }


}
