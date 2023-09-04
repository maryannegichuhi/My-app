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
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.maryanne.ui.theme.MaryanneTheme

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            cardDemo()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun cardDemo(){
    val mContext= LocalContext.current
    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())){
        //TopAppBar
        TopAppBar({ Text(text = "Homepage", fontWeight = FontWeight.Bold,
            fontSize = 20.sp)}, colors = TopAppBarDefaults.largeTopAppBarColors(Color.Gray),
            navigationIcon = {
                IconButton(onClick = {mContext.startActivity(Intent(mContext,ImageActivity::class.java)) }) {
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

        Text(text ="Welcome",fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(start=100.dp))

        Text(text = "Types of dog",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(start=100.dp))

        //Row one
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_8),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "pomeranian dog",
                        fontSize = 20.sp,
                        color = Color.Magenta,
                        fontWeight = FontWeight.Bold)

                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            //Second card

            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_9),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "bolognese dog",
                        fontSize = 20.sp,
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold)

                }


            }
            Spacer(modifier = Modifier.width(10.dp))
            //Third card
            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_10),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "pug dog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)

                }


            }
            Spacer(modifier = Modifier.width(10.dp))
            //Forth card

            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_11),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "bichon frise dog",
                        fontSize = 20.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold)

                }

            }

        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Genre of Music",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(start=100.dp))


        //Row two
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_12),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "Gospel",
                        fontSize = 20.sp,
                        color = Color.Magenta,
                        fontWeight = FontWeight.Bold)

                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            //Second card

            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_13),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "Hiphop",
                        fontSize = 20.sp,
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold)

                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            //Third card
            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_14),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "Country Music",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)

                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            //Forth card

            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_15),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "Afrobeats",
                        fontSize = 20.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold)

                }

            }

        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Best Swahili Dishes",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(start=100.dp))


        //Row three
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_16),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "Pilau",
                        fontSize = 20.sp,
                        color = Color.Magenta,
                        fontWeight = FontWeight.Bold)

                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            //Second card

            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_17),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "Mahamri",
                        fontSize = 20.sp,
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold)

                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            //Third card
            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_18),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "Chipsi Mayai",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)

                }


            }
            Spacer(modifier = Modifier.width(10.dp))
            //Forth card

            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_19),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "Ndizi Nyama",
                        fontSize = 20.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold)

                }

            }

        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Types of cake",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(start=100.dp))


        //Row forth
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_20),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "Chocolate cake",
                        fontSize = 20.sp,
                        color = Color.Magenta,
                        fontWeight = FontWeight.Bold)

                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            //Second card

            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_21),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "Lemon cake",
                        fontSize = 20.sp,
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold)

                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            //Third card
            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_22),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "Red velvet",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)

                }

            }
            //Forth card

            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_23),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "Black forest",
                        fontSize = 20.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold)

                }

            }

        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Chefs",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(start=100.dp))


        //Row fifth
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_24),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "Chef Raphael",
                        fontSize = 20.sp,
                        color = Color.Magenta,
                        fontWeight = FontWeight.Bold)

                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            //Second card

            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_25),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "Chef Ali Mandhry",
                        fontSize = 20.sp,
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold)

                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            //Third card
            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_26),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "Chef Maliha",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)

                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            //Forth card

            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_27),
                        contentDescription ="" ,
                        modifier = Modifier.size(100.dp))
                    Text(text = "Chef Bernice",
                        fontSize = 20.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold)

                }

            }

        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            mContext.startActivity(Intent(mContext,Formactivity::class.java))
        }, shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.padding(10.dp)){
            Text(text = "Next")
        }



    }


}


@Preview(showBackground = true)
@Composable
fun cardDemoPreview(){
    cardDemo()
}
