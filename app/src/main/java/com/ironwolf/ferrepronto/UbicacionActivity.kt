package com.ironwolf.ferrepronto

import android.content.Intent
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UbicacionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ubicacion)

        // ---- WebView ----
        val webView = findViewById<WebView>(R.id.webviewMapa)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.webViewClient = WebViewClient()
        val url = "https://www.google.com/maps/d/u/0/embed?mid=1EyRNa3hGRukZHXTXRFqcHZLhMNopK4E&ehbc=2E312F"
        webView.loadUrl(url)

        // ---- BOTÓN PARA REGRESAR ----
        val regresarhome = findViewById<TextView>(R.id.regresarhome)
        regresarhome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
