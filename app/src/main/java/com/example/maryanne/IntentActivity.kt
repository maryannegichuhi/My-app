package com.example.maryanne

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import android.content.Intent
import android.provider.MediaStore
import android.provider.Settings
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material3.DividerDefaults.color
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.compose.ui.tooling.preview.Preview
import com.example.maryanne.ui.theme.MaryanneTheme

class IntentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun myIntent(){
    val mContext= LocalContext.current
    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        .paint(
            painterResource(id = R.drawable.background),
            contentScale = ContentScale.FillBounds
        )){
        //TopAppBar
        TopAppBar({ Text(text = "Intents", fontWeight = FontWeight.Bold,
            fontSize = 20.sp)}, colors = TopAppBarDefaults.largeTopAppBarColors(Color.Gray),
            navigationIcon = {
                IconButton(onClick = {mContext.startActivity(Intent(mContext,Formactivity::class.java)) }) {
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
        Spacer(modifier = Modifier.height(20.dp))

        //STK
        OutlinedButton(onClick = {
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let {mContext.startActivity(it)}
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            border = BorderStroke(3.dp, Color.LightGray)
        ) {
            Text(text = "PAY VIA M-PESA",
                fontSize = 20.sp,
                color = Color.White)


        }
        Spacer(modifier = Modifier.height(20.dp))

        //STK
        OutlinedButton(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("maryannegichuhi67@gmail.com"))
            shareIntent.putExtra(Intent.EXTRA_SUBJECT,"subject")
            shareIntent.putExtra(Intent.EXTRA_TEXT,"Hello this is the email")
            mContext.startActivity(shareIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            border = BorderStroke(3.dp, Color.LightGray)
        ) {
            Text(text = "EMAIL",
                fontSize = 20.sp,
                color = Color.White)


        }
        Spacer(modifier = Modifier.height(20.dp))

        //STK
        OutlinedButton(onClick = {
            val callIntent=Intent(Intent.ACTION_DIAL)
            callIntent.data = "tel:0707242922".toUri()
            mContext.startActivity(callIntent)

        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            border = BorderStroke(3.dp, Color.LightGray)
        ) {
            Text(text = "CALL",
                fontSize = 20.sp,
                color = Color.White)


        }
        Spacer(modifier = Modifier.height(20.dp))

        //STK
        OutlinedButton(onClick = {
            val shareIntent=Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT,"Hello this is the share space")
            mContext.startActivity(shareIntent)

        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            border = BorderStroke(3.dp, Color.LightGray)
        ) {
            Text(text = "SHARE",
                fontSize = 20.sp,
                color = Color.White)


        }
        Spacer(modifier = Modifier.height(20.dp))

        //STK
        OutlinedButton(onClick = {
            val smsIntent=Intent(Intent.ACTION_SENDTO)
            smsIntent.data = "smsto:0707242922".toUri()
            smsIntent.putExtra("sms_body","Hello Maryanne, how was your day")
            mContext.startActivity(smsIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            border = BorderStroke(3.dp, Color.LightGray)
        ) {
            Text(text = "SMS",
                fontSize = 20.sp,
                color = Color.White)


        }
        Spacer(modifier = Modifier.height(20.dp))

        //STK
        OutlinedButton(onClick = {
            val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                mContext.startActivity(cameraIntent)
            }else{
                println("Camera app is not available")
            }
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            border = BorderStroke(3.dp, Color.LightGray)
        ) {
            Text(text = "CAMERA",
                fontSize = 20.sp,
                color = Color.White)


        }
        Spacer(modifier = Modifier.height(20.dp))

        //STK
        OutlinedButton(onClick = {
            val settingsIntent=Intent(Settings.ACTION_SETTINGS)
            mContext.startActivity(settingsIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            border = BorderStroke(3.dp, Color.LightGray)
        ) {
            Text(text = "SETTINGS",
                fontSize = 20.sp,
                color = Color.White)


        }
        OutlinedButton(onClick = { mContext.startActivity(Intent(mContext,PracticalActivity::class.java))
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            border = BorderStroke(3.dp, Color.LightGray)
        ) {
            Text(text = "JUMIA",
                fontSize = 20.sp,
                color = Color.White)


        }
    }
}




@Preview(showBackground = true)
@Composable
fun myIntentPreview(){
    myIntent()

}

