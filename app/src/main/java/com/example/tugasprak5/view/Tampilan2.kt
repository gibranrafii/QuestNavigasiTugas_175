package com.example.tugasprak5.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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

            Card (
                modifier = Modifier
                    .padding(all = 12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(id = R.color.white)
                )
            ) {
                Column(modifier = Modifier.padding(10.dp)) {

                    Row (
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column {
                            Text(
                                stringResource(id = R.string.nama_lengkap),
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                color = Color.Black)
                            Text("Daffa Alyandra",
                                fontSize = 14.sp,
                                color = Color.Black)
                        }
                        Spacer(modifier = Modifier.width(100.dp))
                        Column {
                            Text(stringResource(id = R.string.jenis_kelamin),
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                color = Color.Black)
                            Text("Laki-laki",
                                fontSize = 14.sp,
                                color = Color.Black)
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column {
                            Text(
                                stringResource(id = R.string.status),
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                color = Color.Black
                            )
                            Text("Single",
                                fontSize = 14.sp,
                                color = Color.Black
                            )
                        }
                        Spacer(modifier = Modifier.width(150.dp))
                        Column {
                            Text(stringResource(id = R.string.alamat),
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                color = Color.Black
                            )
                            Text("Tamsis",
                                fontSize = 14.sp,
                                color = Color.Black
                            )
                        }
                    }
                }
            }
            Card (
                modifier = Modifier
                    .padding(all = 12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(id = R.color.white)
                )
            ) {
                Column(modifier = Modifier.padding(10.dp)) {

                    Row (
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column {
                            Text(
                                stringResource(id = R.string.nama_lengkap),
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                color = Color.Black)
                            Text("Abimanyu",
                                fontSize = 14.sp,
                                color = Color.Black)
                        }
                        Spacer(modifier = Modifier.width(100.dp))
                        Column {
                            Text(stringResource(id = R.string.jenis_kelamin),
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                color = Color.Black)
                            Text("Laki-laki",
                                fontSize = 14.sp,
                                color = Color.Black)
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column {
                            Text(
                                stringResource(id = R.string.status),
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                color = Color.Black
                            )
                            Text("Taken",
                                fontSize = 14.sp,
                                color = Color.Black
                            )
                        }
                        Spacer(modifier = Modifier.width(150.dp))
                        Column {
                            Text(stringResource(id = R.string.alamat),
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                color = Color.Black
                            )
                            Text("Bantul",
                                fontSize = 14.sp,
                                color = Color.Black
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(220.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Button (
                    modifier = Modifier.weight(1f)
                        .padding(start = 15.dp)
                        .size(50.dp),
                    onClick = OnBackBtnClick,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.biru_gelap))
                ) {
                    Text(stringResource(id = R.string.beranda))
                }

                Button(
                    modifier = Modifier.weight(1f)
                        .padding(end = 15.dp )
                        .size(50.dp),
                    onClick = OnNextBtnClick,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.biru_gelap))
                ) {
                    Text(stringResource(id = R.string.formulir))
                }
            }
        }
    }
}