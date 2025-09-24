package com.example.parquemunicipal

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val txtCuriosidade: TextView = findViewById(R.id.txtCuriosidade)
        val btnPrefeitura: Button = findViewById(R.id.btnPrefeitura)
        val btnAbrirSite: Button = findViewById(R.id.btnAbrirSite)

        txtCuriosidade.text = "História e importância cultural:\n" +
                "O Parque Municipal de Belo Horizonte foi inaugurado em 1897 e é considerado um dos primeiros espaços verdes planejados da cidade. Desde sua criação, o parque se tornou um ponto de encontro para a população, servindo como local de lazer, cultura e convivência. Ao longo dos anos, ele se consolidou como um marco histórico e referência na preservação de áreas verdes em meio à cidade, sendo um espaço valorizado tanto por moradores quanto por turistas."

        btnPrefeitura.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:156"))
            startActivity(intent)
        }

        btnAbrirSite.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/ircGDV7SqCbBTXUx7"))
            startActivity(intent)
        }
    }
}