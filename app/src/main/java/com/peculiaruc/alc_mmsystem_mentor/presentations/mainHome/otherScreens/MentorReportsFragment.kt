package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.peculiaruc.alc_mmsystem_mentor.databinding.MentorReportsFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.MentorTasksFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.domain.ReportItem
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.MainHomeFragmentDirections
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.ReportsAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.TasksAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.Navigator
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.UiData
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.mmController

class MentorReportsFragment : Fragment(), ReportsAdapter.OnClickListener {
    private var _binding: MentorReportsFragmentLayoutBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        MentorReportsFragmentLayoutBinding.inflate(inflater).let { _binding = it }
        _binding = MentorReportsFragmentLayoutBinding.inflate(layoutInflater)
        val adapter = ReportsAdapter(UiData.reportsList,this)
        binding.rvReports.adapter = adapter
        binding.rvReports.layoutManager = LinearLayoutManager(activity)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(reportItem: ReportItem) {
        Navigator.navigate(
            mmController,
            MainHomeFragmentDirections.actionMainHomeFragmentToMentorReportDetailFragment(reportItem)
        )
    }
}