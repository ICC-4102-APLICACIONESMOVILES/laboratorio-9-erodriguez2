package eduardo.lab10

import android.net.Uri
import android.view.KeyEvent
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
//"http://demo.tutorialzine.com/2012/04/mobile-touch-gallery/"

class MyWebViewClient : WebViewClient() {
    override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
        if (Uri.parse(url).host == "https://www.google.cl")
        {
            return false
        }
        return true
    }
}
