package com.peculiaruc.alc_mmsystem_mentor.view.fragment

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.LayoutBottomSheetDialogBinding
import com.peculiaruc.alc_mmsystem_mentor.view.activity.RegisterActivity

/**
 * This class creates a bottom sheet that
 * displays success message for a registration
 */
class SignUpBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: LayoutBottomSheetDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LayoutBottomSheetDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = context?.let { BottomSheetDialog(it) }
        dialog?.setOnShowListener {
            val bottomSheetDialog = it as BottomSheetDialog
            val parentLayout =
                bottomSheetDialog.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)
            parentLayout?.let { bottomSheet ->
                val behaviour = BottomSheetBehavior.from(bottomSheet)
                setupFullHeight(bottomSheet)
                behaviour.state = BottomSheetBehavior.STATE_EXPANDED

                behaviour.isDraggable = false
                behaviour.isHideable = false
            }
            bottomSheetDialog.setCancelable(false)


            setPopUpContent()
            binding.btnDismiss.setOnClickListener {
                startActivity(Intent(requireActivity(), RegisterActivity::class.java))
            }

        }

        return dialog ?: super.onCreateDialog(savedInstanceState)
    }

    private fun setupFullHeight(bottomSheet: View) {
        val layoutParams = bottomSheet.layoutParams
        layoutParams.height = 700
        bottomSheet.layoutParams = layoutParams
    }

    private fun setPopUpContent() {
        binding.tvPopUpTitle.text = getText(R.string.registration_success_title)
        binding.tvPopUpMessage.text = getText(R.string.registration_success_message)
        binding.ivPopUpImage.visibility = View.GONE
        binding.btnDismiss.text = getText(R.string.done)
    }
}