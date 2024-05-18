package com.example.todoapp.data

import java.util.UUID

data class TodoItem (
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val isDone: Boolean = false,
)