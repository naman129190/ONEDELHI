package com.onedelhi.secure;

import android.app.Activity;
import android.webkit.WebView;
import easypay.appinvoke.actions.EasypayBrowserFragment;
import java.util.Map;

public class kc0 {

    /* renamed from: a */
    public Activity f31176a;

    /* renamed from: a */
    public WebView f31177a;

    /* renamed from: a */
    public EasypayBrowserFragment f31178a;

    /* renamed from: a */
    public Map<String, String> f31179a;

    public kc0(Activity activity, WebView webView, EasypayBrowserFragment easypayBrowserFragment, Map<String, String> map) {
        this.f31176a = activity;
        this.f31178a = easypayBrowserFragment;
        this.f31179a = map;
        this.f31177a = webView;
        this.f31177a.loadUrl("javascript:" + this.f31179a.get("functionStart") + this.f31179a.get("functionEnd"));
    }
}
