package com.example.geoquiz

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

const val CHEATED = "CHEATED"

class CheatViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {


    var cheated : Boolean
    get() = savedStateHandle.get(CHEATED) ?: false
    set(value) = savedStateHandle.set(CHEATED,value)
}