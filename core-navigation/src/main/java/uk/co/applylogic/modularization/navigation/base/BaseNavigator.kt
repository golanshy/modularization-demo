package uk.co.applylogic.modularization.navigation.base

import androidx.navigation.NavController

interface Navigator {
    fun bind(navController: NavController)
    fun unbind()
}

/**
 * This class holds the global and local navigation Controllers
 */
abstract class BaseNavigator : Navigator {

    var name: String? = null
    var navController: NavController? = null

    override fun bind(navController: NavController) {
        this.name = navController.toString()
        this.navController = navController
    }

    override fun unbind() {
        navController = null
    }
}
