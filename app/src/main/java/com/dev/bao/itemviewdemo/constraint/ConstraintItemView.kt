package com.dev.bao.itemviewdemo.constraint

import android.support.constraint.ConstraintSet
import com.dev.bao.itemviewdemo.abs.ItemView

interface ConstraintItemView : ItemView {

    var constraintSet: ConstraintSet

    val rootViewId: Int
}