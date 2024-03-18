package com.example.labs_32.data

import kotlinx.coroutines.flow.Flow
import java.util.UUID

interface TasksRepository {
    fun getAllITasksStream(): Flow<List<Task>>
    fun getTaskStream(id : UUID): Flow<Task?>
    suspend fun insertTask(task:Task)
    suspend fun deleteTask(task: Task)
    suspend fun updateTask(task: Task)
}