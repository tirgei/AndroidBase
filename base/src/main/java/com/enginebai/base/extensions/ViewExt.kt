package com.enginebai.base.extensions

import android.view.View

fun View.gone() {
	setExistence(false)
}

fun View.invisible() {
	setVisible(false)
}

fun View.visible() {
	visibility = View.VISIBLE
}

fun View.setVisible(visible: Boolean) {
	visibility = if (visible) View.VISIBLE else View.INVISIBLE
}

fun View.setExistence(exist: Boolean) {
	visibility = if (exist) View.VISIBLE else View.GONE
}

fun View.toggleVisible() {
	visibility = if (visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
}

fun View.toggleExistence() {
	visibility = if (visibility == View.VISIBLE) View.GONE else View.VISIBLE
}

val View.isGone: Boolean get() = (visibility == View.GONE)
val View.isInvisible: Boolean get() = (visibility == View.INVISIBLE)
val View.isVisible: Boolean get() = (visibility == View.VISIBLE)
