package com.example.skill_control.data

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf

data class Skills(val id: Int, val nombre: String,var nivel: Int)

object RepositorioSkills{

    val listaHabilidades = mutableStateListOf(
        Skills(1, "Game", 1),
        Skills(2, "Frame", 1),
        Skills(3, "Looks", 1),
        Skills(4, "Money", 1)
    )

}