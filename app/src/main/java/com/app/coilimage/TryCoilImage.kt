package com.app.coilimage

import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation

@Composable
fun ImageCoil(){
    Box(
        modifier = Modifier
            .height(150.dp)
            .width(150.dp),
        contentAlignment = Alignment.Center
    ){
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data("https://avatars.githubusercontent.com/u/14994036?v=4")
                .error(R.drawable.imageerror)
                .placeholder(R.drawable.imageplaceholder)
                .crossfade(1000)
                .transformations(
                    CircleCropTransformation()
                )
                .build(),
            contentDescription = "Coil Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape),
        )
    }
}

@Preview
@Composable
fun PreviewCoil(){
    ImageCoil()
}
