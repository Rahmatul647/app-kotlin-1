package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val input_username = findViewById<EditText>(R.id.input_username);
        val input_password = findViewById<EditText>(R.id.input_password);
        val google_button = findViewById<ImageButton>(R.id.google_button);
        val apple_button = findViewById<ImageButton>(R.id.apple_button);
        val facebook_button = findViewById<ImageButton>(R.id.facebook_button);
        val link = findViewById<TextView>(R.id.link);
        val button_loggin = findViewById<Button>(R.id.button_loggin);

        button_loggin.setOnClickListener{
            val username = input_username.text.toString();
            val password = input_password.text.toString();

            if (username.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "please enter username and password", Toast.LENGTH_SHORT).show()
            }else{
                // For demonstration, we just check if the username is "admin" and password is "password"
                Toast.makeText(this, "Invalid username and password", Toast.LENGTH_SHORT)
            }

        }
    }
}