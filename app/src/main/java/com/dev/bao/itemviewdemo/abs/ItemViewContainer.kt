package com.dev.bao.itemviewdemo.abs

interface ItemViewContainer<T: ItemView> : ItemView {

    fun addChildView(item: T)
}