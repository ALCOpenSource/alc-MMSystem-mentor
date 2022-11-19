package com.peculiaruc.alc_mmsystem_mentor.utils

@SearchTypes
enum class SearchType {
    All, Certificates, MentorManagers, Mentors, Reports, Tasks, Programs
}

@Target(
    AnnotationTarget.FIELD, AnnotationTarget.CLASS
)
annotation class SearchTypes