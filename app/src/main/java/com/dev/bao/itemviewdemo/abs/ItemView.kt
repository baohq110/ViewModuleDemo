package com.dev.bao.itemviewdemo.abs

import android.content.Context
import android.view.View

interface ItemView {

    fun renderView(): View

    val layoutId: Int

}