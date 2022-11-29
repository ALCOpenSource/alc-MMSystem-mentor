package com.peculiaruc.alc_mmsystem_mentor.data.repositories

import com.peculiaruc.alc_mmsystem_mentor.data.local.database.models.Chat
import com.peculiaruc.alc_mmsystem_mentor.data.local.database.models.Message

object MessagesRepository {

    val allChats = mutableListOf<Chat>(

        Chat(
            chatOwner = "Kenny Dabiri",
            messages = mutableListOf(
                Message(
                    messageId = 1,
                    messageOwner = "Aisha Phiri",
                    messageType = "received",
                    messageBody = "Hello Aisha. Trust you are well?",
                    timeSent = "6:35pm"
                ),
                Message(
                    messageId = 2,
                    messageOwner = "Aisha Phiri",
                    messageType = "sent",
                    messageBody = "Hie Kenny, yes I am well thanks",
                    timeSent = "6:40pm",
                    isSeen = true
                ),
                Message(
                    messageId = 1,
                    messageOwner = "Aisha Phiri",
                    messageType = "received",
                    messageBody = "I wanted to follow up on the assignment I gave you. Have you done it?",
                    timeSent = "6:42pm"
                ),
                Message(
                    messageId = 2,
                    messageOwner = "Aisha Phiri",
                    messageType = "sent",
                    messageBody = "No I haven't. Was waiting for you to onboard me.",
                    timeSent = "7:00pm",
                    isSeen = false
                ),
            )
        ),

    )

    fun getChatMessages(name: String): List<Message>? {

        val chat = allChats.find { chat -> chat.chatOwner == name }
        return chat?.messages

    }

    fun getTestMessages(): List<Message> = allChats[1].messages


}