package com.onedelhi.secure;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CheckBox;
import com.onedelhi.secure.de3;
import easypay.appinvoke.actions.EasypayBrowserFragment;
import java.util.Map;

public class le3 {

    /* renamed from: a */
    public Activity f31626a;

    /* renamed from: a */
    public BroadcastReceiver f31627a = new C5999a();

    /* renamed from: a */
    public WebView f31628a;

    /* renamed from: a */
    public CheckBox f31629a;

    /* renamed from: a */
    public EasypayBrowserFragment f31630a;

    /* renamed from: a */
    public String f31631a;

    /* renamed from: a */
    public Map<String, String> f31632a;

    /* renamed from: b */
    public CheckBox f31633b;

    /* renamed from: b */
    public String f31634b = qa0.f34045b;

    /* renamed from: c */
    public String f31635c = mm0.f16219f;

    /* renamed from: d */
    public String f31636d;

    /* renamed from: e */
    public String f31637e;

    /* renamed from: com.onedelhi.secure.le3$a */
    public class C5999a extends BroadcastReceiver {
        public C5999a() {
        }

        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras();
            String string = extras.getString("eventName");
            string.hashCode();
            char c = 65535;
            switch (string.hashCode()) {
                case -891535336:
                    if (string.equals("submit")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1028005300:
                    if (string.equals("selectRadioOption")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1476801686:
                    if (string.equals("activateRadioHelper")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    le3.this.mo39793d();
                    return;
                case 1:
                    le3.this.mo39795f(extras.getString("data0"));
                    return;
                case 2:
                    le3.this.mo39791b();
                    le3 le3 = le3.this;
                    le3.f31630a.logEvent("activated", le3.f31632a.get("id"));
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.onedelhi.secure.le3$b */
    public class C6000b implements Runnable {
        public C6000b() {
        }

        public void run() {
        }
    }

    /* renamed from: com.onedelhi.secure.le3$c */
    public class C6001c extends WebViewClient {

        /* renamed from: com.onedelhi.secure.le3$c$a */
        public class C6002a implements Runnable {
            public C6002a() {
            }

            public void run() {
            }
        }

        public C6001c() {
        }

        public void onPageFinished(WebView webView, String str) {
            if (!TextUtils.isEmpty(le3.this.f31631a) && !str.equals(le3.this.f31631a)) {
                le3.this.f31626a.runOnUiThread(new C6002a());
            }
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public le3(Activity activity, WebView webView, EasypayBrowserFragment easypayBrowserFragment, Map<String, String> map) {
        this.f31626a = activity;
        this.f31630a = easypayBrowserFragment;
        this.f31632a = map;
        this.f31628a = webView;
        IntentFilter intentFilter = new IntentFilter("com.paytm.com.paytm.pgsdk.easypay.appinvoke.CUSTOM_EVENT");
        this.f31631a = webView.getUrl();
        this.f31626a.registerReceiver(this.f31627a, intentFilter);
        this.f31626a.runOnUiThread(new C6000b());
        String str = this.f31632a.get("fields");
        v82.m67791a("radiohelper", "inside radiohelper constructor");
        this.f31633b = (CheckBox) easypayBrowserFragment.getView().findViewById(de3.C5007h.cb_do_not_send_otp);
        this.f31629a = (CheckBox) easypayBrowserFragment.getView().findViewById(de3.C5007h.cb_send_otp);
    }

    /* renamed from: b */
    public void mo39791b() {
    }

    /* renamed from: c */
    public final void mo39792c(String str) {
        this.f31628a.getSettings().setJavaScriptEnabled(true);
        this.f31628a.getSettings().setDomStorageEnabled(true);
        this.f31628a.loadUrl("javascript:" + "(function (){" + "(function (){" + "return " + "document.passwdForm.otpDestinationOption[" + str + "].checked=true ;" + "})();" + "return pwdBaseOtpChannelSelected(1);" + " })();");
        this.f31628a.setWebViewClient(new C6001c());
    }

    /* renamed from: d */
    public final void mo39793d() {
        if (this.f31629a.isChecked()) {
            mo39792c(qa0.f34045b);
        }
        if (this.f31633b.isChecked()) {
            mo39792c(mm0.f16219f);
        }
    }

    /* renamed from: e */
    public void mo39794e() {
        BroadcastReceiver broadcastReceiver;
        try {
            Activity activity = this.f31626a;
            if (activity != null && (broadcastReceiver = this.f31627a) != null) {
                activity.unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public void mo39795f(String str) {
        String str2;
        String str3;
        EasypayBrowserFragment easypayBrowserFragment;
        String str4;
        if (str.equals(mm0.f16219f)) {
            str2 = this.f31632a.get("value1");
            easypayBrowserFragment = this.f31630a;
            str4 = this.f31632a.get("id");
            str3 = "selectedOption1";
        } else {
            str2 = this.f31632a.get("value2");
            easypayBrowserFragment = this.f31630a;
            str4 = this.f31632a.get("id");
            str3 = "selectedOption2";
        }
        easypayBrowserFragment.logEvent(str3, str4);
        this.f31628a.loadUrl("javascript:" + ("if(typeof(autoSelectRadio) != 'undefined'){autoSelectRadio('" + str2 + "');}"));
    }
}
