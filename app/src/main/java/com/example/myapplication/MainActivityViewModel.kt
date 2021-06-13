package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private val _counter = MutableLiveData<Int>()

    init {
        _counter.value = 0
    }

    fun getCounter(): LiveData<Int> = _counter

    fun incCounter() {
        _counter.apply {
            value = value?.plus(1)
        }
    }

}