package uk.co.applylogic.modularization.feature_a.ui.feature_a

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import uk.co.applylogic.modularization.feature_a.FeatureAActivity
import uk.co.applylogic.modularization.feature_a.R
import uk.co.applylogic.modularization.feature_a.databinding.FeatureAFragmentBinding

class FeatureAFragment : Fragment() {

    private lateinit var viewModel: FeatureAViewModel
    private lateinit var binding: FeatureAFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.feature_a_fragment, container, false
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FeatureAViewModel::class.java)

        binding.lifecycleOwner = this
        binding.activity = activity as FeatureAActivity
        binding.fragment = this
        binding.viewModel = viewModel
    }
}
