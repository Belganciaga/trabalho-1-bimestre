package com.example.parquemunicipal

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class tela5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela5)

        val txtCuriosidade: TextView = findViewById(R.id.txtCuriosidade)
        val btnPrefeitura: Button = findViewById(R.id.btnPrefeitura)
        val btnAbrirSite: Button = findViewById(R.id.btnAbrirSite)

        txtCuriosidade.text = "Estrutura de lazer e cuidado com os animais:\n" +
                "Dentro do Parque Municipal, além de lago, pistas de caminhada, quiosques e áreas de piquenique, há uma presença muito especial: os gatinhos que vivem no parque. Uma ONG local chamada SOS Gatinhos do Parque atua no local, promovendo a adoção dos felinos, arrecadando ração e materiais de cuidado, e garantindo que esses animais recebam atenção e proteção. Essa iniciativa permite que os visitantes interajam com os animais, contribuam com a causa e aprendam sobre responsabilidade e bem-estar animal, tornando o parque um espaço ainda mais acolhedor e solidário.."

        btnPrefeitura.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:156"))
            startActivity(intent)
        }

        btnAbrirSite.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/ircGDV7SqCbBTXUx7"))
            startActivity(intent)
        }

        val btnInstagram = findViewById<Button>(R.id.btnInstagram)

        btnInstagram.setOnClickListener {
            val instagramUrl = "https://www.instagram.com/sosgatinhosdoparque/" // link do Instagram da ONG
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(instagramUrl)
            startActivity(intent)
        }

    }
}