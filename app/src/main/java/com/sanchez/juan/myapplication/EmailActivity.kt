package com.sanchez.juan.myapplication

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewEmails)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val emailList = listOf(
            Email("Juan Pérez", "Reunión mañana", "09/12/2024", true),
            Email("María López", "Factura pendiente", "08/12/2024", true),
            Email("Carlos Ruiz", "Proyecto aprobado", "07/12/2024", false)
        )

        recyclerView.adapter = EmailAdapter(emailList)

        val btnRegresar: ImageView = findViewById(R.id.btn_regresar)
        btnRegresar.setOnClickListener {
            onBackPressed()
        }
    }
}