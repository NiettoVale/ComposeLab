package com.example.composelab.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composelab.R

// Pantalla principal de la app
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    // Accede al color primario del tema
    val primaryColor = MaterialTheme.colorScheme.primary

    Column(modifier = Modifier.fillMaxSize()) {
        // TopAppBar con título y logo
        TopAppBar(
            title = { Text(text = "ComposeLab") },
            actions = {
                Icon(
                    painter = painterResource(id = R.drawable.icono_composelab),
                    tint = Color.Unspecified,
                    contentDescription = "Logo de la app",
                    modifier = Modifier.padding(8.dp)
                )
            },
            colors = TopAppBarDefaults.topAppBarColors(containerColor = primaryColor) // Usar el color primario
        )

        // Contenido principal dentro de LazyColumn
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)// Usamos weight(1f) para que ocupe el espacio disponible sin afectar el footer
                .padding(vertical = 20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Button(onClick = { navController.navigate("login") }) {
                    Text(text = "Login UI")
                }

                Button(onClick = { navController.navigate("carrusel") }) {
                    Text(text = "Carrusel de imagenes")
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(primaryColor),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Desarrollado por @NiettoVale",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }
    }
}
