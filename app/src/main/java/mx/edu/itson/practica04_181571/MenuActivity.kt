package mx.edu.itson.practica04_181571

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var type: String

        var btnCold: Button = findViewById(R.id.btnCold) as Button
        var btnHot: Button = findViewById(R.id.btnHot) as Button
        var btnSalty: Button = findViewById(R.id.btnSalties) as Button
        var btnSweet: Button = findViewById(R.id.btnSweets) as Button
        var btnCombos: Button = findViewById(R.id.btnCombos) as Button
        var btnCustom: Button = findViewById(R.id.btnCustom) as Button

        btnCold.setOnClickListener {
            type = "cold"
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("type", type)
            startActivity(intent)
        }

        btnHot.setOnClickListener {
            type = "hot"
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("type", type)
            startActivity(intent)
        }

        btnSalty.setOnClickListener {
            type = "salty"
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("type", type)
            startActivity(intent)
        }

        btnSweet.setOnClickListener {
            type = "sweet"
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("type", type)
            startActivity(intent)
        }

        btnCombos.setOnClickListener {
            type = "combos"
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("type", type)
            startActivity(intent)
        }

        btnCustom.setOnClickListener {
            type = "custom"
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("type", type)
            startActivity(intent)
        }
    }
}