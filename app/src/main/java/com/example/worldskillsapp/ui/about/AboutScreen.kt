package com.example.worldskillsapp.ui.about

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
import androidx.compose.ui.graphics.Color
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
fun AboutScreen(){
    Scaffold { _ ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 35.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {

            Spacer(modifier = Modifier.height(40.dp))
            WorldSkillText(
                text = "¿Qué es WorldSkills Guatemala?",
                style = MaterialTheme.typography.displayMedium,
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.Black,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(20.dp))
            WorldSkillText(
                text = "Historia de WorldSkills",
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.Black,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(15.dp))
            WorldSkillText(
                text = "WorldSkills es una organización internacional que promueve la" +
                        " excelencia en habilidades técnicas y vocacionales desde 1950," +
                        " conectando a jóvenes de todo el mundo a través de competencias de alto nivel.",
                textAlign = TextAlign.Left,
                style = MaterialTheme.typography.displaySmall,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(20.dp))
            WorldSkillText(
                text = "WorldSkills Guatemala",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Black,
                textAlign = TextAlign.Justify,
                color = MaterialTheme.colorScheme.primary,

            )

            Spacer(modifier = Modifier.height(15.dp))
            WorldSkillText(
                text = "WorldSkills Guatemala forma parte de este movimiento global, brindando oportunidades a jóvenes guatemaltecos para desarrollar su talento, competir internacionalmente y transformar su futuro profesional.",
                style = MaterialTheme.typography.displaySmall,
                textAlign = TextAlign.Left,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(20.dp))
            Image(
                modifier = Modifier.fillMaxWidth(),
                painter = painterResource(R.drawable.worldskills),
                contentDescription =  null,
                contentScale = ContentScale.Fit
            )

            WorldSkillText(
                text = "Las habilidades construyen el futuro.",
                modifier = Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Black,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.primary,

                )
        }

    }
}