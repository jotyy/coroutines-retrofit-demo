package top.jotyy.core.utils

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar
import java.util.jar.Attributes

class SnackbarBehavior constructor(
    context: Context,
    attributeSet: AttributeSet
) : CoordinatorLayout.Behavior<View>() {

    override fun layoutDependsOn(
        parent: CoordinatorLayout,
        child: View,
        dependency: View
    ): Boolean = dependency is Snackbar.SnackbarLayout

    override fun onDependentViewChanged(
        parent: CoordinatorLayout,
        child: View,
        dependency: View
    ): Boolean {
        val translationY = Math.min(0.0f, (dependency.translationY - dependency.height))
        child.translationY = translationY
        return true
    }
}