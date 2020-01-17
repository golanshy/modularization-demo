package uk.co.applylogic.modularization.dashboard.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.NavHostFragment
import uk.co.applylogic.modularization.dashboard.MainActivity
import uk.co.applylogic.modularization.dashboard.R
import uk.co.applylogic.modularization.dashboard.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_home, container, false
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        homeViewModel.comp = (activity as MainActivity).comp

        binding.lifecycleOwner = this
        binding.fragment = this
        binding.viewModel = homeViewModel
    }

    fun onNextClicked() {
        NavHostFragment.findNavController(this@HomeFragment)
            .navigate(R.id.action_HomeFragment_to_HomeSecondFragment)
    }

    override fun onResume() {
        super.onResume()
        homeViewModel.text.value = getString(R.string.home_first)
    }
}
