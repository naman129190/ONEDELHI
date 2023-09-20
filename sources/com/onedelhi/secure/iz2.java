package com.onedelhi.secure;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.webkit.WebView;
import android.widget.EditText;
import easypay.appinvoke.actions.EasypayBrowserFragment;
import java.util.Map;

public class iz2 {

    /* renamed from: a */
    public Activity f30510a;

    /* renamed from: a */
    public BroadcastReceiver f30511a = new C5754a();

    /* renamed from: a */
    public final TextWatcher f30512a;

    /* renamed from: a */
    public WebView f30513a;

    /* renamed from: a */
    public EditText f30514a;

    /* renamed from: a */
    public EasypayBrowserFragment f30515a;

    /* renamed from: a */
    public Boolean f30516a = Boolean.FALSE;

    /* renamed from: a */
    public String f30517a;

    /* renamed from: a */
    public Map<String, String> f30518a;

    /* renamed from: b */
    public String f30519b = "";

    /* renamed from: c */
    public String f30520c = "";

    /* renamed from: d */
    public String f30521d = "";

    /* renamed from: e */
    public String f30522e;

    /* renamed from: com.onedelhi.secure.iz2$a */
    public class C5754a extends BroadcastReceiver {
        public C5754a() {
        }

        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras();
            String string = extras.getString("eventName");
            string.hashCode();
            char c = 65535;
            switch (string.hashCode()) {
                case -1905225220:
                    if (string.equals("activatePasswordHelper")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1641265649:
                    if (string.equals("togglePassword")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2104149715:
                    if (string.equals("submitPassword")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    iz2.this.mo38302g(extras.getString("data0"));
                    iz2.this.f30515a.logEvent("activated", (String) iz2.this.f30518a.get("id"));
                    return;
                case 1:
                    iz2.this.mo38308m();
                    iz2.this.f30515a.logEvent("togglePassword", (String) iz2.this.f30518a.get("id"));
                    return;
                case 2:
                    iz2.this.mo38307l();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.onedelhi.secure.iz2$b */
    public class C5755b implements TextWatcher {
        public C5755b() {
        }

        public void afterTextChanged(Editable editable) {
            String unused = iz2.this.f30519b = "";
            String str = "javascript:" + ((String) iz2.this.f30518a.get("functionStart"));
            iz2.this.f30513a.loadUrl((str + (iz2.this.f30517a + "if(fields.length){fields[0].value='" + "" + "';};")) + ((String) iz2.this.f30518a.get("functionEnd")));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public iz2(Activity activity, WebView webView, EasypayBrowserFragment easypayBrowserFragment, Map<String, String> map, String str) {
        this.f30510a = activity;
        this.f30515a = easypayBrowserFragment;
        this.f30518a = map;
        this.f30513a = webView;
        this.f30522e = str;
        this.f30510a.registerReceiver(this.f30511a, new IntentFilter("com.paytm.com.paytm.pgsdk.easypay.appinvoke.CUSTOM_EVENT"));
        this.f30517a = this.f30518a.get("fields");
        webView.loadUrl("javascript:" + this.f30518a.get("functionStart") + this.f30517a + (this.f30517a + "var a=fields; for(var i=0;i<a.length;i++){if(a[i].type=='password'){a[i].blur();Android.showLog(\"input type is password\");a[i].addEventListener('input', function(e){Android.logTempData(this.value)}); a[i].addEventListener('focus', function(){Android.sendEvent('activatePasswordHelper', true, 0);Android.logTempData(this.value);});}}") + this.f30518a.get("functionEnd"));
        C5755b bVar = new C5755b();
        this.f30512a = bVar;
        this.f30514a.addTextChangedListener(bVar);
    }

    /* renamed from: g */
    public void mo38302g(String str) {
    }

    /* renamed from: h */
    public void mo38303h(String str) {
        this.f30519b = str;
        mo38305j();
    }

    /* renamed from: i */
    public void mo38304i() {
        try {
            BroadcastReceiver broadcastReceiver = this.f30511a;
            if (broadcastReceiver != null) {
                this.f30510a.unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f30514a.setText("");
    }

    /* renamed from: j */
    public void mo38305j() {
        String str;
        if (this.f30516a.booleanValue()) {
            this.f30514a.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            this.f30520c = this.f30519b;
            str = "Hide";
        } else {
            this.f30514a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            str = "Show";
        }
        this.f30521d = str;
    }

    /* renamed from: k */
    public final void mo38306k() {
    }

    /* renamed from: l */
    public final void mo38307l() {
        this.f30513a.loadUrl("javascript:" + (("(function(){l=document.getElementsByName('" + this.f30522e) + "');e=document.createEvent('HTMLEvents');e.initEvent('click',true,true);l[0].dispatchEvent(e);})()"));
        mo38302g(h60.f29488G);
    }

    /* renamed from: m */
    public void mo38308m() {
        this.f30516a = Boolean.valueOf(!this.f30516a.booleanValue());
        mo38305j();
    }

    /* renamed from: n */
    public void mo38309n() {
        BroadcastReceiver broadcastReceiver;
        Activity activity = this.f30510a;
        if (activity != null && (broadcastReceiver = this.f30511a) != null) {
            activity.unregisterReceiver(broadcastReceiver);
        }
    }
}
