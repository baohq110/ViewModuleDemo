package com.dev.bao.itemviewdemo.constraint


import android.view.ViewGroup
import com.dev.bao.itemviewdemo.abs.AbsViewContainer

class LayoutContainer(val rootView: ViewGroup): AbsViewContainer() {


    override fun render() {
        childs.forEach {
            rootView.addView(it.renderView(rootView))
        }
    }


}