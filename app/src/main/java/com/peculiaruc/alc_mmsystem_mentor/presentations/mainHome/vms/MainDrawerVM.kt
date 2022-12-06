package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.vms

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * Main Navigation Drawer ViewModel
 * Maintains the state of drawer across different views
 * @constructor Create empty Main Drawer ViewModel
 */
class MainDrawerVM : ViewModel() {

    private val _drawerState: MutableStateFlow<DrawerRequestState> =
        MutableStateFlow(DrawerRequestState.Close)
    val drawerState = _drawerState.asStateFlow().asLiveData()

    /**
     * Change drawer state
     *
     * @param newDrawerState
     */
    fun changeDrawerState(newDrawerState: DrawerRequestState) {
        _drawerState.tryEmit(newDrawerState)
    }

    /**
     * Drawer request state
     *
     * @constructor Create empty Drawer request state
     */
    enum class DrawerRequestState {
        Open, Close
    }

}