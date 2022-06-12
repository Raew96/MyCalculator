package com.example.mycalculator.app.theme


import androidx.compose.material.Colors
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors



private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

fun getAppColors(darkTheme: Boolean) : Colors {
    return when(darkTheme) {
        true -> DarkColorPalette
        else -> LightColorPalette
    }
}
val LocalColors = staticCompositionLocalOf { LightColorPalette }