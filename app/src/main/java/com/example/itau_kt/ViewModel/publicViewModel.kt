package com.example.itau_kt.ViewModel

import androidx.lifecycle.ViewModel
import com.example.itau_kt.Model.Keyboard
import com.example.itau_kt.Model.KeyboardPassword

class publicViewModel:ViewModel() {

    fun keyboard_number():MutableList<Keyboard>{

        val listInt:MutableList<Keyboard> = mutableListOf(
            Keyboard("A",9,1),
            Keyboard("B",3,2),
            Keyboard("C",4,5),
            Keyboard("D",0,7),
            Keyboard("E",8,6),

            )
        listInt.shuffle()

        return listInt
    }



}