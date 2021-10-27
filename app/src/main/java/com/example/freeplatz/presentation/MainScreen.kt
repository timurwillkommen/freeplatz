package com.example.freeplatz.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import androidx.navigation.NavHostController
import com.example.freeplatz.model.Screen
import com.example.freeplatz.repository.TaskRepository

@Composable
fun MainScreen(navController: NavHostController) {
    val taskRepository = TaskRepository()
    val getAllData = taskRepository.getAllData()


    Scaffold(
        topBar = { TopAppBar(title = { Text("Список заданий") }, backgroundColor = Color.White) },
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = {
            FloatingActionButton(

                onClick = { navController.navigate(Screen.CreateTaskScreen.route) },
                backgroundColor = Color(0xFF66A6FF)
            ) {
                Text("+")
            }
        }) {


        LazyColumn(
            contentPadding = PaddingValues(all = 12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFFFDFBFB),
                            Color(0xFFFEBEDEE)
                        )
                    )
                )
        ) {

            items(items = getAllData) { task ->
                CardItem(task = task)
            }

        }
    }


}



