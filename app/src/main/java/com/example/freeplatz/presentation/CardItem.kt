package com.example.freeplatz.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.freeplatz.model.Task

@Composable
fun CardItem(task: Task) {


    Card(
        modifier = Modifier
            .shadow(shape = RectangleShape, elevation = 50.dp)
            .clickable {}

    ) {
        Column(
            modifier = Modifier
                .height(200.dp)
                .fillMaxSize()
                .background(Color(0xFCFCFC))
                .padding(10.dp, 10.dp),
        ) {
            Text(
                text = task.header,
                color = Color(0xFF6F79A8),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )

            Text(
                text = "${task.priceValue} $",
                color = Color.Black,
                fontSize = 16.sp
            )



            Text(
                text = task.task,
                overflow = TextOverflow.Ellipsis,
                maxLines = 3,
                color = Color.Black,
                fontSize = 14.sp
            )

            Divider(color = Color(0xFF6F79A8), thickness = 1.dp)

            Text(
                text = task.date,
                color = Color.Black,
                fontSize = 14.sp
            )
        }
    }
}
