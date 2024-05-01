package com.cookandroid.myappacitivity

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var inIntent = intent
        var hapvalue = inIntent.getIntExtra("Num1", 0) + inIntent.getIntExtra("Num2", 0)

        var btnReturn = findViewById<Button>(R.id.btnReturn)

        btnReturn.setOnClickListener{
            var outIntent = Intent(applicationContext, MainActivity::class.java)
            outIntent.putExtra("Hap", hapvalue)
            setResult(Activity.RESULT_OK, outIntent)
            finish()
        }
    }
}