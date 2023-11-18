package com.c1ctech.androidbottomnavviewexp

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        @Suppress("DEPRECATION")
        Handler().postDelayed(
            {
                startActivity(Intent(this@SplashActivity, WelcomeActivity::class.java))
            },
            2500
        )

        val typeface: Typeface = Typeface.createFromAsset(assets, "Pacifico-Regular.ttf")
        tvSplash.typeface = typeface
    }
}