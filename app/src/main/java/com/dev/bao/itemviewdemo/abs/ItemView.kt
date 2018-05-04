package com.dev.bao.itemviewdemo.abs

import android.content.Context
import android.view.View
import android.view.ViewGroup

interface ItemView {

    fun renderView(container: ViewGroup): View

    val layoutId: Int

    val rootViewId: Int

//    fun getLayoutParams(): ViewGroup.LayoutParams

}