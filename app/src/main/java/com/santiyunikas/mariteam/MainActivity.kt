package com.santiyunikas.mariteam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity(){
    private var EXTRA_IMAGEDETAIL = "extra_imagedetail"
    private var EXTRA_TITLE = "extra_title"
    private var EXTRA_PRICE = "extra_price"
    private var EXTRA_SENDFROM = "extra_sendfrom"
    private var EXTRA_STORE = "extra_store"
    private var EXTRA_WEIGHT = "extra_weight"
    private var EXTRA_CONDITION = "extra_condition"
    private var EXTRA_MINORDER = "extra_minorder"
    private var EXTRA_PREORDERTIME = "extra_preordertime"
    private var EXTRA_CATEGORY = "extra_category"
    private var EXTRA_DESC = "extra_desc"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerViewSet()
        highlightSet()
        toolbarSet()
    }

    fun recyclerViewSet(){
        val rvFish: RecyclerView = findViewById(R.id.rv_fish)
        val rvSeaFish: RecyclerView = findViewById(R.id.rv_sea_fish)
        val rvRiverFish: RecyclerView = findViewById(R.id.rv_river_fish)
        val listFrozen: ArrayList<Fish> = arrayListOf()
        val listSeaFish: ArrayList<Fish> = arrayListOf()
        val listRiverFish: ArrayList<Fish> = arrayListOf()
        rvFish.setHasFixedSize(true)
        FishData.listData.forEach(){
            if (it.category=="Frozen Food"){
                listFrozen.add(it)
            }else if (it.category=="Ikan Air Tawar"){
                listRiverFish.add(it)
            }else{
                listSeaFish.add(it)
            }
        }

        rvFish.layoutManager = LinearLayoutManager(this)
        val listFishAdapter = ListFishAdapter(listFrozen)
        rvFish.adapter = listFishAdapter

        rvSeaFish.layoutManager = LinearLayoutManager(this)
        val listSeaFishAdapter = ListFishAdapter(listSeaFish)
        rvSeaFish.adapter = listSeaFishAdapter

        rvRiverFish.layoutManager = LinearLayoutManager(this)
        val listRiverFishAdapter = ListFishAdapter(listRiverFish)
        rvRiverFish.adapter = listRiverFishAdapter

        listFishAdapter.setOnItemClickCallback(object: ListFishAdapter.OnItemClickCallBack{
            override fun onItemClicked(data: Fish) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra(EXTRA_CATEGORY, data.category)
                intent.putExtra(EXTRA_CONDITION, data.condition)
                intent.putExtra(EXTRA_DESC, data.description)
                intent.putExtra(EXTRA_IMAGEDETAIL, data.imgProduct)
                intent.putExtra(EXTRA_MINORDER, data.minPurchase)
                intent.putExtra(EXTRA_PREORDERTIME, data.preorderTime)
                intent.putExtra(EXTRA_PRICE, data.price)
                intent.putExtra(EXTRA_TITLE, data.title)
                intent.putExtra(EXTRA_SENDFROM, data.sendFrom)
                intent.putExtra(EXTRA_STORE, data.sellerName)
                intent.putExtra(EXTRA_WEIGHT, data.weight)
                startActivity(intent)
            }
        })

        listSeaFishAdapter.setOnItemClickCallback(object: ListFishAdapter.OnItemClickCallBack{
            override fun onItemClicked(data: Fish) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra(EXTRA_CATEGORY, data.category)
                intent.putExtra(EXTRA_CONDITION, data.condition)
                intent.putExtra(EXTRA_DESC, data.description)
                intent.putExtra(EXTRA_IMAGEDETAIL, data.imgProduct)
                intent.putExtra(EXTRA_MINORDER, data.minPurchase)
                intent.putExtra(EXTRA_PREORDERTIME, data.preorderTime)
                intent.putExtra(EXTRA_PRICE, data.price)
                intent.putExtra(EXTRA_TITLE, data.title)
                intent.putExtra(EXTRA_SENDFROM, data.sendFrom)
                intent.putExtra(EXTRA_STORE, data.sellerName)
                intent.putExtra(EXTRA_WEIGHT, data.weight)
                startActivity(intent)
            }
        })

        listRiverFishAdapter.setOnItemClickCallback(object: ListFishAdapter.OnItemClickCallBack{
            override fun onItemClicked(data: Fish) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra(EXTRA_CATEGORY, data.category)
                intent.putExtra(EXTRA_CONDITION, data.condition)
                intent.putExtra(EXTRA_DESC, data.description)
                intent.putExtra(EXTRA_IMAGEDETAIL, data.imgProduct)
                intent.putExtra(EXTRA_MINORDER, data.minPurchase)
                intent.putExtra(EXTRA_PREORDERTIME, data.preorderTime)
                intent.putExtra(EXTRA_PRICE, data.price)
                intent.putExtra(EXTRA_TITLE, data.title)
                intent.putExtra(EXTRA_SENDFROM, data.sendFrom)
                intent.putExtra(EXTRA_STORE, data.sellerName)
                intent.putExtra(EXTRA_WEIGHT, data.weight)
                startActivity(intent)
            }
        })
    }

    fun highlightSet(){
        val highlight: ViewPager = findViewById(R.id.pager) as ViewPager
        val highlightAdapter = ViewPagerAdapter(this)
        highlight.adapter = highlightAdapter

        val tabDots: TabLayout = findViewById(R.id.tab_dots) as TabLayout
        tabDots.setupWithViewPager(highlight)
    }

    fun toolbarSet(){
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setActionBar(toolbar)
        actionBar?.setDisplayShowTitleEnabled(true)
        actionBar?.setTitle("Beranda")
        actionBar?.setLogo(R.drawable.logo)
        toolbar.inflateMenu(R.menu.about_menu)
        toolbar.setBackgroundColor(resources.getColor(R.color.colorPrimaryDark))
        toolbar.setTitleTextColor(resources.getColor(R.color.white))
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.about ->{
                val intent: Intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}

