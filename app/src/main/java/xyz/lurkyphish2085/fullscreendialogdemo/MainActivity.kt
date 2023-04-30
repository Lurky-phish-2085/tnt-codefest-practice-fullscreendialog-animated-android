package xyz.lurkyphish2085.fullscreendialogdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import xyz.lurkyphish2085.fullscreendialogdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.displayBtn.setOnClickListener {
            displayDialog()
        }
    }

    private fun displayDialog() {
        val dialog = FullScreenDialog()
        dialog.show(supportFragmentManager, "fullscreen dialog")
    }
}