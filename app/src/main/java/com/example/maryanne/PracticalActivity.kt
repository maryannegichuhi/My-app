package com.example.maryanne

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import android.content.Intent
import android.provider.Settings
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.maryanne.ui.theme.MaryanneTheme

class PracticalActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun work() {
    val mContext = LocalContext.current
    var search by remember {
        mutableStateOf(" ")
    }
    Column (  modifier = Modifier
        .fillMaxSize()){
        //TopAppBar
        TopAppBar({
            Text(
                text = "JUMIA", fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }, colors = TopAppBarDefaults.largeTopAppBarColors(Color.Gray),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(
                        Intent(
                            mContext,
                            IntentActivity::class.java
                        )
                    )
                }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "arrowback"
                    )

                }
            },
            actions = {
                IconButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello this is the share space")
                    mContext.startActivity(shareIntent)
                }) {
                    Icon(
                        imageVector = Icons.Filled.Share,
                        contentDescription = "share"
                    )
                }

                IconButton(onClick = {
                    val settingsIntent = Intent(Settings.ACTION_SETTINGS)
                    mContext.startActivity(settingsIntent)
                }) {
                    Icon(
                        imageVector = Icons.Filled.Settings,
                        contentDescription = "settings"
                    )
                }
            }

        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = search, onValueChange = { search = it },
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = " ") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search),
            placeholder = {
                Text(text = "search...", color = Color.Black)
            }
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "The best place to shop your items!",
            fontSize = 25.sp
        )

        Spacer(modifier = Modifier.height(10.dp))
        Column (modifier = Modifier .verticalScroll(rememberScrollState())) {
            Row(modifier = Modifier
                .padding(start = 10.dp)
                .horizontalScroll(rememberScrollState())) {
                //Card 1
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_30),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )
                        Text(text = "Name: Smartwatch", fontSize = 15.sp)
                        Text(text = "Origin: Colette in Paris", fontSize = 15.sp)
                        Text(text = "Price: Ksh 39,000.", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        )
                        {
                            Text(text = "Buy")


                        }

                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card 2
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_31),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )
                        Text(text = "Name: Smartwatch", fontSize = 15.sp)
                        Text(text = "Origin: Colette in Paris", fontSize = 15.sp)
                        Text(text = "Price: Ksh 39,000.", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        )
                        {
                            Text(text = "Buy")


                        }

                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card 3
                Card {
                    Column(modifier = Modifier
                        .padding(10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_32),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )
                        Text(text = "Name: Smartwatch", fontSize = 15.sp)
                        Text(text = "Origin: Colette in Paris", fontSize = 15.sp)
                        Text(text = "Price: Ksh 39,000.", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        )
                        {
                            Text(text = "Buy")


                        }

                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card 4
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_33),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )
                        Text(text = "Name: Smartwatch", fontSize = 15.sp)
                        Text(text = "Origin: Colette in Paris", fontSize = 15.sp)
                        Text(text = "Price: Ksh 39,000.", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        )
                        {
                            Text(text = "Buy")


                        }

                    }
                }



            }
            Spacer(modifier = Modifier.height(10.dp))

            //Row 2
            Row(modifier = Modifier
                .padding(start = 10.dp)
                .horizontalScroll(rememberScrollState())) {
                //Card 1
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_35),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )
                        Text(text = "Name: Smartphone", fontSize = 15.sp)
                        Text(text = "Origin: South Korean", fontSize = 15.sp)
                        Text(text = "Price: KSh 174,300.", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        )
                        {
                            Text(text = "Buy")


                        }

                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card 2
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_36),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )
                        Text(text = "Name: Smartphone", fontSize = 15.sp)
                        Text(text = "Origin: South Korean", fontSize = 15.sp)
                        Text(text = "Price: KSh 174,300.", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        )
                        {
                            Text(text = "Buy")


                        }

                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card 3
                Card {
                    Column(modifier = Modifier
                        .padding(10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_37),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )
                        Text(text = "Name: Smartphone", fontSize = 15.sp)
                        Text(text = "Origin: South Korean", fontSize = 15.sp)
                        Text(text = "Price: KSh 174,300.", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        )
                        {
                            Text(text = "Buy")


                        }

                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card 4
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_38),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )
                        Text(text = "Name: Smartphone", fontSize = 15.sp)
                        Text(text = "Origin: South Korean", fontSize = 15.sp)
                        Text(text = "Price: KSh 174,300.", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        )
                        {
                            Text(text = "Buy")


                        }

                    }
                }



            }
            Spacer(modifier = Modifier.height(10.dp))

            //Row 3
            Row(modifier = Modifier
                .padding(start = 10.dp)
                .horizontalScroll(rememberScrollState())) {
                //Card 1
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_39),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )
                        Text(text = "Name: Headphones", fontSize = 15.sp)
                        Text(text = "Origin: Southern California", fontSize = 15.sp)
                        Text(text = "Price: KSh 12,995", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        )
                        {
                            Text(text = "Buy")


                        }

                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card 2
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_40),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )
                        Text(text = "Name: Headphones", fontSize = 15.sp)
                        Text(text = "Origin: Southern California", fontSize = 15.sp)
                        Text(text = "Price: KSh 12,995", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        )
                        {
                            Text(text = "Buy")


                        }

                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card 3
                Card {
                    Column(modifier = Modifier
                        .padding(10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_41),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )
                        Text(text = "Name: Headphones", fontSize = 15.sp)
                        Text(text = "Origin: Southern California", fontSize = 15.sp)
                        Text(text = "Price: KSh 12,995", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        )
                        {
                            Text(text = "Buy")


                        }

                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card 4
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_42),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )
                        Text(text = "Name: Headphones", fontSize = 15.sp)
                        Text(text = "Origin: Southern California", fontSize = 15.sp)
                        Text(text = "Price: KSh 12,995", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        )
                        {
                            Text(text = "Buy")


                        }

                    }
                }



            }

            Spacer(modifier = Modifier.height(10.dp))
            //Row 4
            Row(modifier = Modifier
                .padding(start = 10.dp)
                .horizontalScroll(rememberScrollState())) {
                //Card 1
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_43),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )
                        Text(text = "Name: Macbook", fontSize = 15.sp)
                        Text(text = "Origin:  U.S.A.", fontSize = 15.sp)
                        Text(text = "Price: Ksh 315,000.", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        )
                        {
                            Text(text = "Buy")


                        }

                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card 2
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_44),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )
                        Text(text = "Name: Macbook", fontSize = 15.sp)
                        Text(text = "Origin:  U.S.A.", fontSize = 15.sp)
                        Text(text = "Price: Ksh 315,000.", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        )
                        {
                            Text(text = "Buy")


                        }

                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card 3
                Card {
                    Column(modifier = Modifier
                        .padding(10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_45),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )
                        Text(text = "Name: Macbook", fontSize = 15.sp)
                        Text(text = "Origin:  U.S.A.", fontSize = 15.sp)
                        Text(text = "Price: Ksh 315,000.", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        )
                        {
                            Text(text = "Buy")


                        }

                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card 4
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_46),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )
                        Text(text = "Name: Macbook", fontSize = 15.sp)
                        Text(text = "Origin:  U.S.A.", fontSize = 15.sp)
                        Text(text = "Price: Ksh 315,000.", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        )
                        {
                            Text(text = "Buy")


                        }

                    }
                }



            }
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = { mContext.startActivity(Intent(mContext,LottieAnimationActivity::class.java)) },
                shape = CutCornerShape(10.dp),
                modifier = Modifier.padding(start = 150.dp),
                colors = ButtonDefaults.buttonColors(Color.Black)
            ) {
                Text(text = "Next")

            }

        }

        }





}







@Preview(showBackground = true)
@Composable
fun workPreview(){
    work()

}
