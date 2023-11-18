package com.c1ctech.androidbottomnavviewexp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginEmailData = editTextTextEmailAddress.text
        val loginPasswordData = editTextTextPassword.text

        val sharPer = getSharedPreferences("MY_PER", Context.MODE_PRIVATE)
        val UserName = sharPer.getString("NAME", "").toString()
        val UserEmail = sharPer.getString("EMAIL", "").toString()
        val UserPassword = sharPer.getString("PASSWORD", "").toString()

        loginButton.setOnClickListener {
            if (UserPassword == loginEmailData.toString() && UserEmail == loginPasswordData.toString()){
                startActivity(Intent(this, MainActivity::class.java))

            }else{
                Toast.makeText(this, "Email or Password not valid", Toast.LENGTH_SHORT).show()
            }

        }
    }
}