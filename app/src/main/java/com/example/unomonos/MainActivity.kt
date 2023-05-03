package com.example.unomonos

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = 56
        var x = -1

        var cards= arrayOf(
            R.drawable._2amarillo,R.drawable._4amarillo,R.drawable.block_amarillo,R.drawable.reversoamarillo,R.drawable.comodinamarillo, R.drawable.uno_amarillo, R.drawable.dos_amarillo, R.drawable.tres_amarillo, R.drawable.cuatro_amarillo,
            R.drawable.cinco_amarillo, R.drawable.seis_amarillo, R.drawable.siete_amarillo, R.drawable.ocho_amarillo, R.drawable.nueve_amarillo,
            R.drawable._2azul,R.drawable._4azul,R.drawable.block_azul,R.drawable.reversoazul,R.drawable.comodinazul, R.drawable.uno_azul, R.drawable.dos_azul, R.drawable.tres_azul, R.drawable.cuatro_azul,
            R.drawable.cinco_azul, R.drawable.seis_azul, R.drawable.siete_azul, R.drawable.ocho_azul, R.drawable.nueve_azul,
            R.drawable._2verde,R.drawable._4verde,R.drawable.block_verde,R.drawable.reversoverde,R.drawable.comodinverde, R.drawable.uno_verde, R.drawable.dos_verde, R.drawable.tres_verde, R.drawable.cuatro_verde,
            R.drawable.cinco_verde, R.drawable.seis_verde, R.drawable.siete_verde, R.drawable.ocho_verde, R.drawable.nueve_verde,
            R.drawable._2rojo,R.drawable._4rojo,R.drawable.block_rojo,R.drawable.reversorojo,R.drawable.comodinrojo, R.drawable.uno_rojo, R.drawable.dos_rojo, R.drawable.tres_rojo, R.drawable.cuatro_rojo,
            R.drawable.cinco_rojo, R.drawable.seis_rojo, R.drawable.siete_rojo, R.drawable.ocho_rojo, R.drawable.nueve_rojo)

        val boton : Button = findViewById<Button>(R.id.button)
        val boton2 : Button = findViewById<Button>(R.id.button2)
        val boton3 : Button = findViewById<Button>(R.id.button3)
        var imageview : ImageView = findViewById<ImageView>(R.id.imageView)

        boton.setOnClickListener {

            var  r =  Random()
            var  n=r.nextInt(a)

            imageview.setImageResource(cards[n])

        }

        boton2.setOnClickListener{
            if (x < cards.size-1){
            imageview.setImageResource(cards[x+1])
            x++}
            else {x = 0}
        }

        boton3.setOnClickListener{
            if (x > 0){

                imageview.setImageResource(cards[x-1])
                x--
                }
            else {x = 56}
        }

    }
}