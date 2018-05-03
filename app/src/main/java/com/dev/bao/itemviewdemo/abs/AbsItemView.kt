package com.dev.bao.itemviewdemo.abs

import android.app.Service
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.dev.bao.itemviewdemo.abs.ItemView

abstract class AbsItemView(val context: Context): ItemView {


    override fun renderView(): View {
        return inflater.inflate(layoutId, null, false)
    }

    val inflater: LayoutInflater
        get() = context.getSystemService(Service.LAYOUT_INFLATER_SERVICE) as LayoutInflater

}