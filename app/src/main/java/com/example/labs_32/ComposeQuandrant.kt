package com.example.labs_32

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.labs_32.ui.theme.Labs_32Theme

@Composable
fun TextComposable() {
    Column(
        modifier = Modifier
            .fillMaxSize(0.5f)
            .padding(16.dp)
            .background((Color(0xFFEADDFF))),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Text(
            text = "Text composable",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Displays text and follows the recommended Material Design guidelines.",
            fontStyle = FontStyle.Normal
        )
    }
}

@Composable
fun ImageComposable() {
    Column(
        modifier = Modifier
            .fillMaxSize(0.5f)
            .padding(16.dp)
            .background(Color(0xFFD0BCFF)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Text(
            text = "Image composable",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Creates a composable that lays out and draws a given Painter class object.",
            fontStyle = FontStyle.Normal
        )
    }
}

@Composable
fun RowComposable() {
    Column(
        modifier = Modifier
            .fillMaxSize(0.5f)
            .padding(16.dp)
            .background(Color(0xFFB69DF8)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Text(
            text = "Row composable",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "A layout composable that places its children in a horizontal sequence.",
            fontStyle = FontStyle.Normal
        )
    }
}

@Composable
fun ColumnComposable() {
    Column(
        modifier = Modifier
            .fillMaxSize(0.5f)
            .padding(16.dp)
            .background(Color(0xFFF6EDFF)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Text(
            text = "Column composable",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "A layout composable that places its children in a vertical sequence.",
            fontStyle = FontStyle.Normal
        )
    }
}

@Composable
fun ComposeQuadrant() {
    Row {
        TextComposable()
    }
}

@Composable
@Preview
fun PreviewComposeQuandrant() {
    Labs_32Theme {
        ComposeQuadrant()
    }
}