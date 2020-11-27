package com.dev_candra.tablayoutactivity

import android.content.Context
import androidx.annotation.Nullable
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

//// Kelas yang digunakan untuk mengatur view pager dan komponennya
//
//// Fungsi dari BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT supaya hanya fragment yang ditampilkn
//// saja yang akan masuk ke lifecycle RESUMED sedangkan yang laennya masuk ke STARTED
//class SectionPagerAdapter(private  val mContext : Context, fm : FragmentManager ) : FragmentPagerAdapter(fm,
//    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
//
//    @StringRes
//    private val tabTittle = intArrayOf(
//        R.string.nama_saya,
//        R.string.tab_text2,
//        R.string.tab_text3
//    )
//
//
//    // digunakan untuk menampilkan fragment sesuai dengan posisi tabnya
//    override fun getItem(position: Int): Fragment {
//        // Membuat dua fragment dengan tampilan yang berbeda
////      var fragment : Fragment? = null
////        when(position){
////            0 -> fragment = FragmentHome()
////            1 -> fragment = FragmentProfile()
////        }
////        return fragment as Fragment
//
//        // Membuat dua tampilan yang mirip
//        // Kode ini digunakan untuk mengirim data posisi
//        return FragmentHome.newInstance(position + 1)
//    }
//    // Fungsi ini digunakan untuk memberikan judul pada masing masing tab
//    @Nullable
//    override fun getPageTitle(position: Int): CharSequence? {
//        return mContext.resources.getString(tabTittle[position])
//    }
//
//    // Fungsi ini digunakan untuk menentukan jumlah tab yang ingin ditampilkan
//    override fun getCount(): Int {
//        return 3
//    }

//}
class SectionPagerAdapter(private val context : Context,fm : FragmentManager) : FragmentPagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val tabTittle = intArrayOf(
        R.string.nama_saya,
        R.string.tab_text2,
        R.string.tab_text3
    )

    override fun getItem(position: Int): Fragment {
//        var fragment: Fragment? = null
//        when(position){
//            0 -> fragment = FragmentHome()
//            1 -> fragment = FragmentProfile()
//        }

       return FragmentHome.newInstance(position + 1)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(tabTittle[position])
    }

    override fun getCount(): Int {
        return 3
    }
}

