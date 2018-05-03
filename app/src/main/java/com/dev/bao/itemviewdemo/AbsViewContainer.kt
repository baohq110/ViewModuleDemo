package com.dev.bao.itemviewdemo

import android.content.Context


abstract class AbsViewContainer(val context: Context): ItemViewContainer {

    val childViews: MutableList<ItemView> = mutableListOf()

    override fun addChildView(item: ItemView) {
        childViews.add(item)
    }


}