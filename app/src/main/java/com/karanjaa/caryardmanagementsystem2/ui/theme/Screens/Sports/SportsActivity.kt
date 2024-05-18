package com.karanjaa.caryardmanagementsystem2.ui.theme.Screens.Sports

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
import com.karanjaa.caryardmanagementsystem2.Item
import com.karanjaa.caryardmanagementsystem2.R
import com.karanjaa.caryardmanagementsystem2.ui.theme.Screens.Sports.ui.theme.CarYardManagementSystem2Theme

class SportsActivity : ComponentActivity() {

    companion object {
        val items = listOf(
            Item(
                title = "McLaren",
                image = R.drawable.sports1,
                Route = "",
                Value = 500000
            ),
            Item(
                title = "Mercedes",
                image = R.drawable.sports2,
                Route = "",
                Value = 477792
            ),
            Item(
                title = "Konisegg",
                image = R.drawable.sports3,
                Route = "",
                Value = 800033
            ),
            Item(
                title = "Jaguar",
                image = R.drawable.sports5,
                Route = "",
                Value = 560000
            ),
            Item(
                title = "Ferari",
                image = R.drawable.sports6,
                Route = "",
                Value = 370000
            ),
            Item(
                title = "Lamborghini",
                image = R.drawable.sports7,
                Route = "",
                Value = 578000
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
                    Greeting4("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting4(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    CarYardManagementSystem2Theme {
        Greeting4("Android")
    }
}