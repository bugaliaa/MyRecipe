package com.example.myrecipe.ui.home_screen.welcome_screen.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myrecipe.R
import com.example.myrecipe.ui.theme.MyRecipeTheme

@Composable
fun GoogleButton(
    text: String = "Sign in with Google",
    loadingText: String = "Signing In...",
    icon: Painter = painterResource(id = R.drawable.ic_google_logo),
    isLoading:Boolean = false,
    progressIndicatorColor: Color = MaterialTheme.colors.primary,
    onClick: () -> Unit
){
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .padding(end = 20.dp, start = 20.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(25)
    ) {
        Image(
            painter = icon,
            contentDescription = "Google Button",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(20.dp)
        )
        Text(
            text = if(isLoading) loadingText else text,
            modifier = Modifier.padding(start = 4.dp)
        )
        if (isLoading){
            Spacer(modifier = Modifier.size(8.dp))
            CircularProgressIndicator(
                modifier = Modifier
                    .height(16.dp)
                    .width(16.dp),
                strokeWidth = 2.dp,
                color = progressIndicatorColor
            )
        }
    }
}

@Composable
fun AuthView(
    onClick: () -> Unit
){
    var isLoading by remember {
        mutableStateOf(false)
    }

    GoogleButton(onClick = {
        isLoading = true
        onClick
    })
}

@Preview
@Composable
fun previewGoogleButton(){
    MyRecipeTheme() {
        GoogleButton() {}
    }
}

@Preview
@Composable
fun previewAuthView(){
    MyRecipeTheme() {
        GoogleButton() {}
    }
}