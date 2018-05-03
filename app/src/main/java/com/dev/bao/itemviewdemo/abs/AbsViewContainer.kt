package com.dev.bao.itemviewdemo.abs

import android.content.Context
import com.dev.bao.itemviewdemo.abs.ItemView
import com.dev.bao.itemviewdemo.abs.ItemViewContainer


abstract class AbsViewContainer(val context: Context): ItemViewContainer {

    val childViews: MutableList<ItemView> = mutableListOf()

    override fun addChildView(item: ItemView) {
        childViews.add(item)
    }


}