package com.ironwolf.ferrepronto

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class ComprarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_comprar)

        // 🔘 BOTÓN Carpinteria
        val btnCarpinteria = findViewById<MaterialButton>(R.id.Carpinteria)
        btnCarpinteria.setOnClickListener {
            val intent = Intent(this, CarpinteriaActivity::class.java)
            startActivity(intent)

        }

        // 🔘 BOTÓN Electricidad
        val btnElectricidad = findViewById<MaterialButton>(R.id.Electricidad)
        btnElectricidad.setOnClickListener {
            val intent = Intent(this, ElectricidadActivity::class.java)
            startActivity(intent)

        }

        // 🔘 BOTÓN Plomería
        val btnPlomeria = findViewById<MaterialButton>(R.id.Plomeria)
        btnPlomeria.setOnClickListener {
            val intent = Intent(this, PlomeriaActivity::class.java)
            startActivity(intent)

        }

        // 🔘 BOTÓN Tornilleria
        val btnTornilleria = findViewById<MaterialButton>(R.id.Tornillos)
        btnTornilleria.setOnClickListener {
            val intent = Intent(this, TornilleriaActivity::class.java)
            startActivity(intent)

        }

        // 🔘 BOTÓN Pinturas
        val btnPinturas= findViewById<MaterialButton>(R.id.Pinturas)
        btnPinturas.setOnClickListener {
            val intent = Intent(this, PinturasActivity::class.java)
            startActivity(intent)
        }

        // 🔘 BOTÓN Construccion
        val btnConstr = findViewById<MaterialButton>(R.id.Construccion)
        btnConstr.setOnClickListener {
            val intent = Intent(this, ConstrActivity::class.java)
            startActivity(intent)
        }

        // 🔘 BOTÓN Jardineria
        val btnJardineria = findViewById<MaterialButton>(R.id.Jardineria)
        btnJardineria.setOnClickListener {
            val intent = Intent(this, JardineriaActivity::class.java)
            startActivity(intent)

        }

        // 🔘 BOTÓN Regresar
        val regresarhome = findViewById<TextView>(R.id.regresarhome)
        regresarhome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
