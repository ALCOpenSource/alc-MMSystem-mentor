package com.peculiaruc.alc_mmsystem_mentor.components

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.peculiaruc.alc_mmsystem_mentor.databinding.DownloadCustomDialogBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.PostDeleteDialogBinding

/**
 * Post delete dialog
 *
 * @constructor Create empty Post delete dialog
 */
class PostDeleteDialog : DialogFragment() {

    private lateinit var binding: PostDeleteDialogBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = PostDeleteDialogBinding.inflate(LayoutInflater.from(context))

        val builder = AlertDialog.Builder(requireActivity())
        builder.setView(binding.root)

        binding.btnDeletePostDialog.setOnClickListener {
            Toast.makeText(context, "Deleting...", Toast.LENGTH_SHORT).show()
            dismiss()
        }

        val dialog = builder.create()
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        return dialog
    }

}