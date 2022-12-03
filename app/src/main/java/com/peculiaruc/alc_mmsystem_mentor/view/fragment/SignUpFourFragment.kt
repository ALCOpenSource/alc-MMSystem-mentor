package com.peculiaruc.alc_mmsystem_mentor.view.fragment

import android.annotation.SuppressLint
import android.app.Activity.RESULT_OK
import android.content.Intent
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.provider.OpenableColumns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentRegisterFourBinding


/**
 * This class is for mentor applicants to upload
 * documents and provide social links
 */
class SignUpFourFragment : Fragment() {


    private lateinit var binding: FragmentRegisterFourBinding

    private lateinit var pdfUri: Uri


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterFourBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnSignUpTwoNext.setOnClickListener {
            val action =
                SignUpFourFragmentDirections.actionSignUpFourFragmentToNotificationFragment()
            binding.btnSignUpTwoNext.findNavController().navigate(action)

        }

        binding.btnSignUpTwoPrev.setOnClickListener {
            val action =
                SignUpFourFragmentDirections.actionSignUpFourFragmentToSignUpThreeFragment()
            binding.btnSignUpTwoPrev.findNavController().navigate(action)
        }

        binding.chooseDocOne.setOnClickListener {
            selectPdf()
        }
    }

    // Intent for opening files
    private fun selectPdf() {
        val pdfIntent = Intent(Intent.ACTION_GET_CONTENT)
        pdfIntent.type = "application/pdf"
        pdfIntent.addCategory(Intent.CATEGORY_OPENABLE)
        startActivityForResult(pdfIntent, 12)
    }

    @SuppressLint("Range")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // For loading PDF
        when (requestCode) {
            12 -> if (resultCode == RESULT_OK) {

                getFile(data)

            }
        }
    }

    @SuppressLint("Range")
    // This function gets the file from device storage
    private fun getFile(data: Intent?) {
        pdfUri = data?.data!!
        val uri: Uri = data.data!!
        val uriString: String = uri.toString()
        var pdfName: String? = null
        if (uriString.startsWith("content://")) {
            var myCursor: Cursor? = null
            try {
                myCursor =
                    requireActivity().contentResolver.query(uri, null, null, null, null)
                if (myCursor != null && myCursor.moveToFirst()) {
                    pdfName =
                        myCursor.getString(myCursor.getColumnIndex(OpenableColumns.DISPLAY_NAME))
                    binding.selectedDocOne.text = pdfName
                }
            } finally {
                myCursor?.close()
            }
        }
    }


}