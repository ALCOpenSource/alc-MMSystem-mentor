package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.peculiaruc.alc_mmsystem_mentor.databinding.MentorProgramsFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.domain.ProgramItem
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.MainHomeFragmentDirections
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.ProgramsAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.Navigator
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.UiData
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.mmController

class MentorProgramsFragment : Fragment(), ProgramsAdapter.OnClickListener {


    lateinit var programs : List<ProgramItem>
    private var _binding: MentorProgramsFragmentLayoutBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        MentorProgramsFragmentLayoutBinding.inflate(inflater).let { _binding = it }
        _binding = MentorProgramsFragmentLayoutBinding.inflate(layoutInflater)
        val adapter = ProgramsAdapter(UiData.programItems,this)
        binding.programsRecyclerview.adapter = adapter
        binding.programsRecyclerview.layoutManager = LinearLayoutManager(activity)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(programItem: ProgramItem) {
        Navigator.navigate(
            mmController,
            MainHomeFragmentDirections.actionMainHomeFragmentToMentorProgramDetailFragment(programItem)
        )

    }
}