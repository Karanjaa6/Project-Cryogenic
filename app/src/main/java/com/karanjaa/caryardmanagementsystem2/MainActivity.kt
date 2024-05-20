package com.karanjaa.caryardmanagementsystem2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_COMMERCIAL
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_FAMILY
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_LUXURY
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_SPORTS
import com.karanjaa.CarYardManagementSystem.navigation.theme.screens.register.RegisterScreen.AppNavHost
import com.karanjaa.caryardmanagementsystem2.ui.theme.CarYardManagementSystem2Theme

class MainActivity : ComponentActivity() {

    companion object {
        val items = listOf(
            Item(
                title = "Sports Vehicles",
                image = R.drawable.rari,
                Route = ROUTE_SPORTS,
                Value = 3
            ),
            Item(
                title = "Luxury Vehicles",
                image = R.drawable.rolls,
                Route = ROUTE_LUXURY,
                Value = 3
            ),
            Item(
                title = "Family Vehicles",
                image = R.drawable.familllll,
                Route = ROUTE_FAMILY,
                Value = 3
            ),
            Item(
                title = "Commercial",
                image = R.drawable.comm3,
                Route = ROUTE_COMMERCIAL,
                Value = 3
            )


        )
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarYardManagementSystem2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                AppNavHost()
                }
            }
        }
    }
}

