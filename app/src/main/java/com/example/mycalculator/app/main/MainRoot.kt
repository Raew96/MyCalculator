package com.example.mycalculator.app.main

import androidx.activity.compose.BackHandler
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainRoot(finishApp: () -> Unit) {

    val navController = rememberNavController()

    BackHandler(onBack = finishApp)

    Text(text = "Example Text")

}