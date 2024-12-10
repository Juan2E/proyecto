package com.sanchez.juan.myapplication

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class InscripcionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscripcion)

        // Configurar el RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Datos de prueba
        val inscripciones = listOf(
            Inscripcion("Torneo Ajedrez", "10/12/2024", ),
            Inscripcion("Maratón Escolar", "15/12/2024", ),
            Inscripcion("Torneo Tenis", "20/12/2024", )
        )

        // Configurar el RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = InscripcionAdapter(inscripciones)

        // Configurar el botón de regreso
        val btnRegresar: ImageView = findViewById(R.id.btn_regresar)
        btnRegresar.setOnClickListener {
            onBackPressed()
        }
    }
}

