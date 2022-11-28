package com.peculiaruc.alc_mmsystem_mentor.data.local.dao

import androidx.room.*
import com.peculiaruc.alc_mmsystem_mentor.data.local.models.Task
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    //Get one or more tasks using the id
    @Query("SELECT * from task WHERE id = :id")
    fun getTasks(id: Int) : Flow<Task>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertTask(task: Task)

    @Update
    suspend fun updateTask(task: Task)

    @Delete
    suspend fun deleteTask(task: Task)


}