package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
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
        return binding.root
     /*   attacher le fragment à activity_main.xml en insérant:
        <fragment
        android:id="@+id/titleFragment"
        android:name="com.example.android.navigation.TitleFragment"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        />
      */
    }

}