package com.app.coilimage

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.coilimage.ui.theme.CoilImageTheme
import com.app.coilimage.ui.theme.color1
import com.app.coilimage.ui.theme.color2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoilImageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    TryLazyColumn()
//                   Row (
//                       modifier = Modifier
//                           .fillMaxSize(),
//                       horizontalArrangement = Arrangement.Center,
//                       verticalAlignment = Alignment.CenterVertically
//                   ) {
//                       CoilImageTheme {
//                           ButtonGradient(
//                               text = "Button",
//                               textColor = Color.White,
//                               gradient = Brush.horizontalGradient(
//                                   colors = listOf(color1, color2)
//                               )
//                           ) {
//                               Toast.makeText(
//                                   applicationContext,
//                                   "Button Clicked",
//                                   Toast.LENGTH_LONG
//                               ).show()
//                           }
//
//                           Spacer(modifier = Modifier.width(8.dp))
//
//                           Button(onClick = { /*TODO*/ }) {
//                               Text(text = "Button")
//                           }
//                       }
//                   }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoilImageTheme {
        Greeting("Android")
    }
}