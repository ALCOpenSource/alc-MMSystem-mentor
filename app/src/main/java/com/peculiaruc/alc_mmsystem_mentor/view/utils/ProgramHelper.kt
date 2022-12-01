package com.peculiaruc.alc_mmsystem_mentor.view.utils

import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.view.adapter.ProgramModel

class ProgramHelper {
    companion object {
        fun <ArrayList> getAllProgramList(): ArrayList {
            val programList = ArrayList<ProgramModel>()
            programList.add(
                ProgramModel(
                    R.drawable.img_google,
                    "Andela Google Africa Scholarship Program"
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_one,
                    "Andela Google Africa Scholarship Program"
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_two,
                    "Andela Google Africa Scholarship Program"
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_three,
                    "Andela Google Africa Scholarship Program"
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_one,
                    "Andela Google Africa Scholarship Program"
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_two,
                    "Andela Google Africa Scholarship Program"
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_three,
                    "Andela Google Africa Scholarship Program"
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_one,
                    "Andela Google Africa Scholarship Program"
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_two,
                    "Andela Google Africa Scholarship Program"
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_three,
                    "Andela Google Africa Scholarship Program"
                )
            )


            return programList as ArrayList
        }

        fun <ArrayList> getAssignedProgramList(): ArrayList {
            val programList = ArrayList<ProgramModel>()
            programList.add(
                ProgramModel(
                    R.drawable.img_program_one,
                    "Andela Google Africa Scholarship Program"
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_two,
                    "Andela Google Africa Scholarship Program"
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_three,
                    "Andela Google Africa Scholarship Program"
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_one,
                    "Andela Google Africa Scholarship Program"
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_two,
                    "Andela Google Africa Scholarship Program"
                )
            )

            return programList as ArrayList
        }


        fun <ArrayList> getCompletedProgramList(): ArrayList {
            val programList = ArrayList<ProgramModel>()
            programList.add(
                ProgramModel(
                    R.drawable.img_program_one,
                    "Andela Google Africa Scholarship Program"
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_google,
                    "Andela Google Africa Scholarship Program"
                )
            )
            programList.add(
                ProgramModel(
                    R.drawable.img_program_three,
                    "Andela Google Africa Scholarship Program"
                )
            )

            return programList as ArrayList
        }
    }

}
