package com.example.itau_kt.ViewModel

import androidx.lifecycle.ViewModel
import kotlin.random.Random
import kotlin.random.nextInt

class publicviewmodel:ViewModel() {

    fun keyboard_number():ArrayList<String>{

        val listString: ArrayList<String> = ArrayList()
        val list = generateListInt()
        for (i in list){
            for (e in list){
                listString.add("$i ou $e")
                list.drop(e)
            }
        }

        return listString
    }
    private fun generateListInt():ArrayList<Int>{
        val listInt:ArrayList<Int> = ArrayList()
        for (i in 0..9){
            if(!listInt.contains(i)){
                listInt.add(i)
            }
        }
        return listInt
    }


}