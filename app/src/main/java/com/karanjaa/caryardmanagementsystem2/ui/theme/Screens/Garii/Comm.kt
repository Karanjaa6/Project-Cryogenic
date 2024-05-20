package com.karanjaa.caryardmanagementsystem2.ui.theme.Screens.Garii


import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_CAR
import com.karanjaa.CarYardManagementSystem.ui.theme.Screens.products.AddProductsScreen
import com.karanjaa.caryardmanagementsystem2.R

@Composable
fun  CommScreen(navController: NavHostController){

    Column (

        modifier = Modifier
            .fillMaxSize()
            .background(androidx.compose.ui.graphics.Color.DarkGray)




    ){
        Navbar3(navController)
        Spacer(modifier = Modifier.height(10.dp))
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
        ) {
            Image(
                painter = painterResource(id = R.drawable.comm3),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.matchParentSize()
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        AddProductsScreen(navController)


    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navbar3(navController: NavController){
    val context = LocalContext.current.applicationContext
    TopAppBar(
        title = { Text(text = "Shop", color = androidx.compose.ui.graphics.Color.DarkGray)},
        navigationIcon = {
            IconButton(onClick = { navController.navigate(ROUTE_CAR) }) {
                Icon(imageVector = Icons.Filled.Home, contentDescription = "HOME", tint = androidx.compose.ui.graphics.Color.Gray)
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = androidx.compose.ui.graphics.Color.White,
            titleContentColor = androidx.compose.ui.graphics.Color.White,
            navigationIconContentColor = androidx.compose.ui.graphics.Color.White
        )
    )
}



@Preview
@Composable
fun CommScreenPreview(){
    CommScreen(rememberNavController())
}