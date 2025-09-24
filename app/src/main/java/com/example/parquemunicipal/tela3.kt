package com.example.parquemunicipal

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class tela3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val txtCuriosidade: TextView = findViewById(R.id.txtCuriosidade)
        val btnPrefeitura: Button = findViewById(R.id.btnPrefeitura)
        val btnAbrirSite: Button = findViewById(R.id.btnAbrirSite)

        txtCuriosidade.text = "Diversidade ambiental:\n" +
                "O parque abriga uma grande variedade de árvores nativas e espécies exóticas, proporcionando sombra e beleza para os visitantes. Ele também funciona como um importante refúgio para aves e pequenos animais urbanos, contribuindo para a preservação da biodiversidade em Belo Horizonte. Dessa forma, os frequentadores podem ter um contato direto com a natureza, observando diferentes espécies e aprendendo sobre a importância de conservar o meio ambiente."

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