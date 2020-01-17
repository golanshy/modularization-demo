package uk.co.applylogic.modularization.dashboard.di

import dagger.Module
import dagger.Provides
import uk.co.applylogic.modularization.dashboard.MainActivity
import uk.co.applylogic.modularization.data.di.scope.ActivityScope
import uk.co.applylogic.modularization.dashboard.ui.home.HomeViewModel

@Module
class DashboardModule {

    @Provides
    @ActivityScope
    fun provideMainActivity(activity: MainActivity): MainActivity {
        return activity
    }

    @Provides
    @ActivityScope
    fun provideHomeViewModel(viewModel: HomeViewModel): HomeViewModel {
        return viewModel
    }
}
