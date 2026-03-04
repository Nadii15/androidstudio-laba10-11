package com.ryckluk.student_material_design.data

import android.app.ActivityManager
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.lang.invoke.TypeDescriptor

data class Student (
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age : Int,
    @StringRes val description: Int) {



}