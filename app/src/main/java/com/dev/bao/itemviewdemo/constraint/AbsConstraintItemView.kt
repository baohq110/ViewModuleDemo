package com.dev.bao.itemviewdemo.constraint

import android.content.Context
import android.support.constraint.ConstraintSet
import com.dev.bao.itemviewdemo.abs.AbsItemView
import kotlin.properties.Delegates

abstract class AbsConstraintItemView(context: Context): AbsItemView(context), ConstraintItemView {
    private var _constraintSet: ConstraintSet by Delegates.notNull()

    override var constraintSet: ConstraintSet
        get() = _constraintSet
        set(value) {
            _constraintSet = value
        }
}