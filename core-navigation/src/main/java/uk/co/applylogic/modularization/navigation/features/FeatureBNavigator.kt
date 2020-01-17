package uk.co.applylogic.modularization.navigation.features

import androidx.fragment.app.FragmentActivity
import uk.co.applylogic.modularization.navigation.base.Navigator

interface FeatureBNavigator : Navigator {
    fun bToDashboard(activity: FragmentActivity?)
    fun bToA(activity: FragmentActivity?)
    fun bToC(activity: FragmentActivity?)
}
