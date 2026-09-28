package com.stlouis.biology13

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Each button opens a page of the built-in revision app (assets/index.html)
        val routes = mapOf(
            R.id.strand1 to "#/s/1",
            R.id.strand2 to "#/s/2",
            R.id.strand3 to "#/s/3",
            R.id.strand4 to "#/s/4",
            R.id.strand5 to "#/s/5",
            R.id.btnMix to "#/mix",
            R.id.btnMistakes to "#/mistakes",
            R.id.btnReset to "#/reset"
        )
        routes.forEach { (id, route) ->
            findViewById<View>(id).setOnClickListener { open(route) }
        }

        findViewById<View>(R.id.btnAbout).setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setTitle(R.string.about_title)
                .setMessage(R.string.about_text)
                .setPositiveButton(android.R.string.ok, null)
                .show()
        }
    }

    private fun open(route: String) {
        startActivity(Intent(this, WebActivity::class.java).putExtra(WebActivity.EXTRA_ROUTE, route))
    }
}
