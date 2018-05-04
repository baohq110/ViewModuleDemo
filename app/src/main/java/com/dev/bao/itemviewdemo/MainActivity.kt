package com.dev.bao.itemviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.constraint.ConstraintSet
import com.dev.bao.itemviewdemo.constraint.LayoutContainer
import com.dev.bao.itemviewdemo.modules.ContinueBtnModule
import com.dev.bao.itemviewdemo.modules.HeaderViewModule
import com.dev.bao.itemviewdemo.modules.ListViewModule
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.module_list_view.*

class MainActivity : AppCompatActivity() {
    private val viewContainer: LayoutContainer by lazy { LayoutContainer(rootView) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       constructView()
    }

    private fun constructView() {
        // child views
        val header = HeaderViewModule(this)
        val listView = ListViewModule(this)
        val btnView = ContinueBtnModule(this)

        // add child view
        viewContainer.addChildView(header)
        viewContainer.addChildView(listView)
        viewContainer.addChildView(btnView)
        viewContainer.render()

        val set = ConstraintSet()
        set.clone(rootView)
        set.connect(header.rootViewId, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP)
        // list
        val listParams = listViewRootView.layoutParams
        listParams.width = 0
        listParams.height = 0
        listViewRootView.layoutParams = listParams

        set.connect(listView.rootViewId, ConstraintSet.TOP, header.rootViewId, ConstraintSet.BOTTOM)
        set.connect(listView.rootViewId, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM)
        set.connect(listView.rootViewId, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START)
        set.connect(listView.rootViewId, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END)

        // btn
        set.connect(btnView.rootViewId, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM)

        set.applyTo(rootView)
    }


}
