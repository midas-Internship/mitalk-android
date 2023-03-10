package com.example.mitalk.ui.question

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mitalk.R
import com.example.mitalk.ui.util.MiHeader
import com.example.mitalk.util.miClickable
import com.example.mitalk.util.theme.*
import com.example.mitalk.vm.question.QuestionViewModel

@Composable
fun QuestionScreen(
    navController: NavController,
    vm: QuestionViewModel = hiltViewModel(),
) {

    val container = vm.container
    val state = container.stateFlow.collectAsState().value
    val sideEffect = container.sideEffectFlow

    LaunchedEffect(vm) {
        vm.getQuestionList()
    }

    Column {
        MiHeader(
            text = stringResource(id = R.string.question_many),
            backPressed = {
                navController.popBackStack()
            }
        )

        Spacer(modifier = Modifier.height(19.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(13.dp)
        ) {
            items(state.questionList) {
                QuestionContent(question = it.question, answer = it.answer)
            }
        }
    }
}

@Stable
private val ItemShape = RoundedCornerShape(10.dp)

@Composable
private fun QuestionContent(
    question: String,
    answer: String,
) {

    var open by remember { mutableStateOf(false) }
    var targetValue by remember { mutableStateOf(180F) }
    val rotateValue: Float by animateFloatAsState(
        targetValue = targetValue,
        tween(500)
    )

    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .background(
                color = MitalkColor.White,
                shape = ItemShape,
            )
            .border(
                width = 1.dp,
                color = Color(0xFFEBEBEB),
                shape = ItemShape,
            )
            .miClickable(
                rippleEnabled = false,
            ) {
                targetValue = if (!open) {
                    270F
                } else {
                    180F
                }
                open = !open
            }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        ) {
            Spacer(modifier = Modifier.width(10.dp))

            Bold13NO(
                text = "Q",
                color = Color(0xFF4BE8DE),
            )

            Spacer(modifier = Modifier.width(6.dp))

            Medium13NO(
                modifier = Modifier.width(230.dp),
                text = question,
            )

            SeeAnswerIcon(rotateValue = rotateValue)

        }

        if (open) {
            Row {
                Spacer(modifier = Modifier.width(10.dp))

                Bold13NO(
                    text = "A",
                    color = Color(0xFFEB5656),
                )

                Spacer(modifier = Modifier.width(6.dp))

                Light11NO(
                    text = answer,
                    modifier = Modifier.padding(end = 21.dp)
                )
            }

            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Composable
private fun SeeAnswerIcon(
    rotateValue: Float,
) {
    Icon(
        painter = painterResource(id = MitalkIcon.Back.drawableId),
        contentDescription = MitalkIcon.Back.contentDescription,
        modifier = Modifier
            .padding(end = 21.dp)
            .fillMaxSize()
            .wrapContentWidth(align = Alignment.End)
            .rotate(rotateValue)
    )
}

@Composable
@Preview(showBackground = true)
fun ShowQuestionScreen() {
    val navController = rememberNavController()

    QuestionScreen(navController = navController)
}
