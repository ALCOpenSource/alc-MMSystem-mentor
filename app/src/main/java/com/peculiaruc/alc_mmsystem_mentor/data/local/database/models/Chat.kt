package com.peculiaruc.alc_mmsystem_mentor.data.local.database.models

import com.peculiaruc.alc_mmsystem_mentor.ui.tasks.adapters.TaskListAdapter

/**
 * A [Chat] class that holds the chats data.
 *
 * It is used to instantiate the chatOwner, messages and number of messages variable.
 */

data class Chat(
    val chatOwner: String,
    val messages: List<Message>,
    val numberOfNewMessages: Int? = null
)
