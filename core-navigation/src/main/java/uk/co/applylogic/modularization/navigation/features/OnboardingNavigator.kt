package uk.co.applylogic.modularization.navigation.features

import androidx.fragment.app.FragmentActivity
import uk.co.applylogic.modularization.navigation.base.Navigator

interface OnboardingNavigator : Navigator {
    fun onboardingToDashboard(activity: FragmentActivity?)
    fun onboardingToPasscode(activity: FragmentActivity?)
}
