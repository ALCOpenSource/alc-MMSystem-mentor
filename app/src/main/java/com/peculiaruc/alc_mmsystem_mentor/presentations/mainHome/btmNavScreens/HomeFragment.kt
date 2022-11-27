package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.btmNavScreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmHomeFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.MainHomeFragmentDirections
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.Navigator
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.mmController
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.vms.MainDrawerVM

class HomeFragment : Fragment() {

    private var _binding: BtmHomeFragmentLayoutBinding? = null
    private val binding
        get() = _binding!!

    private lateinit var drawerVM: MainDrawerVM

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        BtmHomeFragmentLayoutBinding.inflate(inflater).let { _binding = it }
        binding.homeNotificationBtnView.setOnClickListener {
            Navigator.navigate(
                mmController,
                MainHomeFragmentDirections.actionMainHomeFragmentToEmptyNotificationFragment()
            )
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModels()
        initClickListeners()
    }

    private fun initClickListeners() {
        binding.homeProfileView.setOnClickListener { drawerVM.changeDrawerState(MainDrawerVM.DrawerRequestState.Open) }
    }

    private fun initViewModels() {
        ViewModelProvider(requireActivity())[MainDrawerVM::class.java].let { drawerVM = it }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}