package com.example.superfoot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class TelaLoja : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_loja)

        refreshScreenData()
    }

    fun refreshScreenData() {
        var bancoController = BancoController(baseContext)
        var jogador = bancoController.findJogador()
        var listaJogadores = bancoController.jogadoresVenda();

        var dinheiroText:TextView = findViewById(R  .id.dinheiro_jogador)
        dinheiroText.setText("$" + jogador.dinheiro.toString())

        var table:LinearLayout = findViewById(R.id.table_jogadores_venda)
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
            buttonJogador.setText("$" + j.preco)

            if(jogador.dinheiro < j.preco) {
                buttonJogador.isEnabled = false
            }

            buttonJogador.setOnClickListener(View.OnClickListener {
                if(jogador.dinheiro >= j.preco) {
                    j.timeId = jogador.id
                    jogador.dinheiro -= j.preco
                    bancoController.alteraDinheiroTime(jogador.id, jogador.dinheiro)
                    bancoController.alteraTimeJogador(j.id, j.timeId)
                    refreshScreenData()
                }
            })

            row.addView(imgPosicao);
            row.addView(textJogador)
            row.addView(buttonJogador)

            table.addView(row)
        }
    }
}
