package com.phonepe.intent.sdk.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.l05;
import com.onedelhi.secure.m05;
import com.onedelhi.secure.mr2;
import com.phonepe.intent.sdk.api.PhonePe;
import com.phonepe.intent.sdk.api.PhonePeInitException;
import jmjou.C7601c;

public class PhWebView extends WebView {

    /* renamed from: a */
    public C7601c f38617a;

    public PhWebView(Context context) {
        super(context);
        try {
            mo48671a(PhonePe.getObjectFactory());
        } catch (PhonePeInitException e) {
            m05.m56773d("PhWebView", e.getMessage(), e);
        }
    }

    public PhWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            mo48671a(PhonePe.getObjectFactory());
        } catch (PhonePeInitException e) {
            m05.m56773d("PhWebView", e.getMessage(), e);
        }
    }

    public PhWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            mo48671a(PhonePe.getObjectFactory());
        } catch (PhonePeInitException e) {
            m05.m56773d("PhWebView", e.getMessage(), e);
        }
    }

    @hw4
    /* renamed from: a */
    public final void mo48671a(@mr2 C7601c cVar) {
        m05.m56774e("PhWebView", "initialization started ..");
        this.f38617a = cVar;
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setAppCacheEnabled(true);
        getSettings().setCacheMode(-1);
        requestFocus(130);
        setBackgroundColor(-1);
        if (l05.m55205i((Boolean) this.f38617a.mo48872h("com.phonepe.android.sdk.Debuggable"))) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        m05.m56774e("PhWebView", "initialization completed.");
    }
}
