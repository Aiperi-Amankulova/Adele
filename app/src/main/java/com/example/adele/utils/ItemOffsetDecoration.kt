package com.example.adele.utils

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.adele.utils.extensions.dpToPx

class ItemOffsetDecoration(
        private val itemTopMargin: Float = 0F,
        private val itemBottomMargin: Float = 0F,
        private val itemLeftMargin: Float = 0F,
        private val itemRightMargin: Float = 0F,
        private val firstItemLeftMargin: Float = 0F,
        private val lastItemRightMargin: Float = 0F,
        private val isNeedBottomMargin: Boolean = true
) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        val position = parent.getChildAdapterPosition(view)
        val isLast = position == state.itemCount - 1

        val itemTopMargin = parent.context.dpToPx(itemTopMargin)
        val itemBottomMargin = parent.context.dpToPx(itemBottomMargin)
        val itemLeftMargin = parent.context.dpToPx(itemLeftMargin)
        val itemRightMargin = parent.context.dpToPx(itemRightMargin)
        val firstItemLeftMargin = parent.context.dpToPx(firstItemLeftMargin)
        val lastItemRightMargin = parent.context.dpToPx(lastItemRightMargin)

        outRect.set(itemLeftMargin, itemTopMargin, itemRightMargin, itemBottomMargin)

        if (position == 0 && firstItemLeftMargin != 0)
            outRect.left = firstItemLeftMargin

        if (isLast && lastItemRightMargin != 0)
            outRect.right = lastItemRightMargin

        if (isNeedBottomMargin && isLast && itemBottomMargin != 0)
            outRect.bottom = 0
    }
}