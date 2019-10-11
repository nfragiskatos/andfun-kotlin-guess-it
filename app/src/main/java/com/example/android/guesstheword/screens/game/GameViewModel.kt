package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

/**
 * Created by Nicholas Fragiskatos on 10/11/2019.
 */
class GameViewModel : ViewModel() {
    init {
        Log.i("GameViewModel", "GameViewModel Created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel Destroyed!")
    }
}