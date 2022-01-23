package com.example.myrecipe.ui.home_screen

import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.myrecipe.ui.home_screen.welcome_screen.WelcomeScreen
import com.example.myrecipe.ui.theme.MyRecipeTheme

@Composable
fun SignInScreen(){
    MyRecipeTheme {
        WelcomeScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun previewSigninScreen(){
    SignInScreen()
}