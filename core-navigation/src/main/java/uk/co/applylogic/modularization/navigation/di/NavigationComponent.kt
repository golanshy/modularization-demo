package uk.co.applylogic.modularization.navigation.di

import uk.co.applylogic.modularization.navigation.features.*

/**
 * This is not a real Dagger Component, only an interface to break circular dependency with navigation.
 * See [Dagger Component Dependencies for Library Development]
 * (https://proandroiddev.com/dagger-component-dependencies-for-library-development-e2df7ce68233)
 * and [Component dependencies](https://dagger.dev/api/2.14/dagger/Component.html#dependencies--)
 */
interface NavigationComponent {
	fun provideOnboardingNavigator(): OnboardingNavigator
	fun provideDashboardNavigator(): DashboardNavigator
	fun provideFeatureANavigator(): FeatureANavigator
	fun provideFeatureBNavigator(): FeatureBNavigator
	fun provideFeatureCNavigator(): FeatureCNavigator
	fun providePasscodeNavigator(): PasscodeNavigator
}
