package com.example.skill_control.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.skill_control.data.RepositorioSkills

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun PantallaSkills(navegador: NavController) {

    BoxWithConstraints(Modifier
        .fillMaxSize()
        .padding(20.dp)) {

        val anchoPantalla = maxWidth.value.toInt()
        val altoPantalla = maxHeight.value.toInt()

        val anchoCasilla = (anchoPantalla / RepositorioSkills.cantidadNiveles) - 10
        val altoCasilla = (altoPantalla / RepositorioSkills.cantidadNiveles) / 2

        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {

            RepositorioSkills.listaHabilidades.forEach { skills ->

                Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {

                    repeat(RepositorioSkills.cantidadNiveles) { indice ->

                        Box(
                            Modifier
                                .size(anchoCasilla.dp, altoCasilla.dp)
                                .padding(1.dp)
                                .background(if(skills.nivel>=(indice+1)) Color.Cyan else Color.Gray)
                                .clickable(onClick = {
                                    RepositorioSkills.estableceNivel(skills.id, (indice+1))
                                })
                        )

                    }

                    Text(
                        RepositorioSkills.dameNombreHabilidad(skills.id) ?: "nombre una mierda",
                        fontSize = (altoCasilla / 2).sp
                    )

                }

            }

        }

    }

}