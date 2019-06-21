package com.example.superfoot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class TelaRanking : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_ranking)

        var bancoController = BancoController(baseContext)

        var times = bancoController.findTimes()
        var table: TableLayout = findViewById(R.id.table_ranking)
        table.removeAllViews()
        for(t in times) {
            var row = TableRow(this)

            var textTime = TextView(this)
            textTime.setText(t.nome)

            var buttonDetalhes = Button(this)
            buttonDetalhes.setText("Detalhes")

            row.addView(textTime)
            row.addView(buttonDetalhes)

            table.addView(row)
        }

    }
}
