package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentContainer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.adapters.DocumentsRecyclerAdapter
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmProfileFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentAboutBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.MentorProgramsFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.MainHomeFragmentDirections
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.Navigator
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.mmController


/**
 * About fragment
 *
 * @constructor Create empty About fragment
 */
class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        FragmentAboutBinding.inflate(inflater).let { _binding = it }

        binding.editProfile.setOnClickListener {
            Navigator.navigate(
                mmController,
                MainHomeFragmentDirections.actionMainHomeFragmentToEditProfileFragment()
            )
        }

        val docsAdapter = DocumentsRecyclerAdapter(
            arrayListOf(
                "My resume.doc",
                "Birth Cert.doc",
                "Java Lead.doc"

            )
        )

        binding.rvProfileDocs.layoutManager = StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL)

        binding.rvProfileDocs.adapter = docsAdapter

        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}