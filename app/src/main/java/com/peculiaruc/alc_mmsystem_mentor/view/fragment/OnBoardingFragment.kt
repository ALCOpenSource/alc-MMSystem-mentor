package com.peculiaruc.alc_mmsystem_mentor.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentOnBoardingBinding

/**
 * This class defines the OnBoarding Process
 */
class OnBoardingFragment : Fragment() {

    companion object {
        private const val ARG_POSITION = "ARG_POSITION"


        /**
         * Gets instance of the and [OnBoardingFragment] to the view pager adapter
         */
        fun getInstance(position: Int) = OnBoardingFragment().apply {
            arguments = bundleOf(ARG_POSITION to position)
        }
    }

    private lateinit var binding: FragmentOnBoardingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val position = requireArguments().getInt(ARG_POSITION)
        val onBoardingTexts = requireContext().resources.getStringArray(R.array.on_boarding_texts)
        val onBoardingImages = getOnBoardAssetsLocation()
        with(binding) {
            ivOnBoardingImg.setImageResource(onBoardingImages[position])
            tvOnBoardingTitle.text = onBoardingTexts[position]
        }

    }

    private fun getOnBoardAssetsLocation(): List<Int> {
        val onBoardAssets: MutableList<Int> = ArrayList()
        onBoardAssets.add(R.drawable.img_on_boarding_one)
        onBoardAssets.add(R.drawable.img_on_boarding_two)
        onBoardAssets.add(R.drawable.img_on_boarding_three)

        return onBoardAssets

    }

}