package eu.example.swearwordjar.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import eu.example.swearwordjar.presentation.home.components.ShowTotalAmountInBox

@Composable
fun HomeScreen(homeScreenViewModel: HomeScreenViewModel = HomeScreenViewModel()) {

	val homeScreenViewModel = homeScreenViewModel
	homeScreenViewModel.addData()

	Surface(modifier = Modifier.fillMaxSize()) {
		Column() {
			ShowTotalAmountInBox(totalAmountInBox = "100 Kr.")

			homeScreenViewModel.addData()
		}

	}

}