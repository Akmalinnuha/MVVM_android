package com.akmalinnuha.contohmvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewModel(val lvm: ListSatu) : ViewModel() {
    var list = MutableLiveData<List<Mahasiswa>>()
    fun getList() : LiveData<List<Mahasiswa>>{
        list.value = lvm.getList()
        return list
    }
    fun addList(newList : Mahasiswa){
        lvm.addList(newList)
        list.value = lvm.getList()
    }
}