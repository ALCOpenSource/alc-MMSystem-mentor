package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils

import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.DrawerItem

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

}