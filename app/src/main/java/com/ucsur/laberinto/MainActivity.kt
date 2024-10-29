package com.ucsur.laberinto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ucsur.laberinto.navigation.AppScreens
import com.ucsur.laberinto.ui.screens.SplashScreen
import com.ucsur.laberinto.ui.theme.LaberintoTheme

// Actividad principal que configura la navegación y el tema
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LaberintoTheme {
                val navController = rememberNavController() // Configura el navegador principal
                NavHost(
                    navController = navController,
                    startDestination = AppScreens.SplashScreen.route
                ) {
                    composable(route = AppScreens.SplashScreen.route) { // Define la ruta del splash screen
                        SplashScreen(navController)
                    }
                    // Aquí se añadirán las demás rutas
                }
            }
        }
    }
}