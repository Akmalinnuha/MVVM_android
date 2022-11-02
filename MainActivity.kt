package com.akmalinnuha.contohmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lsd = ListViewModel(ListSatu())
        val adapter = ListMahasiswaAdapter(lsd.getList())
        val rView = findViewById<RecyclerView>(R.id.viewList)
        rView.adapter = adapter
        rView.layoutManager = LinearLayoutManager(this)
        findViewById<Button>(R.id.tombol).setOnClickListener{
            val nama = findViewById<TextView>(R.id.inputNama).text.toString()
            val nim = findViewById<TextView>(R.id.inputNIM).text.toString()
            val kelas = findViewById<TextView>(R.id.inputKelas).text.toString()
            lsd.addList(Mahasiswa(nama, nim, kelas))
            rView.adapter = adapter
            rView.layoutManager = LinearLayoutManager(this)
            findViewById<TextView>(R.id.inputNama).text = ""
            findViewById<TextView>(R.id.inputNIM).text = ""
            findViewById<TextView>(R.id.inputKelas).text = ""
        }

    }
}