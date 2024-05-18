package com.karanjaa.CarYardManagementSystem.ui.theme.Screens.LuxuryCar

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
import com.karanjaa.CarYardManagementSystem.ui.theme.Screens.LuxuryCar.ui.theme.CarYardManagementSystemTheme
import com.karanjaa.caryardmanagementsystem2.Item
import com.karanjaa.caryardmanagementsystem2.R

class LuxuryActivity : ComponentActivity() {

    companion object {
        val items = listOf(
            Item(
                title = "Lexus",
                image = R.drawable.sports,
                Route = "",
                Value = 500000
            ),
            Item(
                title = "Mercedes",
                image = R.drawable.luxury,
                Route = "",
                Value = 477792
            ),
            Item(
                title = "Cadillac",
                image = R.drawable.family,
                Route = "",
                Value = 800033
            ),
            Item(
                title = "Chevrolet",
                image = R.drawable.commercial,
                Route = "",
                Value = 560000
            ),
            Item(
                title = "Ford",
                image = R.drawable.commercial,
                Route = "",
                Value = 370000
            ),
            Item(
                title = "Renault",
                image = R.drawable.commercial,
                Route = "",
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
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CarYardManagementSystemTheme {
        Greeting("Android")
    }
}