package com.dev.bao.itemviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dev.bao.itemviewdemo.childs.TextViewItemView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val viewContainer: ContrainLayoutContainer by lazy { ContrainLayoutContainer(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // add child view
        viewContainer.addChildView(TextViewItemView(this))


        // render view
        val view = viewContainer.renderView()


        setContentView(view)
    }
}
