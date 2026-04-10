package com.udeh.markethub.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.udeh.markethub.R
import com.udeh.markethub.navigation.ROUT_HOME
import com.udeh.markethub.navigation.ROUT_REGISTER
import com.udeh.markethub.ui.theme.newgreen
import com.udeh.markethub.ui.theme.purple

@Composable
fun LoginScreen(navController: NavController){


    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painter = painterResource(R.drawable.abstract_pattern_design_background_2007), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {
        Image(
            painter = painterResource(R.drawable.heli),
            contentDescription = "product",
            modifier = Modifier.size(100.dp),

            )

        Text(
            text= "Welcome Back!",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            color = purple,

            )

        Spacer(modifier = Modifier.height(20.dp))

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(
                imageVector = Icons.Default.Person,
                contentDescription = ""
            ) },
            label = { Text(text = "Enter Your Email",
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.Black) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = purple,
                focusedBorderColor = Color.Black,
                unfocusedLeadingIconColor = purple,
            )

        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            label = { Text(text = "Enter Your Password",
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Black) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = purple,
                focusedBorderColor = Color.Black,
                unfocusedLeadingIconColor = purple,
            ),
            visualTransformation = PasswordVisualTransformation()

        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {navController.navigate(ROUT_HOME)},
            colors = ButtonDefaults.buttonColors(purple),
            shape = RoundedCornerShape(18.dp),
            modifier = Modifier.width(350.dp),


            ) {
            Text(text = "Login")
        }

        TextButton(onClick = {navController.navigate(ROUT_REGISTER)}) {
            Text(text = "Don't have an Account? Register.",
                color = purple,
                fontWeight = FontWeight.ExtraBold,
            )


        }
    }

}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())

}
