package com.udeh.markethub.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.SurfaceCoroutineScope
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextPainter.paint
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.udeh.markethub.R
import com.udeh.markethub.navigation.ROUT_ONBOARDING
import com.udeh.markethub.ui.screens.payment.PaymentScreen
import com.udeh.markethub.ui.theme.purple
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SplashScreen (navController: NavController){



    //Navigation to the next after the splash screen
    val coroutine = rememberCoroutineScope()
    coroutine.launch {
        delay(2000)
        navController.navigate(ROUT_ONBOARDING)

    //End
    }



    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(purple),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,

    ) {
        Image(
            painter = painterResource(R.drawable.heli),
            contentDescription = "product",
            modifier = Modifier.size(100.dp),

            )

        Text(
            text = "Market Hub",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

    }

}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview()
{SplashScreen(rememberNavController())
}