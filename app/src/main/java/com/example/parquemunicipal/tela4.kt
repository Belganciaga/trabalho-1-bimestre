package com.example.parquemunicipal

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class tela4: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela4)

        val txtCuriosidade: TextView = findViewById(R.id.txtCuriosidade)
        val btnPrefeitura: Button = findViewById(R.id.btnPrefeitura)
        val btnAbrirSite: Button = findViewById(R.id.btnAbrirSite)

        txtCuriosidade.text = "Eventos culturais e interação com a comunidade:\n" +
                "O parque também é palco de eventos culturais e educativos, como feiras de artesanato, exposições artísticas, apresentações musicais e atividades voltadas para educação ambiental. Além disso, os visitantes podem apoiar o trabalho da ONG SOS Gatinhos do Parque e acompanhar suas ações nas redes sociais. Para isso, o app pode incluir um botão que abra diretamente o Instagram da ONG, permitindo que as pessoas conheçam os gatinhos, vejam oportunidades de adoção e contribuam com doações de ração e materiais de cuidado."

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