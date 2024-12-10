package com.sanchez.juan.myapplication

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EventoActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private lateinit var adapter: EventoAdapter
    private lateinit var eventos: ArrayList<Evento>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_evento) // Asegúrate de que el layout correcto es 'activity_evento'

        listView = findViewById(R.id.listViewEventos)

        eventos = ArrayList()
        // Añadir eventos de ejemplo
        eventos.add(Evento("Evento 1", 85))
        eventos.add(Evento("Evento 2", 92))
        eventos.add(Evento("Evento 3", 76))

        // Adapter personalizado para mostrar la lista
        adapter = EventoAdapter(this, eventos)
        listView.adapter = adapter

        // Acción al hacer clic en un evento
        listView.setOnItemClickListener { _, _, position, _ ->
            val evento = eventos[position]
            Toast.makeText(this, "Puntuación de ${evento.nombre}: ${evento.puntuacion}", Toast.LENGTH_SHORT).show()
        }

        val btnRegresar: ImageView = findViewById(R.id.btn_regresar)
        btnRegresar.setOnClickListener {
            onBackPressed()
        }
    }
}
