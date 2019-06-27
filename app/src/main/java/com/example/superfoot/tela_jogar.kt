package com.example.superfoot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_tela_jogar.*
import kotlin.math.log
import kotlin.random.Random


class TelaJogar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_jogar)

        var bancoController = BancoController(baseContext)
        var jogador = bancoController.findJogador()

        val time_partida_1_casa = 1
        val time_partida_1_convidado = 2
        val time_partida_2_casa = 3
        val time_partida_2_convidado = 4
        val time_partida_3_casa = 5
        val time_partida_3_convidado = 6
        val time_partida_4_casa = 7
        val time_partida_4_convidado = 8
        val time_partida_5_casa = 9
        val time_partida_5_convidado = 10

        var resultado_1_text: TextView = findViewById(R.id.resultado_1)
        var resultado_2_text: TextView = findViewById(R.id.resultado_2)
        var resultado_3_text: TextView = findViewById(R.id.resultado_3)
        var resultado_4_text: TextView = findViewById(R.id.resultado_4)
        var resultado_5_text: TextView = findViewById(R.id.resultado_5)

        geraResultado(resultado_1_text, time_partida_1_casa, time_partida_1_convidado, bancoController)
        geraResultado(resultado_2_text, time_partida_2_casa, time_partida_2_convidado, bancoController)
        geraResultado(resultado_3_text, time_partida_3_casa, time_partida_3_convidado, bancoController)
        geraResultado(resultado_4_text, time_partida_4_casa, time_partida_4_convidado, bancoController)
        geraResultado(resultado_5_text, time_partida_5_casa, time_partida_5_convidado, bancoController)

    }

    fun geraResultado(resultado_text:TextView, time_casa:Int, time_convidado:Int, bancoController: BancoController) {
        var obj_time_casa = bancoController.findTimeById(time_casa)
        var obj_time_convidado = bancoController.findTimeById(time_convidado)

        var gols_time_casa = randomGols()
        var gols_time_convidado = randomGols()

        var pontos_time_casa = 0
        var pontos_time_convidado = 0

        if(gols_time_casa > gols_time_convidado) {
            pontos_time_casa = 3
        }

        if(gols_time_convidado > gols_time_casa) {
            pontos_time_convidado = 3
        }

        if(gols_time_casa == gols_time_convidado) {
            pontos_time_casa = 1
            pontos_time_convidado = 1
        }

        bancoController.addPontos(time_casa, obj_time_casa.pontos + pontos_time_casa)
        bancoController.addPontos(time_convidado, obj_time_convidado.pontos + pontos_time_convidado)
        bancoController.addPartida(time_casa, time_convidado, gols_time_casa, gols_time_convidado)

        resultado_text.setText(obj_time_casa.nome + " " + gols_time_casa.toString() + " - " + gols_time_convidado.toString() + " " + obj_time_convidado.nome)
    }

    fun randomGols(): Int {
        return Random.nextInt(0, 5)
    }
}
