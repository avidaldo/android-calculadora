package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculadora.databinding.ActivityCalculadoraBinding

class CalculadoraActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculadoraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculadoraBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tv11Percent.setOnClickListener { }
        binding.tv12CE.setOnClickListener { }
        binding.tv13C.setOnClickListener { }
        binding.tv14EraseLeft.setOnClickListener { }
        binding.tv21Inverso.setOnClickListener { }
        binding.tv22Cuadrado.setOnClickListener { }
        binding.tv23Raiz.setOnClickListener { }
        binding.tv24opDividir.setOnClickListener { }
        binding.tv31num7.setOnClickListener { }
        binding.tv32num8.setOnClickListener { }
        binding.tv33num9.setOnClickListener { }
        binding.tv34opMultiplica.setOnClickListener { }
        binding.tv41num4.setOnClickListener { }
        binding.tv42num5.setOnClickListener { }
        binding.tv43num6.setOnClickListener { }
        binding.tv44opResta.setOnClickListener { }
        binding.tv51num1.setOnClickListener { }
        binding.tv52num2.setOnClickListener { }
        binding.tv53num3.setOnClickListener { }
        binding.tv54opSuma.setOnClickListener { }
        binding.tv61negate.setOnClickListener { }
        binding.tv62num0.setOnClickListener { }
        binding.tv63decimal.setOnClickListener { }
        binding.tv64opIgual.setOnClickListener { }


        binding.tvMC.setOnClickListener { }
        binding.tvMR.setOnClickListener { }
        binding.tvMsum.setOnClickListener { }
        binding.tvMrestar.setOnClickListener { }
        binding.MS.setOnClickListener { }
        binding.tvMHistorial.setOnClickListener { }


    }


}