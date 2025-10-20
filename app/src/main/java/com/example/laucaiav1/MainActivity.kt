package com.example.laucaiav1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ListAlt
import androidx.compose.material.icons.filled.PeopleOutline
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.SettingsSuggest
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.laucaiav1.navigation.Destinations
import com.example.laucaiav1.navigation.NavigationItem
import com.example.laucaiav1.navigation.NavigationWrapper
import com.example.laucaiav1.ui.theme.LaucaiaV1Theme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LaucaiaV1Theme {
                MyApp()
            }
        }
    }
}
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyApp() {
    var selectedItem: Int by remember { mutableIntStateOf(0) }
    val items = listOf(
        NavigationItem("Listas", Icons.Default.ListAlt, Destinations.Listas, 0),
        NavigationItem("Compartido", Icons.Default.PeopleOutline, Destinations.Compartidos, 1),
        NavigationItem("Configuracion", Icons.Default.SettingsSuggest, Destinations.Configuracion, 2)
    )
    val navController = rememberNavController()

    Scaffold(bottomBar = {
        NavigationBar(containerColor = Color.Black   // Color de fondo en negro
        ) {
            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = item.index == selectedItem,
                    label = {Text(
                        text = item.label,
                        fontFamily = FontFamily(Font(com.example.laucaiav1.R.font.mi_fuente)),
                        fontSize = 12.sp, // ajusta si quieres
                        color = Color.White
                    ) },
                    icon = { Icon(imageVector = item.icon, contentDescription = item.label) },
                    onClick = {
                        selectedItem = index
                        // Se pasa la cadena de ruta en lugar del objeto Destinations
                        navController.navigate(item.route.route)
                    },
                    colors = NavigationBarItemDefaults.colors(
                        contentColorFor(Color.White),
                        unselectedIconColor = Color.White
                    )
                )
            }
        }
    }) {
        NavigationWrapper(navController)
    }
}