package com.example.navigationproject.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationproject.R
import com.example.navigationproject.databinding.FragmentHomeBinding
import com.example.navigationproject.ui.data.User


class HomeFragment : Fragment() {

   private lateinit  var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setuplistener()
    }

    private fun setuplistener() {
        binding.btn.setOnClickListener {

            findNavController()
                .navigate(HomeFragmentDirections.actionHomeFragmentToSecondFragment(
                    User(name = binding.editName.text.toString(),
                        email = binding.editEmail.text.toString(),
                        password = binding.editPassword.text.toString())
                ))
        }
    }


}