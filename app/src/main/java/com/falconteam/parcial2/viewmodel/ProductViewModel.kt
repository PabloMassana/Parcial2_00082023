package com.falconteam.parcial2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.falconteam.parcial2.model.Product
import kotlinx.coroutines.flow.*

class ProductViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(ProductUIState())
    val uiState: StateFlow<ProductUIState> = _uiState.asStateFlow()

    val filteredProducts: StateFlow<List<Product>> = uiState
        .map { state ->
            val query = state.searchQuery.lowercase()
            state.products.filter {
                it.name.lowercase().contains(query) || it.category.lowercase().contains(query)
            }
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun updateSearch(query: String) {
        _uiState.update { it.copy(searchQuery = query) }
    }

    fun getProductById(id: Int): Product? =
        _uiState.value.products.find { it.id == id }

    fun addToCart(productId: Int) {
        _uiState.update {
            it.copy(
                products = it.products.map { product ->
                    if (product.id == productId) product.copy(addedToCart = true) else product
                }
            )
        }
    }

    fun getCart(): List<Product> =
        _uiState.value.products.filter { it.addedToCart }
}