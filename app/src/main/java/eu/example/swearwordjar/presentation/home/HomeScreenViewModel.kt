package eu.example.swearwordjar.presentation.home

import androidx.lifecycle.ViewModel
import eu.example.swearwordjar.data.repository.StorageRepository

class HomeScreenViewModel(storageRepository: StorageRepository = StorageRepository()) :
	ViewModel() {

	val storageRepository = storageRepository

		fun addData(){
			storageRepository.addUserToDatabase()
		}
}