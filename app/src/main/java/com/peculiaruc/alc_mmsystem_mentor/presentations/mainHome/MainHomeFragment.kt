package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.peculiaruc.alc_mmsystem_mentor.databinding.MainHomeFragmentDrawerLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.MainHomeFragmentDrawerItemsAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.Navigator
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.UiData
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.mmBtmController
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.mmController
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.vms.MainDrawerVM

class MainHomeFragment : Fragment() {

    private var _binding: MainHomeFragmentDrawerLayoutBinding? =
        null
    private val binding
        get() = _binding!!

    private lateinit var drawerVM: MainDrawerVM
    private var drawerLayout: DrawerLayout? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        MainHomeFragmentDrawerLayoutBinding.inflate(inflater).let { _binding = it }

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModels()

        initNavigation()

        initDrawer()

    }


    private fun initViewModels() {
        ViewModelProvider(requireActivity())[MainDrawerVM::class.java].let { drawerVM = it }

        initObservers()
    }

    private fun initObservers() {
        drawerVM.drawerState.observe(requireActivity()) {
            when (it) {
                MainDrawerVM.DrawerRequestState.Open -> {
                    drawerLayout?.open()
                    drawerLayout?.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
                }
                else -> {
                    drawerLayout?.closeDrawers()
                    drawerLayout?.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                }
            }
        }
    }

    private fun initDrawer() {
        drawerLayout = binding.mainHomeFragmentDrawer
        drawerLayout?.addDrawerListener(object : DrawerLayout.DrawerListener {
            override fun onDrawerSlide(drawerView: View, slideOffset: Float) = Unit

            override fun onDrawerOpened(drawerView: View) = Unit

            override fun onDrawerClosed(drawerView: View) {
                drawerVM.changeDrawerState(MainDrawerVM.DrawerRequestState.Close)
            }

            override fun onDrawerStateChanged(newState: Int) = Unit

        })

        initDrawerUi()
    }

    private fun initDrawerUi() {
        val drawerItems = UiData.drawerNavItems
        val logoutDrawerItem = UiData.drawerNavItemLogout // Store all drawer items

        val adapter = MainHomeFragmentDrawerItemsAdapter(requireActivity()) {
            if (it != null && it.routes == null) Toast.makeText(
                requireActivity(),
                "Navigate to -> ${getString(it.label)}",
                Toast.LENGTH_SHORT
            )
                .show()
            it?.routes?.let { direction ->
                Navigator.navigate(mmController, direction)
            }
        }
        adapter.addAll(drawerItems)

        binding.mainHomeDrawerContentLayout.mainHomeFragmentDrawerLogout.apply {

            mainHomeFragmentDrawerItemIcon.setImageDrawable(
                ResourcesCompat.getDrawable(resources, logoutDrawerItem.icon, null)
            )
            mainHomeFragmentDrawerItemLabel.text = getString(logoutDrawerItem.label)
        }
        binding.mainHomeDrawerContentLayout.mainHomeFragmentDrawerItems.apply {
            isNestedScrollingEnabled = false
            this.adapter = adapter
        }

        binding.mainHomeDrawerContentLayout.mainHomeDrawerHeader.drawerSettingsBtnView.setOnClickListener {
            Navigator.navigate(
                mmController,
                MainHomeFragmentDirections.actionMainHomeFragmentToSettingsFragment()
            )
            drawerVM.changeDrawerState(MainDrawerVM.DrawerRequestState.Close)
        }
    }

    private fun initNavigation() {

        val navView: BottomNavigationView = binding.mainHomeContentLayout.navView

        navView.setupWithNavController(mmBtmController.navController)

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val DRAWER_TAG = "DRAWER_TAG"
    }

}