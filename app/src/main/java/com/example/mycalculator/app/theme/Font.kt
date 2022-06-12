package com.example.mycalculator.app.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.mycalculator.R

val appFontFamily = FontFamily(
    fonts = listOf(
        Font(
            resId = R.font.roboto_black,
            weight = FontWeight.W900,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.roboto_black_italic,
            weight = FontWeight.W900,
            style = FontStyle.Italic
        ),
        Font(
            resId = R.font.roboto_bold,
            weight = FontWeight.W700,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.roboto_bold_italic,
            weight = FontWeight.W700,
            style = FontStyle.Italic
        ),
        Font(
            resId = R.font.roboto_light,
            weight = FontWeight.W300,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.roboto_light_italic,
            weight = FontWeight.W300,
            style = FontStyle.Italic
        ),
        Font(
            resId = R.font.roboto_medium,
            weight = FontWeight.W500,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.roboto_medium_italic,
            weight = FontWeight.W500,
            style = FontStyle.Italic
        ),
        Font(
            resId = R.font.roboto_regular,
            weight = FontWeight.W400,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.roboto_thin,
            weight = FontWeight.W100,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.roboto_thin_italic,
            weight = FontWeight.W100,
            style = FontStyle.Italic
        )
    )
)
