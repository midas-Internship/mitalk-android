package com.example.mitalk.ui.main

import android.view.ViewDebug.CapturedViewProperty
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.mitalk.R
import com.example.mitalk.util.miClickable
import com.example.mitalk.util.theme.*

@Composable
fun EvaluationDialog(
    name: String,
    visible: Boolean,
    onDismissRequest: () -> Unit,
    onBtnPressed: (Int, String?, String?) -> Unit,
) {
    var starCount by remember { mutableStateOf(1) }

    if (visible) {
        Dialog(
            onDismissRequest = onDismissRequest,
        ) {
            Column(
                modifier = Modifier
                    .width(270.dp)
                    .height(328.dp)
                    .background(
                        color = MitalkColor.White,
                        shape = RoundedCornerShape(12.dp),
                    )
            ) {
                Spacer(modifier = Modifier.height(18.dp))
                DialogClose(onDismissRequest = onDismissRequest)
                Spacer(modifier = Modifier.height(15.dp))
                DialogNameTag(name = name)
                Spacer(modifier = Modifier.height(8.dp))
                DialogStar(starCount = starCount, onStarPressed = { starCount = it })
                Spacer(modifier = Modifier.height(8.dp))
                DialogWhatLike(starCount = starCount)
                Spacer(modifier = Modifier.height(9.dp))
                EvaluateItem(text = "친절해요", onPressed = {_->})
                Spacer(modifier = Modifier.height(42.dp))
                Spacer(modifier = Modifier.height(5.dp))
                DialogBtn(starCount = starCount, onBtnPressed = onBtnPressed)
            }
        }
    }
}

@Composable
fun DialogClose(
    onDismissRequest: () -> Unit,
) {
    IconButton(
        onClick = {
            onDismissRequest()
        },
        modifier = Modifier
            .padding(end = 21.dp)
            .fillMaxWidth()
            .wrapContentWidth(align = Alignment.End)
            .size(9.dp)
    ) {
        Icon(
            painter = painterResource(id = MitalkIcon.Close.drawableId),
            contentDescription = MitalkIcon.Close.contentDescription,
            modifier = Modifier.fillMaxSize(),
        )
    }
}

@Composable
fun DialogNameTag(
    name: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(align = Alignment.CenterHorizontally),
    ) {
        Bold13NO(text = "$name ")
        Light13NO(text = stringResource(id = R.string.how_was_counselor))
    }
}

@Composable
fun DialogStar(
    starCount: Int,
    onStarPressed: (Int) -> Unit
) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(align = Alignment.CenterHorizontally),
    ) {
        items(listOf(5,4,3,2,1)) {
            if(starCount <= it) {
                Image(
                    painter = painterResource(id = MitalkIcon.Star_On.drawableId),
                    contentDescription = MitalkIcon.Star_On.contentDescription,
                    modifier = Modifier
                        .miClickable(
                            rippleEnabled = false
                        ) {
                            onStarPressed(it)
                        }
                )
            } else {
                Image(
                    painter = painterResource(id = MitalkIcon.Star_Off.drawableId),
                    contentDescription = MitalkIcon.Star_On.contentDescription,
                    modifier = Modifier
                        .miClickable(
                            rippleEnabled = false
                        ) {
                            onStarPressed(it)
                        }
                )
            }
        }
    }
}

@Composable
fun DialogWhatLike(
    starCount: Int,
) {
    val text =
        if ((5 - starCount) < 2) stringResource(id = R.string.what_bad_counselor)
        else stringResource(id = R.string.what_like_counselor)

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(align = Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Bold08NO(text = text)
        Regular06NO(text = "(" + stringResource(id = R.string.can_choose_from0_to2) + ")")
    }
}

@Composable
fun EvaluateList(
    starCount: Int,
) {
    val list1 =
        if ((5 - starCount) < 2) listOf(
            stringResource(id = R.string.is_kind),
        ) else listOf(
            stringResource(id = R.string.is_unkind),
        )
    val list2 = 
        if ((5 - starCount < 2)) listOf(
            stringResource(id = R.string.is_good_explanation)
        ) else listOf(
            stringResource(id = R.string.is_bad_explanation)
        )
}

@Stable
private val EvaluateItemShape = RoundedCornerShape(5.dp)

@Composable
fun EvaluateItem(
    text: String,
    onPressed: (String) -> Unit,
) {
    Box(
        modifier = Modifier
            .background(
                color = Color(0xFFE9EBE9),
                shape = EvaluateItemShape,
            )
            .clip(shape = EvaluateItemShape)
            .miClickable(rippleEnabled = false) { onPressed(text) }
    ) {
        Medium10NO(
            text = text,
            modifier = Modifier
                .padding(horizontal = 14.dp)
                .padding(vertical = 6.dp)
        )
    }
}

@Composable
fun DialogEditText() {

}

@Stable
private val BtnShape = RoundedCornerShape(2.dp)
@Composable
fun DialogBtn(
    starCount: Int,
    onBtnPressed: (Int, String?, String?) -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .width(125.dp)
            .height(25.dp)
            .background(
                color = Color(0xFFFFDC64),
                shape = BtnShape
            )
            .clip(shape = BtnShape)
            .miClickable {
                onBtnPressed((5 - starCount) * 25, null, null)
            },
        contentAlignment = Alignment.Center,
    ) {
        Bold08NO(text = stringResource(id = R.string.submit))
    }
}
