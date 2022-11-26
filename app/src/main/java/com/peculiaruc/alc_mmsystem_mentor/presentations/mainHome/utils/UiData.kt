package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils

import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.domain.CertificateItem
import com.peculiaruc.alc_mmsystem_mentor.domain.ProgramItem
import com.peculiaruc.alc_mmsystem_mentor.domain.ReportItem
import com.peculiaruc.alc_mmsystem_mentor.domain.TaskItem
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

    val programItems = listOf(
        ProgramItem(
            id = 1,
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            title = "GADS Program 2022",
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_check_24,
        ),
        ProgramItem(
            id = 2,
            title = "GADS Program 2022",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_done_all_24,
        ),
        ProgramItem(
            id = 3,
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",

            title = "GADS Program 2022",
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_check_24,

        ),
        ProgramItem(
            id = 4,
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            title = "GADS Program 2022",
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_check_24,

        ),
        ProgramItem(
            id = 5,
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            title = "GADS Program 2022",
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_done_all_24,
        ),
        ProgramItem(
            id = 6,
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",

            title = "GADS Program 2022",
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_check_24,
        ),
        ProgramItem(
            id = 7,
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",

            title = "GADS Program 2022",
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_done_all_24,
        ),
        ProgramItem(
            id = 8,
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",

            title = "GADS Program 2022",
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_check_24,
        ),
    )

    val taskItems = listOf(
        TaskItem(
            id = 1,
            title = "Room library write article write",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            progress = "Assigned",
            onComplete = true,
            time = "2 days ago from now"
        ),
        TaskItem(
            id = 2,
            title = "Debugging in Vs Code",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            progress = "Completed",
            onStart = false,
            time = "2 days ago from now"
        ),
        TaskItem(
            id = 3,
            title = "Room library write article write",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            progress = "Assigned",
            onComplete = true,
            time = "3 days ago from now"
        ),
        TaskItem(
            id = 4,
            title = "Room library write article write",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            progress = "In progress",
            onComplete = true,
            time = "3 days ago from now"
        ),
        TaskItem(
            id = 5,
            title = "Debugging in Vs Code",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            progress = "Assigned",
            onComplete = true,
            time = "2 days ago from now"
        ),
        TaskItem(
            id = 6,
            title = "Debugging in Vs Code",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            progress = "Completed",
            onStart = true,
            time = "2 days ago from now"
        ),
        TaskItem(
            id = 7,
            title = "Debugging in Vs Code",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            progress = "Completed",
            onStart = true,
            time = "2 days ago from now"
        ),
    )

    val reportsList = listOf(
        ReportItem(
            id = 1,
            title = "Google Africa Scholarship Report",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        ),
        ReportItem(
            id = 2,
            title = "Google Africa Scholarship Report",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        ),
        ReportItem(
            id = 3,
            title = "Google Africa Scholarship Report",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        ),
        ReportItem(
            id = 4,
            title = "Google Africa Scholarship Report",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        ),
        ReportItem(
            id = 5,
            title = "Google Africa Scholarship Report",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        ),ReportItem(
            id = 6,
            title = "Google Africa Scholarship Report",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        ),ReportItem(
            id = 7,
            title = "Google Africa Scholarship Report",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        ),ReportItem(
            id = 8,
            title = "Google Africa Scholarship Report",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        ),ReportItem(
            id = 9,
            title = "Google Africa Scholarship Report",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        ),ReportItem(
            id = 10,
            title = "Google Africa Scholarship Report",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        ),ReportItem(
            id = 11,
            title = "Google Africa Scholarship Report",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        )
    )

    val certificateList = listOf(
        CertificateItem(
            id = 1,
            title = "GADS CLOUD 2022 - COMPLETION",
            time = "Oct 16 2022",
            certImage = R.drawable.cert_ph
        ),CertificateItem(
            id = 2,
            title = "GADS CLOUD 2022 - COMPLETION",
            time = "Oct 16 2022",
            certImage = R.drawable.cert_ph
        ),CertificateItem(
            id = 3,
            title = "GADS CLOUD 2022 - COMPLETION",
            time = "Oct 16 2022",
            certImage = R.drawable.cert_ph
        ),CertificateItem(
            id = 4,
            title = "GADS CLOUD 2022 - COMPLETION",
            time = "Oct 16 2022",
            certImage = R.drawable.cert_ph
        ),CertificateItem(
            id = 5,
            title = "GADS CLOUD 2022 - COMPLETION",
            time = "Oct 16 2022",
            certImage = R.drawable.cert_ph
        ),CertificateItem(
            id = 6,
            title = "GADS CLOUD 2022 - COMPLETION",
            time = "Oct 16 2022",
            certImage = R.drawable.cert_ph
        ),CertificateItem(
            id = 7,
            title = "GADS CLOUD 2022 - COMPLETION",
            time = "Oct 16 2022",
            certImage = R.drawable.cert_ph
        ),CertificateItem(
            id = 8,
            title = "GADS CLOUD 2022 - COMPLETION",
            time = "Oct 16 2022",
            certImage = R.drawable.cert_ph
        ),

    )

}