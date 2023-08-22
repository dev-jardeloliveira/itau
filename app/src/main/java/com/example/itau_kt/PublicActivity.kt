package com.example.itau_kt

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.updateLayoutParams
import com.example.itau_kt.databinding.ActivityPublicBinding

class PublicActivity : AppCompatActivity() {

    lateinit var binding: ActivityPublicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPublicBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        binding.arrow.setOnClickListener{
           if(binding.barTool.appBarLayout.top < 0){
                binding.barTool.appBarLayout.setExpanded(true, true)
               binding.arrow.setImageResource(R.drawable.ic_arrow_up)

            }else{
                binding.barTool.appBarLayout.setExpanded(false, true)
               binding.arrow.setImageResource(R.drawable.ic_arrow_collapse)
            }
        }

    }
}