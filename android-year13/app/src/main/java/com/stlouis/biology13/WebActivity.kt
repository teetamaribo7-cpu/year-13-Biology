package com.stlouis.biology13

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity

class WebActivity : AppCompatActivity() {

    companion object { const val EXTRA_ROUTE = "route" }

    private lateinit var web: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        web = WebView(this)
        setContentView(web)

        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true   // saves scores and mistakes on the phone
        web.settings.allowFileAccess = true
        web.webViewClient = WebViewClient()
        web.addJavascriptInterface(Bridge(), "Android")

        if (savedInstanceState != null) {
            web.restoreState(savedInstanceState)
        } else {
            val route = intent.getStringExtra(EXTRA_ROUTE) ?: "#/mistakes"
            web.loadUrl("file:///android_asset/index.html$route")
        }

        // Phone back button: go back inside the quiz first, then return to the home buttons
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (web.canGoBack()) web.goBack() else finish()
            }
        })
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        web.saveState(outState)
    }

    /** Lets the page close itself and return to the home screen. */
    inner class Bridge {
        @JavascriptInterface
        fun close() { runOnUiThread { finish() } }
    }
}
