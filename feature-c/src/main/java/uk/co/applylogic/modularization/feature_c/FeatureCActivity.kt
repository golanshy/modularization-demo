package uk.co.applylogic.modularization.feature_c

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uk.co.applylogic.modularization.feature_c.ui.featurec.FeatureCFragment

class FeatureCActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feature_c_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FeatureCFragment.newInstance())
                .commitNow()
        }
    }
}
