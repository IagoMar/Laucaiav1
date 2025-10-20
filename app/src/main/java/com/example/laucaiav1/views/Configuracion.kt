package com.example.laucaiav1.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.laucaiav1.MyApp

@Composable
fun PantallaConfiguracion(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF2196F3), // Azul
                        Color(0xFF9C27B0)  // Morado
                    )
                )
            )
    )

    {
        val margenArriba = createGuidelineFromTop(0.08f)
        val margenStart = createGuidelineFromStart(0.03f)
        val margenEnd = createGuidelineFromEnd(0.03f)

        val (texto) = createRefs()

        Text(
            text = "CONFIGURACIÓN",
            fontFamily = FontFamily(Font(com.example.laucaiav1.R.font.mi_fuente)),
            modifier = modifier.constrainAs(texto) { // 👈 aquí el "=" es obligatorio
                top.linkTo(margenArriba)
                start.linkTo(margenStart)
                end.linkTo(margenEnd)
            },
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun Previeww() {
    PantallaConfiguracion(Modifier)
    MyApp()

}