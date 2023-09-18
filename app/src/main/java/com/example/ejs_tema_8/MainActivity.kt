package com.example.ejs_tema_8

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Layout
import kotlin.random.Random
import android.graphics.Color.rgb

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button11)
        var fondo = findViewById<ConstraintLayout>(R.id.layout)
        var colores = IntArray(3)

        button.setOnClickListener {
            println("joder")
            for (i in 0 until 3) {
                colores[i] = Random.nextInt(0, 255)
            }
            button.translationX = Random.nextInt(-(fondo.width/2-button.width), fondo.width/2-button.width).toFloat()
            button.translationY = Random.nextInt(-(fondo.height/2-button.height), fondo.height/2-button.height).toFloat()

            var colorInt = Color.rgb(colores[0], colores[1], colores[2])
            fondo.setBackgroundColor(colorInt)
        }


    }
}
