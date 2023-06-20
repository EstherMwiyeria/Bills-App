package com.example.assessments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assessments.databinding.ActivityLoginBinding
import com.example.assessments.databinding.ActivityMain2Binding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


        override fun onResume() {
            super.onResume()
            setContentView(binding.root)
            binding.btnLogin.setOnClickListener {
                validateRegistration()
            }
        }
        fun validateRegistration() {
            val email=binding.etEmail .text.toString()
            val password =binding.etPassword .text.toString()
            var error = false
            if (email.isBlank()) {
                binding.tilEmail.error = "Name required"
                error=true
            }
            if (password.isBlank()) {
                binding.tilPassword.error = "Phonenumber required"
                error=true
            }

        }
    }
