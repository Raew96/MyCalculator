package com.example.mycalculator.app.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.platform.LocalConfiguration

object AppTheme {

    val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val dimensions: Dimensions
        @Composable
        @ReadOnlyComposable
        get() = LocalDimensions.current
}

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = getAppColors(darkTheme)
    val configuration = LocalConfiguration.current
    val dimensions = if (configuration.screenWidthDp <= 400) {
        smallDimensions
    } else {
        sw360Dimensions
    }
    val typography = if (configuration.screenWidthDp <= 400) smallTypography else sw360Typography

    CompositionLocalProvider(
        LocalColors provides colors,
        LocalDimensions provides dimensions,
        LocalTypography provides typography
    ) {
        MaterialTheme(
            colors = colors,
            typography = typography,
            content = content
        )
    }
}

val Dimens: Dimensions
    @Composable
    get() = AppTheme.dimensions