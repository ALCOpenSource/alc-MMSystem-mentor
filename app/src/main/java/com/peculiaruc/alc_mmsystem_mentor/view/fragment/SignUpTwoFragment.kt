package com.peculiaruc.alc_mmsystem_mentor.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentRegisterTwoBinding

class SignUpTwoFragment : Fragment() {
    private lateinit var binding: FragmentRegisterTwoBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnSignUpTwoNext.setOnClickListener {
            val action = SignUpTwoFragmentDirections.actionSignUpTwoFragmentToSignUpThreeFragment()
            binding.btnSignUpTwoNext.findNavController().navigate(action)

        }

        binding.btnSignUpTwoPrev.setOnClickListener {
            val action = SignUpTwoFragmentDirections.actionSignUpTwoFragmentToSignUpOneFragment()
            binding.btnSignUpTwoPrev.findNavController().navigate(action)
        }

    }

}