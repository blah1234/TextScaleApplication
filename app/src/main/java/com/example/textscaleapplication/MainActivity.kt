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
        const val SCALE = 1.067f
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val world = findViewById<LinearLayout>(R.id.world)

        val hello = "Hello World"
        val inflater = LayoutInflater.from(this)
        val views = mutableListOf<View>()
        for (c in hello) {
            val textView = inflater.inflate(R.layout.text, null)
            (textView as TextView).apply {
                text = c.toString()
                paintFlags = Paint.FILTER_BITMAP_FLAG
            }

            world.addView(textView)
            views.add(textView)
        }


        val pressMe = findViewById<Button>(R.id.press)
        pressMe.setOnClickListener {
//            for (i in views.indices) {
//                val v = views[i]
            val v = world
                val scaleX = ObjectAnimator.ofFloat(v, View.SCALE_X, 1f, SCALE, 1f)
                val scaleY = ObjectAnimator.ofFloat(v, View.SCALE_Y, 1f, SCALE, 1f)
                val set = AnimatorSet()
                set.playTogether(scaleX, scaleY)
//                set.startDelay = i * 100L
                set.duration = 3000
                set.interpolator = LinearInterpolator()
                set.start()
//            }

//            val scaleAnim = ScaleAnimation(1f, SCALE, 1f, SCALE, Animation.RELATIVE_TO_SELF, .5f, Animation.RELATIVE_TO_SELF, .5f)
//            scaleAnim.interpolator = LinearInterpolator()
//            scaleAnim.duration = 5000 /2
//            scaleAnim.repeatCount = 1
//            scaleAnim.repeatMode = Animation.REVERSE
//            world.startAnimation(scaleAnim)
        }
    }
}