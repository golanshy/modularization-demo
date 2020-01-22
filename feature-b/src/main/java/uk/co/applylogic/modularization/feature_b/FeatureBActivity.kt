package uk.co.applylogic.modularization.feature_b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import uk.co.applylogic.modularization.feature_a.di.DaggerFeatureBComponent
import uk.co.applylogic.modularization.feature_a.di.FeatureBComponent
import uk.co.applylogic.modularization.injection.CoreInjectHelper

class FeatureBActivity : AppCompatActivity() {

    internal lateinit var comp: FeatureBComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feature_b_activity)

        comp = DaggerFeatureBComponent
            .builder()
            .coreComponent(CoreInjectHelper.provideCoreComponent(applicationContext))
            .build()

        comp.injectActivity(this)
    }

    override fun onResume() {
        super.onResume()

        val navController = findNavController(R.id.nav_host_fragment)
        comp.navigator().bind(navController)
    }

    override fun onSupportNavigateUp() =
        findNavController(R.id.nav_host_fragment).navigateUp()
}
