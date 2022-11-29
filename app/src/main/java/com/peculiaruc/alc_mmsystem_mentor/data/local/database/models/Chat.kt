package com.peculiaruc.alc_mmsystem_mentor.data.local.database.models

data class Chat(
    val chatOwner: String,
    val messages: List<Message>,
    val numberOfNewMessages: Int? = null
)
