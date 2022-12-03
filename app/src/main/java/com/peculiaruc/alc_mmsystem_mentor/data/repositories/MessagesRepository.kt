package com.peculiaruc.alc_mmsystem_mentor.data.repositories

import com.peculiaruc.alc_mmsystem_mentor.data.local.database.models.Chat
import com.peculiaruc.alc_mmsystem_mentor.data.local.database.models.Message

/**
 * A [MessagesRepository] object that holds the abstracted data of the Messages.
 *
 *
 */
object MessagesRepository {

    var tempName: String = "Aisha Phiri"
    var tempName2: String = "Kenny Dabiri"

    val allChats = mutableListOf<Chat>(

        Chat(
            chatOwner = tempName2,
            messages = mutableListOf(
                Message(
                    messageId = 1,
                    messageOwner = tempName,
                    messageType = "received",
                    messageBody = "Hello Aisha. Trust you are well?",
                    timeSent = "6:35pm"
                ),
                Message(
                    messageId = 2,
                    messageOwner = tempName,
                    messageType = "sent",
                    messageBody = "Hie Kenny, yes I am well thanks",
                    timeSent = "6:40pm",
                    isSeen = true
                ),
                Message(
                    messageId = 1,
                    messageOwner = tempName,
                    messageType = "received",
                    messageBody = "I wanted to follow up on the assignment I gave you. Have you done it?",
                    timeSent = "6:42pm"
                ),
                Message(
                    messageId = 2,
                    messageOwner = tempName,
                    messageType = "sent",
                    messageBody = "No I haven't. Was waiting for you to onboard me.",
                    timeSent = "7:00pm",
                    isSeen = false
                ),
            )
        ),

    )

    /**
     * It is used to fetch the chat messages from the server.
     */
    fun getChatMessages(name: String): List<Message>? {

        val chat = allChats.find { chat -> chat.chatOwner == name }
        return chat?.messages

    }

    /**
     * It is used to fetch the text messages from the server.
     */
    fun getTestMessages(): List<Message> = allChats[1].messages


}