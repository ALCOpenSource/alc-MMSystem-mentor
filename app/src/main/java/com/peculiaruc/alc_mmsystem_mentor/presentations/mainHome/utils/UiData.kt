package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils

import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.domain.ProgramItem
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.DrawerItem
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.SearchItem
import com.peculiaruc.alc_mmsystem_mentor.utils.SearchType

object UiData {

    val drawerItems = mutableListOf(
        DrawerItem(R.drawable.ic_home, R.string.home_fragment_label),
        DrawerItem(R.drawable.ic_account, R.string.profile_fragment_label),
        DrawerItem(R.drawable.ic_programs, R.string.programs_fragment_label),
        DrawerItem(R.drawable.ic_mentor_managers, R.string.my_managers_fragment_label),
        DrawerItem(R.drawable.ic_task, R.string.tasks_fragment_label),
        DrawerItem(R.drawable.ic_reports, R.string.reports_fragment_label),
        DrawerItem(R.drawable.ic_certificate, R.string.certificate_fragment_label),
        DrawerItem(R.drawable.ic_messages, R.string.messages_fragment_label),
        DrawerItem(R.drawable.ic_discussion_forum, R.string.discussion_forum_fragment_label),
        DrawerItem(R.drawable.ic_logout_bckward, R.string.logout),
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

    val programItems = mutableListOf(
        ProgramItem(
            id = 1,
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_check_24,
        ),
        ProgramItem(
            id = 2,
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_done_all_24,
        ),
        ProgramItem(
            id = 3,
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_check_24,

        ),
        ProgramItem(
            id = 4,
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_check_24,

        ),
        ProgramItem(
            id = 5,
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_done_all_24,
        ),
        ProgramItem(
            id = 6,
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_check_24,
        ),
        ProgramItem(
            id = 7,
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_done_all_24,
        ),
        ProgramItem(
            id = 8,
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_check_24,
        ),
    )

}