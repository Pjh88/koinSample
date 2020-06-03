package com.jhpark.koinmvvmsample.ext

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jhpark.koinmvvmsample.base.BaseAdapter


@BindingAdapter("replaceAll")
fun RecyclerView.replaceAll(list: List<Nothing>){
    (adapter as BaseAdapter<*>).run {
        setList(list)
    }
}