package com.example.andres_castro_20240521

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText as EditText1
import com.example.andres_castro_20240521.R.id.sportEditText as sportEditText1


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Registry de advertencia en la consola cada vez que se abre la aplicación */
        Log.w("MainActivity", "La aplicación ha sido abierta")

        // Referencias a los elementos de la interfaz de usuario
        val sportEditText = findViewById<EditText1>(sportEditText1)
        val timeEditText: EditText1 = findViewById(R.id.timeEditText)
        val showButton: Button = findViewById(R.id.showButton)

        // Configuración del botón para mostrar información del entrenamiento
        showButton.setOnClickListener {
            val sport = sportEditText.text.toString()
            val time = timeEditText.text.toString()

            // Mostrar mensaje de alerta con la información del entrenamiento
            Toast.makeText(this, "Deporte: $sport, Tiempo: $time minutos", Toast.LENGTH_LONG).show()

            // Registrar la información en la consola del desarrollador
            Log.i("Entrenamiento", "Deporte: $sport, Tiempo: $time minutos")
        }
    }
}
