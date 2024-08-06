package anu.trial.olu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myImageButton: ImageButton = findViewById(R.id.start)
        myImageButton.setOnClickListener {
            // Start the second activity
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            // Optionally show a toast message
            Toast.makeText(this, "Navigating to Second Activity", Toast.LENGTH_SHORT).show()
        }
    }
}
