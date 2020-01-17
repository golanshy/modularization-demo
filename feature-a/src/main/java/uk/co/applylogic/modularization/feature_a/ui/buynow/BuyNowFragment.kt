package uk.co.applylogic.modularization.feature_a.ui.buynow

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uk.co.applylogic.modularization.feature_a.R

class BuyNowFragment : Fragment() {

    companion object {
        fun newInstance() = BuyNowFragment()
    }

    private lateinit var viewModel: BuyNowViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.buy_now_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BuyNowViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
