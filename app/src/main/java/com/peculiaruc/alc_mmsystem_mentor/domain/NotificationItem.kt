package com.peculiaruc.alc_mmsystem_mentor.domain

/**
 * Notification item
 *
 * @property id
 * @property title
 * @property time
 * @constructor Create empty Notification item
 */
data class NotificationItem(
    val id : Int,
    val title : String,
    val time : String
)
