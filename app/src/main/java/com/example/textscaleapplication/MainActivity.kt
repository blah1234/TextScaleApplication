package com.example.textscaleapplication

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.graphics.Paint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.ScaleAnimation
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    companion object {
        const val SCALE_1 = 1.067f
        const val SCALE_2 = 1.5f
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val world1 = findViewById<TextView>(R.id.world1)
        val pressMe1 = findViewById<Button>(R.id.press1)
        pressMe1.setOnClickListener {
            val scaleX = ObjectAnimator.ofFloat(world1, View.SCALE_X, 1f, SCALE_1, 1f)
            val scaleY = ObjectAnimator.ofFloat(world1, View.SCALE_Y, 1f, SCALE_1, 1f)
            val set = AnimatorSet()
            set.playTogether(scaleX, scaleY)
            set.duration = 5000
            set.interpolator = LinearInterpolator()
            set.start()
        }


        val world2 = findViewById<TextView>(R.id.world2)
        val pressMe2 = findViewById<Button>(R.id.press2)
        pressMe2.setOnClickListener {
            val scaleX = ObjectAnimator.ofFloat(world2, View.SCALE_X, 1f, SCALE_2, 1f)
            val scaleY = ObjectAnimator.ofFloat(world2, View.SCALE_Y, 1f, SCALE_2, 1f)
            val set = AnimatorSet()
            set.playTogether(scaleX, scaleY)
            set.duration = 5000
            set.interpolator = LinearInterpolator()
            set.start()
        }
    }
}