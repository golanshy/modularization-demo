package uk.co.applylogic.modularization.feature_b.ui.featureb

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uk.co.applylogic.modularization.feature_b.R

class FeatureBFragment : Fragment() {

    companion object {
        fun newInstance() = FeatureBFragment()
    }

    private lateinit var viewModel: FeatureBViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.feature_b_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FeatureBViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
