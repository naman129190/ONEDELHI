package com.onedelhi.secure;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.webkit.WebView;
import easypay.appinvoke.actions.EasypayBrowserFragment;
import java.util.Map;

public class j53 {

    /* renamed from: a */
    public Activity f30574a;

    /* renamed from: a */
    public BroadcastReceiver f30575a = new C5763a();

    /* renamed from: a */
    public WebView f30576a;

    /* renamed from: a */
    public EasypayBrowserFragment f30577a;

    /* renamed from: a */
    public String f30578a;

    /* renamed from: a */
    public Map<String, String> f30579a;

    /* renamed from: b */
    public String f30580b;

    /* renamed from: com.onedelhi.secure.j53$a */
    public class C5763a extends BroadcastReceiver {
        public C5763a() {
        }

        public void onReceive(Context context, Intent intent) {
            EasypayBrowserFragment easypayBrowserFragment;
            String str;
            String str2;
            String string = intent.getExtras().getString("eventName");
            string.hashCode();
            if (string.equals("proceedProceedHelper")) {
                j53.this.mo38440b();
                j53 j53 = j53.this;
                easypayBrowserFragment = j53.f30577a;
                str = j53.f30579a.get("id");
                str2 = "proceeded";
            } else if (string.equals("activateProceedHelper")) {
                j53.this.mo38439a();
                j53 j532 = j53.this;
                easypayBrowserFragment = j532.f30577a;
                str = j532.f30579a.get("id");
                str2 = "activated";
            } else {
                return;
            }
            easypayBrowserFragment.logEvent(str2, str);
        }
    }

    /* renamed from: com.onedelhi.secure.j53$b */
    public class C5764b implements Runnable {
        public C5764b() {
        }

        public void run() {
        }
    }

    public j53(Activity activity, WebView webView, EasypayBrowserFragment easypayBrowserFragment, Map<String, String> map) {
        this.f30574a = activity;
        this.f30577a = easypayBrowserFragment;
        this.f30579a = map;
        this.f30576a = webView;
        this.f30574a.registerReceiver(this.f30575a, new IntentFilter("com.paytm.com.paytm.pgsdk.easypay.appinvoke.CUSTOM_EVENT"));
        String str = this.f30579a.get(es2.f11408k0);
        String str2 = this.f30579a.get("autoproceed");
        str = str2 != null ? h60.f29487F : str;
        webView.loadUrl("javascript:" + this.f30579a.get("functionStart") + (this.f30579a.get("fields") + "Android.showLog('inside proceed helper'); var a=fields; if(!" + str + "){ Android.sendEvent('activateProceedHelper', 0, 0); } if(typeof(autoSubmitForm) == 'undefined'){ autoSubmitForm=function(){Android.showLog('activating proceedhelper1'); a[0]" + (this.f30579a.get("element").equals("input") ? ".click()" : this.f30579a.get("element").equals("form") ? ".submit()" : "") + "}; }  if(" + str2 + "){ autoSubmitForm();}") + this.f30579a.get("functionEnd"));
    }

    /* renamed from: a */
    public void mo38439a() {
        this.f30574a.runOnUiThread(new C5764b());
    }

    /* renamed from: b */
    public void mo38440b() {
        BroadcastReceiver broadcastReceiver = this.f30575a;
        if (broadcastReceiver != null) {
            this.f30574a.unregisterReceiver(broadcastReceiver);
        }
        this.f30576a.loadUrl("javascript:" + "if(typeof(autoSubmitForm) != 'undefined'){Android.showLog('activating proceedhelper0'); autoSubmitForm();}");
    }

    /* renamed from: c */
    public void mo38441c() {
        try {
            BroadcastReceiver broadcastReceiver = this.f30575a;
            if (broadcastReceiver != null) {
                this.f30574a.unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
