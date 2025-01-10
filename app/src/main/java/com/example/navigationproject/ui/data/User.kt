package com.example.navigationproject.ui.data
import java.io.Serializable

data class User(
    val name: String,
    val email: String,
    val password: String
): Serializable