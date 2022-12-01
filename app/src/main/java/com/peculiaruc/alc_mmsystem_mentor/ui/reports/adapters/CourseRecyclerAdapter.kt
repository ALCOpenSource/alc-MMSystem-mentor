package com.peculiaruc.alc_mmsystem_mentor.ui.reports.adapters

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.data.local.models.Course
import com.peculiaruc.alc_mmsystem_mentor.ui.reports.screens.MentorsReportFragmentDirections
import kotlinx.android.synthetic.main.item_report_download.view.*
import kotlinx.android.synthetic.main.share_report_dialog.view.*

/**
 * A [CourseRecyclerAdapter] that manages the recyclerView for the selectProgramFragment.
 *
 * It implements the onBindViewHolder, the onCreateViewHolder and the getItemCount methods.
 */
class CourseRecyclerAdapter(val context: Context, private val courses: List<Course>) :
    RecyclerView.Adapter<CourseRecyclerAdapter.CourseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_reports, parent, false)
        return CourseViewHolder(itemView)
    }

    override fun onBindViewHolder(courseViewHolder: CourseViewHolder, position: Int) {
        val course = courses[position]
        courseViewHolder.textTitle.text = course.title
        courseViewHolder.courseTitle.text = course.course
        courseViewHolder.imageView.setImageResource(course.image)
        courseViewHolder.imageView2.setImageResource(course.image2)

        courseViewHolder.setListeners()

    }

    override fun getItemCount(): Int {
        return courses.size
    }

    /**
     * Holds the views for the adapter
     */
    inner class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        val courseTitle: TextView = itemView.findViewById<TextView?>(R.id.textReport)
        val textTitle: TextView = itemView.findViewById(R.id.reporter)
        val imageView: ImageView = itemView.findViewById(R.id.downloadIcon)
        val imageView2: ImageView = itemView.findViewById(R.id.shareIcon)

        /**
         * Handles the onClickListeners for the views.
         */
        fun setListeners() {
            imageView.setOnClickListener(this)
            imageView2.setOnClickListener(this)
            itemView.setOnClickListener {
                val action = MentorsReportFragmentDirections.actionMentorsReportFragmentToMentorReportDetailsFragment()
                itemView.findNavController().navigate(action)
            }
        }

        /**
         * Sets the navigation between screens.
         */
        override fun onClick(v: View?) {
            when (v!!.id) {
                R.id.downloadIcon -> showSubmittedSuccessDialog()
                R.id.shareIcon -> showShareDialog()
            }
        }

        private fun showSubmittedSuccessDialog() {
            context.let {
                Dialog(it, android.R.style.Theme_Translucent).also { dialog ->
                    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
                    val sheetView = View.inflate(context, R.layout.item_report_download, null)

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
            context.let {
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

    }
}