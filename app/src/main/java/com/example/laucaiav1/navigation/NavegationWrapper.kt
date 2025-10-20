package com.example.laucaiav1.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.laucaiav1.views.PantallaCompartido
import com.example.laucaiav1.views.PantallaConfiguracion
import com.example.laucaiav1.views.PantallaListas


@Composable
fun NavigationWrapper(navController: NavHostController) {
    NavHost(navController, startDestination = Destinations.Listas.route) {
        composable(Destinations.Listas.route) {
            PantallaListas()
        }
        composable(Destinations.Compartidos.route) {
            PantallaCompartido()

        }

        composable(Destinations.Configuracion.route) {
            PantallaConfiguracion()
        }

    }

}