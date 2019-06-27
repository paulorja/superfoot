package com.example.superfoot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class TelaRanking : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_ranking)

        var bancoController = BancoController(baseContext)

        var times = bancoController.findTimes()
        var table: LinearLayout = findViewById(R.id.table_ranking)
        table.removeAllViews()

        var i = 1
        for(t in times) {
            var row = LinearLayout(this)
            row.orientation = LinearLayout.HORIZONTAL;


            var textTime = TextView(this)
            textTime.setText(i.toString() + " - " + t.nome + "(" + t.pontos.toString() + " pontos)")

            var buttonDetalhes = Button(this)
            buttonDetalhes.setText("Detalhes")

            row.addView(textTime)
            row.addView(buttonDetalhes)

            table.addView(row)

            i += 1
        }

    }
}
