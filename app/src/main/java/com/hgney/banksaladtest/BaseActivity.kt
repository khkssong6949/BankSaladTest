package com.hgney.banksaladtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setValues()
    abstract fun setupEvents()

}