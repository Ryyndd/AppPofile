package com.example.myproject

import android.graphics.Color
import android.os.Bundle
import android.widget.EditText
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myproject.databinding.ActivityMainBinding
import java.util.Locale


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvBioList.layoutManager = GridLayoutManager(this, 1)
        val data = DataBiodata()
        binding.rvBioList.adapter = rvBiodataAdapter(data)

        binding.searchView.setOnClickListener {
            binding.searchView.isIconified = false
        }

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText.toString())
                return true
            }

        })
    }

    private fun filterList(query: String) {
        val data = DataBiodata()
        val filteredList = data.filter { it.nama.lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT)) }
        if (filteredList.isEmpty()) {
            Toast.makeText(this, "Data tidak ditemukan", Toast.LENGTH_SHORT).show()
        } else {
            (binding.rvBioList.adapter as? rvBiodataAdapter)?.setFilteredList(filteredList) // Assuming adapter has a function named setFilteredList
        }
    }






}


