package com.peculiaruc.alc_mmsystem_mentor.data.local.database.models

/**
 * A [Manager] class that holds the messages data information.
 *
 *
 */
data class Message(
    val messageId: Int,
    val messageOwner: String,
    val messageType: String,
    val messageBody: String,
    val timeSent: String,
    val isSeen: Boolean? = null,
)
