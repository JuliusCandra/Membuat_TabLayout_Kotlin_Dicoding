package com.dev_candra.tablayoutactivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_home.*


class FragmentHome : Fragment(){

//    companion object {
//        private const val ARG_SECTION_NUMBER = "section_number"
//
//        fun newInstance(index: Int):FragmentHome {
//            // Kode yang digunakan untuk menginisasi fragment
//            val fragment = FragmentHome()
//
//            // Kode yang digunakan untuk menginisiasi bundle
//            val bundle = Bundle()
//
//            // Mengirim data menggunakan bundle
//            bundle.putInt(ARG_SECTION_NUMBER,index)
//
//            // Kode ini digunakan untuk mengirim data berupa bundle
//            fragment.arguments = bundle
//            return fragment
//        }
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.fragment_home,container,false)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        // Digunakan untuk mendapatkan data bundle tersebut
//        var index = 1
//        if (arguments != null){
//            index = arguments?.getInt(ARG_SECTION_NUMBER,0) as Int
//        }
//
//        val textView : TextView = view.findViewById(R.id.text1)
//        textView.text = "${getString(R.string.content_tab_text)}$index"
//
//    }

    companion object{
        private const val bandal = "section_number"
        fun newInstance(index : Int): Fragment{
            val fragment = FragmentHome()

            val bundle = Bundle()
            bundle.putInt(bandal,index)

            fragment.arguments = bundle
            return fragment
        }

    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var index = 1

        if (arguments != null){
             index = arguments?.getInt(bandal,0) as Int
        }
        text1.text = "${"this is tab"}$index"

    }


}