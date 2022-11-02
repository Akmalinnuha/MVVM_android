package com.akmalinnuha.contohmvvm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView

class ListMahasiswaAdapter(val LMA: LiveData<List<Mahasiswa>>) :
    RecyclerView.Adapter<ListMahasiswaAdapter.TodoViewHolder>() {
    inner class TodoViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_mahasiswa, parent, false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.itemView.apply {
            val listNama = findViewById<TextView>(R.id.name)
            val listNim = findViewById<TextView>(R.id.nim)
            val listKelas = findViewById<TextView>(R.id.kelas)
            listNama.text = LMA.value?.get(position)?.name?:""
            listNim.text = LMA.value?.get(position)?.nim?:""
            listKelas.text = LMA.value?.get(position)?.kelas?:""
        }
    }

    override fun getItemCount(): Int {
        return LMA.value?.size?:0
    }
}