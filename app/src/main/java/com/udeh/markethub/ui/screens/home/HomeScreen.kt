package com.udeh.markethub.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.udeh.markethub.R
import com.udeh.markethub.navigation.ROUT_INTENT
import com.udeh.markethub.ui.theme.newgreen
import com.udeh.markethub.ui.theme.purple

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun HomeScreen(navController: NavController){


    Column(
        modifier = Modifier.fillMaxSize()

    ) {
        //Top App Bar
        TopAppBar(
            title ={ Text(text = "Home")},
            navigationIcon = {
                IconButton(
                    onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu"
                    ) }
            },

        actions = {
            IconButton(
                onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Notifications"
                )}
            IconButton(
                onClick = {}) {
                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = "ShoppingCart"
                )}
            IconButton(
                onClick = {
                    navController.navigate(ROUT_INTENT)
                }) {
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Share"
                )}

        },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.White,
                navigationIconContentColor = purple,
                titleContentColor = purple,
                actionIconContentColor = purple,
            )
        ) //End Of Top App Bar





        Spacer(modifier = Modifier.height(20.dp))

        //Search Bar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier.padding(start = 20.dp,end = 20.dp). fillMaxWidth(),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },
            placeholder = { Text(text = "Search for Products",
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black,)},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Black,
                focusedBorderColor = purple,
                unfocusedLeadingIconColor = Color.Black,
                focusedLeadingIconColor = purple
            )

        )

        //End of Search Bar

        Spacer(modifier = Modifier.height(20.dp))

        //Categories
        Text(
            text= "Categories",
            modifier =Modifier.padding(start = 20.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,

        )




        //Row in the categories section
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier =Modifier.padding(start = 20.dp,end = 20.dp).horizontalScroll(
                rememberScrollState()
            ),
        ) {
            Column() {
                Image(
                    painter = painterResource(R.drawable.electronics),
                    contentDescription = "product",
                    //This is for border radius
                    modifier = Modifier.size(100.dp).clip(shape= RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop
                    )
                Text(
                    text="Electronics",
                    fontSize = 20.sp,
                )
            }
            Spacer(modifier = Modifier.width(20.dp))


            Column() {
                Image(
                    painter = painterResource(R.drawable.electronics),
                    contentDescription = "product",


                    //This is for border radius
                    modifier = Modifier.size(100.dp).clip(shape= RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop

                )
                Text(
                    text="Electronics",
                    fontSize = 20.sp,
                )
            }
            Spacer(modifier = Modifier.width(20.dp))
            Column() {
                Image(
                    painter = painterResource(R.drawable.electronics),
                    contentDescription = "product",


                    //This is for border radius
                    modifier = Modifier.size(100.dp).clip(shape= RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop

                )
                Text(
                    text="Electronics",
                    fontSize = 20.sp,
                )
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column() {
                Image(
                    painter = painterResource(R.drawable.electronics),
                    contentDescription = "product",


                    //This is for border radius
                    modifier = Modifier.size(100.dp).clip(shape= RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop

                )
                Text(
                    text="Electronics",
                    fontSize = 20.sp,
                )
            }
        }
            //End of Row



    }

    }

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController()) //The function has to be called for the screen to be viewed

}



