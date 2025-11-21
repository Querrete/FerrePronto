package com.ironwolf.ferrepronto

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ElectricidadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_electricidad)

        // 🔘 BOTÓN Regresar
        val regresarhome = findViewById<TextView>(R.id.regresarhome)
        regresarhome.setOnClickListener {
            val intent = Intent(this, ComprarActivity::class.java)
            startActivity(intent)
        }
    }
}