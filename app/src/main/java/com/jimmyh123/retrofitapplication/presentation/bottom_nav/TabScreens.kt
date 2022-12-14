package com.jimmyh123.retrofitapplication.presentation.bottom_nav

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.jimmyh123.retrofitapplication.R

@Composable
fun TabScreenOne() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.teal_700))
            .wrapContentSize(Alignment.Center)
    ) {
        val tabTextModifier = Modifier.align(Alignment.CenterHorizontally)
        TabScreenText("TabScreenOne!", tabTextModifier)
    }
}

@Composable
fun TabScreenTwo() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.purple_200))
            .wrapContentSize(Alignment.Center)
    ) {
        val tabTextModifier = Modifier.align(Alignment.CenterHorizontally)
        TabScreenText("TabScreenTwo!", tabTextModifier)
    }
}

@Composable
fun TabScreenThree() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.black))
            .wrapContentSize(Alignment.Center)
    ) {
        val tabTextModifier = Modifier.align(Alignment.CenterHorizontally)
        TabScreenText("TabScreenThree!", tabTextModifier)
    }
}

@Composable
fun TabScreenText(
    tabScreenTitleText: String,
    modifier: Modifier
) {
    Text(
        text = tabScreenTitleText,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        modifier = modifier,
        textAlign = TextAlign.Center,
        fontSize = 25.sp
    )
}
