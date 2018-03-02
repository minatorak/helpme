package com.example.yossatron.myapplication1

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [BlankFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {
    lateinit var btn1 : Button

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_blank, container, false)
        btn1 = view.findViewById(R.id.kador)
        btn1.setOnClickListener {
            getMainactivity().changeFragment(BlankFragment2.newinstance())
        }

        return view
    }
    companion object {
        fun newinstance():Fragment{
            val bundle = Bundle()
            val fragment = BlankFragment()
            fragment.arguments = bundle
            return fragment
        }
    }
    fun getMainactivity():MainActivity{
        return activity as MainActivity
    }
}