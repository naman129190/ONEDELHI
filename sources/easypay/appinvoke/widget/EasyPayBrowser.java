package easypay.appinvoke.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.onedelhi.secure.yr0;
import easypay.appinvoke.manager.Constants;
import easypay.appinvoke.manager.EasypayWebViewClient;

public class EasyPayBrowser extends WebView {
    public EasyPayBrowser(Context context) {
        super(context);
    }

    public EasyPayBrowser(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo48810a(Object obj) {
        addJavascriptInterface(obj, Constants.JsString);
    }

    @SuppressLint({"JavascriptInterface"})
    public void addJavascriptInterface(Object obj, String str) throws IllegalArgumentException {
        if (str.equals(Constants.JsString)) {
            super.addJavascriptInterface(obj, str);
            return;
        }
        throw new IllegalArgumentException("Cannot use String other than JsString");
    }

    public void removeJavascriptInterface(String str) {
        if (str.equals(Constants.JsString)) {
            super.removeJavascriptInterface(str);
            return;
        }
        throw new IllegalArgumentException("Cannot use String other than JsString");
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) throws IllegalArgumentException {
        if (webChromeClient instanceof yr0) {
            super.setWebChromeClient(webChromeClient);
            return;
        }
        throw new IllegalArgumentException("WebviewClient doesn't extends from EasypayWebChromeClient");
    }

    public void setWebViewClient(WebViewClient webViewClient) throws IllegalArgumentException {
        if (webViewClient instanceof EasypayWebViewClient) {
            super.setWebViewClient(webViewClient);
            return;
        }
        throw new IllegalArgumentException("WebViewClient doesn't extends from EasyPayWebViewClient");
    }
}
