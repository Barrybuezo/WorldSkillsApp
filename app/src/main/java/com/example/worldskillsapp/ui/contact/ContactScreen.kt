package com.example.worldskillsapp.ui.contact

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fitInside
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.worldskillsapp.R
import com.example.worldskillsapp.ui.composable.WorldSkillText


@Composable
fun ContactScreen(onLogout: () -> Unit){
    Scaffold { _ ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {

            Spacer(modifier = Modifier.height(120.dp))
            WorldSkillText(
                modifier = Modifier.fillMaxWidth(),
                text = "Participación y Contacto",
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Black,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(25.dp))
            WorldSkillText(
                text = "Requisitos para participar",
                style = MaterialTheme.typography.displaySmall,
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.Black,
                color = Color.Black  //no hacer esto
                //Hardcore
            )

            Spacer(modifier = Modifier.height(10.dp))
            WorldSkillText(
                text = "* Ser guatemalteco(a) entre 17 y 25 años.\n" +
                        "* Estar inscrito en una institución educativa o técnica.\n" +
                        "* Tener interés en alguna de las competencias.",
                textAlign = TextAlign.Left,
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.secondary
            )

            Spacer(modifier = Modifier.height(15.dp))
            WorldSkillText(
                text = "Proceso de inscripción",
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Black,
                textAlign = TextAlign.Justify,
                color = Color.Black

                )

            Spacer(modifier = Modifier.height(10.dp))
            WorldSkillText(
                text = "1.Completa el formulario en línea\n" +
                       "2.Participa en las pruebas de selección\n" +
                        "3.Prepárate con expertos y entrena para competir",
                style = MaterialTheme.typography.labelSmall,
                textAlign = TextAlign.Left,
                color = Color.Black
            )



            Spacer(modifier = Modifier.height(15.dp))
            WorldSkillText(
                text = "Fechas importantes",
                modifier = Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Black,
                textAlign = TextAlign.Left,
                color = Color.Black
                )

            Spacer(modifier = Modifier.height(10.dp))
            WorldSkillText(
                text = "* Convocatoria: Julio\n" +
                        "* Pruebas de selección: Agosto\n" +
                        "* Entrenamiento: Septiembre-Octubre",
                textAlign = TextAlign.Left,
                style = MaterialTheme.typography.labelSmall,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(15.dp))
            WorldSkillText(
                text = "Contacto",
                modifier = Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Black,
                textAlign = TextAlign.Left,
                color = Color.Black

                )


            //Fila1
            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically){


                Image(
                    painter = painterResource(R.drawable.gmail),
                    contentDescription =  null,
                    modifier = Modifier.size(20.dp),
                    contentScale = ContentScale.Fit
                )


                WorldSkillText(
                    text = "contacto@worldskills.gt",
                    modifier = Modifier.weight(1f),
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.primary
                )
            }

            Spacer(modifier = Modifier.height(5.dp))
            //Fila2
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically
                ) {

                Image(

                    painter = painterResource(R.drawable.celulcar_logo),
                    contentDescription =  null,
                    modifier = Modifier.size(20.dp),
                    contentScale = ContentScale.Fit
                )


                WorldSkillText(
                    text = "+502 1234 5678",
                    modifier = Modifier.weight(1f),
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.Black
                )

            }

            Spacer(modifier = Modifier.height(5.dp))
            //Fila 3
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(5.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(

                    painter = painterResource(R.drawable.facebook_logo),
                    contentDescription =  null,
                    modifier = Modifier.size(18.dp),
                    contentScale = ContentScale.Fit
                )


                Image(
                    painter = painterResource(R.drawable.twitter_logo),
                    contentDescription =  null,
                    modifier = Modifier.size(20.dp),
                    contentScale = ContentScale.Fit
                )

                Image(
                    painter = painterResource(R.drawable.instagram_logo),
                    contentDescription =  null,
                    modifier = Modifier.size(20.dp),
                    contentScale = ContentScale.Fit
                )
            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                onClick = onLogout,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 25.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            ) {
                Text("CERRAR SESIÓN")
            }




        }
    }
}