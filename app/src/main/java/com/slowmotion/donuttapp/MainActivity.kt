package com.slowmotion.donuttapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.slowmotion.donuttapp.Data.DonutData
import com.slowmotion.donuttapp.Data.DonutDataObject
import com.slowmotion.donuttapp.ui.DetailDonutActivity
import com.slowmotion.donuttapp.ui.ListDonutAdapter
import com.slowmotion.donuttapp.view.ProfileActivity

class MainActivity : AppCompatActivity() {
    private lateinit var rvDonut: RecyclerView
    private var list: ArrayList<DonutData> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDonut = findViewById(R.id.rv_donut)
        rvDonut.setHasFixedSize(true)
        list.addAll(DonutDataObject.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvDonut.layoutManager = LinearLayoutManager(this)
        val listDonutAdapter = ListDonutAdapter(list)
        rvDonut.adapter = listDonutAdapter

        listDonutAdapter.setOnItemClickCallBack(object : ListDonutAdapter.OnItemClickCallBack {
            override fun onItemClickedData(data: DonutData) {
                showSelectedDonut(data)
            }

        })
    }

    private fun showSelectedDonut(data: DonutData) {
        val detailDonutActivity = Intent(this@MainActivity, DetailDonutActivity::class.java).apply {
            putExtra(DetailDonutActivity.EXTRA_PHOTO, data.photo)
            putExtra(DetailDonutActivity.EXTRA_NAME, data.name)
            putExtra(DetailDonutActivity.EXTRA_FLAVOR, data.flavor)
            putExtra(DetailDonutActivity.EXTRA_PRICE, data.price)
            putExtra(DetailDonutActivity.EXTRA_DETAIL, data.detail)
        }
        startActivity(detailDonutActivity)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        R.id.action_list;run {
            val moveIntent = Intent(this@MainActivity, ProfileActivity::class.java)
            moveIntent.putExtra(ProfileActivity.EXTRA_PHOTO, R.drawable.profile)
            moveIntent.putExtra(ProfileActivity.EXTRA_USERNAME, "rmsalsbl_sl")
            moveIntent.putExtra(ProfileActivity.EXTRA_EMAIL, "lalarimasei@gmail.com")
            startActivity(moveIntent)
        }
    }
}