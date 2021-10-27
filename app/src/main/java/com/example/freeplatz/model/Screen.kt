package com.example.freeplatz.model

import androidx.annotation.StringRes
import com.example.freeplatz.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object MainScreen : Screen("mainScreen", R.string.main_screen)
    object MyProfileScreen : Screen("profile", R.string.profile)
    object CreateTaskScreen : Screen("createTask", R.string.createTask)
}