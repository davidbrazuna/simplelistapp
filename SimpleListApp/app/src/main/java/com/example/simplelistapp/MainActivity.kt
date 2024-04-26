package com.example.simplelistapp

import adapters.SimpleListAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simplelistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var simpleListAdapter: SimpleListAdapter

    private val simpleList = arrayListOf("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8", "Item9", "Item10")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prepareItemsRecyclerView()
        simpleListAdapter.setSimpleList(simpleList)
    }


    private fun prepareItemsRecyclerView() {
        simpleListAdapter = SimpleListAdapter()
        binding.recyclerViewList.apply {
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
            adapter = simpleListAdapter
        }
    }
}