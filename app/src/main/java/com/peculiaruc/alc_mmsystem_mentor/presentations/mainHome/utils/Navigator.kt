package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavDirections

/**
 * Navigator
 * A navigation util that encapsulates the business logic of app navigation
 * @author Nwadike Philip
 */
object Navigator {

    private const val TAG = "NAVIGATOR_TAG"

    /**
     * Navigate
     *
     * @param controller NavController
     * @param destination NavDirections
     * @throws IllegalArgumentException
     */
    fun navigate(controller: NavController, destination: NavDirections) {
        try {
            controller.navigate(destination)
        } catch (e: IllegalArgumentException) {
            //    For future events were nav directions are invalid --handle Argument Error and try navigating again
            Log.e(TAG, "Invalid NavDirection Passed: ", e)
        } catch (e: Exception) {
            Log.e(TAG, "Unknown Navigation Exception: ", e)
        }
    }

    /**
     * Navigate up
     *
     * @param controller NavController
     */
    fun navigateUp(controller: NavController) {
        controller.navigateUp()
    }

}