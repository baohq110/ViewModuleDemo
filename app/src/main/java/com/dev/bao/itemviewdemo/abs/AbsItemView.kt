package com.dev.bao.itemviewdemo.abs

import android.app.Service
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dev.bao.itemviewdemo.abs.ItemView

abstract class AbsItemView(val context: Context): ItemView {


    override fun renderView(container: ViewGroup): View {
        return inflater.inflate(layoutId, container, false)
    }

    val inflater: LayoutInflater
        get() = context.getSystemService(Service.LAYOUT_INFLATER_SERVICE) as LayoutInflater

}