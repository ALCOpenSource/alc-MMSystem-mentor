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
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentMentorReportDetailsBinding
import kotlinx.android.synthetic.main.item_report_download.view.*
import kotlinx.android.synthetic.main.share_report_dialog.view.*

/**
 * A [Fragment] that displays the details of the mentors report.
 *
 * It has the major achievement column, the major blocker column
 * and also a share and download button to share the information or download it as a pdf.
 */
class MentorReportDetailsFragment : Fragment() {

    private var _binding: FragmentMentorReportDetailsBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Retrieve and inflate the layout for this fragment
        _binding = FragmentMentorReportDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navListener()
    }

    private fun navListener() {
        binding.btnShareField.text = getString(R.string.share)
        binding.btnDownloadField.text = getString(R.string.download)

        binding.btnDownloadField.setOnClickListener {
            showSubmittedSuccessDialog()
        }
        binding.btnShareField.setOnClickListener {
            showShareDialog()
        }
        binding.actionBack.setOnClickListener {
            it.findNavController().navigateUp()
        }
    }


    private fun showSubmittedSuccessDialog() {
        context?.let {
            Dialog(it, android.R.style.Theme_Translucent).also { dialog ->
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
                val sheetView = View.inflate(context, R.layout.item_report_download,  null)

                sheetView.tvTitle.setText(R.string.report_downloaded)
                sheetView.btn_download_dialog_field.setText(R.string.done)
                sheetView.btn_download_dialog_field.setOnClickListener {
                    dialog.dismiss()
                }

                dialog.setContentView(sheetView)
                dialog.show()
                dialog.setCanceledOnTouchOutside(true)
            }

        }

    }


    private fun showShareDialog() {
        context?.let {
            Dialog(it, android.R.style.Theme_Translucent).also { dialog ->
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
                val sheetView = View.inflate(context, R.layout.share_report_dialog, null)

                sheetView.shareTitle.setText(R.string.share_report)
                sheetView.btn_share_dialog_field.setText(R.string.open_email_app)
                sheetView.btn_cancel_dialog_field.setText(R.string.cancel)
                sheetView.btn_cancel_dialog_field.setOnClickListener {
                    dialog.dismiss()
                }
                sheetView.btn_share_dialog_field.setOnClickListener {
                    dialog.dismiss()
                }

                dialog.setContentView(sheetView)
                dialog.show()
                dialog.setCanceledOnTouchOutside(true)
            }

        }

    }


    /**
     * Frees the binding object when the Fragment is destroyed.
     */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}