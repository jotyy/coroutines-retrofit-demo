package top.jotyy.core.base.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

abstract class BaseViewModel<T> : ViewModel() {

    abstract suspend fun loadData()

    init {
        viewModelScope.launch {
            loadData()
        }
    }

    private val _successData = MutableLiveData<T>()

    /**
     * 刷新数据
     */
    fun refresh() {
        viewModelScope.launch {
            loadData()
        }
    }

    /**
     * 重试
     */
    fun retry() {
        viewModelScope.launch {
            loadData()
        }
    }
}