package com.slowmotion.donuttapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.slowmotion.donuttapp.R

class DetailDonutActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_FLAVOR = "extra_flavor"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_donut)

        var actionBar = getSupportActionBar()
        actionBar?.setDisplayHomeAsUpEnabled(true)

        showDonutDetail()
    }
    private fun showDonutDetail(){
        //variable untuk menampung id layout
        val tvImageReceived: ImageView = findViewById(R.id.iv_item_photo)
        val tvNameReceived: TextView = findViewById(R.id.tv_name)
        val tvFlavorReceived: TextView = findViewById(R.id.tv_flavor)
        val tvPriceReceived: TextView = findViewById(R.id.tv_price)
        val tvDetailReceived: TextView = findViewById(R.id.tv_Detail)

        //varible unutk intent
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)
        val name = intent.getStringExtra(EXTRA_NAME)
        val flavor = intent.getStringExtra(EXTRA_FLAVOR)
        val price = intent.getStringExtra(EXTRA_PRICE)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        tvImageReceived.setImageResource(photo)
        tvNameReceived.setText("$name")
        tvFlavorReceived.setText("$flavor")
        tvPriceReceived.setText("$price")
        tvDetailReceived.setText("$detail")

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}