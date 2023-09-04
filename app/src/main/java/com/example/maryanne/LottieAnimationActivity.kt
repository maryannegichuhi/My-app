package com.example.maryanne

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.maryanne.ui.theme.MaryanneTheme

class LottieAnimationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mylottie()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun mylottie(){
     val mContext= LocalContext.current
    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())){
        //TopAppBar
        TopAppBar({ Text(text = "About us", fontWeight = FontWeight.Bold,
            fontSize = 20.sp)}, colors = TopAppBarDefaults.largeTopAppBarColors(Color.Gray),
            navigationIcon = {
                IconButton(onClick = {mContext.startActivity(Intent(mContext,IntentActivity::class.java)) }) {
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
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.register))
        val progress by animateLottieCompositionAsState(composition)

        LottieAnimation(composition,progress,
            modifier = Modifier.size(500.dp))

        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { mContext.startActivity(Intent(mContext,HomePageActivity::class.java)) },
            shape = CutCornerShape(10.dp),
            modifier = Modifier.padding(start = 150.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "Next")

        }

        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
          mContext.startActivity(Intent(mContext,LocationActivity::class.java))
        },
//            modifier = Modifier.padding(100.dp),
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CutCornerShape(5.dp)) {
            Text(text = "See Location",
                color = Color.Green)

        }




    }


}


@Preview(showBackground = true)
@Composable
fun myLottiePreview(){
    mylottie()
}
