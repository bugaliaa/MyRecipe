package com.example.myrecipe.ui.home_screen.welcome_screen.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.unit.dp

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