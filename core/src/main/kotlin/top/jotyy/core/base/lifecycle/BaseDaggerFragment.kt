package top.jotyy.core.base.lifecycle

import android.content.Context
import androidx.databinding.ViewDataBinding
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import dagger.android.support.AndroidSupportInjection
import top.jotyy.core.di.ViewModelFactory
import javax.inject.Inject

abstract class BaseDaggerFragment<T: ViewDataBinding> : BaseFragment<T>(), HasAndroidInjector {

    @get:Inject
    internal var androidInjector: DispatchingAndroidInjector<Any>? = null

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun androidInjector(): AndroidInjector<Any>? = androidInjector
}