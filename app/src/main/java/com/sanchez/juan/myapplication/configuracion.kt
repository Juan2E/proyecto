package com.sanchez.juan.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class configuracion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_configuracion)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnCambiarContraseña: Button = findViewById(R.id.btnCambiarContraseña)
        btnCambiarContraseña.setOnClickListener {
            val intent = Intent(this@configuracion, nueva::class.java)
            startActivity(intent)
        }

        val btnRegresar: ImageView? = findViewById(R.id.btn_regresar)
        btnRegresar?.setOnClickListener {
            onBackPressed()
        }

    }
}
