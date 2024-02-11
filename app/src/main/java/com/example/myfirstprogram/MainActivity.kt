package com.example.myfirstprogram

import android.graphics.drawable.shapes.OvalShape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstprogram.ui.theme.MyFirstProgramTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstProgramTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    /*Column (
        modifier = Modifier
            .background(Color.Green)
            .fillMaxSize(),
                horizontalAlignment  = Alignment.End,
                verticalArrangement = Arrangement.Bottom,
    )
    {*/

    /*Row (
        horizontalArrangement = Arrangement.End,
        modifier = Modifier
            .size(400.dp)
    ) {*/

    Box(
        modifier = Modifier
            //.size(400.dp),
            .fillMaxSize()
            .background(color = Color.LightGray)
            .border(5.dp, color = Color.Magenta)
            .padding(10.dp)
            .border(8.dp, color = Color.Blue)
            .padding(10.dp)
            .border(5.dp, color = Color.Cyan)
        //contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Ahahahaha",
            fontSize = 30.sp,
            modifier = modifier
                .padding(10.dp)
                .border(7.dp, color = Color.Yellow)
                .offset(-30.dp,-30.dp)
                .padding(24.dp)
                .background(Color.LightGray)
                .border(2.dp, Color.Black, shape = CircleShape)
                .align(Alignment.BottomEnd),
            color = Color.Yellow,

            )

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier
                .background(Color.Black)
                .align(Alignment.Center)
        )

        /*Column() {
            for (i  in 1..10)
            {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    modifier = Modifier
                        .background(Color.Red)
                )
            }
        }*/

        LazyColumn(
            horizontalAlignment = Alignment.End,
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            items(10) { index ->
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    modifier = Modifier
                        .background(Color.Red)

                )
            }
        }

        Surface(color = Color.Cyan) {
            Text(
                text = "Hi, my  name is $name!",
                modifier = modifier
                    .padding(24.dp)
                    .background(Color.LightGray),
                color = Color.Magenta,
                fontStyle = FontStyle.Italic,
                fontFamily = FontFamily.Serif,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstProgramTheme {
        Greeting("Boyan")
    }
}