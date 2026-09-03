package com.example.worldskillsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.worldskillsapp.ui.competencia.CompetenciesScreen
import com.example.worldskillsapp.ui.contact.ContactScreen
import com.example.worldskillsapp.ui.navigation.NavigationWrapper
import com.example.worldskillsapp.ui.theme.WorldSkillsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //vista
        setContent {
            WorldSkillsAppTheme {
                NavigationWrapper()
                }
            }
        }
    }


