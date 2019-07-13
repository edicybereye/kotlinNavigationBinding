package com.whitaaplikasi.kotlinbasic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.whitaaplikasi.kotlinbasic.databinding.ActivityBaruBinding

class BaruActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBaruBinding
    private val myName: MyName = MyName("Aleks Haecky")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_baru)
        binding.modelbaru = myName
    }

}
