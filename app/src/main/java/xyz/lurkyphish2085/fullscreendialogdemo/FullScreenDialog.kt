package xyz.lurkyphish2085.fullscreendialogdemo

import android.app.Dialog
import android.os.Binder
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import xyz.lurkyphish2085.fullscreendialogdemo.databinding.LayoutDialogBinding

class FullScreenDialog : DialogFragment() {

    lateinit var binding: LayoutDialogBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = LayoutDialogBinding.inflate(layoutInflater)

        val builder: AlertDialog.Builder =
            AlertDialog.Builder(requireActivity(), R.style.FullscreenDialog)
        val view = binding.root

        builder.setView(view)
        setupButtons()

        return builder.create()
    }

    private fun setupButtons() {
        binding.backBtn.setOnClickListener {
            dismiss()
        }
    }
}