package com.karanjaa.CarYardManagementSystem.navigation

.theme.screens.register.RegisterScreen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.morningmvvm.ui.theme.screens.products.ViewProductsScreen
import com.example.morningmvvm.ui.theme.screens.products.ViewUploadsScreen
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_ABOUT
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_ADD_CARS
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_CAR
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_COMMERCIAL
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_COMMERCIALL
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_FAMILIA
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_FAMILY
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_HOME
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_LOGIN
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_LUXURY
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_REGISTER
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_SPLASH
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_SPORTS
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_SPORTSS
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_UPDATE_CARS
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_UPLOAD_CARS
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_VIEW_CARS
import com.karanjaa.CarYardManagementSystem.ui.theme.Screens.About.AboutScreen
import com.karanjaa.CarYardManagementSystem.ui.theme.Screens.Home.HomeScreen
import com.karanjaa.CarYardManagementSystem.ui.theme.Screens.Login.LoginScreen
import com.karanjaa.CarYardManagementSystem.ui.theme.Screens.Register.RegisterScreen
import com.karanjaa.CarYardManagementSystem.ui.theme.Screens.products.AddProductsScreen
import com.karanjaa.CarYardManagementSystem.ui.theme.Screens.Car.CarScreen
import com.karanjaa.CarYardManagementSystem.ui.theme.Screens.Commercial.CommercialScreen
import com.karanjaa.CarYardManagementSystem.ui.theme.Screens.Famiy.FamilyScreen
import com.karanjaa.CarYardManagementSystem.ui.theme.Screens.LuxuryCar.LuxuryScreen
import com.karanjaa.CarYardManagementSystem.ui.theme.Screens.products.UpdateProductsScreen
import com.karanjaa.caryardmanagementsystem2.ui.theme.Screens.Garii.CommScreen
import com.karanjaa.caryardmanagementsystem2.ui.theme.Screens.Garii.FamiliaScreen
import com.karanjaa.caryardmanagementsystem2.ui.theme.Screens.Garii.SportssScreen
import com.karanjaa.caryardmanagementsystem2.ui.theme.Screens.Splash.SplashScreen
import com.karanjaa.caryardmanagementsystem2.ui.theme.Screens.Sports.SportsScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier, navController: NavHostController= rememberNavController(),startDestination: String= ROUTE_SPLASH){
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){
        composable(ROUTE_HOME){ HomeScreen(navController=navController) }
        composable(ROUTE_LOGIN){ LoginScreen(navController=navController)}
        composable(ROUTE_REGISTER){ RegisterScreen(navController=navController)}
        composable(ROUTE_ABOUT){ AboutScreen(navController=navController)}
        composable(ROUTE_ADD_CARS){ AddProductsScreen(navController= navController)}
        composable(ROUTE_CAR){ CarScreen(navController=navController) }
        composable(ROUTE_LUXURY){ LuxuryScreen(navController=navController)}
        composable(ROUTE_FAMILY){ FamilyScreen(navController = navController)}
        composable(ROUTE_SPORTS){ SportsScreen(navController = navController)}
        composable(ROUTE_COMMERCIAL){ CommercialScreen(navController = navController)}
        composable(ROUTE_SPLASH){ SplashScreen(navController = navController)}
        composable(ROUTE_SPORTSS){ SportssScreen(navController = navController)}
        composable(ROUTE_FAMILIA){ FamiliaScreen(navController = navController)}
        composable(ROUTE_COMMERCIALL){ CommScreen(navController = navController)}
        composable(ROUTE_VIEW_CARS){
            ViewProductsScreen(navController=navController)
        }
        composable(ROUTE_UPDATE_CARS+ "/{id}"){
                passedData ->
            UpdateProductsScreen(
                navController,passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_UPLOAD_CARS){
            ViewUploadsScreen(navController=navController)
        }


    }
}