package com.jesse.kledingnator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Vraag2.newInstance] factory method to
 * create an instance of this fragment.
 */
class Vraag2 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_vraag2, container, false)
        var kledingstuk_ant = arguments?.getString("kledingstuk_ant")
        var Vraag1_ant = arguments?.getString("Vraag1_ant")

        view.findViewById<TextView>(R.id.txt_keuze_kledingstuk).text = kledingstuk_ant
        view.findViewById<TextView>(R.id.txt_vraag1_ant).text = Vraag1_ant
        return view
    }
}