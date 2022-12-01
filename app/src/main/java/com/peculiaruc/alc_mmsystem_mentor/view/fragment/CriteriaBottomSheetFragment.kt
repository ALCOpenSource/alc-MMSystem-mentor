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
import com.peculiaruc.alc_mmsystem_mentor.databinding.LayoutCriteriaBottomSheetDialogBinding
import com.peculiaruc.alc_mmsystem_mentor.view.activity.ProgramDetailActivity


class CriteriaBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: LayoutCriteriaBottomSheetDialogBinding

    companion object {

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LayoutCriteriaBottomSheetDialogBinding.inflate(inflater, container, false)
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
            binding.btnCriteriaDone.setOnClickListener {
                startActivity(Intent(requireActivity(), ProgramDetailActivity::class.java))
                requireActivity().finish()
            }
        }


        return dialog ?: super.onCreateDialog(savedInstanceState)
    }

    private fun setupFullHeight(bottomSheet: View) {
        val layoutParams = bottomSheet.layoutParams
        layoutParams.height = 700
        bottomSheet.layoutParams = layoutParams
    }
}