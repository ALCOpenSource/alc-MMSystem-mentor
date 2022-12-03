package com.peculiaruc.alc_mmsystem_mentor.data.local.database

import android.content.Context
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.peculiaruc.alc_mmsystem_mentor.data.local.dao.TaskDao
import com.peculiaruc.alc_mmsystem_mentor.data.local.models.Task

/**
 * A [Database] schema that is used to cache locally, the mentor tasks data.
 *
 * It implements the getDatabase method.
 *
 */
@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class MentorDatabase: RoomDatabase() {

    /**
     * Creates an instance of the taskDao interface.
     */
    abstract fun taskDao(): TaskDao
    companion object {
        @Volatile
        private var INSTANCE: MentorDatabase? = null

        /**
         * It is used to fetch cached data on the database.
         */
        fun getDatabase(context: Context): MentorDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MentorDatabase::class.java,
                    "mentor_database"
                ).fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}