package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.navigation.NavDirections

/**
 * Navigation items
 * A model class that illustrates the use of icon and label navigation in the ui
 * @property icon
 * @property label
 * @property routes
 * @constructor Create empty Nav items
 */
data class NavItems(
    @DrawableRes
    val icon: Int,
    @StringRes
    val label: Int,
    val routes: NavDirections? = null,
)