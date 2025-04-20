package com.example.composelab.ui.views

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ImagesScreen(navController: NavController) {
    // Simulamos algunas URLs para las imágenes (en este caso, solo nombres como ejemplo)
    val imagenes = listOf(
        "https://images5.alphacoders.com/137/1372162.jpeg",
        "https://images7.alphacoders.com/134/1347908.png",
        "https://images6.alphacoders.com/137/1372163.jpeg",
    )

    // Llamamos a la función de carrusel
    CarruselImages(imagenes)
}