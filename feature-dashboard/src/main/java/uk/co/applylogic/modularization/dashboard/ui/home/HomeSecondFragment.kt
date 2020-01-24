package uk.co.applylogic.modularization.dashboard.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import uk.co.applylogic.modularization.dashboard.DashboardActivity
import uk.co.applylogic.modularization.dashboard.R
import uk.co.applylogic.modularization.dashboard.databinding.FragmentHomeSecondBinding

class HomeSecondFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentHomeSecondBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_home_second, container, false
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        homeViewModel.comp = (activity as DashboardActivity).comp

        binding.lifecycleOwner = this
        binding.fragment = this
        binding.viewModel = homeViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                homeViewModel.comp.navigator().popBackStack()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)
    }

    fun onNextClicked() {
        NavHostFragment.findNavController(this@HomeSecondFragment).navigate(R.id.action_navigation_home_second_to_navigation_home_third)
    }

    override fun onResume() {
        super.onResume()
        homeViewModel.text.value = getString(R.string.home_second)
    }
}
