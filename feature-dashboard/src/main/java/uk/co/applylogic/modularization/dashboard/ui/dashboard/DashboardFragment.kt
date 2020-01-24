package uk.co.applylogic.modularization.dashboard.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import uk.co.applylogic.modularization.dashboard.DashboardActivity
import uk.co.applylogic.modularization.dashboard.R
import uk.co.applylogic.modularization.dashboard.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private lateinit var binding: FragmentDashboardBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_dashboard, container, false
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        dashboardViewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)
        dashboardViewModel.comp = (activity as DashboardActivity).comp

        binding.lifecycleOwner = this
        binding.fragment = this
        binding.viewModel = dashboardViewModel

        dashboardViewModel.text.value = getString(R.string.dashboard_fragment)
    }
}
