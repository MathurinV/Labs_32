package com.example.labs_32.data

import kotlinx.coroutines.flow.Flow
import java.util.UUID

class OfflineTasksRepository(private val taskDao: TaskDao) : TasksRepository {
    override fun getAllITasksStream(): Flow<List<Task>> = taskDao.getAllTasks()

    override fun getTaskStream(id: UUID): Flow<Task?> = taskDao.getTask(id)

    override suspend fun insertTask(task: Task) = taskDao.insert(task)

    override suspend fun deleteTask(task: Task) = taskDao.delete(task)

    override suspend fun updateTask(task: Task) = taskDao.update(task)
}