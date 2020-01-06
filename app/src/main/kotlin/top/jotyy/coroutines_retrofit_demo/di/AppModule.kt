package top.jotyy.coroutines_retrofit_demo.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import top.jotyy.coroutines_retrofit_demo.MainActivity

@Module
abstract class AppModule {
    @ContributesAndroidInjector(
        modules = []
    )
    abstract fun mainActivity(): MainActivity
}