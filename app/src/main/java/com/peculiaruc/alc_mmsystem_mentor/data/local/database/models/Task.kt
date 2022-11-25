package com.peculiaruc.alc_mmsystem_mentor.data.local.database.models

data class Task(
    val id: Int,
    var title: String,
    var desc: String,
    val assigned: Boolean,
    val completed: Boolean,
    val assignee: Int
)
