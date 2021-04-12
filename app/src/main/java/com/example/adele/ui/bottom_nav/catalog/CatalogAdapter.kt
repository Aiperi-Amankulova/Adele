package com.example.adele.ui.bottom_nav.catalog

import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import com.example.adele.data.model.CatalogModel

//
//class CatalogAdapter(private val listener: () -> Unit) : BaseExpandableListAdapter() {
//
//    private val list = arrayListOf<CatalogModel>()
//
//    fun update(list: List<CatalogModel>) {
//        this.list.clear()
//        this.list.addAll(list)
//        notifyDataSetChanged()
//    }
//
//    override fun getGroupCount() = list.size
//
//    override fun getChildrenCount(groupPosition: Int) = list[groupPosition].subList.size
//
//    override fun getGroup(groupPosition: Int) = list[groupPosition]
//
//    override fun getChild(groupPosition: Int, childPosition: Int) =
//            list[groupPosition].subList[childPosition]
//
//    override fun getGroupId(groupPosition: Int) = groupPosition.toLong()
//
//    override fun getChildId(groupPosition: Int, childPosition: Int) = childPosition.toLong()
//
//    override fun hasStableIds() = true
//    override fun getGroupView(p0: Int, p1: Boolean, p2: View?, p3: ViewGroup?): View {
//    }
//
//    override fun getChildView(p0: Int, p1: Int, p2: Boolean, p3: View?, p4: ViewGroup?): View {
//    }
//
//    override fun isChildSelectable(p0: Int, p1: Int): Boolean {
//    }
//
//}