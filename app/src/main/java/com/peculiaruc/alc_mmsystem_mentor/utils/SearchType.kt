package com.peculiaruc.alc_mmsystem_mentor.utils

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

enum class EventCategories(val _readableValue: String) {
    Certificates("Certificates"),
    MentorManagers("Mentor Managers"),
    Mentors("Mentors"),
    Reports("Reports"),
    Tasks("Tasks"),
    Programs("Programs")
}



@Target(
    AnnotationTarget.FIELD, AnnotationTarget.CLASS
)
annotation class SearchTypes

@Target(
    AnnotationTarget.FIELD, AnnotationTarget.CLASS
)
annotation class EventCategoriesTypes