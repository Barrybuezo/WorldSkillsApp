package com.example.worldskillsapp.ui.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.worldskillsapp.R
import com.example.worldskillsapp.ui.composable.WorldSkillText



@Preview(showBackground = true)
@Composable
fun HomeScreen(){
    Scaffold { _ ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 44.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(150.dp))
            Image(
               modifier = Modifier.fillMaxWidth(),
                painter = painterResource(R.drawable.worldskills),
                contentDescription =  null,
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(20.dp))
            WorldSkillText(
                text = "Bienvenido a SkillGT",
                style = MaterialTheme.typography.displayMedium,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(25.dp))
            WorldSkillText(
                text = "Conoce el movimiento que impulsa la excelencia en habilidades técnicas y tecnólogicas en Guatemala.",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.primary
            )
        }

    }
}