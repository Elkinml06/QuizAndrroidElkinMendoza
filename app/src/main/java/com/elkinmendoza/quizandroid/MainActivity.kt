package com.elkinmendoza.quizandroid

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.content.MediaType.Companion.Image
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elkinmendoza.quizandroid.ui.theme.QuizAndroidElkinMendozaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}


//Primera pantalla
@Preview( showSystemUi = true)
@Composable
fun Screen1 () {
    Column(

        modifier = Modifier

            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,

        ) {
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()


        ){
            Text(

                text = "Encabezado",
                modifier = Modifier
                    .background(Color.Blue)
                    .padding(16.dp)
            )
        }

        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green)
                .padding(16.dp)

        ) {
            Text(
                text = "Item 1",
                modifier = Modifier
                    .background(Color.Yellow)
                    .padding(16.dp)
            )
            Text(
                text = "Item 2",
                modifier = Modifier
                    .background(Color.Red)
                    .padding(16.dp)
            )
            Text(
                text = "Item 3",
                modifier = Modifier
                    .background(Color.Magenta)
                    .padding(16.dp)
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()


        ){
            Text(

                text = "Pie de página",
                modifier = Modifier
                    .background(Color.Magenta)
                    .padding(16.dp)
            )
        }

    }
}
//Segunda pantalla
@Preview( showSystemUi = true)
@Composable
fun Screen2 () {
    val image = painterResource(id = R.drawable.ic_launcher_background)
    Column(
        modifier = Modifier
            .padding(16.dp,32.dp)
            .fillMaxSize(),
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            Image(
                painter = image,
                contentDescription = null,
            )
            Text(
                text="Juan Pérez",
                fontWeight = FontWeight.Bold,
                fontSize = (23.sp)
            )
            Text(
                text="Desarrollador Android apasionado por la tecnología y el diseño",
                modifier = Modifier
                    .padding(40.dp,0.dp)
            )
        }


        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Column(
            ) {
                Text(
                    text="150",
                    fontWeight = FontWeight.Bold,
                    fontSize = (23.sp)

                )
                Text(
                    text ="Post",
                    fontWeight = FontWeight.Bold,
                    color = Color.LightGray
                )
            }
            Column(

            ) {
                Text(
                    text="150",
                    fontWeight = FontWeight.Bold,
                    fontSize = (23.sp)

                )
                Text(
                    text ="Post",
                    fontWeight = FontWeight.Bold,
                    color = Color.LightGray
                )
            }
            Column(

            ) {
                Text(
                    text="150",
                    fontWeight = FontWeight.Bold,
                    fontSize = (23.sp)

                )
                Text(
                    text ="Post",
                    fontWeight = FontWeight.Bold,
                    color = Color.LightGray
                )
            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(

            ){
                Text("Seguir")
            }
            Column(

            ){
                Text("Mensaje")
            }
        }
        Text(
            text="Intereses",
            fontWeight = FontWeight.Bold,
            fontSize = (23.sp)
        )
        Column(){
            Row(
                modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Hola")
                Text("Hola")
                Text("Hola")
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Hola")
                Text("Hola")
                Text("Hola")
            }

        }
        Text(
            text="Proyectos Recientes",
            fontWeight = FontWeight.Bold,
            fontSize = (23.sp)
        )

    }


}