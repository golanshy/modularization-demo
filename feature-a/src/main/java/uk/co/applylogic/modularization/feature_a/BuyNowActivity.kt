package uk.co.applylogic.modularization.feature_a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uk.co.applylogic.modularization.feature_a.ui.buynow.BuyNowFragment

class BuyNowActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buy_now_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, BuyNowFragment.newInstance())
                .commitNow()
        }
    }
}
