package eu.example.swearwordjar.presentation.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


// This function should run, and read the total amount from firestore
// when the app launch, and then it should recompose everytime
// total amount is updated
@Composable
fun ShowTotalAmountInBox(totalAmountInBox: String) {
	Card(modifier = Modifier.fillMaxHeight(0.3f)) {
		Column(
			modifier = Modifier
				.fillMaxSize()
				.padding(16.dp),
			horizontalAlignment = Alignment.CenterHorizontally,
			// verticalArrangement = Arrangement.Center
		) {
			Text(
				text = "Total amount in swear box",
				fontSize = 22.sp,
				maxLines = 1,
				overflow = TextOverflow.Ellipsis)
			Text(text = totalAmountInBox, fontSize = 22.sp)
		}


	}
}