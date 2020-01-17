package uk.co.applylogic.modularization.navigation.features

import androidx.fragment.app.FragmentActivity

interface FeatureCNavigator {
    fun cToDashboard(activity: FragmentActivity?)
    fun cToA(activity: FragmentActivity?)
    fun cToB(activity: FragmentActivity?)
}