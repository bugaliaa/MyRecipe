package com.example.myrecipe.ui.home_screen.welcome_screen.composables

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myrecipe.ui.theme.MyRecipeTheme

@Composable
fun SignInButtons(){
    AuthView(){}
    Spacer(modifier = Modifier.size(16.dp))
    PhoneButton()
}

@Preview
@Composable
fun previewButtons(){
    MyRecipeTheme() {
        Column {
            SignInButtons()
        }
    }

}