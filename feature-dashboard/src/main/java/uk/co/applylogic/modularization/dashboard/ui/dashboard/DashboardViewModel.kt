package uk.co.applylogic.modularization.dashboard.ui.dashboard

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import uk.co.applylogic.modularization.dashboard.di.DashboardComponent

class DashboardViewModel : ViewModel() {

    internal lateinit var comp: DashboardComponent

    val text: MutableLiveData<String?> = MutableLiveData(null)
}