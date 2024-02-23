package com.example.myfirstprogram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.drawscope.Stroke
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
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

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

        /*val ratingState = remember { mutableStateOf(3f) }

        RatingBar(
            rating = ratingState.value,
            modifier= Modifier.align(Alignment.Center)
                .offset(0.dp,150.dp),
            onRatingChanged = { newRating ->
                ratingState.value = newRating
            }
        )*/

        RatingBarUsage(0)
    }
}

/*
@Composable
fun RatingBar(
    rating: Float,
    modifier: Modifier = Modifier,
    onRatingChanged: (Float) -> Unit
) {
    Row(modifier = modifier.padding(16.dp)) {
        for (i in 1..5) {
            Icon(
                imageVector = if (i <= rating) Icons.Filled.Star else Icons.Filled.FavoriteBorder,
                contentDescription = "Rating $i",
                modifier = Modifier
                    .size(30.dp)
                    .clickable { onRatingChanged(i.toFloat()) },
                tint = Color.Yellow
            )
        }
    }
}
*/


@Composable
fun OutlinedStar(
    modifier: Modifier = Modifier,
    onStarClicked: () -> Unit
) {
    Canvas(
        modifier = modifier
            .size(34.dp)
            .clickable(onClick = onStarClicked)
    ) {
        val path = Path()
        val center = size.width / 1.9
        val radius = size.width / 2.5
        val angle = (2 * PI) / 5 // angle between points (360 degrees / 5 points)

        for (i in 0 until 5) {
            val outerX = center + radius * cos(i * angle - PI / 2)
            val outerY = center + radius * sin(i * angle - PI / 2)
            val innerX = center + (radius / 2) * cos((i * angle + angle / 2) - PI / 2)
            val innerY = center + (radius / 2) * sin((i * angle + angle / 2) - PI / 2)

            if (i == 0) {
                path.moveTo(outerX.toFloat(), outerY.toFloat())
            } else {
                path.lineTo(outerX.toFloat(), outerY.toFloat())
            }
            path.lineTo(innerX.toFloat(), innerY.toFloat())
        }
        path.close()

        drawPath(
            path = path,
            color = Color.Gray,
            style = Stroke(width = 2.dp.toPx())
        )
    }
}

@Composable
fun Star(
    isFilled: Boolean,
    modifier: Modifier = Modifier,
    onStarClicked: () -> Unit
) {
    if (isFilled) {
        Icon(
            imageVector = Icons.Filled.Star,
            contentDescription = null,
            modifier = modifier
                .clickable(onClick = onStarClicked)
                .size(34.dp),
            tint = Color.Yellow
        )
    } else {
        OutlinedStar(
            modifier = modifier,
            onStarClicked = onStarClicked
        )
    }
}

@Composable
fun RatingBar(
    maxRating: Int = 5,
    currentRating: Int,
    modifier: Modifier = Modifier,
    onRatingChanged: (Int) -> Unit,
) {
    Row(modifier = modifier) {
        for (i in 1..maxRating) {
            Star(
                isFilled = i <= currentRating,
                onStarClicked = { onRatingChanged(i) }
            )
        }
    }
}

@Composable
fun RatingBarUsage(rating:Int) {
    var rating_ by remember { mutableStateOf(rating) }

    RatingBar(
        currentRating = rating_,
        onRatingChanged = { newRating ->
            rating_ = newRating
        }
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstProgramTheme {
        Greeting("Boyan")
    }
}