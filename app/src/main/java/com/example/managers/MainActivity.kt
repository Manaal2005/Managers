package com.example.managers

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.managers.ui.theme.ManagersTheme

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
  Column(modifier = Modifier
      .verticalScroll(rememberScrollState())) {
      Text(text = "Welcome to Android Programming",
          fontSize = 25.sp,
          color = Color.Green,
          fontWeight = FontWeight.Bold,
          fontStyle = FontStyle.Normal,
          modifier = Modifier
              .background(Color.Red)
              .fillMaxWidth()
              .height(80.dp)
              .padding(top = 20.dp)

      )

      Spacer(modifier = Modifier.height(20.dp))

      Text(text = "Find the healthy and delicious food",
          fontSize = 20.sp,
          fontFamily = FontFamily.SansSerif,
          color = Color.Gray)

      Spacer(modifier = Modifier.height(20.dp))



      //Centering an animation
     Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
         //Lottie Animation
         val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.animate2))
         val progress by animateLottieCompositionAsState(composition)

         LottieAnimation(composition, progress,
             modifier = Modifier.size(200.dp)
         )
     }


      Text(text = "KENYAN MEALS",
          fontSize = 30.sp,
          color = Color.Black,
          fontWeight = FontWeight.ExtraBold)

      Spacer(modifier = Modifier.height(10.dp))

      Text(text = "1. Ugali",
          fontSize = 25.sp,
          fontWeight = FontWeight.Bold)

      Text(text = "2. Pilau",
          fontSize = 25.sp,
          fontWeight = FontWeight.Bold)

      Text(text = "3. Rice ",
          fontSize = 25.sp,
          fontWeight = FontWeight.Bold)

      Text(text = "4. Githeri",
          fontSize = 25.sp,
          fontWeight = FontWeight.Bold)

      Spacer(modifier = Modifier.height(5.dp))

      Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RectangleShape
      ) {
          Icon(imageVector = Icons.Default.Add,
              contentDescription = "",
              tint = Color.Black

              )
          Spacer(modifier = Modifier.width(5.dp))
       Text(text = "MORE MEALS", color = Color.Green)
      }


      Spacer(modifier = Modifier.height(5.dp))

      Image(painter = painterResource(id = R.drawable.food), contentDescription ="" ,
          modifier = Modifier
              .height(200.dp)
              .fillMaxWidth(),
          contentScale = ContentScale.Crop
      )

      Spacer(modifier = Modifier.height(5.dp))

      Row {
          Spacer(modifier = Modifier.width(25.dp))

          Button(onClick = { /*TODO*/ },
              colors = ButtonDefaults.buttonColors(Color.Red),
              shape = CutCornerShape(5.dp)
          ) {
              Icon(imageVector = Icons.Default.ArrowBack,
                  contentDescription = "",
                  tint = Color.Black)
              Text(text = "BACK", color = Color.White)
          }

          Spacer(modifier = Modifier.width(15.dp))

          val context = LocalContext.current

          Button(onClick = { context.startActivity(Intent(context,HomeActivity::class.java)) },
              colors = ButtonDefaults.buttonColors(Color.Red),
              shape = CutCornerShape(15.dp)
          ) {
              Text(text = "NEXT", color = Color.White)
              Icon(imageVector = Icons.Default.ArrowForward,
                  contentDescription = "",
                  tint = Color.Black)

          }
          Spacer(modifier = Modifier.width(15.dp))

          Button(onClick = { context.startActivity(Intent(context,IntentsActivity::class.java)) },
              colors = ButtonDefaults.buttonColors(Color.Red),
              shape = CutCornerShape(5.dp)
          ) {
              Text(text = "NEXT", color = Color.White)
              Icon(imageVector = Icons.Default.ArrowForward,
                  contentDescription = "",
                  tint = Color.Black)

          }

      }



  }
}


@Preview(showBackground = true)
@Composable
fun demoPreview(){
    demo()
}

