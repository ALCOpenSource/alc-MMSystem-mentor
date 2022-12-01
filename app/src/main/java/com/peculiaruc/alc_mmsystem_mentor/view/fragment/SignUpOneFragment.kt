package com.peculiaruc.alc_mmsystem_mentor.view.fragment

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentRegisterOneBinding
import java.io.FileDescriptor
import java.io.IOException


class SignUpOneFragment : Fragment() {

    private lateinit var binding: FragmentRegisterOneBinding

    private var imageUri: Uri? = null
    private val resultLoadImage = 123


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterOneBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnRegisterOneNext.setOnClickListener {
            val action = SignUpOneFragmentDirections.actionSignUpOneFragmentToSignUpTwoFragment()
            binding.btnRegisterOneNext.findNavController().navigate(action)

        }

        binding.imgPickBtn.setOnClickListener {
            val galleryIntent =
                Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(galleryIntent, resultLoadImage)
        }

        populateCountrySpinner()
        populateCitySpinner()

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == resultLoadImage && resultCode == Activity.RESULT_OK && data != null) {
            imageUri = data.data
            //imageView.setIimageUri(imageUri);
            val bitmap = uriToBitmap(imageUri!!)
            binding.imageView.setImageBitmap(bitmap)
        }
    }

    private fun uriToBitmap(selectedFileUri: Uri): Bitmap? {
        try {
            val parcelFileDescriptor =
                requireContext().contentResolver.openFileDescriptor(selectedFileUri, "r")
            val fileDescriptor: FileDescriptor = parcelFileDescriptor!!.fileDescriptor
            val image = BitmapFactory.decodeFileDescriptor(fileDescriptor)
            parcelFileDescriptor.close()
            return image
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return null
    }

    private fun populateCountrySpinner() {

        ArrayAdapter.createFromResource(
            requireActivity(),
            R.array.country_list,
            android.R.layout.simple_spinner_item
        ).also { adapter ->

            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            val countrySpinner: AutoCompleteTextView =
                binding.countryRegSp
            countrySpinner.setAdapter(adapter)
        }
    }

    private fun populateCitySpinner() {

        ArrayAdapter.createFromResource(
            requireActivity(),
            R.array.city_list,
            android.R.layout.simple_spinner_item
        ).also { adapter ->

            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            val citySpinner: AutoCompleteTextView =
                binding.cityRegSp
            citySpinner.setAdapter(adapter)
        }
    }

}