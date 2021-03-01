package molina.raul.practica4_thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        var intent = Intent(this, ProductosActivity::class.java)

        val btnCold: Button = findViewById(R.id.button_cold_drinks) as Button
        val btnHot: Button = findViewById(R.id.button_hot_drinks) as Button
        val btnSweet: Button = findViewById(R.id.button_sweets) as Button
        val btnSalties: Button = findViewById(R.id.button_salties) as Button
        val btnCombos: Button = findViewById(R.id.button_combos) as Button
        val btnCustom: Button = findViewById(R.id.button_custom) as Button


        /*
        btnCold.setOnClickListener {
            intent.putExtra("type", "coldDrinks")
            startActivity(intent)
        }
        */
        btnCold.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }
        btnHot.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }
        btnSweet.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }
        btnSalties.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }
        btnCombos.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }
        btnCustom.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }


    }
}