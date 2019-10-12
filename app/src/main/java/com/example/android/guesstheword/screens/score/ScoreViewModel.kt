package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by Nicholas Fragiskatos on 10/12/2019.
 */
class ScoreViewModel(finalScore: Int) : ViewModel() {

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    private val _eventPlayAgain = MutableLiveData<Boolean>()
    val eventPlayAgain: LiveData<Boolean>
        get() = _eventPlayAgain

    init {
        Log.i("ScoreViewModel", "Final score is: $finalScore")
        _score.value = finalScore
    }

    fun onPlayAgainComplete() {
        _eventPlayAgain.value = false
    }

    fun onPlayAgain() {
        _eventPlayAgain.value = true
    }
}