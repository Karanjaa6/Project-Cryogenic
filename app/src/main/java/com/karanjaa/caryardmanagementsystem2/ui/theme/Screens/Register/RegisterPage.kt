package com.karanjaa.CarYardManagementSystem.ui.theme.Screens.Register


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.TextField

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.karanjaa.CarYardManagementSystem.data.AuthViewModel
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_ABOUT
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_HOME
import com.karanjaa.CarYardManagementSystem.navigation.ROUTE_LOGIN
import com.karanjaa.caryardmanagementsystem2.R


@Composable
fun RegisterScreen(navController: NavController)

{
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.mini),
            contentDescription = "Register",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())
    }
    var fullnames by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var pass by remember { mutableStateOf("") }
    var confirmpass by remember { mutableStateOf("") }
    var contact by remember { mutableStateOf("") }
    var context= LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()) {

       androidx.compose.material3.Text(
            text = "Create an account",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = fullnames,
            onValueChange = { fullnames = it },
            placeholder = { Text(text = "Enter your full names") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "person"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { androidx.compose.material3.Text(text = "Enter email") },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = contact,
            onValueChange = { contact = it },
            placeholder = { androidx.compose.material3.Text(text = "Enter contact") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription = "contact"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = confirmpass,
            onValueChange = { confirmpass= it },
            placeholder = { androidx.compose.material3.Text(text = "Enter password") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "password"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = contact,
            onValueChange = { contact = it },
            placeholder = { androidx.compose.material3.Text(text = "Enter your mobile number") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription = "location"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))


        Button(onClick = {
            val myregister= AuthViewModel(navController,context)
            myregister.signup(fullnames.trim(),email.trim(),pass.trim(),confirmpass.trim())
            navController.navigate(ROUTE_HOME)




        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Register ")
        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ROUTE_LOGIN)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Have an Account? Click to Login")
        }
        Spacer(modifier = Modifier.height(20.dp))
        
        Button(onClick = {navController.navigate(ROUTE_ABOUT)}, 
            modifier = Modifier.fillMaxWidth()) {
            Text(text = "About Us")
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterScreenPreview() {
    RegisterScreen(rememberNavController())

}