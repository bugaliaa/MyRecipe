package com.example.myrecipe.ui.home_screen.welcome_screen.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myrecipe.R

@Composable
fun WelcomeScreenMessage(){
    Image(
        painter = painterResource(id = R.drawable.login_screen),
        contentDescription = "Welcome Screen Logo",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .clip(CircleShape)
            .size(164.dp)
    )
    Spacer(modifier = Modifier.size(24.dp))
    Text(
        text = "Welcome to Recipe App",
        style = TextStyle(color = Color.Black, fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
    )
}