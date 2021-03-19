package com.example.adele.utils.extensions

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.os.Build
import android.text.SpannableString
import android.text.Spanned
import android.text.style.StrikethroughSpan
import android.util.TypedValue
import android.view.View
import androidx.annotation.RequiresApi
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.shape.CornerFamily


fun Context.dpToPx(dimens: Float?): Int {
    val metrics = applicationContext.resources.displayMetrics
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dimens ?: 0f, metrics)
            .toInt()
}

fun ShapeableImageView.setCornerRadius(
        topRight: Float = 0f,
        topLeft: Float = 0f,
        bottomRight: Float = 0f,
        bottomLeft: Float = 0f
) {
    this.shapeAppearanceModel = this.shapeAppearanceModel
            .toBuilder()
            .setTopLeftCorner(CornerFamily.ROUNDED, topLeft)
            .setTopRightCorner(CornerFamily.ROUNDED, topRight)
            .setBottomLeftCorner(CornerFamily.ROUNDED, bottomLeft)
            .setBottomRightCorner(CornerFamily.ROUNDED, bottomRight)
            .build()
}

fun Activity.showLightStatusBar() {
    window.apply {
        decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
        decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    }
}

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Activity.showTransparentStatusBar() {
    window.apply {
        decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        statusBarColor = Color.TRANSPARENT
    }
}

fun String.strikeThroughSpan(): SpannableString {
    val string = SpannableString(this)
    string.setSpan(StrikethroughSpan(), 0, this.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
    return string
}