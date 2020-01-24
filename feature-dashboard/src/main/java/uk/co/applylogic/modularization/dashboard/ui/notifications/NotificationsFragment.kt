package uk.co.applylogic.modularization.dashboard.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import uk.co.applylogic.modularization.dashboard.DashboardActivity
import uk.co.applylogic.modularization.dashboard.R
import uk.co.applylogic.modularization.dashboard.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel
    private lateinit var binding: FragmentNotificationsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_notifications, container, false
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        notificationsViewModel = ViewModelProvider(this).get(NotificationsViewModel::class.java)
        notificationsViewModel.comp = (activity as DashboardActivity).comp

        binding.lifecycleOwner = this
        binding.fragment = this
        binding.viewModel = notificationsViewModel

        notificationsViewModel.text.value = getString(R.string.notifications_fragment)
    }
}
