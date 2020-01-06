package top.jotyy.coroutines_retrofit_demo

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import timber.log.Timber
import top.jotyy.core.di.DaggerCoreComponent
import top.jotyy.coroutines_retrofit_demo.di.DaggerAppComponent

class AndroidApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.factory()
            .create(
                DaggerCoreComponent.factory().create(this)
            )

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}