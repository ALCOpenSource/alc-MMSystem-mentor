package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils

import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.SearchItem
import com.peculiaruc.alc_mmsystem_mentor.utils.SearchType

object UiData {

    val drawerNavItems = mutableListOf(
        NavItems(R.drawable.ic_home, R.string.home_fragment_label),
        NavItems(R.drawable.ic_account, R.string.profile_fragment_label),
        NavItems(R.drawable.ic_programs, R.string.programs_fragment_label),
        NavItems(R.drawable.ic_mentor_managers, R.string.my_managers_fragment_label),
        NavItems(R.drawable.ic_task, R.string.tasks_fragment_label),
        NavItems(R.drawable.ic_reports, R.string.reports_fragment_label),
        NavItems(R.drawable.ic_certificate, R.string.certificate_fragment_label),
        NavItems(R.drawable.ic_messages, R.string.messages_fragment_label),
        NavItems(R.drawable.ic_discussion_forum, R.string.discussion_forum_fragment_label),
        NavItems(R.drawable.ic_logout_bckward, R.string.logout),
    )

    val homeNavItems = mutableListOf(
        NavItems(R.drawable.ic_home, R.string.home_fragment_label),
        NavItems(R.drawable.ic_account, R.string.profile_fragment_label),
        NavItems(R.drawable.ic_programs, R.string.programs_fragment_label),
        NavItems(R.drawable.ic_mentor_managers, R.string.my_managers_fragment_label),
        NavItems(R.drawable.ic_task, R.string.tasks_fragment_label),
        NavItems(R.drawable.ic_reports, R.string.reports_fragment_label),
        NavItems(R.drawable.ic_certificate, R.string.certificate_fragment_label),
        NavItems(R.drawable.ic_messages, R.string.messages_fragment_label),
        NavItems(R.drawable.ic_discussion_forum, R.string.discussion_forum_fragment_label),
        NavItems(R.drawable.ic_logout_bckward, R.string.logout),
    )


    val searchItems = mutableListOf(
        SearchItem(
            R.drawable.ic_launcher_background,
            title = "Google Africa Scholarship",
            sourceLocation = SearchType.Programs,
        ),
        SearchItem(
            R.drawable.ic_launcher_background,
            title = "Google Africa Scholarship",
            sourceLocation = SearchType.Programs,
        ),
        SearchItem(
            null,
            title = "Google Africa Scholarship Report",
            reportAuthor = "Ibrahim Kabira",
            reportFinishedDate = "19th - 25th Oct 22",
            sourceLocation = SearchType.Reports,
        ),
        SearchItem(
            R.drawable.ic_task_list,
            title = "Room library article written",
            taskDueDate = "3 days from now",
            sourceLocation = SearchType.Tasks,
        ),
        SearchItem(
            R.drawable.cert_ph,
            title = "Gads Cloud 2022 - Completion",
            taskDueDate = "3 days from now",
            sourceLocation = SearchType.Certificates,
        ),
    )

}