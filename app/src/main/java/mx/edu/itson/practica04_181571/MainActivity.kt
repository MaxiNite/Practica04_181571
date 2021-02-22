package mx.edu.itson.practica04_181571

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)

        val button:Button = findViewById(R.id.btnStart) as Button

        button.setOnClickListener {
            var intent: Intent = Intent(this, RegisterPage::class.java)
            startActivity(intent)
        }
    }
}