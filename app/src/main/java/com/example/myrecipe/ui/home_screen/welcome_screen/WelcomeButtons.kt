package com.example.myrecipe.ui.home_screen.welcome_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PhoneAndroid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myrecipe.R
import com.example.myrecipe.ui.theme.MyRecipeTheme

@Composable
fun SignInButtons(){
    GoogleButton()
    Spacer(modifier = Modifier.size(16.dp))
    PhoneButton()
}

@Composable
fun GoogleButton(){
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .padding(end = 20.dp, start = 20.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(25)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_google_logo),
            contentDescription = "Google Button",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(20.dp)
        )
        Text(
            text = "Sign in using Google",
            modifier = Modifier.padding(start = 4.dp)
        )
    }
}

@Composable
fun PhoneButton(){
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .padding(end = 20.dp, start = 20.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(25)
    ) {
        Image(
            imageVector = Icons.Filled.PhoneAndroid,
            contentDescription = "Google Button",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(20.dp)
        )
        Text(
            text = "Sign in using Phone",
            modifier = Modifier.padding(start = 4.dp)
        )
    }
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