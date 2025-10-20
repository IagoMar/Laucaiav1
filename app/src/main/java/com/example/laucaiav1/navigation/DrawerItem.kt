package com.example.laucaiav1.navigation


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

enum class DrawerItem(
    val icon: ImageVector,
    val text: String,
    val route: Destinations
) {
    LISTAS(Icons.Default.Home, "Listas", Destinations.Listas),
    COMPARTIDOS(Icons.Default.Settings, "Settings", Destinations.Compartidos),
    AJUSTES(Icons.Default.Info, "About", Destinations.Configuracion),
}