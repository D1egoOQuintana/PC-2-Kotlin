package com.quintana.luis.labcalificado02
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.quintana.luis.labcalificado02.databinding.ActivityEjercicio01Binding

class Ejercicio01 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEjercicio01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMostrar.setOnClickListener {
            binding.viewVerde.visibility = View.VISIBLE
        }

        binding.btnOcultar.setOnClickListener {
            binding.viewVerde.visibility = View.GONE
        }
        binding.btnIrEjercicio02.setOnClickListener {
            val intent = Intent(this, Ejercicio02::class.java)
            startActivity(intent)
        }
    }

}
