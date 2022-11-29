package com.peculiaruc.alc_mmsystem_mentor.data.local.database.models

data class Message(
    val messageId: Int,
    val messageOwner: String,
    val messageType: String,
    val messageBody: String,
    val timeSent: String,
    val isSeen: Boolean? = null,
)
