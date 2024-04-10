package com.example.first

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.first.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView!!.text=binding.textView.context.getText((R.string.testText))
        binding.b1!!.text =binding.textView.context.getText((R.string.b1Text))
        binding.b2!!.text =binding.textView.context.getText((R.string.b2Text))
        binding.counter!!.text = counter.toString()

        binding.b1.setOnClickListener {
            counter++
            binding.counter.text = counter.toString()
        }
        binding.b2.setOnClickListener {

            if(counter>0) counter--

            binding.counter.text = counter.toString()

        }




    }
}