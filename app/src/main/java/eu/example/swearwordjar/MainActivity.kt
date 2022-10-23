package eu.example.swearwordjar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import eu.example.swearwordjar.presentation.home.HomeScreen
import eu.example.swearwordjar.presentation.home.HomeScreenViewModel
import eu.example.swearwordjar.presentation.ui.theme.SwearWordJarTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			SwearWordJarTheme {
				// A surface container using the 'background' color from the theme
				HomeScreen()
			}
		}
	}
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
	SwearWordJarTheme {

	}
}