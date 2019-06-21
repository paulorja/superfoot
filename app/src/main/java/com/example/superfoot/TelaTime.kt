package com.example.superfoot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class TelaTime : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_time)

        refreshScreenData()
    }


    fun refreshScreenData() {
        var bancoController = BancoController(baseContext)
        var jogador = bancoController.findJogador()
        var listaJogadores = bancoController.jogadoresTime(jogador.id);

        val btnFormacao:Button = findViewById(R.id.btn_formacao)
        btnFormacao.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TelaFormacao::class.java).apply {
            }
            startActivity(intent)
        })

        var dinheiroText: TextView = findViewById(R  .id.dinheiro_jogador)
        dinheiroText.setText("$" + jogador.dinheiro.toString())

        var table: LinearLayout = findViewById(R.id.table_jogadores)
        table.removeAllViews()

        for(j in listaJogadores) {
            var row = LinearLayout(this)
            row.orientation = LinearLayout.HORIZONTAL;

            var imgPosicao = ImageView(this);

            if(j.posicaoQueJoga == 1) {
                imgPosicao.setImageDrawable(resources.getDrawable(R.drawable.ata));
            } else if(j.posicaoQueJoga == 2) {
                imgPosicao.setImageDrawable(resources.getDrawable(R.drawable.mc));
            } else if(j.posicaoQueJoga == 3) {
                imgPosicao.setImageDrawable(resources.getDrawable(R.drawable.zag));
            }

            var textJogador = TextView(this)
            textJogador.setText("(" + j.forca + ") " + j.nome)

            var buttonJogador = Button(this)
            buttonJogador.setText("Detalhes")

            buttonJogador.setOnClickListener(View.OnClickListener {

            })

            row.addView(imgPosicao);
            row.addView(textJogador)
            row.addView(buttonJogador)

            table.addView(row)
        }

    }
}
