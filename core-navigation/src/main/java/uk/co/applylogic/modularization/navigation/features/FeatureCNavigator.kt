package uk.co.applylogic.modularization.navigation.features

import androidx.fragment.app.FragmentActivity
import uk.co.applylogic.modularization.navigation.base.Navigator

interface FeatureCNavigator: Navigator {
    fun cToDashboard(activity: FragmentActivity?)
    fun cToA(activity: FragmentActivity?)
    fun cToB(activity: FragmentActivity?)
}