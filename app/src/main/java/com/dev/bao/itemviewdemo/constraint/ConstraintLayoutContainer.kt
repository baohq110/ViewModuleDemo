package com.dev.bao.itemviewdemo.constraint

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.view.View
import com.dev.bao.itemviewdemo.R
import com.dev.bao.itemviewdemo.abs.AbsViewContainer

class ConstraintLayoutContainer(context: Context): AbsViewContainer<ConstraintItemView>(context) {

    override fun renderView(): View {

        val view =  inflater.inflate(layoutId, null, false)
        return view
    }

    fun addChildsToContainer(view: ConstraintLayout) {
        childViews.forEach {
            // add to view container
            view.addView(it.renderView())

            // apply constraint to constraint layout
            it.constraintSet.applyTo(view)
        }
    }

    override val layoutId: Int
        get() = R.layout.container_constraint_layout
}