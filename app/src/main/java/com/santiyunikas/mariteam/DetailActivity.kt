package com.santiyunikas.mariteam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toolbar

class DetailActivity : AppCompatActivity() {

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

    private lateinit var imgDetail:ImageView
    private lateinit var tvTitleDetail: TextView
    private lateinit var tvPriceDetail: TextView
    private lateinit var tvSendfromDetail: TextView
    private lateinit var tvStoreDetail: TextView
    private lateinit var tvWeightDetail: TextView
    private lateinit var tvConditionDetail: TextView
    private lateinit var tvMinorderDetail: TextView
    private lateinit var tvPreordertimeDetail: TextView
    private lateinit var tvCategoryDetail: TextView
    private lateinit var tvDescDetail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        imgDetail = findViewById(R.id.img_detail)
        tvTitleDetail= findViewById(R.id.tv_title_detail)
        tvPriceDetail = findViewById(R.id.tv_price_detail)
        tvSendfromDetail = findViewById(R.id.tv_sendFrom_detail)
        tvStoreDetail = findViewById(R.id.tv_store_detail)
        tvWeightDetail = findViewById(R.id.tv_weight_detail)
        tvConditionDetail = findViewById(R.id.tv_condition_detail)
        tvMinorderDetail = findViewById(R.id.tv_minorder_detail)
        tvPreordertimeDetail = findViewById(R.id.tv_preordertime_detail)
        tvCategoryDetail= findViewById(R.id.tv_category_detail)
        tvDescDetail= findViewById(R.id.tv_desc_detail)

        toolbarSet()
        getExtra()
    }

    fun toolbarSet(){
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setActionBar(toolbar)
        actionBar?.setDisplayShowTitleEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setTitle("Detail Produk")
        actionBar?.setLogo(R.drawable.logo)
        toolbar.inflateMenu(R.menu.about_menu)
        toolbar.setBackgroundColor(resources.getColor(R.color.colorPrimaryDark))
        toolbar.setTitleTextColor(resources.getColor(R.color.white))
        toolbar.setNavigationOnClickListener {
            finish()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.about ->{
                val intent: Intent = Intent(this@DetailActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }


    fun getExtra(){
        val imgExtra = intent.getIntExtra(EXTRA_IMAGEDETAIL,0)
        val titleExtra = intent.getStringExtra(EXTRA_TITLE)
        val priceExtra = intent.getStringExtra(EXTRA_PRICE)
        val sendFromExtra = intent.getStringExtra(EXTRA_SENDFROM)
        val storeExtra = intent.getStringExtra(EXTRA_STORE)
        val weightExtra = intent.getStringExtra(EXTRA_WEIGHT)
        val conditionExtra = intent.getStringExtra(EXTRA_CONDITION)
        val minOrderExtra = intent.getStringExtra(EXTRA_MINORDER)
        val preOrderExtra = intent.getStringExtra(EXTRA_PREORDERTIME)
        val categoryExtra = intent.getStringExtra(EXTRA_CATEGORY)
        val descExtra = intent.getStringExtra(EXTRA_DESC)

        imgDetail.setImageResource(imgExtra)
        tvTitleDetail.text = titleExtra
        tvSendfromDetail.text = sendFromExtra
        tvStoreDetail.text = storeExtra
        tvWeightDetail.text = weightExtra
        tvConditionDetail.text = conditionExtra
        tvMinorderDetail.text = minOrderExtra
        tvPreordertimeDetail.text = preOrderExtra
        tvCategoryDetail.text = categoryExtra
        tvDescDetail.text = descExtra
        tvPriceDetail.text = priceExtra
    }

}
