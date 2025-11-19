package com.ironwolf.ferrepronto

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContactoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto)

        // TEXTVIEW DEL CORREO 1
        val tvCorreo = findViewById<TextView>(R.id.tvCorreo)
        tvCorreo.setOnClickListener {
            val correo = "ferrepronto@hotmail.com"
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:$correo")
            }
            startActivity(intent)
        }

        // TEXTVIEW DEL CORREO 2
        val tvCorreo2 = findViewById<TextView>(R.id.tvCorreo2)
        tvCorreo2.setOnClickListener {
            val correo = "ferrepronto@gmail.com"
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:$correo")
            }
            startActivity(intent)
        }

        // TELEFONO LOCAL
        val tvTelLocal = findViewById<TextView>(R.id.tvTelefonolocal)
        tvTelLocal.setOnClickListener {
            val numero = "2222854418"
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$numero")
            }
            startActivity(intent)
        }

        // TELEFONO CELULAR
        val tvTelCel = findViewById<TextView>(R.id.tvTelefonocelular)
        tvTelCel.setOnClickListener {
            val numero = "2224265301"
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$numero")
            }
            startActivity(intent)
        }

        val regresarhome = findViewById<TextView>(R.id.regresarhome)
        regresarhome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)}
    }
}

