package com.sanchez.juan.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emailList: List<Email>) :
    RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sender: TextView = itemView.findViewById(R.id.tvSender)
        val subject: TextView = itemView.findViewById(R.id.tvSubject)
        val date: TextView = itemView.findViewById(R.id.tvDate)
        val statusIndicator: View = itemView.findViewById(R.id.statusIndicator)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.sender.text = email.sender
        holder.subject.text = email.subject
        holder.date.text = email.date
        holder.statusIndicator.setBackgroundColor(
            if (email.isRead) android.graphics.Color.GRAY else android.graphics.Color.GREEN
        )
    }

    override fun getItemCount(): Int = emailList.size
}
