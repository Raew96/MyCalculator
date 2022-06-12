package com.example.mycalculator.app.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.sp

private val defaultTypography = Typography()

val smallTypography = Typography(
    h1 = defaultTypography.h1.copy(fontFamily = appFontFamily, fontSize = 96.sp),
    h2 = defaultTypography.h2.copy(fontFamily = appFontFamily, fontSize = 60.sp),
    h3 = defaultTypography.h3.copy(fontFamily = appFontFamily, fontSize = 48.sp),
    h4 = defaultTypography.h4.copy(fontFamily = appFontFamily, fontSize = 34.sp),
    h5 = defaultTypography.h5.copy(fontFamily = appFontFamily, fontSize = 24.sp),
    h6 = defaultTypography.h6.copy(fontFamily = appFontFamily, fontSize = 20.sp),
    subtitle1 = defaultTypography.subtitle1.copy(fontFamily = appFontFamily, fontSize = 16.sp),
    subtitle2 = defaultTypography.subtitle2.copy(fontFamily = appFontFamily, fontSize = 14.sp),
    body1 = defaultTypography.body1.copy(fontFamily = appFontFamily, fontSize = 16.sp),
    body2 = defaultTypography.body2.copy(fontFamily = appFontFamily, fontSize = 14.sp),
    button = defaultTypography.button.copy(fontFamily = appFontFamily, fontSize = 14.sp),
    caption = defaultTypography.caption.copy(fontFamily = appFontFamily, fontSize = 12.sp),
    overline = defaultTypography.overline.copy(fontFamily = appFontFamily, fontSize = 10.sp)
)

val sw360Typography = Typography(

    h1 = defaultTypography.h1.copy(fontFamily = appFontFamily, fontSize = 76.sp),
    h2 = defaultTypography.h2.copy(fontFamily = appFontFamily, fontSize = 48.sp),
    h3 = defaultTypography.h3.copy(fontFamily = appFontFamily, fontSize = 38.sp),
    h4 = defaultTypography.h4.copy(fontFamily = appFontFamily, fontSize = 27.sp),
    h5 = defaultTypography.h5.copy(fontFamily = appFontFamily, fontSize = 19.sp),
    h6 = defaultTypography.h6.copy(fontFamily = appFontFamily, fontSize = 18.sp),
    subtitle1 = defaultTypography.subtitle1.copy(fontFamily = appFontFamily, fontSize = 13.sp),
    subtitle2 = defaultTypography.subtitle2.copy(fontFamily = appFontFamily, fontSize = 11.sp),
    body1 = defaultTypography.body1.copy(fontFamily = appFontFamily, fontSize = 13.sp),
    body2 = defaultTypography.body2.copy(fontFamily = appFontFamily, fontSize = 11.sp),
    button = defaultTypography.button.copy(fontFamily = appFontFamily, fontSize = 11.sp),
    caption = defaultTypography.caption.copy(fontFamily = appFontFamily, fontSize = 10.sp),
    overline = defaultTypography.overline.copy(fontFamily = appFontFamily, fontSize = 8.sp)
)

internal val LocalTypography = staticCompositionLocalOf { smallTypography }