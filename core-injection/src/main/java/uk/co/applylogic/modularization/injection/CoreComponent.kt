package uk.co.applylogic.modularization.injection

import android.app.Application
import android.content.Context
import uk.co.applylogic.modularization.data.di.qualifier.ApplicationContext
import dagger.Component
import uk.co.applylogic.modularization.data.di.module.ApplicationModule
import uk.co.applylogic.modularization.data.di.module.NetworkModule
import uk.co.applylogic.modularization.android.handler.NetworkErrorHandlerInterface
import uk.co.applylogic.modularization.data.repository.ContentInterface
import uk.co.applylogic.modularization.data.repository.ContentRepositoryContract
import uk.co.applylogic.modularization.navigation.di.NavigationComponent
import uk.co.applylogic.modularization.navigation.features.*

import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, NetworkModule::class],
		dependencies = [NavigationComponent::class])
interface CoreComponent {

	@ApplicationContext
	fun context(): Context

	fun application(): Application

	fun contentRepository(): ContentRepositoryContract

	fun contentInterface(): ContentInterface

	fun networkErrorHandler(): NetworkErrorHandlerInterface

	fun onboardingNavigator(): OnboardingNavigator

	fun dashboardNavigator(): DashboardNavigator

	fun featureANavigator(): FeatureANavigator

	fun featureBNavigator(): FeatureBNavigator

	fun featureCNavigator(): FeatureCNavigator
}
