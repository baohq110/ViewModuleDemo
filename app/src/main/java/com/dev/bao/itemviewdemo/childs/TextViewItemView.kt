package com.dev.bao.itemviewdemo.childs

import android.content.Context
import android.view.View
import com.dev.bao.itemviewdemo.AbsItemView
import com.dev.bao.itemviewdemo.DataLoader
import com.dev.bao.itemviewdemo.R

class TextViewItemView(context: Context) : AbsItemView(context) {

    var dataLoader: DataLoader? = null

    override val layoutId: Int
        get() = R.layout.item_text_view


}