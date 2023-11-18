package com.c1ctech.androidbottomnavviewexp

import android.content.Context
import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceDataStore
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_singup.*
import kotlinx.android.synthetic.main.activity_singup.signupTitle
class SingupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singup)


        val typeface: Typeface = Typeface.createFromAsset(assets, "Pacifico-Regular.ttf")
        signupTitle.typeface = typeface


        signupButton.setOnClickListener {

            val signupNameData = signupName.text.toString()
            val signupEmailData = signupEmail.text.toString()
            val signupPasswordData = signupPassword.text.toString()

            if (signupNameData.isEmpty()){
                signupName.error = "Name required"
                signupName.requestFocus()
                return@setOnClickListener
            }
            if (signupEmailData.isEmpty()){
                signupEmail.error = "Email required"
                signupEmail.requestFocus()
                return@setOnClickListener
            }
            if (signupPasswordData.isEmpty()){
                signupPassword.error = "Password required"
                signupPassword.requestFocus()
                return@setOnClickListener
            }
            val sharPer = getSharedPreferences("MY_PER", Context.MODE_PRIVATE)
            val editor = sharPer.edit()
            editor.putString("NAME", signupNameData)
            editor.putString("EMAIL", signupEmailData)
            editor.putString("PASSWORD", signupPasswordData)
            editor.apply()


            startActivity(Intent(this, loginActivity::class.java))

        }
    }
}