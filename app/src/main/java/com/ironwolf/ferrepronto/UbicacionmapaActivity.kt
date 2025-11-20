package com.ironwolf.ferrepronto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class UbicacionmapaActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private val ubicacion = LatLng(19.082565, -98.262048) // Cambia a tu dirección

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ubicacionmapa)

        // --- BOTÓN REGRESAR ---
        val tvBack = findViewById<TextView>(R.id.tvBack)
        tvBack.setOnClickListener {
            finish() // Regresa a la actividad anterior
        }

        // --- MAPA ---
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentmaps) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Marcador
        mMap.addMarker(MarkerOptions().position(ubicacion).title("Mi Ubicación"))

        // Cámara
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ubicacion, 17f))
    }
}
