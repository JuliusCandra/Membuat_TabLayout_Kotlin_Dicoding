package com.dev_candra.tablayoutactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initToolbar()
    }

//    private fun initToolbar(){
//        val candra = "Candra Julius Sinaga"
//        supportActionBar?.title = candra
//        supportActionBar?.subtitle = "TabLayout"
//    }

//    private fun initPagerAdapter(){
//        // Kode ini digunakan untuk menghubungkan sectionpager dengan main utama
//        val pagerAdapter = SectionPagerAdapter(this,supportFragmentManager)
//
//        // Kode yang digunakan untuk memasukkan adapter ke view pager
//        view_pager.adapter = pagerAdapter
//
//        // Untuk menghubungkan tablayout dengan ViewPager
//        tabs.setupWithViewPager(view_pager)
//
//        supportActionBar?.elevation = 0f
//    }


    private fun initToolbar(){
        supportActionBar?.title = "Candra Julius Sinaga"
        supportActionBar?.subtitle = "TabLayout"
        getPageAdapter()
    }

    private fun getPageAdapter(){
        val adapter = SectionPagerAdapter(this,supportFragmentManager)
        view_pager.adapter = adapter
        tabs.setupWithViewPager(view_pager)

        supportActionBar?.elevation = 0f
    }

}