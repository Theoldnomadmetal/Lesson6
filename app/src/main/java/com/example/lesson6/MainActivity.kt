package com.example.lesson6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutus= findViewById<TextView>(R.id.aboutustv)



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.products -> {
                this.startActivity(Intent(this, SecondActivity::class.java))
            }
            R.id.services->{this.startActivity(Intent(this,ThirdActivity::class.java))
            }
            R.id.about-> findViewById<TextView>(R.id.aboutustv).text= getString(R.string.aboutus_string)

        }
        return super.onOptionsItemSelected(item)
    }
}