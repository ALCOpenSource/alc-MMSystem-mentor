package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.btmNavScreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.peculiaruc.alc_mmsystem_mentor.adapters.DocumentsRecyclerAdapter
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmProfileFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.MainHomeFragmentDirections
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.Navigator
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.mmController

class ProfileFragment : Fragment() {
    private var _binding: BtmProfileFragmentLayoutBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        BtmProfileFragmentLayoutBinding.inflate(inflater).let { _binding = it }


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