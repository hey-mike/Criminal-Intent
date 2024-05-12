package com.bignerdranch.android.criminalintent

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

private const val TAG = "CrimeListViewModel"

class CrimeListViewModel : ViewModel() {
    private val crimeRepository = CrimeRepository.get()

    val crimes = crimeRepository.getCrimes()

    init {
        viewModelScope.launch {
           
        }
    }

}