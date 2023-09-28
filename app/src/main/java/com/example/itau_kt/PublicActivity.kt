package com.example.itau_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.itau_kt.Model.KeyboardPassword
import com.example.itau_kt.ViewModel.publicViewModel
import com.example.itau_kt.databinding.ActivityPublicBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class PublicActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    val  model: publicViewModel by viewModels()
    lateinit var binding: ActivityPublicBinding
    private var list:MutableList<KeyboardPassword> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPublicBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
        var navHostController = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
       navController = navHostController.navController
        val bottoNavigatioView = findViewById<BottomNavigationView>(R.id.bntNavigation)
        NavigationUI.setupWithNavController(bottoNavigatioView, navController)


     //   list = model.keyboard_number()


     /*   binding.arrow.setOnClickListener{
           if(binding.barTool.appBarLayout.top < 0){
                binding.barTool.appBarLayout.setExpanded(true, true)
               binding.arrow.setImageResource(R.drawable.ic_arrow_up)

            }else{
                binding.barTool.appBarLayout.setExpanded(false, true)
               binding.arrow.setImageResource(R.drawable.ic_arrow_collapse)
            }
        }

        binding.btn.layoutBtn.setOnClickListener {
            btnClickAcessar()
        }


        binding.keyboard2.num1.setOnClickListener {
          binding.input.text!!.append(list[0].text)
        }
        binding.keyboard2.num2.setOnClickListener {
            binding.input.text!!.append(list[1].value.toString())
        }
*/

    }


  /*  fun btnClickAcessar(){
        binding.btn.textBtn.visibility =  android.view.View.GONE
        binding.btn.progressBar.visibility =  android.view.View.VISIBLE
        binding.keyboard2.keyboard.visibility = View.VISIBLE

        Thread.sleep(5000)
        getKeyboard()

        binding.btn.layoutBtn.isEnabled = false
        binding.btn.textBtn.visibility =  android.view.View.VISIBLE
        binding.btn.progressBar.visibility =  android.view.View.GONE

    }
    fun getKeyboard(){
        binding.keyboard2.num1.text = list[0].value.toString()
        binding.keyboard2.num2.text = list[1].value.toString()
        binding.keyboard2.num3.text = list[2].value.toString()
        binding.keyboard2.num4.text = list[3].value.toString()
        binding.keyboard2.num5.text = list[4].value.toString()
    }
    fun setInputPassword(number: Int){
        binding.input.text!!.append(number.toString())
    }*/
}




