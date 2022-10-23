package eu.example.swearwordjar.data.repository

import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class StorageRepository() {

	val fireStoreDatabase = Firebase.firestore

	// Create a new user, with first and last name
	val user = hashMapOf(
		"first" to "ada",
		"last" to "Lovelace",
		"born" to 1815
	)

	// Add a new document with a generated ID
	fun addUserToDatabase(){
		fireStoreDatabase.collection("users")
			.add(user)
			.addOnSuccessListener { documentReference ->
				Log.d("TAG","addUserToDatabase: ${documentReference.id}")
			}
			.addOnFailureListener { e ->
				Log.w("error", "addUserToDatabase: ", e)
			}
	}

	////
	// Test with Coroutine
	fun addUserToDatabase1() = CoroutineScope(Dispatchers.IO).launch {
		fireStoreDatabase.collection("users")
			.add(user)
			.addOnSuccessListener { documentReference ->
				Log.d("TAG","addUserToDatabase: ${documentReference.id}")
			}
			.addOnFailureListener { e ->
				Log.w("error", "addUserToDatabase: ", e)
			}
	}




}