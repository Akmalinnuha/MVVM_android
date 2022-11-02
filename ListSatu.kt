package com.akmalinnuha.contohmvvm

class ListSatu {
    private val daftar = mutableListOf<Mahasiswa>()
    init {
        daftar.add(Mahasiswa("Akmal", "205150200111043","PSI-C"))
    }

    fun getList() = daftar
    fun addList(newList : Mahasiswa) { daftar.add(newList)}
}