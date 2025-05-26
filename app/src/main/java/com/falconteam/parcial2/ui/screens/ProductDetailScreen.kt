package com.falconteam.parcial2.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.falconteam.parcial2.model.Product

@Composable
fun ProductDetailScreen(product: Product, onAddToCart: () -> Unit) {
    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Text(
            product.name,
            style = MaterialTheme.typography.headlineSmall,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        AsyncImage(
            model = product.image,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth().height(250.dp)
        )

        Spacer(Modifier.height(16.dp))

        Text("Categoría: ${product.category}")
        Text("Precio: $${product.price}")
        Text(product.description, modifier = Modifier.padding(top = 8.dp))

        Spacer(Modifier.height(24.dp))

        Button(
            onClick = onAddToCart,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Agregar al carrito")
        }
    }
}
