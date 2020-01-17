package uk.co.applylogic.modularization.dashboard.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import uk.co.applylogic.modularization.dashboard.di.DashboardComponent

class HomeViewModel() : ViewModel() {

    internal lateinit var comp: DashboardComponent

    val text: MutableLiveData<String?>  = MutableLiveData(null)

    fun onBuyClicked() {

    }
}