package com.example.parquemunicipal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.btnCuriosidade1)
        val btn2: Button = findViewById(R.id.btnCuriosidade2)
        val btn3: Button = findViewById(R.id.btnCuriosidade3)
        val btn4: Button = findViewById(R.id.btnCuriosidade4)

        btn1.setOnClickListener {
            startActivity(Intent(this, tela2::class.java))
        }
        btn2.setOnClickListener {
            startActivity(Intent(this, tela3::class.java))
        }
        btn3.setOnClickListener {
            startActivity(Intent(this, tela4::class.java))
        }
        btn4.setOnClickListener {
            startActivity(Intent(this, tela5::class.java))
        }
    }
}
