package com.example.placarbasquete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado_jogo.*

class ResultadoJogo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_jogo)

        resultado()

    }


    private fun resultado() {
        var intent = intent
        var time1 = intent.getStringExtra("time1")
        var time2 = intent.getStringExtra("time2")
        var pontosT1 = intent.getStringExtra("pontosT1")
        var pontosT2 = intent.getStringExtra("pontosT2")

        textView3.text = time1.toString()
        textView4.text = time2.toString()
        textView5.text = pontosT1.toString()
        textView6.text = pontosT2.toString()

    }
}