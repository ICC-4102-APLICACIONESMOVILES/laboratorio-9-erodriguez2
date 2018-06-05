package eduardo.lab10

import android.content.Context
import android.util.Log
import android.webkit.JavascriptInterface

class WebAppInterface(context: Context) {
    @JavascriptInterface
    fun showToast(toast: String){
        Log.d("ShowToast", "OK")
    }
}
