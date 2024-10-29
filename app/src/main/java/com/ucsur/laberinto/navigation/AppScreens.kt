package com.ucsur.laberinto.navigation

// Define las rutas de navegación de la aplicación
sealed class AppScreens(val route: String) {
    object SplashScreen: AppScreens("splash_screen") // Pantalla inicial con logo animado
    object MainMenuScreen: AppScreens("main_menu_screen") //Menú principal
    object GameScreen: AppScreens("game_screen") // Pantalla del laberinto
    object InstructionsScreen: AppScreens("instructions_screen") // Pantalla de reglas del juego
    object CreditsScreen: AppScreens("credits_screen") // Pantalla de créditos
}