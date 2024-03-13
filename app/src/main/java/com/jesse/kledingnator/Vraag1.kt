package com.jesse.kledingnator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.Navigation

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Vraag1.newInstance] factory method to
 * create an instance of this fragment.
 */
class Vraag1 : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_vraag1, container, false)

        val ant_kledingstuk = arguments?.getString("ant_kledingstuk")

        view.findViewById<Button>(R.id.btn_Vraag1_ja).setOnClickListener {
            val ant_vragen = bundleOf("ant_kledingstuk" to ant_kledingstuk)
            Navigation.findNavController(view).navigate(R.id.action_Vraag1_to_Vraag2, ant_vragen)
        }

        view.findViewById<Button>(R.id.btn_Vraag1_WeetIkNiet).setOnClickListener {
            val ant_vragen = bundleOf("ant_kledingstuk" to ant_kledingstuk)
            Navigation.findNavController(view).navigate(R.id.action_Vraag1_to_Vraag2, ant_vragen)
        }

        view.findViewById<Button>(R.id.btn_Vraag1_nee).setOnClickListener {
            val ant_vragen = bundleOf("ant_kledingstuk" to ant_kledingstuk)
            Navigation.findNavController(view).navigate(R.id.action_Vraag1_to_Vraag2, ant_vragen)
        }
        return view
    }
}