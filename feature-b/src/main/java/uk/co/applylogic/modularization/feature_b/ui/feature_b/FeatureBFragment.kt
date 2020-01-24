package uk.co.applylogic.modularization.feature_b.ui.feature_b

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import uk.co.applylogic.modularization.feature_b.FeatureBActivity
import uk.co.applylogic.modularization.feature_b.R
import uk.co.applylogic.modularization.feature_b.databinding.FeatureBFragmentBinding

class FeatureBFragment : Fragment() {

    private lateinit var viewModel: FeatureBViewModel
    private lateinit var binding: FeatureBFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.feature_b_fragment, container, false
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FeatureBViewModel::class.java)

        binding.lifecycleOwner = this
        binding.activity = activity as FeatureBActivity
        binding.fragment = this
        binding.viewModel = viewModel
    }
}
