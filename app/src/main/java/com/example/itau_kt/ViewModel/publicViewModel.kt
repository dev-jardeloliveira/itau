package com.example.itau_kt.ViewModel

import androidx.lifecycle.ViewModel
import com.example.itau_kt.Model.Keyboard
import com.example.itau_kt.Model.KeyboardPassword

class publicViewModel:ViewModel() {

    fun keyboard_number():ArrayList<KeyboardPassword>{

        val listString: ArrayList<KeyboardPassword> = ArrayList()
        val list = generateListInt()
        for (i in list){
                listString.add(KeyboardPassword("${i.number1} ou ${i.number2}", i.number1, i.number2))
        }

        return listString
    }
    private fun generateListInt():MutableList<Keyboard>{
        val listInt:MutableList<Keyboard> = mutableListOf()
        val numbers1:MutableList<Int> = mutableListOf(0,1,2,3,4)
        numbers1.shuffle()
        val numbers2:MutableList<Int> = mutableListOf(5,6,7,8,9)
        numbers2.shuffle()
        for (i in 0..4){
            listInt.add(Keyboard(numbers1[i],numbers2[i]))
        }
        return listInt
    }


}