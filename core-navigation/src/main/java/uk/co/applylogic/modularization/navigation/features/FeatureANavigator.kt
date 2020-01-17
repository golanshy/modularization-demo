package uk.co.applylogic.modularization.navigation.features

import androidx.fragment.app.FragmentActivity
import uk.co.applylogic.modularization.navigation.base.Navigator

interface FeatureANavigator : Navigator {
    fun aToDashboard(activity: FragmentActivity?)
    fun aToB(activity: FragmentActivity?)
    fun aToC(activity: FragmentActivity?)
}
