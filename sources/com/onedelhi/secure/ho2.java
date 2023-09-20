package com.onedelhi.secure;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.internal.ImagesContract;
import com.onedelhi.secure.de3;
import easypay.appinvoke.actions.EasypayBrowserFragment;
import easypay.appinvoke.manager.Constants;
import easypay.appinvoke.manager.EasypayWebViewClient;
import easypay.appinvoke.manager.PaytmAssist;
import java.util.HashMap;
import java.util.Map;

public class ho2 implements vw4 {

    /* renamed from: a */
    public Activity f29679a;

    /* renamed from: a */
    public BroadcastReceiver f29680a = new C5538i();

    /* renamed from: a */
    public TextWatcher f29681a;

    /* renamed from: a */
    public WebView f29682a;

    /* renamed from: a */
    public Button f29683a;

    /* renamed from: a */
    public CheckBox f29684a;

    /* renamed from: a */
    public EditText f29685a;

    /* renamed from: a */
    public TextView f29686a;

    /* renamed from: a */
    public EasypayBrowserFragment f29687a;

    /* renamed from: a */
    public EasypayWebViewClient f29688a;

    /* renamed from: a */
    public Boolean f29689a = Boolean.FALSE;

    /* renamed from: a */
    public Map<String, String> f29690a;

    /* renamed from: b */
    public EditText f29691b;

    /* renamed from: b */
    public String f29692b;

    /* renamed from: b */
    public boolean f29693b;

    /* renamed from: c */
    public String f29694c;

    /* renamed from: c */
    public boolean f29695c;

    /* renamed from: d */
    public String f29696d = "";

    /* renamed from: e */
    public String f29697e = "";

    /* renamed from: f */
    public String f29698f = "";

    /* renamed from: g */
    public String f29699g;

    /* renamed from: com.onedelhi.secure.ho2$a */
    public class C5530a implements ValueCallback<String> {
        public C5530a() {
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
        }
    }

    /* renamed from: com.onedelhi.secure.ho2$b */
    public class C5531b implements ValueCallback<String> {
        public C5531b() {
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
        }
    }

    /* renamed from: com.onedelhi.secure.ho2$c */
    public class C5532c implements ValueCallback<String> {
        public C5532c() {
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
        }
    }

    /* renamed from: com.onedelhi.secure.ho2$d */
    public class C5533d implements ValueCallback<String> {
        public C5533d() {
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
        }
    }

    /* renamed from: com.onedelhi.secure.ho2$e */
    public class C5534e extends tj4<HashMap<String, String>> {
        public C5534e() {
        }
    }

    /* renamed from: com.onedelhi.secure.ho2$f */
    public class C5535f implements ValueCallback<String> {
        public C5535f() {
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
        }
    }

    /* renamed from: com.onedelhi.secure.ho2$g */
    public class C5536g implements Runnable {
        public C5536g() {
        }

        public void run() {
        }
    }

    /* renamed from: com.onedelhi.secure.ho2$h */
    public class C5537h implements ValueCallback<String> {
        public C5537h() {
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
        }
    }

    /* renamed from: com.onedelhi.secure.ho2$i */
    public class C5538i extends BroadcastReceiver {
        public C5538i() {
        }

        public void onReceive(Context context, Intent intent) {
            String string;
            Bundle extras = intent.getExtras();
            if (extras != null && (string = extras.getString("eventName")) != null) {
                char c = 65535;
                switch (string.hashCode()) {
                    case -1905225220:
                        if (string.equals("activatePasswordHelper")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 538831501:
                        if (string.equals("nbLoginSubmit")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 604340202:
                        if (string.equals("activateNetBankingHelper")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 835905134:
                        if (string.equals("confirmhelper")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1369967012:
                        if (string.equals("nbConfirmSubmit")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 2094056946:
                        if (string.equals("userIdInputHelper")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 2104149715:
                        if (string.equals("submitPassword")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 2:
                        ho2.this.mo37442m(extras.getString("data0"));
                        ho2.this.f29687a.logEvent("activated", (String) ho2.this.f29690a.get("id"));
                        return;
                    case 1:
                        String unused = ho2.this.mo37452y();
                        ho2 ho2 = ho2.this;
                        ho2.mo37441a((String) ho2.f29690a.get("submitLogin"), "submitLogin");
                        return;
                    case 3:
                        ho2.this.mo37445p();
                        return;
                    case 4:
                        ho2.this.mo37444o();
                        return;
                    case 5:
                        ho2.this.f29687a.logEvent("negtbanking userid", (String) ho2.this.f29690a.get("id"));
                        return;
                    case 6:
                        ho2.this.mo37437C();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.ho2$j */
    public class C5539j implements Runnable {

        /* renamed from: com.onedelhi.secure.ho2$j$a */
        public class C5540a implements ValueCallback<String> {
            public C5540a() {
            }

            /* renamed from: a */
            public void onReceiveValue(String str) {
            }
        }

        public C5539j() {
        }

        public void run() {
            ho2.this.f29682a.evaluateJavascript(ho2.this.f29692b, new C5540a());
        }
    }

    /* renamed from: com.onedelhi.secure.ho2$k */
    public class C5541k implements TextWatcher {
        public C5541k() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.onedelhi.secure.ho2$l */
    public class C5542l implements Runnable {

        /* renamed from: com.onedelhi.secure.ho2$l$a */
        public class C5543a implements ValueCallback<String> {
            public C5543a() {
            }

            /* renamed from: a */
            public void onReceiveValue(String str) {
            }
        }

        public C5542l() {
        }

        public void run() {
            ho2.this.f29682a.evaluateJavascript("javascript:" + "(function() { try {" + ((String) ho2.this.f29690a.get("confirmJs")) + "}catch(e){Android.showLog('net banking confirm page error');}}());", new C5543a());
        }
    }

    /* renamed from: com.onedelhi.secure.ho2$m */
    public class C5544m implements TextWatcher {
        public C5544m() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.onedelhi.secure.ho2$n */
    public class C5545n implements ValueCallback<String> {
        public C5545n() {
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
        }
    }

    /* renamed from: com.onedelhi.secure.ho2$o */
    public class C5546o implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f29717b;

        /* renamed from: n */
        public final /* synthetic */ int f29718n;

        /* renamed from: com.onedelhi.secure.ho2$o$a */
        public class C5547a implements ValueCallback<String> {
            public C5547a() {
            }

            /* renamed from: a */
            public void onReceiveValue(String str) {
            }
        }

        public C5546o(int i, String str) {
            this.f29718n = i;
            this.f29717b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x00bc  */
        /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0067  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                com.onedelhi.secure.ho2 r0 = com.onedelhi.secure.ho2.this
                android.webkit.WebView r0 = r0.f29682a
                java.lang.String r0 = r0.getUrl()
                int r1 = r5.f29718n
                r2 = 0
                java.lang.String r0 = r0.substring(r2, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "javascript:"
                r1.append(r2)
                java.lang.String r2 = "(function() { try {"
                r1.append(r2)
                com.onedelhi.secure.ho2 r2 = com.onedelhi.secure.ho2.this
                java.util.Map r2 = r2.f29690a
                java.lang.String r3 = "selectorType"
                java.lang.Object r2 = r2.get(r3)
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r4 = "name"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x003c
                java.lang.String r2 = "var x=document.getElementsByName('"
            L_0x0038:
                r1.append(r2)
                goto L_0x0053
            L_0x003c:
                com.onedelhi.secure.ho2 r2 = com.onedelhi.secure.ho2.this
                java.util.Map r2 = r2.f29690a
                java.lang.Object r2 = r2.get(r3)
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r3 = "id"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0053
                java.lang.String r2 = "var x=document.getElementById('"
                goto L_0x0038
            L_0x0053:
                com.onedelhi.secure.ho2 r2 = com.onedelhi.secure.ho2.this
                java.util.Map r2 = r2.f29690a
                java.lang.String r3 = "nextelement"
                java.lang.Object r2 = r2.get(r3)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L_0x006e
                com.onedelhi.secure.ho2 r2 = com.onedelhi.secure.ho2.this
                java.util.Map r2 = r2.f29690a
                goto L_0x0076
            L_0x006e:
                com.onedelhi.secure.ho2 r2 = com.onedelhi.secure.ho2.this
                java.util.Map r2 = r2.f29690a
                java.lang.String r3 = "selector"
            L_0x0076:
                java.lang.Object r2 = r2.get(r3)
                java.lang.String r2 = (java.lang.String) r2
                r1.append(r2)
                java.lang.String r2 = "');"
                r1.append(r2)
                java.lang.String r2 = "if("
                r1.append(r2)
                java.lang.String r2 = "x"
                r1.append(r2)
                java.lang.String r2 = "!=null)"
                r1.append(r2)
                java.lang.String r2 = "{Android.NbWatcher(1,2)}"
                r1.append(r2)
                java.lang.String r2 = "else{Android.NbWatcher(1,4)}"
                r1.append(r2)
                java.lang.String r2 = "}catch(e){Android.showLog('not found -Net Banking js Injection');}}());"
                r1.append(r2)
                com.onedelhi.secure.ho2 r2 = com.onedelhi.secure.ho2.this
                android.webkit.WebView r2 = r2.f29682a
                java.lang.String r1 = r1.toString()
                com.onedelhi.secure.ho2$o$a r3 = new com.onedelhi.secure.ho2$o$a
                r3.<init>()
                r2.evaluateJavascript(r1, r3)
                java.lang.String r1 = r5.f29717b
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x00c9
                com.onedelhi.secure.ho2 r0 = com.onedelhi.secure.ho2.this
                easypay.appinvoke.actions.EasypayBrowserFragment r0 = r0.f29687a
                int r1 = com.onedelhi.secure.de3.C5007h.layout_netbanking
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r0.mo48690P0(r1, r2)
            L_0x00c9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ho2.C5546o.run():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ho2$p */
    public class C5548p implements Runnable {
        public C5548p() {
        }

        public void run() {
            try {
                ho2.this.f29687a.mo48690P0(de3.C5007h.layout_netbanking, Boolean.TRUE);
                PaytmAssist.getAssistInstance().getmAnalyticsManager().mo38402D(true);
                PaytmAssist.getAssistInstance().getmAnalyticsManager().mo38419g(ho2.this.f29682a.getUrl());
                ho2.this.mo37438D();
                ho2 ho2 = ho2.this;
                ho2.mo37443n((String) ho2.f29690a.get("userNameInject"));
                ho2.this.mo37448s();
                ho2 ho22 = ho2.this;
                ho22.mo37441a((String) ho22.f29690a.get("userInputjs"), (String) ho2.this.f29690a.get("passwordInputJs"));
            } catch (Exception e) {
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.ho2$q */
    public class C5549q implements Runnable {
        public C5549q() {
        }

        public void run() {
            ho2.this.mo37436B();
        }
    }

    public ho2(Activity activity, WebView webView, EasypayBrowserFragment easypayBrowserFragment, Map<String, String> map, EasypayWebViewClient easypayWebViewClient) {
        PaytmAssist.getAssistInstance().getmAnalyticsManager().mo38413a(true);
        this.f29679a = activity;
        this.f29687a = easypayBrowserFragment;
        this.f29690a = map;
        this.f29682a = webView;
        this.f29688a = PaytmAssist.getAssistInstance().getWebClientInstance();
        try {
            this.f29679a.registerReceiver(this.f29680a, new IntentFilter("com.paytm.com.paytm.pgsdk.easypay.appinvoke.CUSTOM_EVENT"));
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
        this.f29692b = "javascript:";
        if (easypayWebViewClient != null) {
            easypayWebViewClient.addAssistWebClientListener(this);
        }
        try {
            this.f29694c = this.f29690a.get("fields");
            CheckBox checkBox = (CheckBox) this.f29679a.findViewById(de3.C5007h.cb_nb_userId);
            this.f29684a = checkBox;
            checkBox.setButtonDrawable(de3.C5006g.ic_checkbox_selected);
            this.f29685a = (EditText) this.f29679a.findViewById(de3.C5007h.et_nb_password);
            this.f29683a = (Button) this.f29679a.findViewById(de3.C5007h.nb_bt_submit);
            this.f29686a = (TextView) this.f29679a.findViewById(de3.C5007h.img_pwd_show);
            this.f29692b += this.f29690a.get("functionStart") + this.f29694c + "else{Android.sendEvent('activateNetBankingHelper', true, 0);}" + this.f29690a.get("functionEnd");
            this.f29682a.post(new C5539j());
        } catch (NullPointerException unused) {
        }
        this.f29681a = new C5541k();
    }

    /* renamed from: A */
    public void mo37435A() {
        try {
            BroadcastReceiver broadcastReceiver = this.f29680a;
            if (broadcastReceiver != null) {
                this.f29679a.unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
        this.f29691b.setText("");
    }

    /* renamed from: B */
    public void mo37436B() {
        String str;
        if (this.f29689a.booleanValue()) {
            this.f29691b.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            this.f29697e = this.f29696d;
            str = "Hide";
        } else {
            this.f29691b.setTransformationMethod(PasswordTransformationMethod.getInstance());
            str = "Show";
        }
        this.f29698f = str;
        this.f29679a.runOnUiThread(new C5536g());
    }

    /* renamed from: C */
    public final void mo37437C() {
        this.f29682a.loadUrl("javascript:" + (("(function(){l=document.getElementsByName('" + this.f29699g) + "');e=document.createEvent('HTMLEvents');e.initEvent('click',true,true);l[0].dispatchEvent(e);})()"));
        mo37442m(h60.f29488G);
    }

    /* renamed from: D */
    public final void mo37438D() {
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:");
        sb.append("(function() { try {");
        if (!TextUtils.isEmpty(this.f29690a.get("istabpage"))) {
            sb.append(this.f29690a.get("uwtabdetect"));
        }
        sb.append("}catch(e){Android.showLog('not found -could not inject user name');}}());");
        this.f29682a.getSettings().setDomStorageEnabled(true);
        this.f29682a.getSettings().setJavaScriptEnabled(true);
        this.f29693b = true;
        this.f29682a.evaluateJavascript(sb.toString(), new C5530a());
        mo37440F();
    }

    /* renamed from: E */
    public void mo37439E() {
        BroadcastReceiver broadcastReceiver;
        Activity activity = this.f29679a;
        if (activity != null && (broadcastReceiver = this.f29680a) != null) {
            activity.unregisterReceiver(broadcastReceiver);
        }
    }

    /* renamed from: F */
    public final void mo37440F() {
        if (this.f29682a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("javascript:");
            sb.append("(function() { try {");
            if (!TextUtils.isEmpty(this.f29690a.get("istabpage"))) {
                sb.append(this.f29690a.get("wtabdetect"));
            }
            sb.append("}catch(e){Android.showLog('not found -could not inject user name');}}());");
            this.f29682a.getSettings().setDomStorageEnabled(true);
            this.f29682a.getSettings().setJavaScriptEnabled(true);
            this.f29693b = true;
            this.f29682a.evaluateJavascript(sb.toString(), new C5531b());
        }
    }

    /* renamed from: H */
    public boolean mo33954H(WebView webView, Object obj) {
        return false;
    }

    /* renamed from: K */
    public void mo33955K(WebView webView, String str, Bitmap bitmap) {
    }

    /* renamed from: V */
    public void mo33956V(WebView webView, String str) {
    }

    /* renamed from: a */
    public final void mo37441a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        boolean equals = this.f29690a.get("bank").equals("hdfc-nb");
        sb.append("javascript:");
        if (equals) {
            sb.append(str);
            sb.append(str2);
        } else {
            sb.append("(function() { try {");
            sb.append(str);
            sb.append(str2);
            sb.append("}catch(e){Android.showLog('not found -Net Banking js Injection');}}());");
        }
        this.f29682a.getSettings().setDomStorageEnabled(true);
        this.f29682a.getSettings().setJavaScriptEnabled(true);
        this.f29693b = true;
        this.f29682a.evaluateJavascript(sb.toString(), new C5545n());
        if (str2.equals("submitLogin")) {
            this.f29687a.mo48720w0("", 3);
            this.f29695c = true;
        }
    }

    /* renamed from: m */
    public void mo37442m(String str) {
        Activity activity;
        Runnable runnable;
        if (str.equals(h60.f29487F)) {
            activity = this.f29679a;
            runnable = new C5548p();
        } else {
            this.f29696d = "";
            activity = this.f29679a;
            runnable = new C5549q();
        }
        activity.runOnUiThread(runnable);
    }

    /* renamed from: n */
    public final void mo37443n(String str) {
        if (!TextUtils.isEmpty(str)) {
            SharedPreferences sharedPreferences = this.f29679a.getApplicationContext().getSharedPreferences(Constants.BANKPREF, 0);
            String str2 = "";
            if (sharedPreferences != null) {
                HashMap hashMap = (HashMap) new fj1().mo36013o(sharedPreferences.getString(Constants.USER_ID_NET_BANK_KEY, str2), new C5534e().getType());
                if (hashMap != null && hashMap.containsKey(this.f29690a.get("bank"))) {
                    str2 = "'" + ((String) hashMap.get(this.f29690a.get("bank"))) + "'";
                } else {
                    return;
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f29682a.getSettings().setDomStorageEnabled(true);
                this.f29682a.getSettings().setJavaScriptEnabled(true);
                this.f29693b = true;
                this.f29682a.evaluateJavascript("javascript:" + "(function() { try {" + str + str2 + "}catch(e){Android.showLog('not found -could not inject user name');}}());", new C5535f());
            }
        }
    }

    /* renamed from: o */
    public final void mo37444o() {
        Handler handler = new Handler();
        if (!TextUtils.isEmpty(this.f29690a.get("confirmJs"))) {
            handler.postDelayed(new C5542l(), 100);
        }
    }

    /* renamed from: p */
    public final void mo37445p() {
        mo37447r();
    }

    /* renamed from: q */
    public final void mo37446q(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:");
        sb.append("(function() { try {var y=");
        if (this.f29690a.get("selectorType").equals("id")) {
            str2 = "document.getElementById('";
        } else {
            if (this.f29690a.get("selectorType").equals("name")) {
                str2 = "document.getElementsByName('";
            }
            sb.append(str);
            sb.append("')");
            sb.append(".value;");
            sb.append("Android.NbWatcher(y,99)");
            sb.append("}catch(e){Android.showLog('not found -Net Banking js Injection');}}());");
            this.f29682a.getSettings().setDomStorageEnabled(true);
            this.f29682a.getSettings().setJavaScriptEnabled(true);
            this.f29693b = true;
            this.f29682a.evaluateJavascript(sb.toString(), new C5537h());
        }
        sb.append(str2);
        sb.append(str);
        sb.append("')");
        sb.append(".value;");
        sb.append("Android.NbWatcher(y,99)");
        sb.append("}catch(e){Android.showLog('not found -Net Banking js Injection');}}());");
        this.f29682a.getSettings().setDomStorageEnabled(true);
        this.f29682a.getSettings().setJavaScriptEnabled(true);
        this.f29693b = true;
        this.f29682a.evaluateJavascript(sb.toString(), new C5537h());
    }

    /* renamed from: r */
    public final void mo37447r() {
        try {
            this.f29679a.findViewById(de3.C5007h.layout_netbanking).setVisibility(0);
            this.f29684a.setVisibility(8);
            this.f29685a.setVisibility(8);
            this.f29686a.setVisibility(8);
            this.f29683a.setVisibility(8);
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: s */
    public final void mo37448s() {
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:");
        sb.append("(function() { try {");
        if (!TextUtils.isEmpty(this.f29690a.get("activeInputJS"))) {
            sb.append(this.f29690a.get("activeInputJS"));
        }
        sb.append("}catch(e){Android.showLog('not found -could not inject user name');}}());");
        this.f29682a.getSettings().setDomStorageEnabled(true);
        this.f29682a.getSettings().setJavaScriptEnabled(true);
        this.f29693b = true;
        this.f29682a.evaluateJavascript(sb.toString(), new C5532c());
        mo37449u();
    }

    /* renamed from: t */
    public void mo33964t(WebView webView, String str) {
        EasypayBrowserFragment easypayBrowserFragment;
        int i;
        if (this.f29695c && (TextUtils.isEmpty(this.f29690a.get("nextsburl")) || str.contains(this.f29690a.get("nextsburl")))) {
            mo37453z();
            this.f29695c = false;
        }
        if (!str.contains(this.f29690a.get(ImagesContract.URL))) {
            easypayBrowserFragment = this.f29687a;
            if (easypayBrowserFragment != null) {
                i = 3;
            } else {
                return;
            }
        } else {
            easypayBrowserFragment = this.f29687a;
            if (easypayBrowserFragment != null) {
                i = 4;
            } else {
                return;
            }
        }
        easypayBrowserFragment.mo48720w0("", i);
    }

    /* renamed from: u */
    public final void mo37449u() {
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:");
        sb.append("(function() { try {");
        if (!TextUtils.isEmpty(this.f29690a.get("activepwjs"))) {
            sb.append(this.f29690a.get("activepwjs"));
        }
        sb.append("}catch(e){Android.showLog('not found -could not inject user name');}}());");
        this.f29682a.getSettings().setDomStorageEnabled(true);
        this.f29682a.getSettings().setJavaScriptEnabled(true);
        this.f29693b = true;
        this.f29682a.evaluateJavascript(sb.toString(), new C5533d());
    }

    /* renamed from: v */
    public void mo33966v(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    /* renamed from: w */
    public final void mo37450w(CheckBox checkBox) {
        if (checkBox != null) {
            checkBox.addTextChangedListener(new C5544m());
        }
    }

    /* renamed from: x */
    public void mo37451x(String str) {
        this.f29696d = str;
        mo37436B();
    }

    /* renamed from: y */
    public final String mo37452y() {
        return "Android.NbWatcher(" + "login_submkitted," + "check url" + ");";
    }

    /* renamed from: z */
    public final void mo37453z() {
        String str = this.f29690a.get(ImagesContract.URL);
        new Handler().postDelayed(new C5546o(str.length(), str), 100);
    }
}
