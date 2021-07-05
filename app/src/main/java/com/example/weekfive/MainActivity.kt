package com.example.weekfive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weekfive.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myProfileAdapter: ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val names : List<ProfileModel> =  listOf(
            ProfileModel(
                "Mudiaga","Etaoghene", true
            ),
            ProfileModel(
                "Mary", "Timaya", false
            ),
            ProfileModel(
                "John", "Mote", true
            ),
            ProfileModel(
                "Mercy","Johnson", false
            )
        )
        myProfileAdapter = ProfileAdapter(names)
        binding.recyclerView.adapter = myProfileAdapter
    }
}