package com.example.mitalk.util.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mitalk.R

internal val notoSansKR = FontFamily(
    Font(R.font.noto_sans_kr_black, FontWeight.Black),
    Font(R.font.noto_sans_kr_bold, FontWeight.Bold),
    Font(R.font.noto_sans_kr_light, FontWeight.Light),
    Font(R.font.noto_sans_kr_medium, FontWeight.Medium),
    Font(R.font.noto_sans_kr_regular, FontWeight.Normal),
    Font(R.font.noto_sans_kr_thin, FontWeight.Thin),
)

internal val gmartketSans = FontFamily(
    Font(R.font.gmarket_sans_light, FontWeight.Light),
    Font(R.font.gmarket_sans_medium, FontWeight.Medium),
    Font(R.font.gmarket_sans_bold, FontWeight.Bold)
)

object MiTalkTypography {

    @Stable
    val light09NO = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Light,
        fontSize = 9.sp,
    )

    @Stable
    val light11NO = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Light,
        fontSize = 11.sp
    )

    @Stable
    val light13NO = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Light,
        fontSize = 13.sp,
    )

    @Stable
    val medium13NO = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Medium,
        fontSize = 13.sp,
    )

    @Stable
    val regular7No = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Normal,
        fontSize = 7.sp
    )

    @Stable
    val regular06NO = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Normal,
        fontSize = 6.sp
    )

    @Stable
    val regular12NO = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )

    @Stable
    val regular14NO = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    )

    @Stable
    val medium10NO = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp
    )

    @Stable
    val bold08NO = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Bold,
        fontSize = 8.sp
    )

    @Stable
    val bold11NO = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Bold,
        fontSize = 11.sp
    )

    @Stable
    val bold13NO = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Bold,
        fontSize = 13.sp,
    )

    @Stable
    val bold20NO = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
    )

    @Stable
    val bold26NO = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Bold,
        fontSize = 26.sp,
    )

    @Stable
    val medium10GM = TextStyle(
        fontFamily = gmartketSans,
        fontWeight = FontWeight.Medium,
        fontSize = 13.sp
    )

    @Stable
    val medium15GM = TextStyle(
        fontFamily = gmartketSans,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp
    )

    @Stable
    val medium21GM = TextStyle(
        fontFamily = gmartketSans,
        fontWeight = FontWeight.Medium,
        fontSize = 21.sp,
    )

}

@Composable
fun Regular7NO(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start,
) {
    Text(
        modifier = modifier,
        text = text,
        style = MiTalkTypography.regular7No,
        color = color,
        textAlign = textAlign,
    )
}
@Composable
fun Light09NO(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start
) {
    Text(
        modifier = modifier,
        text = text,
        style = MiTalkTypography.light09NO,
        color = color,
        textAlign = textAlign,
    )
}

@Composable
fun Light11NO(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start
) {
    Text(
        modifier = modifier,
        text = text,
        style = MiTalkTypography.light11NO,
        color = color,
        textAlign = textAlign,
    )
}
@Composable
fun Light13NO(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start,
) {
    Text(
        modifier = modifier,
        text = text,
        style = MiTalkTypography.light13NO,
        color = color,
        textAlign = textAlign,
    )
}

@Composable
fun Medium13NO(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start,
) {
    Text(
        modifier = modifier,
        text = text,
        style = MiTalkTypography.medium13NO,
        color = color,
        textAlign = textAlign,
    )
}

@Composable
fun Regular06NO(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start,
) {
    Text(
        modifier = modifier,
        text = text,
        style = MiTalkTypography.regular06NO,
        color = color,
        textAlign = textAlign,
    )
}

@Composable
fun Regular12NO(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start,
) {
    Text(
        modifier = modifier,
        text = text,
        style = MiTalkTypography.regular12NO,
        color = color,
        textAlign = textAlign,
    )
}

@Composable
fun Regular14NO(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start,
) {
    Text(
        modifier = modifier,
        text = text,
        style = MiTalkTypography.regular14NO,
        color = color,
        textAlign = textAlign,
    )
}

@Composable
fun Medium10NO(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start,
) {
    Text(
        modifier = modifier,
        text = text,
        style = MiTalkTypography.medium10NO,
        color = color,
        textAlign = textAlign,
    )
}

@Composable
fun Bold08NO(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start,
) {
    Text(
        modifier = modifier,
        text = text,
        style = MiTalkTypography.bold08NO,
        color = color,
        textAlign = textAlign,
    )
}

@Composable
fun Bold11NO(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start,
) {
    Text(
        modifier = modifier,
        text = text,
        style = MiTalkTypography.bold11NO,
        color = color,
        textAlign = textAlign,
    )
}

@Composable
fun Bold13NO(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start,
) {
    Text(
        modifier = modifier,
        text = text,
        style = MiTalkTypography.bold13NO,
        color = color,
        textAlign = textAlign,
    )
}



@Composable
fun Bold20NO(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start,
) {
    Text(
        modifier = modifier.padding(0.dp),
        text = text,
        style = MiTalkTypography.bold20NO,
        color = color,
        textAlign = textAlign,
    )
}

@Composable
fun Bold26NO(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start,
) {
    Text(
        modifier = modifier,
        text = text,
        style = MiTalkTypography.bold26NO,
        color = color,
        textAlign = textAlign
    )
}

@Composable
fun Medium10GM(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start,
) {
    Text(
        modifier = modifier,
        text = text,
        style = MiTalkTypography.medium10GM,
        color = color,
        textAlign = textAlign,
    )
}

@Composable
fun Medium15GM(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start,
) {
    Text(
        modifier = modifier,
        text = text,
        style = MiTalkTypography.medium15GM,
        color = color,
        textAlign = textAlign,
    )
}
@Composable
fun Medium21GM(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MitalkColor.Black,
    textAlign: TextAlign = TextAlign.Start,
) {
    Text(
        modifier = modifier,
        text = text,
        style = MiTalkTypography.medium21GM,
        color = color,
        textAlign = textAlign,
    )
}

