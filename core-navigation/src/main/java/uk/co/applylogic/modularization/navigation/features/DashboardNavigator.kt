package uk.co.applylogic.modularization.navigation.features

import uk.co.applylogic.modularization.navigation.base.Navigator

interface DashboardNavigator: Navigator {

    fun dashboardToPasscode()
    fun dashboardToA()
    fun dashboardToB()
    fun dashboardToC()
}
