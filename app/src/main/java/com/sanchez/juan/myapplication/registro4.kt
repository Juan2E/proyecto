package com.sanchez.juan.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class registro4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registro4)

        // Ajuste de márgenes para Edge to Edge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val inscribirseButton: Button = findViewById(R.id.btn_inscribirse)

        inscribirseButton.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Confirmar inscripción")
            builder.setMessage("¿Deseas inscribirte en este torneo?")

            builder.setPositiveButton("Aceptar") { dialog, which ->
                Toast.makeText(this, "Inscripción confirmada", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, eventos::class.java)
                startActivity(intent)
            }
            builder.setNegativeButton("Cancelar") { dialog, which ->
                dialog.dismiss()
            }
            builder.show()
        }

        // Configurar el botón de regreso
        val btnRegresar: ImageView = findViewById(R.id.btn_regresar)
        btnRegresar.setOnClickListener {
            onBackPressed()
        }

        // Definir el número fijo
        val phone = "+51 916366097"
        val message = "Hola, Buenas tardes. ¿Podrias pasarme informacion del evento?"

        // Referenciar el botón de WhatsApp
        val btnWhatsApp = findViewById<ImageButton>(R.id.btnWhatsApp)

        // Establecer el OnClickListener
        btnWhatsApp.setOnClickListener {
            // Crear el intent para abrir WhatsApp
            val intentWsp = Intent()
            intentWsp.action = Intent.ACTION_VIEW
            intentWsp.data = Uri.parse("https://wa.me/$phone?text=$message")

            // Iniciar la actividad
            startActivity(intentWsp)
        }
    }
}
