package com.example.maryanne

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import android.content.Intent
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.maryanne.ui.theme.MaryanneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            demo()

        }
    }
}

@Composable
fun demo(){

    val mContext= LocalContext.current



    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray)){

        Text("Hello Maryanne \uD83D\uDE0A ", color = Color.Black,
            fontSize =30.sp,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
            textDecoration = TextDecoration.Underline)

        Text(text = "Welcome to Android",
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive)
        Text(text = "Kotlin",
            color = Color.Blue,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif)

        Spacer(modifier = Modifier.height(50.dp))

        Text(text = "Jetpack compose",
            color = Color.Cyan,
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif)
        Divider()
        Spacer(modifier = Modifier.height(30.dp))


        Row {
            Text(text = "Hey", fontSize = 30.sp)

            Spacer(modifier = Modifier.width(20.dp))

            Text(text = "Hello",fontSize = 30.sp)
        }

        Row {
            Text(text = "eMobilis", fontSize = 30.sp)

            Spacer(modifier = Modifier.width(20.dp))

            Text(text = "Technology",fontSize = 30.sp)
        }
        /*Box {
            Text(text = "yes")
            Text(text = "no")
        }*/

        Button(onClick = { /*TODO*/ },
            shape = CutCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.LightGray)
        ) {
            Image(painter = painterResource(id = R.drawable.img_4), contentDescription =" ",
                modifier = Modifier.size(20.dp))
            Text(text = "Add to Cart")
        }



        Button(onClick = {
            mContext.startActivity(Intent(mContext,Formactivity::class.java))},
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color.Magenta)
        ) {
            Text(text = "Form")}

        //Intent
        Button(onClick = {
            mContext.startActivity(Intent(mContext,ImageActivity::class.java))
        }, shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)) {
            Text(text = "Next")
        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext,LottieAnimationActivity::class.java))
        }, shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)) {
            Text(text = "Next")
        }


    }
}



@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    demo()
}