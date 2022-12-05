package com.peculiaruc.alc_mmsystem_mentor.components

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.peculiaruc.alc_mmsystem_mentor.databinding.ShareCustomDialogBinding

/**
 * Share dialog
 *
 * @constructor Create empty Share dialog
 */
class ShareDialog : DialogFragment() {

    private lateinit var binding: ShareCustomDialogBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = ShareCustomDialogBinding.inflate(LayoutInflater.from(context))

        val builder = AlertDialog.Builder(requireActivity())
        builder.setView(binding.root)

        binding.btnOpenEmailDialog .setOnClickListener {
            Toast.makeText(context, "Opening email...", Toast.LENGTH_SHORT).show()
            dismiss()
        }

        val dialog = builder.create()
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        return dialog
    }
}