package com.example.tugasprak5

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tugasprak5.view.Welcome
import com.example.tugasprak5.view.formPendaftaran
import com.example.tugasprak5.view.listForm

enum class Navigasi{
    Home,
    List,
    Form
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
){
    Scaffold { isiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Home.name,

            modifier = Modifier
                .padding(isiRuang)
                .fillMaxSize()
        ){
            composable (route = Navigasi.Home.name){
                Welcome (
                    onMasukClick = {
                        navController.navigate(Navigasi.List.name)
                    }
                )
            }
            composable(route = Navigasi.List.name){
                listForm (
                    OnBackBtnClick = {
                        cancelAndBackToHome(navController)
                    },
                    OnNextBtnClick = {
                        navController.navigate(Navigasi.Form.name)
                    }
                )
            }
            composable(route = Navigasi.Form.name){
                formPendaftaran (
                    OnKembaliBtnClick = {
                        navController.navigate(Navigasi.List.name)
                    },
                    OnSubmitBtnClick = {
                        submitAndGoToPopUp(navController)
                    }
                )
            }
        }
    }
}

private fun submitAndGoToPopUp(navController: NavHostController) {
    navController.navigate(Navigasi.Form.name)
}


private fun cancelAndBackToHome(
    navController: NavController
){
    navController.popBackStack(Navigasi.Home.name, inclusive = false)
}