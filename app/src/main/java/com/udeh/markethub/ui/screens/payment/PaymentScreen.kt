package com.udeh.markethub.ui.screens.payment

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.udeh.markethub.ui.theme.purple

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun PaymentScreen (navController: NavController){


    Column(
        modifier = Modifier
            .fillMaxSize()


    ) {

        TopAppBar(
            title ={ Text(text = "Payments",
                color = purple)},
            navigationIcon = {
                IconButton(
                    onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                    ) }
            },


            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.White,
                navigationIconContentColor = purple,
                titleContentColor = purple,
                actionIconContentColor = purple,
            )


        )

    }

}

@Preview(showBackground = true)
@Composable
fun PaymentScreenPreview()
    {PaymentScreen(rememberNavController())

}