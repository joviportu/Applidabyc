package com.example.applicationdabyc.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel2 : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = ""
    }
    val text: LiveData<String> = _text
}