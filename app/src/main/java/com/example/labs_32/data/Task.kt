package com.example.labs_32.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: UUID,
    val title: String,
    val description: String,
    val is_done: Boolean
)