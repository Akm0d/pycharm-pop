<<<<<<< HEAD:src/main/kotlin/com/github/akm0d/pycharmpop/MyBundle.kt
package com.github.akm0d.pycharmpop
=======
package org.jetbrains.plugins.pop_completion
>>>>>>> 22dd244 (Applied project templates):src/main/kotlin/org/jetbrains/plugins/pop_completion/PopBundle.kt

import com.intellij.AbstractBundle
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.PropertyKey

@NonNls
private const val BUNDLE = "messages.PopBundle"

object PopBundle : AbstractBundle(BUNDLE) {

    @Suppress("SpreadOperator")
    @JvmStatic
    fun message(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any) =
        getMessage(key, *params)

    @Suppress("SpreadOperator")
    @JvmStatic
    fun messagePointer(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any) =
        getLazyMessage(key, *params)
}
