package com.falconteam.parcial2.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.falconteam.parcial2.model.Product

@Composable
fun CartScreen(cartItems: List<Product>) {
    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Text("Carrito de Compras", style = MaterialTheme.typography.headlineSmall)
        Spacer(Modifier.height(8.dp))

        if (cartItems.isEmpty()) {
            Text("El carrito está vacío.")
        } else {
            LazyColumn {
                items(cartItems) { product ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    ) {
                        Row(Modifier.padding(8.dp)) {
                            AsyncImage(
                                model = product.image,
                                contentDescription = null,
                                modifier = Modifier.size(80.dp)
                            )
                            Spacer(Modifier.width(8.dp))
                            Column {
                                Text(product.name)
                                Text("Precio: $${product.price}")
                            }
                        }
                    }
                }
            }
        }
    }
}
