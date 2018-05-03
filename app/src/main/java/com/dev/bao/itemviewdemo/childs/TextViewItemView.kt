package com.dev.bao.itemviewdemo.childs

import android.content.Context
import com.dev.bao.itemviewdemo.abs.AbsItemView
import com.dev.bao.itemviewdemo.abs.DataLoader
import com.dev.bao.itemviewdemo.R

class TextViewItemView(context: Context) : AbsItemView(context) {

    var dataLoader: DataLoader? = null

    override val layoutId: Int
        get() = R.layout.item_text_view


}