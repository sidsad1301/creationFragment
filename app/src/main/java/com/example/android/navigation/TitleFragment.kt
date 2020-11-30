package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflater fragment par DataBindingUtil
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(
                inflater,  // LayoutInflater used to inflate the binding layout
                R.layout.fragment_title,  // ayout resource ID of the layout to inflate
                container,   //set of LayoutParams values for root car attachToParent=false
                false  // If hierarchy should be attached to the parent parameter
        )

        binding.playButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        }

        return binding.root
     /*  dans main_activity
             android:name="com.example.android.navigation.TitleFragment"
            est maintenant remplacé par le graphe de navigation
             android:name="androidx.navigation.fragment.NavHostFragment"
             qui pointe TitelFragment comme départ de la navigation
      */
    }

}