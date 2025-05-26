package com.falconteam.parcial2.navigation

sealed class Routes(val route: String) {
    object ProductList : Routes("product_list")
    object ProductDetail : Routes("product_detail/{productId}") {
        fun createRoute(productId: Int) = "product_detail/$productId"
    }
    object Cart : Routes("cart")
}
