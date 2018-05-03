package com.dev.bao.itemviewdemo.abs

import android.content.Context
import com.dev.bao.itemviewdemo.abs.ItemView
import com.dev.bao.itemviewdemo.abs.ItemViewContainer


abstract class AbsViewContainer<T: ItemView>(context: Context): AbsItemView(context), ItemViewContainer<T> {

    val childViews: MutableList<T> = mutableListOf()

    override fun addChildView(item: T) {
        childViews.add(item)
    }


}