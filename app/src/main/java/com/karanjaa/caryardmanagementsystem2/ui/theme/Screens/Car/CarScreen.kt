package com.karanjaa.CarYardManagementSystem.ui.theme.Screens.Car

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_HOME
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_REGISTER
import com.karanjaa.caryardmanagementsystem2.Item
import com.karanjaa.caryardmanagementsystem2.MainActivity

@Composable
fun CarScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray)) {
        Navbar(navController)
        LazyColumnScreen(navController)




    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navbar(navController: NavController){
    val context = LocalContext.current.applicationContext
    TopAppBar(
        title = { Text(text = "CarYard Motors", color = Color.DarkGray) },
        navigationIcon = {
            IconButton(onClick = {navController.navigate(ROUTE_HOME)}) {
                Icon(imageVector = Icons.Filled.Home, contentDescription = "HOME", tint = Color.DarkGray)
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White
        ),
        actions = {
            IconButton(onClick = {navController.navigate(ROUTE_REGISTER)}) {
                Icon(imageVector = Icons.Filled.Create, contentDescription = "Account", tint = Color.DarkGray)
            }
        })
}

@Composable
fun LazyColumnScreen(navController:NavController){
    LazyColumn (
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    )
    {

        itemsIndexed(MainActivity.items){ index, item ->
            ColumnItem(item = item)
            Spacer(modifier = Modifier.width(8.dp))
            Spacer(modifier = Modifier.height(15.dp))
            Button(onClick = { navController.navigate(item.Route)  }, colors =ButtonDefaults.buttonColors(Color.Yellow)) {
                Text(text = item.title)
            }
        }


    }
}
@Composable
fun ColumnItem(item: Item){
    Column (
        modifier = Modifier
            .clip(RoundedCornerShape(30.dp))
            .height(250.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = item.image),
            contentDescription = item.title,
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(8.dp))


    }
}


@Preview()
@Composable
fun CarScreenPreview(){
    CarScreen(rememberNavController())
}
