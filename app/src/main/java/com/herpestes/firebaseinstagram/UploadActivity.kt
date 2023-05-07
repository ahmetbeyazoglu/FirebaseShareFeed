package com.herpestes.firebaseinstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.herpestes.firebaseinstagram.databinding.ActivityUploadBinding

class UploadActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUploadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUploadBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}