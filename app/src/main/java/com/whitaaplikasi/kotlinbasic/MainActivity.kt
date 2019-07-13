package com.whitaaplikasi.kotlinbasic


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.whitaaplikasi.kotlinbasic.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

       binding.button.setOnClickListener {
           runRoll()
       }
    }

    private fun runRoll() {

        binding.valueText.text =  binding.editText.text
        binding.valueText.visibility =  View.VISIBLE
        binding.editText.visibility = View.GONE
        binding.button.visibility = View.GONE
    }


}
