package com.example.laucaiav1.navigation

sealed class Destinations(val route: String) {
    object Listas : Destinations("listas")
    object Compartidos : Destinations("compartidos")
    object Configuracion : Destinations("configuracion")
    data class Pantalla11(val myParameter: String) : Destinations("pantalla11/{myParameter}") {
        fun createRoute() = "pantalla11/$myParameter"
    }
}