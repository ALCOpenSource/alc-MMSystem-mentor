package com.peculiaruc.alc_mmsystem_mentor.presentations.components

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AlertDialog
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.MmsDialogLayoutBinding

/**
 * Main MMS dialog
 *
 * @property context
 * @constructor Create empty M m s dialog
 */
class MMSDialog(private val context: Context) {

    var binding: MmsDialogLayoutBinding = MmsDialogLayoutBinding.bind(
        LayoutInflater.from(context).inflate(R.layout.mms_dialog_layout, null, false)
    )
    private val alertDialog: MaterialAlertDialogBuilder = MaterialAlertDialogBuilder(context, R.style.MMSDialogTheme)
    private var dialog: AlertDialog

    init {
        alertDialog.setView(binding.root)

        dialog = alertDialog.create()
    }

    /**
     * Show
     *
     * @param dialogProperties
     */
    fun show(
        dialogProperties: MMSDialogProperties
    ) {
        binding.apply {
            dialog.setCancelable(dialogProperties.cancelable)
            dialog.setCanceledOnTouchOutside(dialogProperties.cancelableOnTouchOutside)
            mmsDialogTitle.text = dialogProperties.msg
            dialogProperties.illustration?.let {
                mmsDialogIllustration.setImageDrawable(
                    ResourcesCompat.getDrawable(
                        context.resources,
                        it, null
                    )
                )
            }
            mmsDialogPosBtn.apply {
                visibility = showViewIf(dialogProperties.posEnabled)
                setOnClickListener { dialogProperties.posAction() }
                text = dialogProperties.posLabel
            }
            mmsDialogNegBtn.apply {
                visibility = showViewIf(dialogProperties.negEnabled)
                setOnClickListener { dialogProperties.negAction() }
                text = dialogProperties.negLabel
            }
        }

        dialog.show()
    }


    /**
     * Visible if
     * Controls if a view is visible or not base on its condition
     * @param condition
     * @return Int
     */
    private fun showViewIf(condition: Boolean): Int = if (condition) View.VISIBLE else View.GONE

    /**
     * Hide
     *
     */
    fun hide() {
        dialog.dismiss()
    }

}

/**
 * Main MMS dialog properties
 * Used to control the functionality MMSDialog
 */
class MMSDialogProperties {
    var msg: String? = null

    @DrawableRes
    var illustration: Int? = null
    var posEnabled: Boolean = false
    var posLabel: String = ""
    var cancelable: Boolean = true
    var cancelableOnTouchOutside: Boolean = true
    var negEnabled: Boolean = false
    var negLabel: String = ""
    var posAction: () -> Unit = {}
    var negAction: () -> Unit = {}

    /**
     * Set msg
     *
     * @param msg
     */
    fun setMsg(msg: String) = apply { this.msg = msg }

    /**
     * Set illustration
     *
     * @param illustration
     */
    fun setIllustration(@DrawableRes illustration: Int) =
        apply { this.illustration = illustration }

    /**
     * Set cancelable on touch outside
     *
     * @param cancelable
     */
    fun setCancelableOnTouchOutside(cancelable: Boolean) =
        apply { this.cancelableOnTouchOutside = cancelable }

    /**
     * Set cancelable
     *
     * @param cancelable
     */
    fun setCancelable(cancelable: Boolean) = apply { this.cancelable = cancelable }

    /**
     * Set pos enabled
     *
     * @param enabled
     * @param label
     */
    fun setPosEnabled(enabled: Boolean, label: String) = apply { this.posEnabled = enabled; posLabel = label}

    /**
     * Set neg enabled
     *
     * @param enabled
     * @param label
     */
    fun setNegEnabled(enabled: Boolean, label: String) = apply { this.negEnabled = enabled; negLabel = label }

    /**
     * Set pos action
     *
     * @param action
     * @receiver
     */
    fun setPosAction(action: () -> Unit) = apply { this.posAction = action }

    /**
     * Set neg action
     *
     * @param action
     * @receiver
     */
    fun setNegAction(action: () -> Unit) = apply { this.negAction = action }


}