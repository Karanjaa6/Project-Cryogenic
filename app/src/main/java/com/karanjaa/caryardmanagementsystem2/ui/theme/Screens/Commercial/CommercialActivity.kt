package com.karanjaa.CarYardManagementSystem.ui.theme.Screens.Commercial

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
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_COMMERCIALL
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_LURIOUS
import com.karanjaa.CarYardManagementSystem.ui.theme.Screens.Commercial.ui.theme.CarYardManagementSystemTheme

import com.karanjaa.caryardmanagementsystem2.Item
import com.karanjaa.caryardmanagementsystem2.R


class CommercialActivity : ComponentActivity() {

    companion object {
        val items = listOf(
            Item(
                title = "Mercedes",
                image = R.drawable.trck2,
                Route = ROUTE_COMMERCIALL,
                Value = 500000
            ),
            Item(
                title = "Renault",
                image = R.drawable.truck3,
                Route = ROUTE_COMMERCIALL,
                Value = 477792
            ),
            Item(
                title = "Man",
                image = R.drawable.truck4,
                Route = ROUTE_COMMERCIALL,
                Value = 800033
            ),
            Item(
                title = "Chevrolet",
                image = R.drawable.truck7,
                Route = ROUTE_COMMERCIALL,
                Value = 560000
            ),
            Item(
                title = "Ford",
                image = R.drawable.truck5,
                Route = ROUTE_COMMERCIALL,
                Value = 370000
            ),
            Item(
                title = "Scania",
                image = R.drawable.truck6,
                Route = ROUTE_COMMERCIALL,
                Value = 578000
            )


        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarYardManagementSystemTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting3("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    CarYardManagementSystemTheme {
        Greeting3("Android")
    }
}