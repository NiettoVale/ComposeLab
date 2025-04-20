package com.example.composelab.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.composelab.ui.views.HomeScreen
import com.example.composelab.ui.views.ImagesScreen
import com.example.composelab.ui.views.LoginScreen

// Función que define las rutas y sus pantallas asociadas
@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home" // Ruta inicial al abrir la app
    ) {
        // Definición de la pantalla Home
        composable("home") { HomeScreen(navController) }
        // Definición de la pantalla Login
        composable("login") { LoginScreen(navController) }
        // Definición de la pantalla Images
        composable("carrusel") { ImagesScreen(navController) }
    }
}
