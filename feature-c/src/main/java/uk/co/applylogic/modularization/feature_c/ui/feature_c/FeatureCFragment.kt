package uk.co.applylogic.modularization.feature_c.ui.feature_c

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import uk.co.applylogic.modularization.feature_c.FeatureCActivity
import uk.co.applylogic.modularization.feature_c.R
import uk.co.applylogic.modularization.feature_c.databinding.FeatureCFragmentBinding

class FeatureCFragment : Fragment() {

    private lateinit var viewModel: FeatureCViewModel
    private lateinit var binding: FeatureCFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.feature_c_fragment, container, false
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FeatureCViewModel::class.java)

        binding.lifecycleOwner = this
        binding.activity = activity as FeatureCActivity
        binding.fragment = this
        binding.viewModel = viewModel
    }
}
