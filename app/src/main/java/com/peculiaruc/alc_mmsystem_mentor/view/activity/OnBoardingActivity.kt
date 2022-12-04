package com.peculiaruc.alc_mmsystem_mentor.view.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.viewpager2.widget.ViewPager2
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.ActivityOnBoardingBinding
import com.peculiaruc.alc_mmsystem_mentor.view.adapter.OnBoardingAdapter


/**
 * This class defines the OnBoarding process
 */
class OnBoardingActivity : AppCompatActivity() {


    private var onBoardingPageChangeCallback = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            updateCircleMarker(position)
            clickToJumpToPage(position)
        }
    }


    private lateinit var binding: ActivityOnBoardingBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val numberOfScreens = resources.getStringArray(R.array.on_boarding_texts).size

        val onBoardingAdapter = OnBoardingAdapter(this, numberOfScreens)
        binding.onBoardingViewPager.adapter = onBoardingAdapter
        binding.onBoardingViewPager.registerOnPageChangeCallback(onBoardingPageChangeCallback)

    }


    private fun updateCircleMarker(position: Int) {
        when (position) {
            0 -> {

                binding.ivFirstCircle.background =
                    AppCompatResources.getDrawable(this, R.drawable.comp_view_circle_blue)
                binding.ivSecondCircle.background =
                    AppCompatResources.getDrawable(this, R.drawable.comp_view_circle_gray)
                binding.ivThirdCircle.background =
                    AppCompatResources.getDrawable(this, R.drawable.comp_view_circle_gray)
                binding.btnOnBoardingPrev.visibility = View.GONE
            }

            1 -> {
                binding.ivFirstCircle.background =
                    AppCompatResources.getDrawable(this, R.drawable.comp_view_circle_gray)
                binding.ivSecondCircle.background =
                    AppCompatResources.getDrawable(this, R.drawable.comp_view_circle_blue)
                binding.ivThirdCircle.background =
                    AppCompatResources.getDrawable(this, R.drawable.comp_view_circle_gray)
                binding.btnOnBoardingPrev.visibility = View.VISIBLE
            }

            2 -> {
                binding.ivFirstCircle.background =
                    AppCompatResources.getDrawable(this, R.drawable.comp_view_circle_gray)
                binding.ivSecondCircle.background =
                    AppCompatResources.getDrawable(this, R.drawable.comp_view_circle_gray)
                binding.ivThirdCircle.background =
                    AppCompatResources.getDrawable(this, R.drawable.comp_view_circle_blue)

                binding.btnOnBoardingPrev.visibility = View.VISIBLE
            }

        }
    }


    override fun onDestroy() {
        binding.onBoardingViewPager.unregisterOnPageChangeCallback(onBoardingPageChangeCallback)
        super.onDestroy()
    }


    private fun clickToJumpToPage(position: Int) {

        when (position) {
            0 -> {

                binding.btnOnBoardingNext.setOnClickListener {
                    binding.onBoardingViewPager.setCurrentItem(
                        binding.onBoardingViewPager.currentItem + 1,
                        true
                    )
                }

            }

            1 -> {

                binding.btnOnBoardingNext.setOnClickListener {
                    binding.onBoardingViewPager.setCurrentItem(
                        binding.onBoardingViewPager.currentItem + 1,
                        true
                    )
                }

                binding.btnOnBoardingPrev.setOnClickListener {
                    binding.onBoardingViewPager.setCurrentItem(
                        binding.onBoardingViewPager.currentItem + -1,
                        true
                    )
                }

            }

            2 -> {

                binding.btnOnBoardingNext.setOnClickListener {
                    startActivity(Intent(this, LogInActivity::class.java))
                    finish()
                }


                binding.btnOnBoardingPrev.setOnClickListener {
                    binding.onBoardingViewPager.setCurrentItem(
                        binding.onBoardingViewPager.currentItem + -1,
                        true
                    )
                }
            }


        }
    }

}