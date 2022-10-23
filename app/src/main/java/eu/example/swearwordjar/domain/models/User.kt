package eu.example.swearwordjar.domain.models

// import com.google.firebase.Timestamp

data class User(
	val userId: String = "",
	val documentId: String = "",
	// val timestamp: Timestamp = Timestamp.now()
	val amountOwed: String = ""
)
