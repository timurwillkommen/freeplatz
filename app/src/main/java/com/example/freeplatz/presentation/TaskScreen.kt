package com.example.freeplatz.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun TaskScreen(){
    Column()
    {
        Row(){}
        Text(text="Задача")
        Text(text="Какая-то задача")
        Text(text = "Дополнительные файлы")
        Row(){/*фотографии, файлы*/}
        Text(text = "Срок")
        Button(onClick = { /*TODO*/ } ) {
            Text(text ="Взять задание" )
        }
    }
}