package com.ironwolf.ferrepronto

import android.content.Intent
import android.location.Geocoder
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class UbicacionmapaActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var googleMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ubicacionmapa)

        // BARRA COMPLETA PARA REGRESAR
        val headerBar = findViewById<LinearLayout>(R.id.headerBar)
        headerBar.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        // MAPA
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentmaps) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(map: GoogleMap) {
        googleMap = map

        val direccion =
            "Av México - Puebla 46, Barrio del Perdón, 72700 San Juan Cuautlancingo, Pue."

        try {
            val geocoder = Geocoder(this)
            val lista = geocoder.getFromLocationName(direccion, 1)

            if (!lista.isNullOrEmpty()) {
                val loc = lista[0]
                val lugar = LatLng(loc.latitude, loc.longitude)

                googleMap.addMarker(
                    MarkerOptions()
                        .position(lugar)
                        .title(direccion)
                )

                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lugar, 17f))
            } else {
                Toast.makeText(this, "No se pudo encontrar la dirección", Toast.LENGTH_LONG).show()
            }

        } catch (e: Exception) {
            Toast.makeText(this, "Error con Geocoder", Toast.LENGTH_LONG).show()
        }
    }
}
