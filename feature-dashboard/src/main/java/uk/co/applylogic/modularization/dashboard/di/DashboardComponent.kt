package uk.co.applylogic.modularization.dashboard.di

import android.app.Application
import android.content.Context
import dagger.Component
import uk.co.applylogic.modularization.android.handler.NetworkErrorHandlerInterface
import uk.co.applylogic.modularization.dashboard.MainActivity
import uk.co.applylogic.modularization.dashboard.ui.dashboard.DashboardFragment
import uk.co.applylogic.modularization.data.di.qualifier.ApplicationContext
import uk.co.applylogic.modularization.data.di.scope.ActivityScope
import uk.co.applylogic.modularization.data.repository.ContentInterface
import uk.co.applylogic.modularization.data.repository.ContentRepositoryContract
import uk.co.applylogic.modularization.dashboard.ui.dashboard.DashboardViewModel
import uk.co.applylogic.modularization.dashboard.ui.home.HomeFragment
import uk.co.applylogic.modularization.dashboard.ui.home.HomeSecondFragment
import uk.co.applylogic.modularization.dashboard.ui.notifications.NotificationsFragment
import uk.co.applylogic.modularization.injection.CoreComponent


@ActivityScope
@Component(
        dependencies = [CoreComponent::class],
        modules = [DashboardModule::class]
)
interface DashboardComponent {

    @ApplicationContext
    fun context(): Context
    fun application(): Application

    fun networkErrorHandler(): NetworkErrorHandlerInterface
    fun contentInterface(): ContentInterface
    fun contentRepository(): ContentRepositoryContract
//    fun navigator(): OnboardingNavigator

//    fun authRepository(): AuthRepositoryContract
//    fun referenceRepository(): ReferenceRepositoryContract
//    fun userRepository(): UserRepositoryContract
//    fun addressSearchRepository(): AddressSearchRepositoryContract
//    fun cmsClient(): CDAClient
//    fun locale(): Locale

    fun injectViewModel(model: DashboardViewModel)
    fun injectActivity(activity: MainActivity)
    fun injectHomeFragment(fragment: HomeFragment)
    fun injectHomeSecondFragment(fragment: HomeSecondFragment)
    fun injectDashboardFragment(fragment: DashboardFragment)
    fun injectNotificationsFragment(fragment: NotificationsFragment)
}
