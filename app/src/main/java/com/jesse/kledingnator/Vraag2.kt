package com.jesse.kledingnator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

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


override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {
    // Inflate the layout for this fragment
    val view = inflater.inflate(R.layout.fragment_vraag2, container, false)

    view.findViewById<Button>(R.id.btn_voorkant).setOnClickListener {
        Navigation.findNavController(view).navigate(R.id.action_Vraag2_to_vraag3)
    }

    view.findViewById<Button>(R.id.btn_achterkant).setOnClickListener {
        Navigation.findNavController(view).navigate(R.id.action_Vraag2_to_vraag3)
    }

    view.findViewById<Button>(R.id.btn_geenprint).setOnClickListener {
        Navigation.findNavController(view).navigate(R.id.action_Vraag2_to_vraag3)
    }
    return view
}
}