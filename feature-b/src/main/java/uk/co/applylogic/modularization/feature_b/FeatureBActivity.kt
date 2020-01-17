package uk.co.applylogic.modularization.feature_b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uk.co.applylogic.modularization.feature_b.ui.featureb.FeatureBFragment

class FeatureBActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feature_b_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FeatureBFragment.newInstance())
                .commitNow()
        }
    }
}
