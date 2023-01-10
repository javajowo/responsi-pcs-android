package com.responsi.pcs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login_btn :Button
        login_btn=findViewById(R.id.login_btn)
        login_btn.setOnClickListener(
            val intent -Intent(this,HomeActivity::class.java)
        )
    }
}