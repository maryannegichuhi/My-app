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
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.compose.ui.tooling.preview.Preview
import com.example.maryanne.ui.theme.MaryanneTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Myimage()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Myimage(){

    val mContext= LocalContext.current

    Column(modifier = Modifier
        .fillMaxSize()

        .verticalScroll(rememberScrollState())) {
        //TopAppBar
        TopAppBar({ Text(text = "About", fontWeight = FontWeight.Bold,
            fontSize = 20.sp)}, colors = TopAppBarDefaults.largeTopAppBarColors(Color.Gray),
            navigationIcon = {
                IconButton(onClick = {mContext.startActivity(Intent(mContext,MainActivity::class.java)) }) {
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
        Text(text = "BREEDS OF DOGS",
            fontSize = 30.sp,
            color = Color.Black,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(start = 50.dp)

        )
        Spacer(modifier = Modifier.height(20.dp))

        //First row
        Row {


            Image(painter = painterResource(id = R.drawable.img_5) ,
                contentDescription = "Siberian Husky",
                modifier = Modifier.size(width = 200.dp, height = 100.dp)
            )
            Column {
                Text(text = "Siberian Husky",
                    fontSize = 20.sp,
                )

                Text(text = " Siberian huskies are the most popular and well-known breed of husky.\n" +
                        "\n" +
                        "Originating in Siberia, the breed was introduced to Alaska in the early 1900s by natives of Chuckchi." +
                        " Sometimes the Siberian husky is called the Chuckchi.")
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        //Second row
        Row {


            Image(painter = painterResource(id = R.drawable.img_6) ,
                contentDescription = "Siberian Husky",
                modifier = Modifier.size(width = 200.dp, height = 100.dp)
            )
            Column {
                Text(text = "Alaskan Husky",
                    fontSize = 20.sp,
                )

                Text(text = "Alaskan husky is the most common breed of husky but is not the most prized since it’s technically a mongrel. People breed Alaskan huskies because they work very well as sled dogs." +
                        " Their fortitude and pulling power puts them above pure pedigree dogs")
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        //Third row
        Row {

            Image(painter = painterResource(id = R.drawable.img_7) ,
                contentDescription = "Siberian Husky",
                modifier = Modifier.size(width = 200.dp, height = 100.dp)

            )
            Column {
                Text(text =
                "Labrador  Husky",
                    fontSize = 20.sp,
                )

                Text(text = "The Labrador husky is a very rare breed, and not often found outside of Canada." +
                        " They are incredibly cute as puppies but are almost exclusively used as sled dogs instead of being kept as pets. As mechanized snow travel increases and the need for sledding decreases, " +
                        "the Labrador husky breed numbers continue to decline.")
            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        //Circular image
        Image(painter = painterResource(id = R.drawable.img_3) ,
            contentDescription = "Siberian Husky",
            modifier = Modifier
                .size(128.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { mContext.startActivity(Intent(mContext,ScrollActivity::class.java)) },
            shape = CutCornerShape(10.dp),
            modifier = Modifier.padding(start = 150.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "Next")

        }




    }


}




@Preview(showBackground = true)
@Composable
fun Myimagepreview(){
    Myimage()
}