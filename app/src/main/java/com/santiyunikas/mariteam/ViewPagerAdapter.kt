package com.santiyunikas.mariteam

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class ViewPagerAdapter: PagerAdapter{
    private var context: Context
    private lateinit var layoutInflater: LayoutInflater
    private var imageView: Array<Int> = arrayOf(R.drawable.greetings, R.drawable.bussiness, R.drawable.payment)

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    constructor( context: Context) {
        this.context = context
    }

    override fun getCount(): Int {
        return imageView.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = layoutInflater.inflate(R.layout.fragment_screen_slide_page, null)
        val imagePager: ImageView = view.findViewById(R.id.hgImageView)
        imagePager.setImageResource(imageView[position])

        val viewPager: ViewPager = container as ViewPager
        viewPager.addView(view, 0)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp: ViewPager = container as ViewPager
        val view: View = `object` as View
        vp.removeView(view)
    }
}