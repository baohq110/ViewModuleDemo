package com.dev.bao.itemviewdemo

import android.view.View

interface ItemView {

    fun renderView(): View

    val layoutId: Int

}