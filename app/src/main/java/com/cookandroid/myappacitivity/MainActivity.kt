package com.cookandroid.myappacitivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnNew = findViewById<Button>(R.id.btnNewActivity)

        btnNew.setOnClickListener{
            var edtNum1 = findViewById<EditText>(R.id.edtNum1)
            var edtNum2 = findViewById<EditText>(R.id.edtNum2)

            var intent = Intent(applicationContext, MainActivity2::class.java)
            intent.putExtra("num1", Integer.parseInt(edtNum1.text.toString()))
            intent.putExtra("num2", Integer.parseInt(edtNum2.text.toString()))
            startActivityForResult(intent, 0)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode== RESULT_OK) {
            var hap:Int=data!!.getIntExtra("Hap", 0)
            Toast.makeText(applicationContext,"합계 : $hap", Toast.LENGTH_SHORT).show()
        }
    }
}