package com.example.worldskillsapp.ui.competencia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.worldskillsapp.ui.composable.WorldSkillText
import com.example.worldskillsapp.ui.theme.DarkBlue20

@Preview(showBackground = true)
@Composable

fun CompetenciesScreen(){
    Scaffold { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item{
                CompetenciesHeader()
        }
            items(
                items = competenciesList
            ){ competencies ->
                OutlinedCard(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                    colors = CardDefaults.outlinedCardColors(
                        containerColor = MaterialTheme.colorScheme.surface
                    ),
                    border = CardDefaults.outlinedCardBorder()
                )
                    {


                    Row(
                        modifier = Modifier.padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = competencies.icon),
                            contentDescription = null,
                            modifier = Modifier.size(75.dp),
                        )

                        Column(
                        modifier = Modifier.padding(5.dp),

                        ){
                        WorldSkillText(
                            modifier = Modifier.padding(all = 4.dp),
                            text = competencies.title,
                            fontWeight = FontWeight.Black,
                            color = Color.Black,
                            style = MaterialTheme.typography.labelMedium
                        )

                        WorldSkillText(
                            modifier = Modifier.padding(all = 4.dp),
                            text = competencies.description,
                            color = Color.Black,
                            style = MaterialTheme.typography.labelSmall
                        )
                        }
                      }

                    }

            }
    }
    }
}

@Composable
fun CompetenciesHeader(){
    Spacer(modifier = Modifier.height(50.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(DarkBlue20)
                .padding(25.dp)
        ){
            WorldSkillText(
                text = "Categorias y Competencias",
                style = MaterialTheme.typography.displayMedium,
                fontWeight = FontWeight.Black,
                color = Color.White,
            )

        }
}