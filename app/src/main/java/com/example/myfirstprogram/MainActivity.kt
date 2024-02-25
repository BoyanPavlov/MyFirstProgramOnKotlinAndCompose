package com.example.myfirstprogram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstprogram.ui.theme.MyFirstProgramTheme
import com.example.myfirstprogram.usedElements.CheckBoxes
import com.example.myfirstprogram.usedElements.RatingBarUsage

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
                .offset(-30.dp, -30.dp)
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
        Box(
            modifier = modifier
                .align(Alignment.TopCenter)
                .offset(0.dp, 70.dp)
                .padding(16.dp)
                .background(color = Color.Green)
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.3f)
                .border(
                    width = 10.dp,
                    color = Color.DarkGray,
                    shape = RectangleShape
                )
                .padding(17.dp)
        ) {
            //When you import text - it must  be lower case and it  should have "_"
            val importedFontFromGoogle = FontFamily(Font(R.font.sixtyfour_regular))

            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.Red,
                            fontSize = 18.sp,
                        )
                    )
                    {
                        append("J")
                    }
                    append("etpack ")
                    /////////////////////
                    withStyle(
                        style = SpanStyle(
                            color = Color.Black,
                            fontSize = 18.sp,
                        )
                    )
                    {
                        append("C")
                    }
                    append("ompose")
                },
                color = Color.White,
                fontSize = 14.sp,
                fontFamily = importedFontFromGoogle,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.Center,
                //textDecoration = TextDecoration.LineThrough,
                textDecoration = TextDecoration.Underline,
            )

            /*Row {
                val bigText:String="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."

                Text(text = bigText)
            }*/
        }

        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .offset(0.dp, -120.dp)
        )
        {
            RatingBarUsage(0)
        }

        Column(modifier = Modifier
            .padding()
            .align(Alignment.CenterStart)
        ) {
            CheckBoxes()
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
