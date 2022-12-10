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
                visibility = visibleIf(dialogProperties.posEnabled)
                setOnClickListener { dialogProperties.posAction() }
                text = dialogProperties.posLabel
            }
            mmsDialogNegBtn.apply {
                visibility = visibleIf(dialogProperties.negEnabled)
                setOnClickListener { dialogProperties.negAction() }
                text = dialogProperties.negLabel
            }
        }

        dialog.show()
    }

    private fun visibleIf(condition: Boolean) = if (condition) View.VISIBLE else View.GONE

    fun hide() {
        dialog.dismiss()
    }

}

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

    fun setMsg(msg: String) = apply { this.msg = msg }
    fun setIllustration(@DrawableRes illustration: Int) =
        apply { this.illustration = illustration }

    fun setCancelableOnTouchOutside(cancelable: Boolean) =
        apply { this.cancelableOnTouchOutside = cancelable }

    fun setCancelable(cancelable: Boolean) = apply { this.cancelable = cancelable }
    fun setPosEnabled(enabled: Boolean, label: String) = apply { this.posEnabled = enabled; posLabel = label}
    fun setNegEnabled(enabled: Boolean, label: String) = apply { this.negEnabled = enabled; negLabel = label }
    fun setPosAction(action: () -> Unit) = apply { this.posAction = action }
    fun setNegAction(action: () -> Unit) = apply { this.negAction = action }


}