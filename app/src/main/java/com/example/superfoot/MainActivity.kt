package com.example.superfoot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.content.Intent
import android.widget.ImageButton
import androidx.core.view.isVisible
import java.nio.InvalidMarkException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnJogar:Button = findViewById(R.id.btn_jogar)
        btnJogar.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TelaJogar::class.java).apply {
            }
            startActivity(intent)
        })

        val btnCarrinho:ImageButton = findViewById(R.id.btn_carrinho)
        btnCarrinho.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TelaLoja::class.java).apply {
            }
            startActivity(intent)
        })

        val btnEstadio:ImageButton = findViewById(R.id.btn_estadio)
        btnEstadio.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TelaEstadio::class.java).apply {
            }
            startActivity(intent)
        })

        val btnTime:ImageButton = findViewById(R.id.btn_time)
        btnTime.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TelaTime::class.java).apply {
            }
            startActivity(intent)
        })


    }
}
