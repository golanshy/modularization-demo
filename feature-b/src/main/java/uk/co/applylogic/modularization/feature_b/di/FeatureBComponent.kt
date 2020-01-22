package uk.co.applylogic.modularization.feature_a.di

import dagger.Component
import uk.co.applylogic.modularization.data.di.scope.ActivityScope
import uk.co.applylogic.modularization.feature_b.FeatureBActivity
import uk.co.applylogic.modularization.feature_b.di.FeatureBModule
import uk.co.applylogic.modularization.injection.BaseComponent
import uk.co.applylogic.modularization.injection.CoreComponent
import uk.co.applylogic.modularization.navigation.features.FeatureBNavigator

@ActivityScope
@Component(
        dependencies = [CoreComponent::class],
        modules = [FeatureBModule::class]
)
interface FeatureBComponent: BaseComponent {
    fun navigator(): FeatureBNavigator
    fun injectActivity(activity: FeatureBActivity)
}
