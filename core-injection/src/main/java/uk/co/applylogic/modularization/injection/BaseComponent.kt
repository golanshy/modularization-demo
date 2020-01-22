package uk.co.applylogic.modularization.injection

import android.app.Application
import android.content.Context
import uk.co.applylogic.modularization.android.handler.NetworkErrorHandlerInterface
import uk.co.applylogic.modularization.data.di.qualifier.ApplicationContext
import uk.co.applylogic.modularization.data.repository.ContentInterface
import uk.co.applylogic.modularization.data.repository.ContentRepositoryContract
import uk.co.applylogic.modularization.navigation.features.FeatureANavigator

interface BaseComponent {
    @ApplicationContext
    fun context(): Context
    fun application(): Application
    fun networkErrorHandler(): NetworkErrorHandlerInterface
    fun contentInterface(): ContentInterface
    fun contentRepository(): ContentRepositoryContract
}