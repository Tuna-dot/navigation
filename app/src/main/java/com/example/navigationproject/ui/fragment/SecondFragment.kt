package com.example.navigationproject.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.navigationproject.R
import com.example.navigationproject.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    var binding: FragmentSecondBinding? = null
    val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        binding!!.txtEmail.text = args.user.email
        binding!!.txtName.text = args.user.name
        binding!!.txtPassword.text = args.user.password
    }


}