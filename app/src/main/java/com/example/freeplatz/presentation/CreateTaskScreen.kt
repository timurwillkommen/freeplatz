package com.example.freeplatz.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.freeplatz.model.Screen

@Composable
fun CreateTaskScreen(navController: NavHostController) {


    val subject = rememberSaveable { mutableStateOf("") }
    val price = remember { mutableStateOf("") }
    val date = remember { mutableStateOf("") }
    val task = remember { mutableStateOf("") }

    Scaffold(topBar = {
        TopAppBar(title = { Text("Создание задания") }, backgroundColor = Color.White,
            navigationIcon = {
                IconButton(onClick = { navController.navigate(Screen.MainScreen.route) }) {
                    Icon(Icons.Filled.ArrowBack, null)
                }
            })
    }) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize(1f)
                .padding(20.dp)
        ) {
            OutlinedTextField(modifier = Modifier,
                value = subject.value,
                onValueChange = { subject.value = it },
                label = {
                    Text(text = "Заголовок")
                }
            )

            OutlinedTextField(
                value = price.value, onValueChange = { price.value = it },
                label = {
                    Text(text = "Цена")
                }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )

            OutlinedTextField(value = date.value, onValueChange = { date.value = it }, label = {
                Text(text = "Срок")
            }
            )

            OutlinedTextField(value = task.value, onValueChange = { task.value = it }, label = {
                Text(text = "Задача")
            }
            )

            OutlinedButton(
                onClick = { /* Do something! */ }, colors = ButtonDefaults.outlinedButtonColors(
                    disabledContentColor = Color(0xFFD1D9FF)
                )
            ) {
                Text("Добавить файлы")
            }

            Button(
                onClick = { /* Do something! */ }, colors = ButtonDefaults.textButtonColors(
                    backgroundColor = Color(0xFFD1D9FF)
                )
            ) {
                Text("Опубликовать", color = Color.Black)
            }


        }
    }


}