package com.example.itc_football.data

import com.google.firebase.Timestamp

data class Chat(
    val username: String = "",
    val text: String = "",
    val isSelf: Boolean = false,
    val timestamp: Timestamp = Timestamp.now()
)
