package com.c1ctech.androidbottomnavviewexp

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*


class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val typeface: Typeface = Typeface.createFromAsset(assets, "Pacifico-Regular.ttf")
        textView3.typeface = typeface

        buttonWelcome.setOnClickListener {
            val intent = Intent(this, SingupActivity::class.java)
            startActivity(intent)
        }

//        Intent(this@SplashActivity, WelcomeActivity::class.java)
    }
}