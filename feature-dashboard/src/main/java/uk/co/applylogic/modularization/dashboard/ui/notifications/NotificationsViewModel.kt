package uk.co.applylogic.modularization.dashboard.ui.notifications

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import uk.co.applylogic.modularization.dashboard.di.DashboardComponent

class NotificationsViewModel : ViewModel() {

    internal lateinit var comp: DashboardComponent

    val text: MutableLiveData<String?> = MutableLiveData(null)
}