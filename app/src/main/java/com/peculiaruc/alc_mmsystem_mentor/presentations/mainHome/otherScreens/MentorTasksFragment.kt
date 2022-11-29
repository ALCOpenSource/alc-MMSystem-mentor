package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.peculiaruc.alc_mmsystem_mentor.databinding.MentorProgramsFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.MentorTasksFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.domain.TaskItem
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.MainHomeFragmentDirections
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.ProgramsAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.TasksAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.Navigator
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.UiData
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.mmController

class MentorTasksFragment : Fragment(), TasksAdapter.OnTaskClickListener {
    private var _binding: MentorTasksFragmentLayoutBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        MentorTasksFragmentLayoutBinding.inflate(inflater).let { _binding = it }
        _binding = MentorTasksFragmentLayoutBinding.inflate(layoutInflater)
        val adapter = TasksAdapter(UiData.taskItems,this)
        binding.tasksRecyclerView.adapter = adapter
        binding.tasksRecyclerView.layoutManager = LinearLayoutManager(activity)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(taskItem: TaskItem) {
        Navigator.navigate(
            mmController,
            MainHomeFragmentDirections.actionMainHomeFragmentToMentorTaskDetailFragment(taskItem)
        )

    }
}