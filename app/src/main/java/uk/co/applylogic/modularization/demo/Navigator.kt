package uk.co.applylogic.modularization.demo

import androidx.fragment.app.FragmentActivity
import uk.co.applylogic.modularization.navigation.features.OnboardingNavigator
import uk.co.applylogic.modularization.navigation.base.BaseNavigator
import uk.co.applylogic.modularization.navigation.di.NavigationComponent
import uk.co.applylogic.modularization.navigation.features.*

/**
 * This class holds the navController for any feature through [BaseNavigator]
 * It is injected through [uk.co.applylogic.modularization.injection.CoreComponent],
 * so no need to create it in every feature component.
 *
 * When injected, it can be referenced as any feature Navigator,
 * because it contains all interfaces through [NavigationComponent],
 * but it needs to be exposed from the component,
 * like e.g. [uk.co.applylogic.modularization.onboarding.di.OnboardingComponent.navigator].
 */
internal class Navigator : BaseNavigator(),
    OnboardingNavigator,
    DashboardNavigator,
    PasscodeNavigator,
    FeatureANavigator,
    FeatureBNavigator,
    FeatureCNavigator,
    NavigationComponent {

    //region global

    //endregion

    //region features

    override fun provideOnboardingNavigator(): OnboardingNavigator {
        return this
    }

    override fun provideDashboardNavigator(): DashboardNavigator {
        return this
    }

    override fun provideFeatureANavigator(): FeatureANavigator {
        return this
    }

    override fun provideFeatureBNavigator(): FeatureBNavigator {
        return this
    }

    override fun provideFeatureCNavigator(): FeatureCNavigator {
        return this
    }

    override fun providePasscodeNavigator(): PasscodeNavigator {
        return this
    }

    //endregion

    //region onboarding

    override fun onboardingToDashboard(activity: FragmentActivity?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onboardingToPasscode(activity: FragmentActivity?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    //endregion

    //region passcode

    override fun passcodeToDashboard() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    //endregion

    //region dashboard

    override fun dashboardToA() {
        navController?.navigate(R.id.action_global_featureAActivity)
    }

    override fun dashboardToB() {
        navController?.navigate(R.id.action_global_featureBActivity)
    }

    override fun dashboardToC() {
        navController?.navigate(R.id.action_global_featureCActivity)
    }

    override fun dashboardToPasscode() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    //endregion

    //region feature-a

    override fun aToDashboard(activity: FragmentActivity?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun aToB(activity: FragmentActivity?) {
        navController?.navigate(R.id.action_global_featureBActivity)
        activity?.finish()
    }

    override fun aToC(activity: FragmentActivity?) {
        navController?.navigate(R.id.action_global_featureCActivity)
        activity?.finish()
    }

    //endregion

    //region feature-b

    override fun bToDashboard(activity: FragmentActivity?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bToA(activity: FragmentActivity?) {
        navController?.navigate(R.id.action_global_featureAActivity)
        activity?.finish()
    }

    override fun bToC(activity: FragmentActivity?) {
        navController?.navigate(R.id.action_global_featureCActivity)
        activity?.finish()
    }

    //endregion

    //region feature-c

    override fun cToDashboard(activity: FragmentActivity?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun cToA(activity: FragmentActivity?) {
        navController?.navigate(R.id.action_global_featureAActivity)
        activity?.finish()
    }

    override fun cToB(activity: FragmentActivity?) {
        navController?.navigate(R.id.action_global_featureBActivity)
        activity?.finish()
    }

    //endregion
}
