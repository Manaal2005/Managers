package com.example.managers

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.managers.ui.theme.ManagersTheme

class productsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            products()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun products(){
    val mContext= LocalContext.current

    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    ) {
        TopAppBar(title = { Text(text = "Products On Sale", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = {

                }) {
                    Icon(Icons.Filled.Settings, null)
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription ="" ,
                        tint = Color.White)

                }



            },
            actions = {
                IconButton(onClick = {
                    val shareIntent= Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "https://www.bing.com/ck/a?!&&p=a93ebeed3bd55471JmltdHM9MTcwMjI1MjgwMCZpZ3VpZD0xODRjZTQ4MC05ODcwLTZjZTMtMTQ2NC1mNzQyOTllNjZkMjMmaW5zaWQ9NTE5Ng&ptn=3&ver=2&hsh=3&fclid=184ce480-9870-6ce3-1464-f74299e66d23&psq=flaticon&u=a1aHR0cHM6Ly93d3cuZmxhdGljb24uY29tLw&ntb=1")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))


                }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "",
                        tint = Color.White
                    )
                }
                IconButton(onClick = {
                    val settingsIntent=Intent(Settings.ACTION_SETTINGS)
                    mContext.startActivity(settingsIntent)
                }) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "",
                        tint = Color.White
                    )


                }
            }

        )

        Spacer(modifier = Modifier.height(10.dp))

        Row (modifier = Modifier
            .padding(start = 10.dp)
            .horizontalScroll(rememberScrollState())){

            Column {
                Card (modifier = Modifier
                    .size(width =150.dp, height = 200.dp )){

                    Box(Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.burger),
                            contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Burger",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White
                        )
                    }

                }
                Text(text = "Burger",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Text(text = "KSH.15,000.00",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Button(onClick = {  },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = CutCornerShape(5.dp)
                ) {
                    Text(text = "PAY", color = Color.White)

                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Card (modifier = Modifier
                    .size(width =150.dp, height = 200.dp )){

                    Box(Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.biryani),
                            contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Biryani",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White
                        )
                    }

                }
                Text(text = "Biryani",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Text(text = "KSH.10,000.00",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Button(onClick = {  },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = CutCornerShape(5.dp)
                ) {
                    Text(text = "PAY", color = Color.White)

                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Card (modifier = Modifier
                    .size(width =150.dp, height = 200.dp )){

                    Box(Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.salmon),
                            contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Salmon",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White
                        )
                    }

                }
                Text(text = "Salmon",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Text(text = "KSH.67,000.00",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Button(onClick = {  },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = CutCornerShape(5.dp)
                ) {
                    Text(text = "PAY", color = Color.White)

                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Card (modifier = Modifier
                    .size(width =150.dp, height = 200.dp )){

                    Box(Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.leatherwatch2),
                            contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Burger",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White
                        )
                    }

                }
                Text(text = "Burger",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Text(text = "KSH.20,000.00",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Button(onClick = {  },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = CutCornerShape(5.dp)
                ) {
                    Text(text = "PAY", color = Color.White)

                }
            }
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                Card (modifier = Modifier
                    .size(width =150.dp, height = 200.dp )){

                    Box(Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.burger),
                            contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Burger",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White
                        )
                    }

                }
                Text(text = "Burger",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Text(text = "KSH.20,000.00",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Button(onClick = {  },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = CutCornerShape(5.dp)
                ) {
                    Text(text = "PAY", color = Color.White)

                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Card (modifier = Modifier
                    .size(width =150.dp, height = 200.dp )){

                    Box(Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.burger),
                            contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Burger",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White
                        )
                    }

                }
                Text(text = "Burger",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Text(text = "KSH.20,000.00",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Button(onClick = {  },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = CutCornerShape(5.dp)
                ) {
                    Text(text = "PAY", color = Color.White)

                }
            }


        }
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Leather watches",
            fontSize = 25.sp,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(50.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.ExtraBold
            )

        Spacer(modifier = Modifier.height(10.dp))

        Row (modifier = Modifier
            .padding(start = 10.dp)
            .horizontalScroll(rememberScrollState())){

            Column {
                Card (modifier = Modifier
                    .size(width =150.dp, height = 200.dp )){

                    Box(Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.leatherwatch1),
                            contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Watch",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White
                        )
                    }

                }
                Text(text = "Leather watch",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Text(text = "KSH.15,000.00",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Button(onClick = {  },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = CutCornerShape(5.dp)
                ) {
                    Text(text = "PAY", color = Color.White)

                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Card (modifier = Modifier
                    .size(width =150.dp, height = 200.dp )){

                    Box(Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.leatherwatch2),
                            contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Watch",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White
                        )
                    }

                }
                Text(text = "Leather watch",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Text(text = "KSH.10,000.00",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Button(onClick = {  },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = CutCornerShape(5.dp)
                ) {
                    Text(text = "PAY", color = Color.White)

                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Card (modifier = Modifier
                    .size(width =150.dp, height = 200.dp )){

                    Box(Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.leatherwatch3),
                            contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Watch",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White
                        )
                    }

                }
                Text(text = "Leather watch",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Text(text = "KSH.67,000.00",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Button(onClick = {  },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = CutCornerShape(5.dp)
                ) {
                    Text(text = "PAY", color = Color.White)

                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Card (modifier = Modifier
                    .size(width =150.dp, height = 200.dp )){

                    Box(Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.burger),
                            contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Burger",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White
                        )
                    }

                }
                Text(text = "Burger",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Text(text = "KSH.20,000.00",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Button(onClick = {  },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = CutCornerShape(5.dp)
                ) {
                    Text(text = "PAY", color = Color.White)

                }
            }
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                Card (modifier = Modifier
                    .size(width =150.dp, height = 200.dp )){

                    Box(Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.burger),
                            contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Burger",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White
                        )
                    }

                }
                Text(text = "Burger",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Text(text = "KSH.20,000.00",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Button(onClick = {  },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = CutCornerShape(5.dp)
                ) {
                    Text(text = "PAY", color = Color.White)

                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Card (modifier = Modifier
                    .size(width =150.dp, height = 200.dp )){

                    Box(Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.burger),
                            contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Burger",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White
                        )
                    }

                }
                Text(text = "Burger",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Text(text = "KSH.20,000.00",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )

                Button(onClick = {  },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = CutCornerShape(5.dp)
                ) {
                    Text(text = "PAY", color = Color.White)

                }
            }


        }





    }




}


@Preview(showBackground = true)
@Composable
fun productsPreview(){

    products()
}
