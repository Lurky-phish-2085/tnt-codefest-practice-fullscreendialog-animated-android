package xyz.lurkyphish2085.fullscreendialogdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.display_btn).setOnClickListener {
            displayDialog()
        }
    }

    private fun displayDialog() {
        val dialog = FullScreenDialog()
        dialog.show(supportFragmentManager, "fullscreen dialog")
    }
}