package com.peculiaruc.alc_mmsystem_mentor.components

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.peculiaruc.alc_mmsystem_mentor.databinding.PostSaveDialogBinding

/**
 * Post update dialog
 *
 * @constructor Create empty Post update dialog
 */
class PostUpdateDialog : DialogFragment() {

    private lateinit var binding: PostSaveDialogBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = PostSaveDialogBinding.inflate(LayoutInflater.from(context))

        val builder = AlertDialog.Builder(requireActivity())
        builder.setView(binding.root)

        binding.btnUpdateDialog.setOnClickListener {
            Toast.makeText(context, "Updated...", Toast.LENGTH_SHORT).show()
            dismiss()
        }

        val dialog = builder.create()
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        return dialog
    }

}