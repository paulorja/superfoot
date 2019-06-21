package com.example.superfoot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TelaEstadio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_estadio)

        var bancoController = BancoController(baseContext)

        bancoController.insereDado("joao", "joao", "joao")
        bancoController.findJogador();
    }
}
