package com.example.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var texto: TextView
    val frases = arrayOf(
        "Nem todas as tempestades vêm para atrapalhar a sua vida. Algumas vêm para limpar seu caminho.",
        "A persistência realiza o impossível",
        "Não se desespere quando a caminhada estiver difícil, é sinal de que você está no caminho certo.",
        "Seus sonhos não precisam de plateia, eles só precisam de você.",
        "Tudo de deve ser feito, merece ser bem feito.",
        "No meio da dificuldade encontra-se a oportunidade.",
        "Pedras no caminho? Eu guardo todas. Um dia vou construir um castelo."
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        texto=findViewById(R.id.textoFrase) as TextView
    }
    fun gerarFrase(view:View){
        val totalIntensArray=frases.size
        val numeroAleatorio= java.util.Random().nextInt(totalIntensArray)
        texto.setText( frases [numeroAleatorio])


    }
}