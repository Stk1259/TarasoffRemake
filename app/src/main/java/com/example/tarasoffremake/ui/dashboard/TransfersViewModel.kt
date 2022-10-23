package com.example.tarasoffremake.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TransfersViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is transfers Fragment"
    }
    val text: LiveData<String> = _text
}