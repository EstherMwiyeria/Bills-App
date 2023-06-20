package com.example.assessments


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.assessments.databinding.ActivityMain2Binding
//import com.example.billz.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {

            val isValid = validateForm()

            if (isValid) {

                val username = binding.etUsername.text.toString()
                val password = binding.etPassword.text.toString()


                if (username == "your_username" && password == "your_password") {
                    startActivity(Intent(this, HomeActivity::class.java))
                    finish()
                } else {
                    // Login failed, show an error message
                    binding.tvError.text = "Invalid username or password"
                }
            }
        }
    }

    private fun validateForm(): Boolean {
        val username = binding.etUsername.text.toString()
        val password = binding.etPassword.text.toString()


        return true
    }
}



