package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.peculiaruc.alc_mmsystem_mentor.databinding.MentorCertsFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.MentorTasksFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.domain.CertificateItem
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.MainHomeFragmentDirections
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.CertificatesAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.TasksAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.Navigator
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.UiData
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.mmController

class MentorCertsFragment : Fragment(), CertificatesAdapter.OnClickListener {
    private var _binding: MentorCertsFragmentLayoutBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        MentorCertsFragmentLayoutBinding.inflate(inflater).let { _binding = it }
        _binding = MentorCertsFragmentLayoutBinding.inflate(layoutInflater)
        val adapter = CertificatesAdapter(UiData.certificateList,this)
        binding.certificatesRv.adapter = adapter
        binding.certificatesRv.layoutManager = LinearLayoutManager(activity)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(certificateItem: CertificateItem) {
        Navigator.navigate(
            mmController,
            MainHomeFragmentDirections.actionMainHomeFragmentToMentorCertDetailFragment(certificateItem)
        )
    }
}