package com.peculiaruc.alc_mmsystem_mentor.presentations.components

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.MmsDialogLayoutBinding

class MMSDialog(private val context: Context) {

    lateinit var binding: MmsDialogLayoutBinding
    private val alertDialog = MaterialAlertDialogBuilder(context)
    private val dialog = alertDialog.create()

    init {
        binding = MmsDialogLayoutBinding.bind(
            LayoutInflater.from(context).inflate(R.layout.mms_dialog_layout, null, false)
        )
        alertDialog.setView(binding.root)
    }

    fun show(
        dialogProperties: DialogProperties
    ) {
        binding.apply {
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
            }
            mmsDialogNegBtn.apply {
                visibility = visibleIf(dialogProperties.negEnabled)
                setOnClickListener { dialogProperties.negAction() }
            }
        }

        dialog.show()
    }

    private fun visibleIf(condition: Boolean) = if (condition) View.VISIBLE else View.GONE

    fun hide() {
        dialog.hide()
    }

    inner class DialogProperties {
        var msg: String? = null

        @DrawableRes
        var illustration: Int? = null
        var posEnabled: Boolean = false
        var negEnabled: Boolean = false
        var posAction: () -> Unit = {}
        var negAction: () -> Unit = {}

        fun setMsg(msg: String) = apply { this.msg = msg }
        fun setIllustration(@DrawableRes illustration: Int) =
            apply { this.illustration = illustration }

        fun setPosEnabled(enabled: Boolean) = apply { this.posEnabled = enabled }
        fun setNegEnabled(enabled: Boolean) = apply { this.negEnabled = enabled }
        fun setPosAction(action: () -> Unit) = apply { this.posAction = action }
        fun setNegAction(action: () -> Unit) = apply { this.negAction = action }


    }

}