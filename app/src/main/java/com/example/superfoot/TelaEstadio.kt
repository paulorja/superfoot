package com.example.superfoot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class TelaEstadio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_estadio)

        refreshScreenData()
    }

    fun refreshScreenData() {
        var bancoController = BancoController(baseContext)
        var jogador = bancoController.findJogador()

        var dinheiroText: TextView = findViewById(R.id.dinheiro_jogador)
        dinheiroText.setText("$" + jogador.dinheiro.toString())

        var estCapacidadeAtual: TextView = findViewById(R.id.est_capacidade_atual)
        estCapacidadeAtual.setText("Capacidade atual: "+jogador.capacidadeEstadioTotal+" pessoas")

        var btnMelhorarEstadio: Button = findViewById(R.id.btn_melhorar_estadio)
        if(jogador.dinheiro < 5000) {
            btnMelhorarEstadio.isEnabled = false
        }
        btnMelhorarEstadio.setOnClickListener(View.OnClickListener {
            if(jogador.dinheiro >= 5000) {
                jogador.dinheiro -= 5000
                jogador.capacidadeEstadio += 1
                bancoController.alteraCapacidadeEstadio(jogador.id, jogador.dinheiro, jogador.capacidadeEstadio)
                refreshScreenData()
            }
        })
    }
}
