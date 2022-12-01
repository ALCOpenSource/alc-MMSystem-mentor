package com.peculiaruc.alc_mmsystem_mentor.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentProgramsCompletedBinding
import com.peculiaruc.alc_mmsystem_mentor.view.adapter.ProgramsAdapter
import com.peculiaruc.alc_mmsystem_mentor.view.utils.ProgramHelper


class CompletedProgramFragment : Fragment() {

    private lateinit var binding: FragmentProgramsCompletedBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProgramsCompletedBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerview.layoutManager =
            LinearLayoutManager(requireActivity(), RecyclerView.VERTICAL, false)

        val programsAdapter =
            ProgramsAdapter(requireActivity(), ProgramHelper.getCompletedProgramList())
        binding.recyclerview.adapter = programsAdapter
    }


}