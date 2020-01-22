package uk.co.applylogic.modularization.dashboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
import uk.co.applylogic.modularization.dashboard.di.DaggerDashboardComponent
import uk.co.applylogic.modularization.dashboard.di.DashboardComponent
import uk.co.applylogic.modularization.injection.CoreInjectHelper

class DashboardActivity : AppCompatActivity() {

    internal lateinit var comp: DashboardComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        comp = DaggerDashboardComponent
            .builder()
            .coreComponent(CoreInjectHelper.provideCoreComponent(applicationContext))
            .build()

        comp.injectActivity(this)
    }

    override fun onResume() {
        super.onResume()

        val navController = findNavController(R.id.nav_host_fragment)
        comp.navigator().bind(navController)

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_home_fourth
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        nav_view.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp() =
        findNavController(R.id.nav_host_fragment).navigateUp()
}
