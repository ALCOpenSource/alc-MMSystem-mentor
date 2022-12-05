package com.peculiaruc.alc_mmsystem_mentor.domain

/**
 * Comment item
 *
 * @property id
 * @property owner
 * @property description
 * @property time
 * @constructor Create empty Comment item
 */
data class CommentItem(
    val id : Int,
    val owner : String,
    val description : String,
    val time: String,

)
