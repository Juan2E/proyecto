package com.sanchez.juan.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class nueva : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva)

        // Obtener las referencias de los elementos
        val etNuevaContraseña: EditText = findViewById(R.id.etNuevaContraseña)
        val etConfirmarContraseña: EditText = findViewById(R.id.etConfirmarContraseña)
        val btnConfirmarCambio: Button = findViewById(R.id.btnConfirmarCambio)

        // Acción al hacer clic en el botón de confirmar cambio
        btnConfirmarCambio.setOnClickListener {
            val nuevaContraseña = etNuevaContraseña.text.toString()
            val confirmarContraseña = etConfirmarContraseña.text.toString()

            // Verificar si las contraseñas coinciden
            if (nuevaContraseña == confirmarContraseña) {
                // Aquí puedes agregar la lógica para guardar la nueva contraseña
                Toast.makeText(this, "Contraseña cambiada con éxito", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
