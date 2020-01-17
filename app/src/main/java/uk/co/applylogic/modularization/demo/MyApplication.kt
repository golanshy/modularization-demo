package uk.co.applylogic.modularization.demo

import androidx.multidex.MultiDexApplication
import uk.co.applylogic.modularization.injection.CoreComponent
import uk.co.applylogic.modularization.injection.CoreComponentProvider
import uk.co.applylogic.modularization.injection.DaggerCoreComponent
import uk.co.applylogic.modularization.data.di.module.ApplicationModule
import uk.co.applylogic.modularization.data.di.module.NetworkModule

class MyApplication  : MultiDexApplication(), CoreComponentProvider {
    private lateinit var coreComponent: CoreComponent

    override fun provideCoreComponent(): CoreComponent {

        if (!this::coreComponent.isInitialized) {
            coreComponent = DaggerCoreComponent
                .builder()
                .applicationModule(ApplicationModule(this))
                .networkModule(NetworkModule(this))
                .navigationComponent(Navigator())
                .build()
        }
        return coreComponent
    }
}