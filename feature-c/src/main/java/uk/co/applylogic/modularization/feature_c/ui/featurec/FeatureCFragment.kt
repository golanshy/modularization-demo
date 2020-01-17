package uk.co.applylogic.modularization.feature_c.ui.featurec

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uk.co.applylogic.modularization.feature_c.R

class FeatureCFragment : Fragment() {

    companion object {
        fun newInstance() = FeatureCFragment()
    }

    private lateinit var viewModel: FeatureCViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.feature_c_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FeatureCViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
