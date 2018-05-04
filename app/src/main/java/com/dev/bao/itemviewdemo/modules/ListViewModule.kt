package com.dev.bao.itemviewdemo.modules

import android.content.Context
import com.dev.bao.itemviewdemo.R
import com.dev.bao.itemviewdemo.abs.AbsItemView

class ListViewModule(context: Context): AbsItemView(context) {

    override val rootViewId: Int
        get() = R.id.listViewRootView

    override val layoutId: Int
        get() = R.layout.module_list_view
}