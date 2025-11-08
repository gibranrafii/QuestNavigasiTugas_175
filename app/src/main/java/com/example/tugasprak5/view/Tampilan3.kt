package com.example.tugasprak5.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasprak5.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun formPendaftaran (
    OnKembaliBtnClick: () -> Unit,
    OnSubmitBtnClick: () -> Unit
) {
    var textNama by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }

    var namaLengkap by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }

    var showDialog by remember { mutableStateOf(false) }

    val gender:List<String> = listOf("Laki-Laki", "Perempuan")
    val kawin:List<String> = listOf("Single", "Taken", "HTS")

    Scaffold (
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 10.dp),
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Formulir Pendaftaran")
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.biru_tua)
                )
            )
        },
    ) { isiRuang ->
        Column (
            modifier = Modifier
                .padding(isiRuang)
                .fillMaxSize()
                .background(colorResource(id = R.color.biru_tua)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            ElevatedCard (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 12.dp, bottom = 12.dp, end = 12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(id = R.color.biru)
                )
            ){
                Text(
                    stringResource(id = R.string.nama_lengkap),
                    fontSize = 18.sp,
                    modifier = Modifier.padding(top = 12.dp, start = 16.dp, bottom = 10.dp)
                )
                OutlinedTextField(
                    value = textNama,
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 12.dp),
                    label = { Text(text = "Isian Nama Lengkap") },

                    onValueChange = {
                        textNama = it
                    }
                )
            }
        }
    }
}