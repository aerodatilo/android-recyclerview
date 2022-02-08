package com.hybot.jornada_android_fev22_recyclerview_multithread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvPokemons =  findViewById<RecyclerView>(R.id.rvPokemons)

        rvPokemons.layoutManager = LinearLayoutManager(this)

        val charmander = Pokemon("Charmander","https://sm.ign.com/ign_br/screenshot/default/blob_bkmv.jpg")
        val pikachu = Pokemon("Pikachu","https://cidadedoheroi.com.br/wp-content/uploads/2021/11/Pikachu-capa.jpg")
        val listaPokemons = listOf(charmander, pikachu, charmander)
        rvPokemons.adapter = PokemonsAdapter(listaPokemons)
    }
}