package com.sanchez.juan.myapplication

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast

class eventos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eventos)

        // Configuración de botones de registro
        val button: Button = findViewById(R.id.button1)
        button.setOnClickListener {
            val intent = Intent(this, registro::class.java)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, registro2::class.java)
            startActivity(intent)
        }

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, registro3::class.java)
            startActivity(intent)
        }

        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this, registro4::class.java)
            startActivity(intent)
        }

        // Configuración del ImageButton con PopupMenu
        val imageButton = findViewById<ImageButton>(R.id.myImageButton)
        imageButton.setOnClickListener {
            // Crear un menú emergente
            val popupMenu = PopupMenu(this, imageButton)
            popupMenu.menuInflater.inflate(R.menu.menu_options, popupMenu.menu)

            // Manejar clics en las opciones del menú
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.menu_opcion1 -> {
                        val intent = Intent(this, eventos::class.java)
                        startActivity(intent)
                        true
                    }
                    R.id.menu_opcion2 -> {
                        val intent = Intent(this, configuracion::class.java)
                        startActivity(intent)
                        true
                    }
                    R.id.menu_opcion3 -> {
                        val intent = Intent(this, InscripcionActivity::class.java)
                        startActivity(intent)
                        true

                    }
                    R.id.menu_opcion4 -> {
                        val intent = Intent(this, EventoActivity::class.java)
                        startActivity(intent)
                        true
                    }

                    R.id.menu_opcion5 -> {
                        val intent = Intent(this, EmailActivity::class.java)
                        startActivity(intent)
                        true
                    }
                    R.id.menu_opcion6 -> {
                        showLogoutDialog()
                        true
                    }
                    else -> false
                }
            }
            popupMenu.show() // Mostrar el menú
        }
    }

    // Diálogo para cerrar sesión
    private fun showLogoutDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Cerrar sesión")
            .setMessage("¿Quieres cerrar sesión?")
            .setPositiveButton("Aceptar") { _: DialogInterface, _: Int ->
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            }
            .setNegativeButton("Cancelar") { dialog: DialogInterface, _: Int ->
                dialog.dismiss()
            }
        val alertDialog = builder.create()
        alertDialog.show()
    }
}
