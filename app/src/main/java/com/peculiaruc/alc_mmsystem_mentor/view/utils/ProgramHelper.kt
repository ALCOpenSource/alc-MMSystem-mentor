package com.peculiaruc.alc_mmsystem_mentor.view.utils

import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.view.adapter.ProgramModel

/**
 * This class is used for populating mentor programs
 */
@Suppress("UNCHECKED_CAST")
class ProgramHelper {
    companion object {


        /* Get all program list */
        /**
         * Adds all program items data to [programList]
         */
        fun <ArrayList> getAllProgramList(): ArrayList {
            val programList = ArrayList<ProgramModel>()
            programList.add(
                ProgramModel(
                    R.drawable.img_google,
                    R.string.program_title
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_one,
                    R.string.program_title
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_two,
                    R.string.program_title
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_three,
                    R.string.program_title
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_one,
                    R.string.program_title
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_two,
                    R.string.program_title
                )
            )


            return programList as ArrayList
        }

        /**
         * Adds assigned program items data to [programList]
         */
        fun <ArrayList> getAssignedProgramList(): ArrayList {
            val programList = ArrayList<ProgramModel>()
            programList.add(
                ProgramModel(
                    R.drawable.img_program_one,
                    R.string.program_title
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_two,
                    R.string.program_title
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_three,
                    R.string.program_title
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_one,
                    R.string.program_title
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_two,
                    R.string.program_title
                )
            )

            return programList as ArrayList
        }

        /**
         * Adds completed program items data to [programList]
         */
        fun <ArrayList> getCompletedProgramList(): ArrayList {
            val programList = ArrayList<ProgramModel>()
            programList.add(
                ProgramModel(
                    R.drawable.img_program_one,
                    R.string.program_title
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_google,
                    R.string.program_title
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_three,
                    R.string.program_title
                )
            )

            return programList as ArrayList
        }
    }

}
