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
 * Use the [KeuzeKledingstuk.newInstance] factory method to
 * create an instance of this fragment.
 */
class KeuzeKledingstuk : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_keuze_kledingstuk, container, false)

        view.findViewById<Button>(R.id.btn_keuze_broek).setOnClickListener {
            val kledingstuk = "Broek"
            val ant_vragen = bundleOf("ant_kledingstuk" to kledingstuk)
            Navigation.findNavController(view).navigate(R.id.action_keuzeKledingstuk_to_vraag1, ant_vragen)
        }

        view.findViewById<Button>(R.id.btn_keuze_sokken).setOnClickListener {
            val kledingstuk = "Sokken"
            val ant_vragen = bundleOf("ant_kledingstuk" to kledingstuk)
            Navigation.findNavController(view).navigate(R.id.action_keuzeKledingstuk_to_vraag1, ant_vragen)
        }

        view.findViewById<Button>(R.id.home).setOnClickListener {
            val kledingstuk = "Vest"
            val ant_vragen = bundleOf("ant_kledingstuk" to kledingstuk)
            Navigation.findNavController(view).navigate(R.id.action_keuzeKledingstuk_to_vraag1, ant_vragen)
        }
        return view
    }
}