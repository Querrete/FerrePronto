package com.ironwolf.ferrepronto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // 🔘 BOTÓN CERRAR SESIÓN
        val btnCerrarSesion = findViewById<MaterialButton>(R.id.Cerrar_sesion)
        btnCerrarSesion.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }



        // 🔘 BOTÓN CONTACTO
        val btnContacto = findViewById<MaterialButton>(R.id.Contacto)
        btnContacto.setOnClickListener {
            val intent = Intent(this, ContactoActivity::class.java)
            startActivity(intent)
        }

        // 🔘 BOTÓN COMPRAR
        val btnComprar = findViewById<MaterialButton>(R.id.Comprar)
        btnComprar.setOnClickListener {
            val intent = Intent(this, ComprarActivity::class.java)
            startActivity(intent)
        }

        // 🔘 BOTÓN UBICACIÓN (si existe)
        val btnUbicacion = findViewById<MaterialButton>(R.id.Ubicacion)
        btnUbicacion.setOnClickListener {
            val intent = Intent(this, UbicacionActivity::class.java)
            startActivity(intent)
        }

        // 🔘 BOTÓN ACERCA
        val btnAcerca_de = findViewById<MaterialButton>(R.id.Acerca_de)
        btnAcerca_de.setOnClickListener {
            val intent = Intent(this, AcercaDeActivity::class.java)
            startActivity(intent)
        }

    }
}
