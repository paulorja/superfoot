package com.example.superfoot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class TelaLoja : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_loja)

        var jogadores = ArrayList<String>()

        jogadores.add("Neymar | 19 | ATK")
        jogadores.add("Firmino | 16 | ATK")
        jogadores.add("Marquinhos | 10 | DEF")
        jogadores.add("Paulão | 99 | ATK")

        var table:TableLayout = findViewById(R.id.table_jogadores_venda)
        table.removeAllViews()
        for(j in jogadores) {
            var row = TableRow(this)

            var textJogador = TextView(this)
            textJogador.setText(j)

            var buttonJogador = Button(this)
            buttonJogador.setText("COMPRAR")

            row.addView(textJogador)
            row.addView(buttonJogador)

            table.addView(row)

        }

    }
}
