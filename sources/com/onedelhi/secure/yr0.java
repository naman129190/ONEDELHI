package com.onedelhi.secure;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import easypay.appinvoke.actions.EasypayBrowserFragment;

public class yr0 extends WebChromeClient {

    /* renamed from: a */
    public EasypayBrowserFragment f38042a;

    public yr0(EasypayBrowserFragment easypayBrowserFragment) {
        this.f38042a = easypayBrowserFragment;
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (!str.equals("https://secure4.arcot.com/acspage/cap?RID=40147&VAA=B")) {
            return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        jsResult.confirm();
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return false;
    }
}
