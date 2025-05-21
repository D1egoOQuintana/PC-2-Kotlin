package com.quintana.luis.labcalificado02

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.quintana.luis.labcalificado02.databinding.ActivityEjercicio02Binding

class Ejercicio02 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio02Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        fun validarCampos(): Boolean {
            if (binding.etNombre.text.isBlank()) {
                binding.etNombre.error = "Ingrese nombre"
                binding.etNombre.requestFocus()
                return false
            }
            if (binding.etNumeroCliente.text.isBlank()) {
                binding.etNumeroCliente.error = "Ingrese número de cliente"
                binding.etNumeroCliente.requestFocus()
                return false
            }
            if (binding.etProductos.text.isBlank()) {
                binding.etProductos.error = "Ingrese productos"
                binding.etProductos.requestFocus()
                return false
            }
            if (binding.etDireccion.text.isBlank()) {
                binding.etDireccion.error = "Ingrese dirección"
                binding.etDireccion.requestFocus()
                return false
            }
            if (binding.etTelefono.text.isBlank()) {
                binding.etTelefono.error = "Ingrese teléfono"
                binding.etTelefono.requestFocus()
                return false
            }
            return true
        }

        binding.btnRegistrar.setOnClickListener {
            if (validarCampos()) {
                val intent = Intent(this, DetalleActivity::class.java).apply {
                    putExtra("nombre", binding.etNombre.text.toString())
                    putExtra("numeroCliente", binding.etNumeroCliente.text.toString())
                    putExtra("productos", binding.etProductos.text.toString())
                    putExtra("direccion", binding.etDireccion.text.toString())
                    putExtra("telefono", binding.etTelefono.text.toString())
                }
                startActivity(intent)
            }
        }


    }
}