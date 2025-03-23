package com.example.composelab.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

// Función que maneja la navegación en la app
@Composable
fun AppNavigation() {
    // Se crea un controlador de navegación
    val navController = rememberNavController()
    // Se pasa el controlador a la estructura de navegación
    NavGraph(navController = navController)
}