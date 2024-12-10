package com.sanchez.juan.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class InscripcionAdapter(private val inscripciones: List<Inscripcion>) :
    RecyclerView.Adapter<InscripcionAdapter.InscripcionViewHolder>() {

    class InscripcionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNombreEvento: TextView = itemView.findViewById(R.id.tv_event_name)
        val tvFechaEvento: TextView = itemView.findViewById(R.id.tv_event_date)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InscripcionViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_inscripcion, parent, false)
        return InscripcionViewHolder(view)
    }

    override fun onBindViewHolder(holder: InscripcionViewHolder, position: Int) {
        val inscripcion = inscripciones[position]
        holder.tvNombreEvento.text = inscripcion.nombreEvento
        holder.tvFechaEvento.text = inscripcion.fechaEvento
    }

    override fun getItemCount(): Int = inscripciones.size
}
