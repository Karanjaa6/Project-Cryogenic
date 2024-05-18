package com.karanjaa.CarYardManagementSystem.ui.theme.Screens.Home


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_CAR
//import com.karanjaa.caryardmanagementsystem.navigation.ROUTE_ADD_CARS
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_VIEW_CARS
import com.karanjaa.caryardmanagementsystem2.R


@Composable
fun HomeScreen(navController: NavController){
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.mini2),
            contentDescription ="back",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize() )
    }
    Column(modifier = Modifier
        .fillMaxSize()) {
        var context= LocalContext.current
        // var productdata=productviewmodel(navController,context)


       androidx.compose.material3.Text(text = "WELCOME TO CRYOGENIC MOTORS",
            color = Color.Black,
            fontFamily = FontFamily.SansSerif,
            fontSize = 40.sp)

        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = {
            navController.navigate(ROUTE_CAR)},
            colors = ButtonDefaults.buttonColors(Color.Gray)) {
            Text(text = "View Vehicles")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            navController.navigate(ROUTE_VIEW_CARS)
        }, colors = ButtonDefaults.buttonColors(Color.Gray)) {
            Text(text = "View Vehicle")
        }
        Spacer(modifier = Modifier.height(10.dp))



    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}