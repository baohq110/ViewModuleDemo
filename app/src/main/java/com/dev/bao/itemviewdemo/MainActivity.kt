package com.dev.bao.itemviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.constraint.ConstraintSet
import com.dev.bao.itemviewdemo.constraint.ConstraintItemView
import com.dev.bao.itemviewdemo.constraint.ConstraintLayoutContainer
import com.dev.bao.itemviewdemo.modules.HeaderViewModule

class MainActivity : AppCompatActivity() {
    private val viewContainer: ConstraintLayoutContainer by lazy { ConstraintLayoutContainer(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // render view
        val view = viewContainer.renderView() as ConstraintLayout

        // add child view
        viewContainer.addChildView(getHeadViewModule(view))


        viewContainer.addChildsToContainer(view)

        setContentView(view)
    }



    private fun getHeadViewModule(container: ConstraintLayout): ConstraintItemView {


        val module =  HeaderViewModule(this)


        val constraintSet = ConstraintSet().apply {
            clone(container)
            connect(ConstraintSet.PARENT_ID, ConstraintSet.START, module.rootViewId, ConstraintSet.START)
            connect(ConstraintSet.PARENT_ID, ConstraintSet.TOP, module.rootViewId, ConstraintSet.TOP)
            connect(ConstraintSet.PARENT_ID, ConstraintSet.END, module.rootViewId, ConstraintSet.END)
        }


        module.constraintSet = constraintSet

        return module
    }

}
