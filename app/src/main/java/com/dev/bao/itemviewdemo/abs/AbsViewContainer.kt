package com.dev.bao.itemviewdemo.abs

import android.content.Context
import com.dev.bao.itemviewdemo.abs.ItemView
import com.dev.bao.itemviewdemo.abs.ItemViewContainer


abstract class AbsViewContainer: ItemViewContainer {

    protected val childs: MutableList<ItemView> = mutableListOf()

    override fun addChildView(item: ItemView) {
        childs.add(item)
    }
}