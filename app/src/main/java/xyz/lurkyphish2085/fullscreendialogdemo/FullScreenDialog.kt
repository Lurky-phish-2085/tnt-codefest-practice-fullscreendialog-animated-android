package xyz.lurkyphish2085.fullscreendialogdemo

import android.app.Dialog
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class FullScreenDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder: AlertDialog.Builder = AlertDialog.Builder(requireActivity(), R.style.FullscreenDialog)
        val inflater = activity?.layoutInflater
        val view = inflater?.inflate(R.layout.layout_dialog, null)

        builder.setView(view)

        return builder.create()
    }
}