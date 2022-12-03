package com.peculiaruc.alc_mmsystem_mentor.ui.reports.screens

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentComposeReportProgramBinding
import kotlinx.android.synthetic.main.item_report_dialog.view.*


/**
 * A [Fragment] that displays the mentors report field.
 *
 * It has fields to take in information as regards the programs they supervise
 * and also a button to submit it to the server.
 */
class ComposeReportFragment : Fragment() {
    private var _binding: FragmentComposeReportProgramBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Retrieve and inflate the layout for this fragment
        _binding = FragmentComposeReportProgramBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toolbarCreateTitle.text = getString(R.string.compose_report)
        binding.actionBack.setOnClickListener {
            it.findNavController().navigateUp()
        }

        navListener()
    }

    private fun navListener() {
        binding.cpsChooseTxt.text = getString(R.string.choose_report)
        binding.programTxt.text = getString(R.string.program)
        binding.taskTxt.text = getString(R.string.task)
        binding.btnProgramField.text = getString(R.string.select_program)
        binding.btnComposeField.text = getString(R.string.submit_report)

        /**
         * Navigates from the compose report screen to the submitted form dialog.
         */
        binding.btnComposeField.setOnClickListener {
            showReportSubmittedSuccessDialog()
        }

        binding.taskTxt.setOnClickListener {
            val action = ComposeReportFragmentDirections.actionComposeReportFragmentToComposeReportTasksFragment()
            binding.taskTxt.findNavController().navigate(action)
        }

        binding.btnProgramField.setOnClickListener {
            val action = ComposeReportFragmentDirections.actionComposeReportFragmentToSelectProgramFragment()
            binding.btnProgramField.findNavController().navigate(action)
        }
    }

    /**
     * Frees the binding object when the Fragment is destroyed.
     */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun showReportSubmittedSuccessDialog() {
        context?.let {
            Dialog(it, android.R.style.Theme_Translucent).also { dialog ->
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
                val sheetView = View.inflate(context, R.layout.item_report_dialog, null)

                sheetView.reportTitle.setText(R.string.report_submitted)
                sheetView.btn_report_field.setText(R.string.done)
                sheetView.btn_report_field.setOnClickListener {
                    dialog.dismiss()
                }

                dialog.setContentView(sheetView)
                dialog.show()
                dialog.setCanceledOnTouchOutside(true)
            }

        }

    }
}