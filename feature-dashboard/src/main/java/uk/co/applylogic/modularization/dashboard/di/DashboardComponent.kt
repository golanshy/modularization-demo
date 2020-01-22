package uk.co.applylogic.modularization.dashboard.di

import dagger.Component
import uk.co.applylogic.modularization.dashboard.DashboardActivity
import uk.co.applylogic.modularization.data.di.scope.ActivityScope
import uk.co.applylogic.modularization.injection.BaseComponent
import uk.co.applylogic.modularization.injection.CoreComponent
import uk.co.applylogic.modularization.navigation.features.DashboardNavigator

@ActivityScope
@Component(
        dependencies = [CoreComponent::class],
        modules = [DashboardModule::class]
)
interface DashboardComponent: BaseComponent {
    fun navigator(): DashboardNavigator
    fun injectActivity(activity: DashboardActivity)
}
