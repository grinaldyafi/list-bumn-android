package com.grinaldyafi.daftarbumn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class mainlist : AppCompatActivity() {
    private lateinit var rvBUMN: RecyclerView
    private var list: ArrayList<BUMN> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainlist)
        val actionbar = supportActionBar
        actionbar!!.title= "BUMN"

        rvBUMN = findViewById(R.id.rv_bumn)
        rvBUMN.setHasFixedSize(true)

        list.addAll(bumnData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvBUMN.layoutManager = LinearLayoutManager(this)
        val listBumnAdapter = ListBUMNAdapter(list)
        rvBUMN.adapter = listBumnAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.home, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.miCompose -> {
                val iAbout = Intent(this@mainlist, MainActivity::class.java)
                startActivity(iAbout)
            }
        }
    }
}
