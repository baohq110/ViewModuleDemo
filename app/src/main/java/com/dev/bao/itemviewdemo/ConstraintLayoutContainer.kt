package com.dev.bao.itemviewdemo

import android.app.Service
import android.content.Context
import android.support.constraint.ConstraintLayout
import android.view.LayoutInflater
import android.view.View
import com.dev.bao.itemviewdemo.abs.AbsViewContainer

class ConstraintLayoutContainer(context: Context): AbsViewContainer(context) {

    override fun renderView(): View {
        val inflater = context.getSystemService(Service.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view =  inflater.inflate(layoutId, null, false)

        (view as? ConstraintLayout)?.let {
            addChildToView(it)
        }

        return view
    }

    private fun addChildToView(view: ConstraintLayout) {
        childViews.forEach {
            view.addView(it.renderView())
        }



    }

    override val layoutId: Int
        get() = R.layout.container_constraint_layout
}