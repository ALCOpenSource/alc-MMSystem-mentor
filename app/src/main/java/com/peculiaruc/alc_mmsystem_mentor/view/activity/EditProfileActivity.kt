package com.peculiaruc.alc_mmsystem_mentor.view.activity

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.ActivityApplicantEditProfileBinding
import java.io.FileDescriptor
import java.io.IOException


/**
 * This class is for updating profile
 */
class EditProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityApplicantEditProfileBinding
    private var imageUri: Uri? = null
    private val resultLoadImage = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_applicant_edit_profile)

        binding = ActivityApplicantEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backArrow.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        binding.btnLogout.setOnClickListener {
            startActivity(Intent(this, LogInActivity::class.java))
        }

        binding.editProfileSaveButton.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        binding.chooseDocOne.setOnClickListener {
            selectPdf()
        }

        binding.imgPickBtn.setOnClickListener {
            val galleryIntent =
                Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(galleryIntent, resultLoadImage)
        }

        populateCountrySpinner()
        populateCitySpinner()


    }


    private fun selectPdf() {
        val pdfIntent = Intent(Intent.ACTION_GET_CONTENT)
        pdfIntent.type = "application/pdf"
        pdfIntent.addCategory(Intent.CATEGORY_OPENABLE)
        startActivityForResult(pdfIntent, 12)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // For loading IMAGE
        when (requestCode) {

            resultLoadImage -> if (requestCode == resultLoadImage && resultCode == Activity.RESULT_OK && data != null) {
                imageUri = data.data
                //imageView.setImageURI(imageUri);
                val bitmap = uriToBitmap(imageUri!!)
                binding.imageView.setImageBitmap(bitmap)
            }
        }

    }


    private fun uriToBitmap(selectedFileUri: Uri): Bitmap? {
        try {
            val parcelFileDescriptor =
                contentResolver.openFileDescriptor(selectedFileUri, "r")
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
            this,
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
            this,
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
