package com.example.laucaiav1.prefabricated

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp


@Composable
fun BoxTask(
    modifier: Modifier = Modifier,
    nombreListaTareas: String,
    numTareas: Int,
    numTareasAcabadas: Int
) {
    Box(
        modifier
            .padding(10.dp, bottom = 10.dp, end = 10.dp, top = 35.dp)
            .fillMaxWidth()
            .height(83.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFEFD2A8),
                        Color(0xFFFFEB3B)
                    )
                )
            ), contentAlignment = Alignment.Center
        )
    {
        Text("Tareas Casa", fontWeight = FontWeight.Bold, color = Color.White, fontSize = 22.sp)
        Text("3/8")
    }




}

@Preview(showBackground = true, showSystemUi = true, backgroundColor = 223123)
@Composable
private fun Previeww() {
    BoxTask(Modifier, "Tareas casa", 8, 3)


}