package com.peculiaruc.alc_mmsystem_mentor.view.activity


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.ActivityProgramDetailsBinding


class ProgramDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProgramDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_program_details)

        binding = ActivityProgramDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)



        getIncomingIntent()

        binding.backArrow.setOnClickListener {
            // startActivity(Intent(this, ))
        }

        binding.btnProgramRequest.setOnClickListener {
            startActivity(Intent(this, CriteriaFormActivity::class.java))
        }

    }

    private fun getIncomingIntent() {
        if (intent.hasExtra("program_img") && intent.hasExtra("program_name")) {
            val imageID = intent.getIntExtra("program_img", 0)
            val programName = intent.getStringExtra("program_name")
            setImage(imageID, programName)
        }
    }


    private fun setImage(imageID: Int, programName: String?) {
        binding.tvProgramName.text = programName
        binding.tlbTitle.text = programName
        binding.ivProgramImg.setImageResource(imageID)
    }
}