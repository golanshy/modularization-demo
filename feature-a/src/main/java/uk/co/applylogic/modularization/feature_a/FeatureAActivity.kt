package uk.co.applylogic.modularization.feature_a

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import uk.co.applylogic.modularization.feature_a.di.DaggerFeatureAComponent
import uk.co.applylogic.modularization.feature_a.di.FeatureAComponent
import uk.co.applylogic.modularization.injection.CoreInjectHelper


class FeatureAActivity : AppCompatActivity() {

    internal lateinit var comp: FeatureAComponent
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feature_a_activity)

        comp = DaggerFeatureAComponent
            .builder()
            .coreComponent(CoreInjectHelper.provideCoreComponent(applicationContext))
            .build()

        comp.injectActivity(this)

        navController = findNavController(R.id.nav_host_fragment)
        comp.navigator().bind(navController)

        setupActionBarWithNavController(navController, AppBarConfiguration(setOf()))
    }

    override fun onSupportNavigateUp() = navController.navigateUp()
}
