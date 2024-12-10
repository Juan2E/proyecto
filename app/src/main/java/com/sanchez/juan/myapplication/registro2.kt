package com.sanchez.juan.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AlertDialog
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class registro2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro2)

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
