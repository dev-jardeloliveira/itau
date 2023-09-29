package com.example.itau_kt.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import com.example.itau_kt.Model.Keyboard
import com.example.itau_kt.Model.KeyboardPassword
import com.example.itau_kt.R
import com.example.itau_kt.ViewModel.publicViewModel
import com.example.itau_kt.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

     private var binding:FragmentLoginBinding? = null
     val  model: publicViewModel by viewModels()
     private var list:MutableList<Keyboard> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater,container,false)
        val view = binding!!.root
        binding!!.arrow.setOnClickListener{
            if(binding!!.barTool.appBarLayout.top < 0){
                binding!!.barTool.appBarLayout.setExpanded(true, true)
                binding!!.arrow.setImageResource(R.drawable.ic_arrow_up)

            }else{
                binding!!.barTool.appBarLayout.setExpanded(false, true)
                binding!!.arrow.setImageResource(R.drawable.ic_arrow_collapse)
            }
        }


        list = model.keyboard_number()


        binding!!.btn.layoutBtn.setOnClickListener {
            btnClickAcessar()
        }


        binding!!.keyboard2.num1.setOnClickListener {
            binding!!.input.text!!.append(list[0].letter)
        }
        binding!!.keyboard2.num2.setOnClickListener {
            binding!!.input.text!!.append(list[1].letter)
        }
        binding!!.keyboard2.num3.setOnClickListener {
            binding!!.input.text!!.append(list[2].letter)
        }
        binding!!.keyboard2.num4.setOnClickListener {
            binding!!.input.text!!.append(list[3].letter)
        }
        binding!!.keyboard2.num5.setOnClickListener {
            binding!!.input.text!!.append(list[4].letter)
        }
        binding!!.keyboard2.backspace.setOnClickListener {
           binding!!.input.text!!.clear()
        }
        return view
    }

    fun btnClickAcessar(){
        binding!!.btn.textBtn.visibility =  android.view.View.GONE
        binding!!.btn.progressBar.visibility =  android.view.View.VISIBLE
        binding!!.keyboard2.keyboard.visibility = View.VISIBLE

        getKeyboard()
        /*Thread.sleep(5000)
        binding!!.btn.layoutBtn.isEnabled = false
        binding!!.btn.textBtn.visibility =  android.view.View.VISIBLE
        binding!!.btn.progressBar.visibility =  android.view.View.GONE*/


    }
    fun getKeyboard(){
            binding!!.keyboard2.num1.text = "${list[0].number1} ou ${list[0].number2}"
            binding!!.keyboard2.num2.text = "${list[1].number1} ou ${list[1].number2}"
            binding!!.keyboard2.num3.text = "${list[2].number1} ou ${list[2].number2}"
            binding!!.keyboard2.num4.text = "${list[3].number1} ou ${list[3].number2}"
            binding!!.keyboard2.num5.text = "${list[4].number1} ou ${list[4].number2}"



    }
    fun setInputPassword(number: Int){
        binding?.input?.text!!.append(number.toString())
    }
}