package com.example.pract7

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button : Button = findViewById(R.id.button)
        var cLayout : ConstraintLayout = findViewById(R.id.constrain_layout)
        var textView : TextView = findViewById(R.id.textView)
        button.setOnClickListener {
            textView.text = "Привет, друг!"
        }
        var buttonCounter : Button = findViewById(R.id.button_count)
        buttonCounter.setOnClickListener{
            textView.text = "Я нажал кнопку ${++counter} раз"
        }
        var imageViewCount : ImageView = findViewById(R.id.imageViewCount)
        imageViewCount.setOnClickListener {
            textView.text = "Я нажал кнопку ${++counter} раз"
            textView.setTextColor(ContextCompat.getColor(this, androidx.appcompat.R.color.abc_search_url_text_normal))
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20.toFloat())
            imageViewCount.setBackgroundColor(Color.LTGRAY)
            cLayout.setBackgroundColor(Color.DKGRAY)
        }
    }
}