package com.example.placarbasquete

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nomes_times.*

class NomesTimes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nomes_times)
        btnComecar.setOnClickListener {
            comecar()
        }
        btnLimpar.setOnClickListener {
            limpar()
        }
    }

    private fun comecar() {
        var time1 = time1.text.toString()
        var time2 = time2.text.toString()
        val intent = Intent(this@NomesTimes, MainActivity::class.java)
        intent.putExtra("time1", time1)
        intent.putExtra("time2", time2)
        startActivity(intent)
    }

    private fun limpar() {
        textView1.text = ""
        textView2.text = ""

    }
}