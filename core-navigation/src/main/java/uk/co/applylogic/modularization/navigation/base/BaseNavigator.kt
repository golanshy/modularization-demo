package uk.co.applylogic.modularization.navigation.base

import androidx.navigation.NavController

interface Navigator {
    fun bind(navController: NavController)
    fun unbind()
    fun popBackStack()
}

/**
 * This class holds the global and local navigation Controllers
 */
abstract class BaseNavigator : Navigator {

    var navController: NavController? = null

    override fun bind(navController: NavController) {
        this.navController = navController
    }

    override fun unbind() {
        navController = null
    }

    override fun popBackStack() {
        navController?.popBackStack()
    }
}
