package com.filipkowicz.attributebinder


import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.View
import androidx.annotation.AttrRes
import androidx.annotation.StyleRes
import androidx.core.content.res.use

@Suppress("unused")
class Material3AttributeBinder @JvmOverloads constructor(
    context: Context,
    private val attrs: AttributeSet? = null,
    @AttrRes private val defStyleAttr: Int = 0,
    @StyleRes private val defStyleRes: Int = 0
) : View(context, attrs, defStyleAttr, defStyleRes) {

    private fun obtainStyledAttributes(@AttrRes attrRes: Int): TypedArray {
        return context.obtainStyledAttributes(attrs, intArrayOf(attrRes), defStyleAttr, defStyleRes)
    }

    private val _colorPrimary: Int by lazy {
        obtainStyledAttributes(com.google.android.material.R.attr.colorPrimary).use {
            it.getColor(
                0,
                0
            )
        }
    }

    private val _colorPrimaryVariant: Int by lazy {
        obtainStyledAttributes(com.google.android.material.R.attr.colorPrimaryVariant).use {
            it.getColor(
                0,
                0
            )
        }
    }

    private val _colorSecondary: Int by lazy {
        obtainStyledAttributes(com.google.android.material.R.attr.colorSecondary).use {
            it.getColor(
                0,
                0
            )
        }
    }

    private val _colorSecondaryVariant: Int by lazy {
        obtainStyledAttributes(com.google.android.material.R.attr.colorSecondaryVariant).use {
            it.getColor(
                0,
                0
            )
        }
    }

    private val _colorBackground: Int by lazy {
        obtainStyledAttributes(com.google.android.material.R.attr.backgroundColor).use {
            it.getColor(
                0,
                0
            )
        }
    }

    private val _colorSurface: Int by lazy {
        obtainStyledAttributes(com.google.android.material.R.attr.colorSurface).use {
            it.getColor(
                0,
                0
            )
        }
    }

    private val _colorError: Int by lazy {
        obtainStyledAttributes(com.google.android.material.R.attr.colorError).use {
            it.getColor(
                0,
                0
            )
        }
    }

    private val _colorOnPrimary: Int by lazy {
        obtainStyledAttributes(com.google.android.material.R.attr.colorOnPrimary).use {
            it.getColor(
                0,
                0
            )
        }
    }

    private val _colorOnSecondary: Int by lazy {
        obtainStyledAttributes(com.google.android.material.R.attr.colorOnSecondary).use {
            it.getColor(
                0,
                0
            )
        }
    }

    private val _colorOnBackground: Int by lazy {
        obtainStyledAttributes(com.google.android.material.R.attr.colorOnBackground).use {
            it.getColor(
                0,
                0
            )
        }
    }

    private val _colorOnSurface: Int by lazy {
        obtainStyledAttributes(com.google.android.material.R.attr.colorOnSurface).use {
            it.getColor(
                0,
                0
            )
        }
    }

    private val _colorOnError: Int by lazy {
        obtainStyledAttributes(com.google.android.material.R.attr.colorOnError).use {
            it.getColor(
                0,
                0
            )
        }
    }

    fun getColorPrimary(): Int = _colorPrimary

    fun getColorPrimaryVariant(): Int = _colorPrimaryVariant

    fun getColorSecondary(): Int = _colorSecondary

    fun getColorSecondaryVariant(): Int = _colorSecondaryVariant

    fun getColorBackground(): Int = _colorBackground

    fun getColorSurface(): Int = _colorSurface

    fun getColorError(): Int = _colorError

    fun getColorOnPrimary(): Int = _colorOnPrimary

    fun getColorOnSecondary(): Int = _colorOnSecondary

    fun getColorOnBackground(): Int = _colorOnBackground

    fun getColorOnSurface(): Int = _colorOnSurface

    fun getColorOnError(): Int = _colorOnError

    fun resolveCustomColorAttr(@AttrRes attrRes: Int): Int = obtainStyledAttributes(attrRes).use {
        it.getColor(
            0,
            0
        )
    }


}