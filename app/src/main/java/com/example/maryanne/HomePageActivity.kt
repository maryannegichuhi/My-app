package com.example.maryanne

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import android.content.Intent
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.maryanne.ui.theme.MaryanneTheme

class HomePageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            items()


        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun items(){
    val mContext = LocalContext.current
    Column (modifier = Modifier.fillMaxSize()) {
        //TopAppBar
        TopAppBar({ Text(text = "Homepage", fontWeight = FontWeight.Bold,
            fontSize = 20.sp)}, colors = TopAppBarDefaults.largeTopAppBarColors(Color.Gray),
            navigationIcon = {
                IconButton(onClick = {mContext.startActivity(Intent(mContext,SplashScreenActivity::class.java)) }) {
                    Icon(imageVector = Icons.Filled.ArrowBack,
                        contentDescription ="arrowback" )

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Share,
                        contentDescription = "share"
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Settings,
                        contentDescription = "settings"
                    )
                }
            }

        )
        Spacer(modifier = Modifier.height(10.dp))

        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .clickable {
                mContext.startActivity(Intent(mContext, Formactivity::class.java))
            }
            ) {
               Row(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = "Registration page",
                        fontSize = 15.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold
                    )
                }
            }


        Spacer(modifier = Modifier.height(10.dp))
        

        Card(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .clickable {
                    mContext.startActivity(Intent(mContext, PracticalActivity::class.java))
                }
            ) {
                Row(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = "View products",
                        fontSize = 15.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        Spacer(modifier =Modifier.height(10.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .clickable {
                    mContext.startActivity(Intent(mContext, ImageActivity::class.java))
                }
            ) {
                Row(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = "Image page",
                        fontSize = 15.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        Spacer(modifier =Modifier.height(10.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .clickable {
                    mContext.startActivity(Intent(mContext, IntentActivity::class.java))
                }
            ) {
                Row(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = "Click to go to",
                        fontSize = 15.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Intents",
                        fontSize = 15.sp,
                        color = Color.Green,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        Spacer(modifier =Modifier.height(10.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .clickable {
                    mContext.startActivity(
                        Intent(
                            mContext,
                            LottieAnimationActivity::class.java
                        )
                    )
                }
            ) {
                Row(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = "Lottie Animations",
                        fontSize = 15.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }
    }





@Preview(showBackground = true)
@Composable
fun itemsPreview(){
    items()
}
