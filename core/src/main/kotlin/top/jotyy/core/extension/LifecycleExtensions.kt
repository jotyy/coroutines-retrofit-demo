package top.jotyy.core.extension

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

/**
 * 减少live data模板代码
 *
 * @param data [LiveData]
 * @param block 处理数据
 */
fun <T> Fragment.observe(data: LiveData<T>, block: (T) -> Unit) {
    data.observe(this, Observer(block))
}