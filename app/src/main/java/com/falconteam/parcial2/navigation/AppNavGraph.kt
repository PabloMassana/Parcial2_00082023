package com.falconteam.parcial2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.falconteam.parcial2.ui.screens.CartScreen
import com.falconteam.parcial2.ui.screens.ProductDetailScreen
import com.falconteam.parcial2.ui.screens.ProductListScreen
import com.falconteam.parcial2.viewmodel.ProductViewModel

@Composable
fun AppNavGraph(
    navController: NavHostController = rememberNavController(),
    viewModel: ProductViewModel
) {
    NavHost(navController = navController, startDestination = Routes.ProductList.route) {
        composable(Routes.ProductList.route) {
            ProductListScreen(viewModel = viewModel, navController = navController)
        }
        composable(Routes.ProductDetail.route) { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId")?.toIntOrNull()
            productId?.let {
                val product = viewModel.getProductById(it)
                product?.let {
                    ProductDetailScreen(
                        product = product,
                        onAddToCart = {
                            viewModel.addToCart(product.id)
                            navController.popBackStack()
                        }
                    )
                }
            }
        }
        composable(Routes.Cart.route) {
            CartScreen(cartItems = viewModel.getCart())
        }
    }
}
