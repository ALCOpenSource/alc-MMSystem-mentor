package com.peculiaruc.alc_mmsystem_mentor.data.local.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task")
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "title")
    var title: String,
    @ColumnInfo(name = "description")
    var desc: String,
    @ColumnInfo(name = "assigned")
    val assigned: Boolean,
    @ColumnInfo(name = "completed")
    val completed: Boolean,
    @ColumnInfo(name = "assignee")
    val assignee: Int
)
