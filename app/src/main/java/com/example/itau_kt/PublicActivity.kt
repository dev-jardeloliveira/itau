package com.example.itau_kt

import android.graphics.Color
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.view.updateLayoutParams
import androidx.lifecycle.ViewModel
import com.example.itau_kt.ViewModel.publicviewmodel
import com.example.itau_kt.databinding.ActivityPublicBinding

class PublicActivity : AppCompatActivity() {

    val  model: publicviewmodel by viewModels()
    lateinit var binding: ActivityPublicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPublicBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)


          var list = model.keyboard_number()

          binding.keyboard2.num1.text = list[0].toString()
          binding.keyboard2.num2.text = list[1].toString()
          binding.keyboard2.num3.text = list[2].toString()
          binding.keyboard2.num4.text = list[3].toString()
          binding.keyboard2.num5.text = list[4].toString()

        binding.arrow.setOnClickListener{
           if(binding.barTool.appBarLayout.top < 0){
                binding.barTool.appBarLayout.setExpanded(true, true)
               binding.arrow.setImageResource(R.drawable.ic_arrow_up)

            }else{
                binding.barTool.appBarLayout.setExpanded(false, true)
               binding.arrow.setImageResource(R.drawable.ic_arrow_collapse)
            }
        }

        binding.btn.layoutBtn.setOnClickListener {
            binding.btn.textBtn.visibility =  android.view.View.GONE
            binding.btn.progressBar.visibility =  android.view.View.VISIBLE
            binding.keyboard2.keyboard.visibility = View.VISIBLE
        }



    }
}




