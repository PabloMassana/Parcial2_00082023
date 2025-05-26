package com.falconteam.parcial2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.falconteam.parcial2.navigation.AppNavGraph
import com.falconteam.parcial2.ui.theme.Parcial2Theme
import com.falconteam.parcial2.viewmodel.ProductViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: ProductViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Parcial2Theme {
                AppNavGraph(viewModel = viewModel)
            }
        }
    }
}
