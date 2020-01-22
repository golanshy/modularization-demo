package uk.co.applylogic.modularization.feature_c.di

import dagger.Component
import uk.co.applylogic.modularization.data.di.scope.ActivityScope
import uk.co.applylogic.modularization.feature_c.FeatureCActivity
import uk.co.applylogic.modularization.injection.BaseComponent
import uk.co.applylogic.modularization.injection.CoreComponent
import uk.co.applylogic.modularization.navigation.features.FeatureCNavigator

@ActivityScope
@Component(
        dependencies = [CoreComponent::class],
        modules = [FeatureCModule::class]
)
interface FeatureCComponent: BaseComponent {
    fun navigator(): FeatureCNavigator
    fun injectActivity(activity: FeatureCActivity)
}
