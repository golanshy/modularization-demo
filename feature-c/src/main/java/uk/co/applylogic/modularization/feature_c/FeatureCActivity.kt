package uk.co.applylogic.modularization.feature_c

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import uk.co.applylogic.modularization.feature_c.di.DaggerFeatureCComponent
import uk.co.applylogic.modularization.feature_c.di.FeatureCComponent
import uk.co.applylogic.modularization.injection.CoreInjectHelper

class FeatureCActivity : AppCompatActivity() {

    internal lateinit var comp: FeatureCComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feature_c_activity)

        comp = DaggerFeatureCComponent
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
