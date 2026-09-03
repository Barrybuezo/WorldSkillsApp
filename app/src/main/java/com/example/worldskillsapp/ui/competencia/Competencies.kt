package com.example.worldskillsapp.ui.competencia
import com.example.worldskillsapp.R

data class CompetenciesData(
    val icon: Int,
    val title: String,
    val description: String,

)

val competenciesList = listOf(
    CompetenciesData(
        icon = R.drawable.informatica_logo,
        title = "Tecnología de la Información",
        description = "Desarrollo de software, redes y soporte técnico.",

    ),
    CompetenciesData(
        icon = R.drawable.mecatronica_logo,
        title = "Mecatrónica",
        description = "Integración de sistemas mecánicos, eléctricos y de control.",

    ),
    CompetenciesData(
        icon = R.drawable.belleza_logo,
        title = "Estética y Belleza",
        description = "Técnicas de maquillaje, cuidado de la piel y estilismo.",
    ),
    CompetenciesData(
        icon = R.drawable.cocina_logo,
        title = "Cocina y Gastronomía",
        description = "Preparación culinaria, presentación y creatividad gastronómica.",

    ),
    CompetenciesData(
        icon = R.drawable.disenio_grafico_logo,
        title = "Diseño Gráfico",
        description = "Comunicación visual, diseño digital y creatividad aplicada.",
    )
)