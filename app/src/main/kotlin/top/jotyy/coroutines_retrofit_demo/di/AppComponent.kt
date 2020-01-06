package top.jotyy.coroutines_retrofit_demo.di

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import top.jotyy.core.di.CoreComponent
import top.jotyy.coroutines_retrofit_demo.AndroidApplication

@AppScope
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class
    ],
    dependencies = [CoreComponent::class]
)
interface AppComponent : AndroidInjector<AndroidApplication> {
    @Component.Factory
    interface Factory {
        fun create(component: CoreComponent) : AppComponent
    }
}