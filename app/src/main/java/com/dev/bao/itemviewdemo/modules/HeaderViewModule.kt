package com.dev.bao.itemviewdemo.modules

import android.content.Context
import android.support.constraint.ConstraintSet
import com.dev.bao.itemviewdemo.R
import com.dev.bao.itemviewdemo.constraint.AbsConstraintItemView

class HeaderViewModule(context: Context): AbsConstraintItemView(context) {

    override val rootViewId: Int
        get() = R.id.headerRootView

    override val layoutId: Int
        get() = R.layout.module_head_view
}