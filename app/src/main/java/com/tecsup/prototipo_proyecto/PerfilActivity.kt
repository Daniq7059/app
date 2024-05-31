package com.tecsup.prototipo_proyecto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.tecsup.prototipo_proyecto.R.layout.activity_perfil
import com.tecsup.tecsupapp.notas.NotaViendo
import com.tecsup.tecsupapp.notas.NotasAdapterViendo
import com.tecsup.prototipo_proyecto.notasViendoHorizontal.NotaHorizontal
import com.tecsup.prototipo_proyecto.notasViendoHorizontal.NotasAdapterHorizontal


class PerfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(activity_perfil)

        val intent = Intent(this, CertificadosActivity::class.java)
        val intent2 = Intent(this, EditarPerfilActivity::class.java)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navigationView: NavigationView = findViewById(R.id.nav_view)

                setContentView(activity_perfil)
                val recyclerNotas = findViewById<RecyclerView>(R.id.recyclerNotasViendo)

                val listNotas = listOf(
                    NotaViendo("Diseño de Interfaces","Omar Castañeda","7 Semanas"),
                    NotaViendo("Scrum","Cesar Zavaleta","7 Semanas"),
                    NotaViendo("POO","Walter Moncada","7 Semanas"),
                    NotaViendo("Humanidades","Omar Castañeda","7 Semanas"),
                    NotaViendo("Scram","Cesar Zavaleta","7 Semanas"),
                    NotaViendo("POO","Walter Moncada","7 Semanas")



                )

                val adapter = NotasAdapterViendo(listNotas)
                recyclerNotas.adapter = adapter
                //recyclerNotas.layoutManager=LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
                recyclerNotas.layoutManager= GridLayoutManager(this,1)

        //Content 2
            val recyclerNotasHorizontal = findViewById<RecyclerView>(R.id.recyclerNotasViendoHorizontal)

            val listNotas2 = listOf(
                NotaHorizontal("Diseño de Interfaces", "https://img.freepik.com/fotos-premium/casa-mano-humana-fondo_488220-5956.jpg?w=996"),
                NotaHorizontal("Diseño de Interfaces", "https://img.freepik.com/fotos-premium/casa-mano-humana-fondo_488220-5956.jpg?w=996"),
                NotaHorizontal("Diseño de Interfaces", "https://img.freepik.com/fotos-premium/casa-mano-humana-fondo_488220-5956.jpg?w=996"),
                NotaHorizontal("Diseño de Interfaces", "https://img.freepik.com/fotos-premium/casa-mano-humana-fondo_488220-5956.jpg?w=996"),
                NotaHorizontal("Diseño de Interfaces", "https://img.freepik.com/fotos-premium/casa-mano-humana-fondo_488220-5956.jpg?w=996"),
                NotaHorizontal("Diseño de Interfaces", "https://img.freepik.com/fotos-premium/casa-mano-humana-fondo_488220-5956.jpg?w=996")



            )

            val adapter2 = NotasAdapterHorizontal(listNotas2)
            recyclerNotasHorizontal.adapter = adapter2
            recyclerNotasHorizontal.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.gato -> {
                    drawerLayout.openDrawer(GravityCompat.START)
                    true // Indica que el evento ha sido consumido
                }
                // Agrega más casos para otros elementos del menú si es necesario
                else -> false
            }
        }
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNav.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    // Acción para el elemento Home
                    true
                }
                R.id.circleplay -> {
                    // Acción para el elemento Circle Play
                    true
                }
                R.id.heart -> {
                    // Acción para el elemento Heart
                    startActivity(Intent(this, CertificadosActivity::class.java))
                    true
                }
                R.id.gato -> {
                    startActivity(Intent(this, EditarPerfilActivity::class.java))
                    true
                }
                else -> false
            }
        }

    }
}


