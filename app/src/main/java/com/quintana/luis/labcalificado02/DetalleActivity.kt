package com.quintana.luis.labcalificado02

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.quintana.luis.labcalificado02.databinding.ActivityDetalleBinding

class DetalleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetalleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Recibir datos enviados
        val nombre = intent.getStringExtra("nombre") ?: "No especificado"
        val numero = intent.getStringExtra("numero") ?: "989498385"
        val productos = intent.getStringExtra("productos") ?: "No especificado"
        val ciudad = intent.getStringExtra("ciudad") ?: "No especificado"
        val direccion = intent.getStringExtra("direccion") ?: "No especificado"

        // Asignar textos a los TextViews
        binding.tvNombre.text = "Nombre: $nombre"
        binding.tvNumero.text = "Número: $numero"
        binding.tvProductos.text = "Productos: $productos"
        binding.tvCiudad.text = "Ciudad: $ciudad"
        binding.tvDireccion.text = "Dirección: $direccion"

        // Botón llamar muestra Toast con nombre y teléfono
        binding.btnLlamar.setOnClickListener {
            Toast.makeText(this, "Llamando a $nombre\nTeléfono: $numero", Toast.LENGTH_LONG).show()
        }

        // Botón WhatsApp muestra mensaje personalizado
        binding.btnWhatsapp.setOnClickListener {
            Toast.makeText(this, "Hola $nombre Tus productos: $productos están en camino a la dirección: $direccion", Toast.LENGTH_LONG).show()
        }

        // Botón MAPS muestra la dirección
        binding.btnMaps.setOnClickListener {
            Toast.makeText(this, "Dirección: $direccion", Toast.LENGTH_LONG).show()
        }
    }
}
