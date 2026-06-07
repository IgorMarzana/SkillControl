package com.example.skill_control

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.skill_control.screens.PantallaEstadisticas
import com.example.skill_control.screens.PantallaSkills
import com.example.skill_control.ui.theme.Skill_ControlTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SkillControl()
        }
    }
}

@Composable
fun SkillControl(){

    val controlNavegacion = rememberNavController()

    NavHost(navController = controlNavegacion, startDestination = "skills"){
        composable("skills"){ PantallaSkills(controlNavegacion) }
        composable("estadisticas"){ PantallaEstadisticas(controlNavegacion) }
    }


}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun SkillControlPreview(){
    SkillControl()
}