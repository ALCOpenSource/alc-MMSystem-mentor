package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.btmNavScreens

import android.graphics.Rect
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmHomeFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.home.HomeActivitiesOverviewAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.home.HomeQuickActionsAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.UiData
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.MainHomeFragmentDirections
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.Navigator
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.mmController

import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.vms.MainDrawerVM

class HomeFragment : Fragment() {

    private var _binding: BtmHomeFragmentLayoutBinding? = null
    private val binding
        get() = _binding!!

    private lateinit var drawerVM: MainDrawerVM
    private lateinit var quickActionsAdapter: HomeQuickActionsAdapter.Adapter
    private lateinit var homeActivitiesOverviewAdapter: HomeActivitiesOverviewAdapter.Adapter

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

        initUi()
    }

    private fun initUi() {
        initClickListeners()

        initRecyclerViews()
    }

    private fun initRecyclerViews() {
        quickActionsAdapter = HomeQuickActionsAdapter.Adapter {
        findNavController().navigate(R.id.action_homeFragment_to_tasks_navigation)
        //            Toast.makeText(
//                requireActivity(),
//                "Navigate to -> ${getString(it.label)}",
//                Toast.LENGTH_SHORT
//            )
//                .show()
        }
        homeActivitiesOverviewAdapter = HomeActivitiesOverviewAdapter.Adapter {
            Toast.makeText(
                requireActivity(),
                "View -> ${it.category._readableValue}",
                Toast.LENGTH_SHORT
            )
                .show()
        }
        quickActionsAdapter.add(UiData.homeNavItems)
        homeActivitiesOverviewAdapter.add(UiData.homeActivityOverview)
        binding.apply {

            homeQuickActions.apply {
                isNestedScrollingEnabled = false
                setHasFixedSize(false)
                layoutManager =
                    GridLayoutManager(requireActivity(), 2, GridLayoutManager.VERTICAL, false)
                addItemDecoration(object : ItemDecoration() {
                    override fun getItemOffsets(
                        outRect: Rect,
                        view: View,
                        parent: RecyclerView,
                        state: RecyclerView.State
                    ) {
                        super.getItemOffsets(outRect, view, parent, state)
                        outRect.apply {
                            top = 10
                            bottom = 10
                            left = 10
                            right = 10
                        }


                }
            })

            adapter = quickActionsAdapter
        }

        homeActivityOverview.apply {
            isNestedScrollingEnabled = false
            setHasFixedSize(false)
            layoutManager =
                LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
            addItemDecoration(object : ItemDecoration() {
                override fun getItemOffsets(
                    outRect: Rect,
                    view: View,
                    parent: RecyclerView,
                    state: RecyclerView.State
                ) {
                    outRect.apply {
                        if (state.itemCount != (state.itemCount - 1)) right = 18
                    }


                }
            })
            adapter = homeActivitiesOverviewAdapter
        }

    }
}

private fun initClickListeners() {
    binding.homeProfileView.homeProfileView.setOnClickListener { drawerVM.changeDrawerState(MainDrawerVM.DrawerRequestState.Open) }
}

private fun initViewModels() {
    ViewModelProvider(requireActivity())[MainDrawerVM::class.java].let { drawerVM = it }
}

override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
}

}