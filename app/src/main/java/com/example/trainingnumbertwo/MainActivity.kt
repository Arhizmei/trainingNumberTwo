package com.example.trainingnumbertwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.trainingnumbertwo.databinding.ActivityMainBinding

lateinit var bindingClass : ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    bindingClass = ActivityMainBinding.inflate(layoutInflater)
    setContentView(bindingClass.root)

    bindingClass.button1.setOnClickListener {
        bindingClass.textView1.text = "It`s work"
        bindingClass.textView1.visibility = View.VISIBLE

        var a = 0

        a = bindingClass.editTextTextPersonName.text.toString().toInt()
        when (a) {

            in 1 .. 100 -> {
                bindingClass.textView1.text = "a"

            }
            else -> {

                bindingClass.textView1.text = "work"
            }
        }




    }

    }
}