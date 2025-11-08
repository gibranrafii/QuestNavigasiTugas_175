package com.example.tugasprak5.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasprak5.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun listForm (
    OnBackBtnClick : () -> Unit,
    OnNextBtnClick : () -> Unit,
) {
    Box (
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 10.dp),
        contentAlignment = Alignment.Center
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.biru_tua)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "List Peserta",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier
                    .padding(top = 50.dp, start = 12.dp)
            )
            Spacer(modifier = Modifier.padding(10.dp))

        }
    }
}