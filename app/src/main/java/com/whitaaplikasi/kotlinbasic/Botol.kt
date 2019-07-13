package com.whitaaplikasi.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.whitaaplikasi.kotlinbasic.databinding.ActivityBotolBinding

class Botol : AppCompatActivity() {
    private lateinit var binding: ActivityBotolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botol)
    }
}
