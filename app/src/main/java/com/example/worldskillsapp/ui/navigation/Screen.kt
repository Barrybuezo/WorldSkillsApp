package com.example.worldskillsapp.ui.navigation

import com.example.worldskillsapp.R


sealed class Screen(
    val route: String,
    val label: String,
    val icon: Int
) {
    object Home : Screen(
        route = "home",
        label = "Home",
        icon = R.drawable.home_logo
    )

    object About : Screen(
        route = "about",
        label = "About Us",
        icon = R.drawable.about_us_logo
    )

    object Competencies : Screen(
        route = "competencies",
        label = "Competen..",
        icon = R.drawable.competencies_logo
    )

    object Contact : Screen(
        route = "contact",
        label = "Contact",
        icon = R.drawable.celulcar_logo
    )

    object Login : Screen(
        route = "login",
        label = "Login",
        icon = R.drawable.informatica_logo // no se usa en la barra, pero el constructor lo pide
    )
}

val bottomNavItems = listOf(
    Screen.Home,
    Screen.About,
    Screen.Competencies,
    Screen.Contact
)