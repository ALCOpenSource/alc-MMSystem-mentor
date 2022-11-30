package com.peculiaruc.alc_mmsystem_mentor.data.local.dao

import androidx.room.*
import com.peculiaruc.alc_mmsystem_mentor.data.local.models.Task
import kotlinx.coroutines.flow.Flow

/**
 * A [Dao] object that interacts with tasks database.
 *
 * It implements the getTasks, insertTasks, updateTasks and deleteTasks suspend methods.
 *
 */
@Dao
interface TaskDao {

    /**
     * Gets one or more tasks using the id
     */
    @Query("SELECT * from task WHERE id = :id")
    fun getTasks(id: Int) : Flow<Task>

    /**
     * Inserts a new tasks to the db.
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertTask(task: Task)

    /**
     * Used to update the tasks schema.
     */
    @Update
    suspend fun updateTask(task: Task)

    /**
     * Used to delete a task from the db.
     */
    @Delete
    suspend fun deleteTask(task: Task)


}