package com.sanchez.juan.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class EventoAdapter(
    context: Context,
    eventos: List<Evento>
) : ArrayAdapter<Evento>(context, 0, eventos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_evento, parent, false)

        val evento = getItem(position)
        val nombreTextView: TextView = view.findViewById(R.id.textViewNombre)
        val puntuacionTextView: TextView = view.findViewById(R.id.textViewPuntuacion)

        nombreTextView.text = evento?.nombre
        puntuacionTextView.text = "Puntuación: ${evento?.puntuacion}"

        return view
    }
}