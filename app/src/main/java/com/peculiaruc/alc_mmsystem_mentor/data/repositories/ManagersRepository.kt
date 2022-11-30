package com.peculiaruc.alc_mmsystem_mentor.data.repositories

import com.peculiaruc.alc_mmsystem_mentor.data.local.database.models.Manager

/**
 * A [ManagersRepository] object that holds the abstracted data of the Managers.
 *
 *
 */
object ManagersRepository {

    val allManagers: List<Manager> = mutableListOf(

        Manager(
            managerName = "Kenny Dabiri",
            managerTitle = "Mentor Manager",
            about = """
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
                    Praesent dignissimpharetra metus, ut cursus purus efficitur et. 
                    Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris
                     sed, dignissim lectus. Phasellus eget tortor dapibus, laoreet mauris 
                     sed, dignissim lectus. 
                """.trimIndent(),
            memberSince = "Member since June 22 2021",
        ),
        Manager(
            managerName = "Peculiar C Umeh",
            managerTitle = "Admin",
            about = """
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
                    Praesent dignissimpharetra metus, ut cursus purus efficitur et. 
                    Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet mauris
                     sed, dignissim lectus. Phasellus eget tortor dapibus, laoreet mauris 
                     sed, dignissim lectus.
                """.trimIndent(),
            memberSince = "Member since July 4 2017",
        )

    )

    /**
     * It is used to fetch the manager's data from the server.
     */
    fun getManager(name: String) : Manager? = allManagers.find { manager -> manager.managerName == name }

}