package uk.co.applylogic.modularization.feature_a.di

import dagger.Component
import uk.co.applylogic.modularization.data.di.scope.ActivityScope
import uk.co.applylogic.modularization.feature_a.FeatureAActivity
import uk.co.applylogic.modularization.injection.BaseComponent
import uk.co.applylogic.modularization.injection.CoreComponent
import uk.co.applylogic.modularization.navigation.features.FeatureANavigator

@ActivityScope
@Component(
        dependencies = [CoreComponent::class],
        modules = [FeatureAModule::class]
)
interface FeatureAComponent: BaseComponent {
    fun navigator(): FeatureANavigator
    fun injectActivity(activity: FeatureAActivity)
}
