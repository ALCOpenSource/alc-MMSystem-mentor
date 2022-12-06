package com.peculiaruc.alc_mmsystem_mentor.utils

/**
 * Search type
 *
 * @constructor
 *
 * @param _readableValue
 */
@SearchTypes
enum class SearchType(_readableValue: String) {
    All("All"),
    Certificates("Certificates"),
    MentorManagers("Mentor Managers"),
    Mentors("Mentors"),
    Reports("Reports"),
    Tasks("Tasks"),
    Programs("Programs")
}


/**
 * Event categories
 *
 * @property _readableValue
 * @constructor Create empty Event categories
 */
enum class EventCategories(val _readableValue: String) {
    Certificates("Certificates"),
    MentorManagers("Mentor Managers"),
    Mentors("Mentors"),
    Reports("Reports"),
    Tasks("Tasks"),
    Programs("Programs")
}


/**
 * Search types
 *
 * @constructor Create empty Search types
 */
@Target(
    AnnotationTarget.FIELD, AnnotationTarget.CLASS
)
annotation class SearchTypes

/**
 * Event categories types
 *
 * @constructor Create empty Event categories types
 */
@Target(
    AnnotationTarget.FIELD, AnnotationTarget.CLASS
)
annotation class EventCategoriesTypes