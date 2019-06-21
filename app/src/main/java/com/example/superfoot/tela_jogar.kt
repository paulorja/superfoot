package com.example.superfoot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.isVisible
import kotlin.math.log


class TelaJogar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_jogar)

        var btnVoltar:Button = findViewById(R.id.t_jogar_btn_voltar)


        btnVoltar.setOnClickListener(View.OnClickListener {

        })


    }
}
