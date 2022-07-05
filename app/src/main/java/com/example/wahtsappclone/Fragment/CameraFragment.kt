package com.example.wahtsappclone.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.wahtsappclone.databinding.FragmentCameraBinding

class CameraFragment : Fragment() {

    private var binding: FragmentCameraBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCameraBinding.inflate(inflater,container,false)
        return binding?.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}