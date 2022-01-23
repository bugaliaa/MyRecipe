package com.example.myrecipe.ui.home_screen.welcome_screen

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myrecipe.ui.home_screen.welcome_screen.composables.SignInButtons
import com.example.myrecipe.ui.home_screen.welcome_screen.composables.WelcomeScreenMessage

@Composable
fun WelcomeScreen(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        WelcomeScreenMessage()
        Spacer(modifier = Modifier.size(24.dp))
        SignInButtons()
    }
}