package com.peculiaruc.alc_mmsystem_mentor.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentRegisterThreeBinding

/**
 * This class is for mentor applicants to provide
 * technical proficiencies and previous
 * roles held while signing up
 */
class SignUpThreeFragment : Fragment() {

    private lateinit var binding: FragmentRegisterThreeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnSignUpTwoNext.setOnClickListener {
            val action =
                SignUpThreeFragmentDirections.actionSignUpThreeFragmentToSignUpFourFragment()
            binding.btnSignUpTwoNext.findNavController().navigate(action)

        }

        binding.btnSignUpTwoPrev.setOnClickListener {
            val action =
                SignUpThreeFragmentDirections.actionSignUpThreeFragmentToSignUpTwoFragment()
            binding.btnSignUpTwoPrev.findNavController().navigate(action)
        }

    }


}