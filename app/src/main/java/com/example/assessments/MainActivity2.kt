package com.example.assessments


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.assessments.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnRegister.setOnClickListener {
            validateRegistration()
        }
    }
    fun validateRegistration() {
        val userName = binding.etUserName.text.toString()
        val phoneNumber =binding.etPhoneNumber .text.toString()
        val email=binding.etEmail .text.toString()
        val password =binding.etPassword .text.toString()
        var error = false
        if (userName.isBlank()) {
            binding.tillUserName.error = "Name required"
            error=true
        }
        if (phoneNumber.isBlank()) {
            binding.tilPhoneNumber.error = "Phonenumber required"
            error=true
        }
        if (email.isBlank()) {
            binding.tilEmail.error = "Email required"
            error=true
        }

        if (password.isBlank()) {
            binding.tilPassword.error = "Password required"
            error=true
        }
        if (!error){
            val intent= Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
}





