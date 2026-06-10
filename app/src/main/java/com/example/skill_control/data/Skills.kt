package com.example.skill_control.data

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

data class Skills(val id: Int, val nombre: String, var nivel: Int)

object RepositorioSkills {

    val cantidadNiveles = 10

    val listaHabilidades = mutableStateListOf(

        Skills(1, "Game", 1),
        Skills(2, "Frame", 1),
        Skills(3, "Looks", 1),
        Skills(4, "Money", 1)

    )

    fun dameNombreHabilidad(id: Int): String? {

        listaHabilidades.forEach {

            if (it.id == id) {

                return it.nombre

            }

        }

        return null

    }

    fun estableceNivel(id: Int, nivel: Int) {

        listaHabilidades.forEachIndexed { indice, skills ->

            if (skills.id == id) {

                listaHabilidades[indice] = Skills(id, skills.nombre, nivel)

            }

        }

    }


}