package com.example.mytodoapp

import java.util.*

data class ToDoItem(
 val item: String,
 val id: UUID = UUID.randomUUID()
)