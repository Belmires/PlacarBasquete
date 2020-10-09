package com.example.placarbasquete

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intent = intent
        var time1 = intent.getStringExtra("time1")
        var time2 = intent.getStringExtra("time2")
        textView.text = time1.toString()
        textView2.text = time2.toString()

        //Botões do 1º ti
        btn_a3.setOnClickListener(){
            acrescentar3PtsT1()
        }
        btn_a2.setOnClickListener(){
            acrescentar2PtsT1()
        }
        btn_a1.setOnClickListener(){
            acrescentar1PtsT1()
        }
        btn_an1.setOnClickListener(){
            diminuir1PtsT1()
        }

        //Botões do time B
        btn_b3.setOnClickListener(){
            acrescentar3PtsT2()
        }
        btn_b2.setOnClickListener(){
            acrescentar2PtsT2()
        }
        btn_b1.setOnClickListener(){
            acrescentar1PtsT2()
        }
        btn_bn1.setOnClickListener(){
            diminuir1PtsT2()
        }
        btn_reset.setOnClickListener {
            limpar()
        }
        btn_finalizar.setOnClickListener(){
            terminarPartida(time1.toString(),time2.toString())
        }


    }
    fun acrescentar3PtsT1(){
        var pont = txt_aplacar.text.toString().toInt() + 3
        txt_aplacar.text = pont.toString()
    }
    fun acrescentar2PtsT1(){
        var pont = txt_aplacar.text.toString().toInt() + 2
        txt_aplacar.text = pont.toString()
    }
    fun acrescentar1PtsT1(){
        var pont = txt_aplacar.text.toString().toInt() + 1
        txt_aplacar.text = pont.toString()
    }
    fun diminuir1PtsT1(){
        var pont = txt_aplacar.text.toString().toInt()
        if (pont >= 1){
            pont--
            txt_aplacar.text = pont.toString()
        }
    }

    fun acrescentar3PtsT2(){
        var pont = txt_bplacar.text.toString().toInt() + 3
        txt_bplacar.text = pont.toString()
    }
    fun acrescentar2PtsT2(){
        var pont = txt_bplacar.text.toString().toInt() + 2
        txt_bplacar.text = pont.toString()
    }
    fun acrescentar1PtsT2(){
        var pont = txt_bplacar.text.toString().toInt() + 1
        txt_bplacar.text = pont.toString()
    }
    fun diminuir1PtsT2(){
        var pont = txt_bplacar.text.toString().toInt()
        if (pont >= 1){
            pont--
            txt_bplacar.text = pont.toString()
        }
    }
    fun limpar(){
        var pont:String = "0"
        txt_aplacar.text = pont
        txt_bplacar.text = pont
    }
    fun terminarPartida( time1:String, time2:String){

        var pontosT1 = txt_aplacar.text.toString().toInt()
        var pontosT2 = txt_bplacar.text.toString().toInt()
        val intent = Intent(this@MainActivity, ResultadoJogo::class.java)
        intent.putExtra("time2", time2)
        intent.putExtra("time1", time1)
        intent.putExtra("pontosT1", pontosT1.toString())
        intent.putExtra("pontosT2", pontosT2.toString())

        startActivity(intent)
    }
}