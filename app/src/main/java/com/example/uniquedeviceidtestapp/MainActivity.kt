package com.example.uniquedeviceidtestapp

import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        my_textview.text = """Secure Android ID: ${getSecureAndroidId()}
Serial Number (deprec): ${Build.SERIAL}
"""
    }

    fun getSecureAndroidId(): String {
        val androidId = Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)
        return androidId
    }
}
