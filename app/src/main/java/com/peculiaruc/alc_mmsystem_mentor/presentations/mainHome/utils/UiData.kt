package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils

import com.peculiaruc.alc_mmsystem_mentor.R

import com.peculiaruc.alc_mmsystem_mentor.domain.*
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.MainHomeFragmentDirections
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.SearchItem
import com.peculiaruc.alc_mmsystem_mentor.utils.EventCategories
import com.peculiaruc.alc_mmsystem_mentor.utils.EventCategoriesTypes
import com.peculiaruc.alc_mmsystem_mentor.utils.SearchType

/**
 * Ui data
 *
 * @constructor Create empty Ui data
 */
object UiData {

    val drawerNavItemLogout = NavItems(R.drawable.ic_logout_bckward, R.string.logout)

    val drawerNavItems = mutableListOf(
        NavItems(R.drawable.ic_home, R.string.home_fragment_label),
        NavItems(R.drawable.ic_account, R.string.profile_fragment_label),
        NavItems(R.drawable.ic_programs, R.string.programs_fragment_label),
        NavItems(R.drawable.ic_mentor_managers, R.string.my_managers_fragment_label),
        NavItems(R.drawable.ic_task, R.string.tasks_fragment_label),
        NavItems(R.drawable.ic_reports, R.string.reports_fragment_label),
        NavItems(R.drawable.ic_certificate, R.string.certificate_fragment_label),
        NavItems(R.drawable.ic_messages, R.string.messages_fragment_label),
        NavItems(
            R.drawable.ic_discussion_forum,
            R.string.discussion_forum_fragment_label,
            routes = MainHomeFragmentDirections.actionMainHomeFragmentToDiscussionFragment()
        ),
    )

    val homeNavItems = mutableListOf(
        NavItems(R.drawable.ic_task, R.string.mms_tasks_in_progress),
        NavItems(R.drawable.ic_comment_circle_chat_message, R.string.mms_chat_mentor_manager),
        NavItems(R.drawable.ic_reports, R.string.reports_fragment_label),
        NavItems(R.drawable.ic_discussion_forum, R.string.discussion_forum_fragment_label),
    )
    val homeActivityOverview = mutableListOf(
        ActivityOverview(20, EventCategories.Mentors),
        ActivityOverview(5, EventCategories.Programs),
        ActivityOverview(10, EventCategories.Tasks),
    )
    val searchItems = mutableListOf(
        SearchItem(
            R.drawable.ic_launcher_background,
            title = "Google Africa Scholarship 2022",
            sourceLocation = SearchType.Programs,
        ),
        SearchItem(
            R.drawable.ic_launcher_background,
            title = "Google Africa Scholarship 2021",
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

    val availableTechnicalProficiencies = mutableListOf(
        "Python",
        "Java",
        "Kotlin",
        "Django",
        "JavaScript",
        "My SQL",
        "Android",
        "Swift",
        "C++",
    )

    val availableRolesHeld = mutableListOf(
        "Learner",
        "Mentor",
        "Program Assistant",
        "Program Assistant Lead",
        "Mentor Manager",
    )

    val availableDocuments = mutableListOf(
        "My resume.pdf",
        "University Cert.doc",
        "Java Cert.doc",
    )

    val availablePreviewPrograms = mutableListOf(
        "Input previous held programs 1",
        "Input previous held programs 2",
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

            title = "GADS Program 2021",
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_check_24,

            ),
        ProgramItem(
            id = 4,
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            title = "GADS Program 2020",
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_check_24,

            ),
        ProgramItem(
            id = 5,
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            title = "GADS Program 2019",
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_done_all_24,
        ),
        ProgramItem(
            id = 6,
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",

            title = "GADS Program 2018",
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_check_24,
        ),
        ProgramItem(
            id = 7,
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",

            title = "GADS Program 2025",
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_done_all_24,
        ),
        ProgramItem(
            id = 8,
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",

            title = "GADS Program 2024",
            date = "Dec 12 2022",
            programImage = R.drawable.google_logo,
            onDoneDrawable = R.drawable.ic_baseline_check_24,
        ),
    )

    val taskItems = listOf(
        TaskItem(
            id = 1,
            title = "Room library write article write",
            description = "Fixed Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            progress = "Assigned",
            onComplete = true,
            time = "2 days ago from now"
        ),
        TaskItem(
            id = 2,
            title = "Debugging in Vs Code",
            description = "Current Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            progress = "Completed",
            onStart = false,
            time = "2 days ago from now"
        ),
        TaskItem(
            id = 3,
            title = "Room library write article write",
            description = "Pre Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            progress = "Assigned",
            onComplete = true,
            time = "3 days ago from now"
        ),
        TaskItem(
            id = 4,
            title = "Room library write article write",
            description = "Post Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            progress = "In progress",
            onComplete = true,
            time = "3 days ago from now"
        ),
        TaskItem(
            id = 5,
            title = "Debugging in Vs Code",
            description = "Old Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            progress = "Assigned",
            onComplete = true,
            time = "2 days ago from now"
        ),
        TaskItem(
            id = 6,
            title = "Debugging in Vs Code",
            description = "Ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            progress = "Completed",
            onStart = true,
            time = "2 days ago from now"
        ),
        TaskItem(
            id = 7,
            title = "Debugging in Vs Code",
            description = "New Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            progress = "Completed",
            onStart = true,
            time = "2 days ago from now"
        ),
    )

    val reportsList = listOf(
        ReportItem(
            id = 1,
            title = "Google Africa Scholarship Report 1",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        ),
        ReportItem(
            id = 2,
            title = "Google Africa Scholarship Report 2",
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
        ), ReportItem(
            id = 6,
            title = "Google Africa Scholarship Report",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        ), ReportItem(
            id = 7,
            title = "Google Africa Scholarship Report",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        ), ReportItem(
            id = 8,
            title = "Google Africa Scholarship Report",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        ), ReportItem(
            id = 9,
            title = "Google Africa Scholarship Report",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        ), ReportItem(
            id = 10,
            title = "Google Africa Scholarship Report",
            owner = "Ibrahim Kabir",
            time = "19th-25th Oct 2022",
            achievements = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            recommendations = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            blocker = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
        ), ReportItem(
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
        ),
        CertificateItem(
            id = 2,
            title = "GADS CLOUD 2022 - COMPLETION",
            time = "Oct 16 2022",
            certImage = R.drawable.cert_ph
        ),
        CertificateItem(
            id = 3,
            title = "GADS CLOUD 2022 - COMPLETION",
            time = "Oct 16 2022",
            certImage = R.drawable.cert_ph
        ),
        CertificateItem(
            id = 4,
            title = "GADS CLOUD 2022 - COMPLETION",
            time = "Oct 16 2022",
            certImage = R.drawable.cert_ph
        ),
        CertificateItem(
            id = 5,
            title = "GADS CLOUD 2022 - COMPLETION",
            time = "Oct 16 2022",
            certImage = R.drawable.cert_ph
        ),
        CertificateItem(
            id = 6,
            title = "GADS CLOUD 2022 - COMPLETION",
            time = "Oct 16 2022",
            certImage = R.drawable.cert_ph
        ),
        CertificateItem(
            id = 7,
            title = "GADS CLOUD 2022 - COMPLETION",
            time = "Oct 16 2022",
            certImage = R.drawable.cert_ph
        ),
        CertificateItem(
            id = 8,
            title = "GADS CLOUD 2022 - COMPLETION",
            time = "Oct 16 2022",
            certImage = R.drawable.cert_ph
        ),
    )

    val notificationsLIst = listOf(
        NotificationItem(
            id = 1,
            title = "Peculiah C. Umeh posted a comment on How to Archive Programs on MMS",
            time = "Yesterday at 11.52PM"
        ),
        NotificationItem(
            id = 2,
            title = "Baba C. Mammah has liked your comment in post Ideation: Week 1 GADS 100Days",
            time = "Yesterday at 11.52PM"
        ),
        NotificationItem(
            id = 3,
            title = "Alison Debby Davis mentioned you in a comment in the post The New Library for Android JetPack",
            time = "Yesterday at 9.42AM"
        ),
        NotificationItem(
            id = 4,
            title = "Alison Debby Davis mentioned you in a comment in the post The New Library for Android JetPack",
            time = "Yesterday at 9.42AM"
        ),
        NotificationItem(
            id = 5,
            title = "Kabiru Omo Isaka archived Luke Mathais Mentor Manager's Report",
            time = "Yesterday at 9.42AM"
        ),
        NotificationItem(
            id = 6,
            title = "Ferdinand Johnson created All Mentors Daily Task Report For February",
            time = "Yesterday at 11.52PM"
        ),
    )

    val discussionList = listOf(
        DiscussionItem(
            id = 1,
            time = "5h ago",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            title = "The New MMS Discussion Forum",
            owner = "Samuel Kabede"
        ),
        DiscussionItem(
            id = 2,
            time = "5h ago",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            title = "The New MMS Discussion Forum",
            owner = "Samuel Kabede"
        ),
        DiscussionItem(
            id = 3,
            time = "5h ago",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim ut cursus purus efficitur et. Duis ac enim tellus. Phasellus pharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris sed, dignissim lectus",
            title = "The New MMS Discussion Forum",
            owner = "Samuel Kabede"
        ),
    )

    val commentsList = listOf(
        CommentItem(
            id = 1,
            owner = "Ibrahim Kuleke",
            description = "Found this insightful. Please how can I register to be part of the program",
            time = "just now"
        ),
        CommentItem(
            id = 2,
            owner = "Sarah Tasha",
            description = "Found this insightful. Please how can I register to be part of the program",
            time = "10 mins"
        ),
        CommentItem(
            id = 3,
            owner = "Sarah Tasha",
            description = "Found this insightful. Please how can I register to be part of the program",
            time = "10 mins"
        ),
    )

}

data class ActivityOverview(
    val count: Int,
    @EventCategoriesTypes
    val category: EventCategories,
)