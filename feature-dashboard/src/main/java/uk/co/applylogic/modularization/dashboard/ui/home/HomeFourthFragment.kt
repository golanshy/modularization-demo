package uk.co.applylogic.modularization.dashboard.ui.home

import android.content.Context
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
import uk.co.applylogic.modularization.dashboard.databinding.FragmentHomeFourthBinding


class HomeFourthFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentHomeFourthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_home_fourth, container, false
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
                onCompleteClicked()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)
    }

    override fun onResume() {
        super.onResume()
        homeViewModel.text.value = getString(R.string.home_fourth)
    }

    fun onCompleteClicked() {
        NavHostFragment.findNavController(this@HomeFourthFragment)
            .navigate(R.id.action_navigation_home_fourth_to_navigation_home)
    }
}
