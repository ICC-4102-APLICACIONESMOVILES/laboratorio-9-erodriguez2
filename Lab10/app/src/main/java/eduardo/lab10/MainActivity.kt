package eduardo.lab10

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.webkit.*
import org.jetbrains.anko.find

class MainActivity : AppCompatActivity() {

    private lateinit var myWebView : WebView
    private lateinit var myWebSettings: WebSettings

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getUIReferences()
        myWebView.webViewClient = MyWebViewClient()
        myWebSettings = myWebView.settings
        myWebSettings.javaScriptEnabled = true
        myWebView.loadUrl("https://www.google.cl")
    }

    private fun getUIReferences()
    {
        myWebView = find(R.id.myWebView)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && myWebView.canGoBack())
        {
            myWebView.goBack()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onBackPressed() {
        myWebView.webChromeClient = object : WebChromeClient() {
            override fun onConsoleMessage(message: String?, lineNumber: Int, sourceID: String?) {
                Log.d("onConsoleMessage", "OK")
            }
        }
        Log.d("onBackPressed", "OK")
    }
}
