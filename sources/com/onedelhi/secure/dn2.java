package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.CheckBox;
import com.onedelhi.secure.de3;
import com.onedelhi.secure.wr0;
import easypay.appinvoke.actions.EasypayBrowserFragment;
import easypay.appinvoke.actions.GAEventManager;
import easypay.appinvoke.manager.Constants;
import easypay.appinvoke.manager.EasyPayHelper;
import easypay.appinvoke.manager.EasypayWebViewClient;
import easypay.appinvoke.manager.PaytmAssist;
import java.util.ArrayList;
import java.util.HashMap;

public class dn2 implements vw4, lu1 {

    /* renamed from: a */
    public Activity f27511a;

    /* renamed from: a */
    public WebView f27512a;

    /* renamed from: a */
    public CheckBox f27513a;

    /* renamed from: a */
    public ew2 f27514a;

    /* renamed from: a */
    public EasypayBrowserFragment f27515a;

    /* renamed from: a */
    public GAEventManager f27516a;

    /* renamed from: a */
    public StringBuilder f27517a;

    /* renamed from: a */
    public HashMap<String, ew2> f27518a;

    /* renamed from: b */
    public String f27519b;

    /* renamed from: b */
    public boolean f27520b = false;

    /* renamed from: n */
    public int f27521n = 0;

    /* renamed from: com.onedelhi.secure.dn2$a */
    public class C5034a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ew2 f27523a;

        /* renamed from: b */
        public final /* synthetic */ String f27524b;

        public C5034a(ew2 ew2, String str) {
            this.f27523a = ew2;
            this.f27524b = str;
        }

        public void run() {
            dn2 dn2;
            ew2 ew2;
            ew2 ew22 = this.f27523a;
            if (ew22 != null && !TextUtils.isEmpty(ew22.mo35650c())) {
                try {
                    String str = this.f27524b;
                    char c = 65535;
                    switch (str.hashCode()) {
                        case -2086665488:
                            if (str.equals(Constants.NEXT_BTN)) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1590453867:
                            if (str.equals(Constants.SUBMIT_BTN)) {
                                c = 1;
                                break;
                            }
                            break;
                        case -469982381:
                            if (str.equals(Constants.AUTOFILL_USERID)) {
                                c = 8;
                                break;
                            }
                            break;
                        case -83625758:
                            if (str.equals(Constants.READ_OTP)) {
                                c = 0;
                                break;
                            }
                            break;
                        case 64933036:
                            if (str.equals(Constants.PASSWORD_INPUT_REGISTER)) {
                                c = 7;
                                break;
                            }
                            break;
                        case 1110972755:
                            if (str.equals(Constants.FILLER_FROM_CODE)) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1201244404:
                            if (str.equals(Constants.PREVIOUS_BTN)) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1559877390:
                            if (str.equals(Constants.FILLER_FROM_WEB)) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1881123402:
                            if (str.equals(Constants.PASSWORD_FINDER)) {
                                c = 6;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 1:
                            C5706ib.m51978a("Action  SUBMIT_BTN", this);
                            dn2.this.mo34516x(this.f27523a.mo35650c());
                            if (dn2.this.f27515a != null && dn2.this.f27515a.isAdded()) {
                                dn2.this.f27515a.mo48720w0("", 3);
                                return;
                            }
                            return;
                        case 2:
                            C5706ib.m51978a("Action  NEXT_BTN", this);
                            dn2 = dn2.this;
                            ew2 = this.f27523a;
                            break;
                        case 3:
                            dn2 = dn2.this;
                            ew2 = this.f27523a;
                            break;
                        case 5:
                            C5706ib.m51978a(" called Action FILLER_FROM_WEB ", this);
                            dn2 = dn2.this;
                            ew2 = this.f27523a;
                            break;
                        case 6:
                        case 7:
                            dn2 = dn2.this;
                            ew2 = this.f27523a;
                            break;
                        case 8:
                            C5706ib.m51978a("Inside AUTOFILL_USERID", this);
                            ew2 unused = dn2.this.f27514a = this.f27523a;
                            dn2.this.mo34512r();
                            return;
                        default:
                            return;
                    }
                    dn2.mo34516x(ew2.mo35650c());
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.dn2$b */
    public class C5035b implements Runnable {

        /* renamed from: com.onedelhi.secure.dn2$b$a */
        public class C5036a extends tj4<HashMap<String, ArrayList<String>>> {
            public C5036a() {
            }
        }

        /* renamed from: com.onedelhi.secure.dn2$b$b */
        public class C5037b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ ArrayList f27528a;

            /* renamed from: b */
            public final /* synthetic */ String f27529b;

            public C5037b(String str, ArrayList arrayList) {
                this.f27529b = str;
                this.f27528a = arrayList;
            }

            public void run() {
                dn2.this.f27515a.mo48678E0(this.f27529b);
                if (dn2.this.f27521n > 1) {
                    dn2.this.f27515a.mo48686M0(dn2.this.f27521n, true);
                    dn2.this.f27515a.mo48689O0(true);
                    dn2.this.f27515a.mo48680G0(this.f27528a);
                    return;
                }
                dn2.this.f27515a.mo48686M0(dn2.this.f27521n, false);
                dn2.this.f27515a.mo48689O0(false);
            }
        }

        /* renamed from: com.onedelhi.secure.dn2$b$c */
        public class C5038c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ ArrayList f27531a;

            public C5038c(ArrayList arrayList) {
                this.f27531a = arrayList;
            }

            public void run() {
                dn2 dn2 = dn2.this;
                dn2.mo34513s((String) this.f27531a.get(dn2.f27521n - 1));
                dn2.this.f27515a.mo48701i0();
            }
        }

        public C5035b() {
        }

        public void run() {
            String string = new wr0(dn2.this.f27511a.getApplicationContext(), "PaytmAsist").getString(Constants.USER_ID_NET_BANK_KEY, "");
            C5706ib.m51978a("inside fetch USerID" + string, this);
            try {
                HashMap hashMap = (HashMap) new fj1().mo36013o(string, new C5036a().getType());
                if (hashMap != null) {
                    C5706ib.m51978a("inside fetch USerID", this);
                    ArrayList arrayList = (ArrayList) hashMap.get(dn2.this.f27519b);
                    if (arrayList != null) {
                        int unused = dn2.this.f27521n = arrayList.size();
                        if (dn2.this.f27521n > 0) {
                            String str = (String) arrayList.get(dn2.this.f27521n - 1);
                            if (dn2.this.f27511a != null && !dn2.this.f27511a.isFinishing()) {
                                dn2.this.f27511a.runOnUiThread(new C5037b(str, arrayList));
                            }
                            if (dn2.this.f27511a != null && !dn2.this.f27511a.isFinishing()) {
                                dn2.this.f27511a.runOnUiThread(new C5038c(arrayList));
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.onedelhi.secure.dn2$c */
    public class C5039c implements ValueCallback<String> {
        public C5039c() {
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
        }
    }

    /* renamed from: com.onedelhi.secure.dn2$d */
    public class C5040d implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f27534b;

        /* renamed from: c */
        public final /* synthetic */ String f27535c;

        /* renamed from: n */
        public final /* synthetic */ int f27536n;

        public C5040d(int i, String str, String str2) {
            this.f27536n = i;
            this.f27534b = str;
            this.f27535c = str2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
            r0.mo48720w0(r1, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bf, code lost:
            r0.mo48720w0(r2, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                int r0 = r4.f27536n
                r1 = 106(0x6a, float:1.49E-43)
                if (r0 == r1) goto L_0x00f9
                r1 = 108(0x6c, float:1.51E-43)
                java.lang.String r2 = ""
                if (r0 == r1) goto L_0x00df
                r1 = 157(0x9d, float:2.2E-43)
                if (r0 == r1) goto L_0x00c3
                r1 = 1
                switch(r0) {
                    case 151: goto L_0x00ac;
                    case 152: goto L_0x0057;
                    case 153: goto L_0x0049;
                    default: goto L_0x0014;
                }
            L_0x0014:
                switch(r0) {
                    case 159: goto L_0x003e;
                    case 160: goto L_0x0022;
                    case 161: goto L_0x0019;
                    default: goto L_0x0017;
                }
            L_0x0017:
                goto L_0x010a
            L_0x0019:
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                easypay.appinvoke.actions.EasypayBrowserFragment r0 = r0.f27515a
                r1 = 5
                goto L_0x00bf
            L_0x0022:
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                easypay.appinvoke.actions.EasypayBrowserFragment r0 = r0.f27515a
                r0.mo48702j0()
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                int r0 = r0.f27521n
                if (r0 <= 0) goto L_0x010a
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                easypay.appinvoke.actions.EasypayBrowserFragment r0 = r0.f27515a
                r0.mo48689O0(r1)
                goto L_0x010a
            L_0x003e:
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                easypay.appinvoke.actions.EasypayBrowserFragment r0 = r0.f27515a
                r0.mo48701i0()
                goto L_0x010a
            L_0x0049:
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                easypay.appinvoke.actions.EasypayBrowserFragment r0 = r0.f27515a
                java.lang.String r1 = r4.f27534b
                r2 = 3
            L_0x0052:
                r0.mo48720w0(r1, r2)
                goto L_0x010a
            L_0x0057:
                boolean r0 = easypay.appinvoke.manager.Constants.IS_RELEASE_8_1_0
                if (r0 == 0) goto L_0x0065
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                easypay.appinvoke.actions.EasypayBrowserFragment r0 = r0.f27515a
                java.lang.String r1 = r4.f27534b
                r2 = 0
                goto L_0x0052
            L_0x0065:
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                easypay.appinvoke.actions.EasypayBrowserFragment r0 = r0.f27515a
                r0.mo48702j0()
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                easypay.appinvoke.actions.EasypayBrowserFragment r0 = r0.f27515a
                int r2 = com.onedelhi.secure.de3.C5007h.layout_netbanking
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                r0.mo48690P0(r2, r3)
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                easypay.appinvoke.actions.EasypayBrowserFragment r0 = r0.f27515a
                java.lang.String r2 = r4.f27534b
                r0.mo48683J0(r2)
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                easypay.appinvoke.actions.EasypayBrowserFragment r0 = r0.f27515a
                int r2 = r0.f38700n
                int r2 = r2 + r1
                r0.f38700n = r2
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                boolean r0 = r0.f27520b
                if (r0 != 0) goto L_0x010a
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                boolean unused = r0.f27520b = r1
                java.lang.String r0 = "Autofill called"
                com.onedelhi.secure.C5706ib.m51978a(r0, r4)
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                java.util.HashMap r1 = r0.f27518a
                java.lang.String r2 = "AUTOFILL_USERID"
                goto L_0x0101
            L_0x00ac:
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                java.lang.StringBuilder r0 = r0.f27517a
                java.lang.String r2 = r4.f27534b
                r0.append(r2)
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                easypay.appinvoke.actions.EasypayBrowserFragment r0 = r0.f27515a
                java.lang.String r2 = r4.f27534b
            L_0x00bf:
                r0.mo48720w0(r2, r1)
                goto L_0x010a
            L_0x00c3:
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                android.widget.CheckBox r0 = r0.f27513a
                if (r0 == 0) goto L_0x010a
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                android.widget.CheckBox r0 = r0.f27513a
                boolean r0 = r0.isChecked()
                if (r0 == 0) goto L_0x010a
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                java.lang.String r1 = r4.f27535c
                r0.mo34517y(r1)
                goto L_0x010a
            L_0x00df:
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                easypay.appinvoke.actions.EasypayBrowserFragment r0 = r0.f27515a
                com.onedelhi.secure.vq2 r0 = r0.mo48700h0()
                if (r0 == 0) goto L_0x010a
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                easypay.appinvoke.actions.EasypayBrowserFragment r0 = r0.f27515a
                com.onedelhi.secure.vq2 r0 = r0.mo48700h0()
                r0.mo46285E(r2)
                goto L_0x010a
            L_0x00f9:
                com.onedelhi.secure.dn2 r0 = com.onedelhi.secure.dn2.this
                java.util.HashMap r1 = r0.f27518a
                java.lang.String r2 = "PASSWORD_FINDER"
            L_0x0101:
                java.lang.Object r1 = r1.get(r2)
                com.onedelhi.secure.ew2 r1 = (com.onedelhi.secure.ew2) r1
                r0.mo34514u(r2, r1)
            L_0x010a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.dn2.C5040d.run():void");
        }
    }

    /* renamed from: com.onedelhi.secure.dn2$e */
    public class C5041e implements Runnable {
        public C5041e() {
        }

        public void run() {
            dn2 dn2 = dn2.this;
            dn2.mo34514u(Constants.PASSWORD_FINDER, (ew2) dn2.f27518a.get(Constants.PASSWORD_FINDER));
        }
    }

    /* renamed from: com.onedelhi.secure.dn2$f */
    public class C5042f implements Runnable {

        /* renamed from: n */
        public final /* synthetic */ int f27539n;

        public C5042f(int i) {
            this.f27539n = i;
        }

        public void run() {
            int i = this.f27539n;
            if (i == 154 || i == 156) {
                dn2.this.f27515a.mo48690P0(de3.C5007h.layout_netbanking, Boolean.TRUE);
                dn2.this.f27515a.mo48720w0("", 1);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.dn2$g */
    public class C5043g extends tj4<HashMap<String, ArrayList<String>>> {
        public C5043g() {
        }
    }

    @SuppressLint({"AddJavascriptInterface"})
    public dn2(HashMap<String, ew2> hashMap, WebView webView, Activity activity, C5235fb fbVar) {
        if (hashMap != null) {
            try {
                this.f27518a = hashMap;
            } catch (Exception e) {
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
                return;
            }
        }
        if (fbVar != null) {
            this.f27519b = fbVar.mo35825a();
        }
        this.f27512a = webView;
        this.f27511a = activity;
        this.f27513a = (CheckBox) activity.findViewById(de3.C5007h.cb_nb_userId);
        EasyPayHelper easyPayHelper = PaytmAssist.getAssistInstance().getEasyPayHelper();
        this.f27516a = PaytmAssist.getAssistInstance().getmAnalyticsManager();
        this.f27515a = PaytmAssist.getAssistInstance().getFragment();
        easyPayHelper.addJsCallListener(this);
        PaytmAssist.getAssistInstance().getmAnalyticsManager().mo38413a(true);
        EasypayWebViewClient webClientInstance = PaytmAssist.getAssistInstance().getWebClientInstance();
        PaytmAssist.getAssistInstance().getmAnalyticsManager().mo38419g(webView.getUrl());
        this.f27516a.mo38413a(true);
        webClientInstance.addAssistWebClientListener(this);
        this.f27517a = new StringBuilder();
        this.f27515a.mo48682I0(true);
        PaytmAssist.getAssistInstance().getmEventMap().put("rememberUserId", "Checked");
    }

    /* renamed from: A */
    public final void mo34508A(int i) {
        try {
            Activity activity = this.f27511a;
            if (activity != null && this.f27515a != null) {
                activity.runOnUiThread(new C5042f(i));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: B */
    public void mo34509B(String str) {
        if (!TextUtils.isEmpty(str)) {
            mo34513s(str);
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
    public void mo34510a(String str, String str2, int i) {
        try {
            this.f27511a.runOnUiThread(new C5040d(i, str2, str));
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public void mo34511b(String str, String str2, int i) {
        if (i == 100) {
            mo34514u(Constants.SUBMIT_BTN, this.f27518a.get(Constants.SUBMIT_BTN));
        } else if (i != 106) {
            switch (i) {
                case Constants.ACTION_PASSWORD_FOUND /*154*/:
                    mo34508A(Constants.ACTION_PASSWORD_FOUND);
                    mo34514u(Constants.PASSWORD_INPUT_REGISTER, this.f27518a.get(Constants.PASSWORD_INPUT_REGISTER));
                    return;
                case 155:
                    EasypayBrowserFragment easypayBrowserFragment = this.f27515a;
                    if (easypayBrowserFragment != null) {
                        easypayBrowserFragment.mo48718u0(155, "START OTP FROM NET BANKING");
                        return;
                    }
                    return;
                case Constants.ACTION_DELAY_PASSWORD_FOUND /*156*/:
                    try {
                        new Handler().postDelayed(new C5041e(), 500);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                default:
                    return;
            }
        } else {
            mo34514u(Constants.PASSWORD_FINDER, this.f27518a.get(Constants.PASSWORD_FINDER));
        }
    }

    /* renamed from: r */
    public final void mo34512r() {
        C5706ib.m51978a("inside fetch USerID before run", this);
        new Thread(new C5035b()).start();
    }

    /* renamed from: s */
    public final void mo34513s(String str) {
        String c = this.f27514a.mo35650c();
        try {
            int indexOf = c.indexOf("''");
            StringBuilder sb = new StringBuilder();
            int i = indexOf + 1;
            sb.append(c.substring(0, i));
            sb.append(str);
            sb.append(c.substring(i));
            String sb2 = sb.toString();
            C5706ib.m51978a("Autofill JS After UserId" + sb2, this);
            EasypayBrowserFragment easypayBrowserFragment = this.f27515a;
            if (easypayBrowserFragment != null && easypayBrowserFragment.isAdded()) {
                this.f27515a.mo48683J0(str);
            }
            C5706ib.m51978a("autofill js:" + sb2, this);
            mo34516x(sb2);
            GAEventManager gAEventManager = this.f27516a;
            if (gAEventManager != null) {
                gAEventManager.mo38400B(true);
            }
        } catch (Exception e) {
            GAEventManager gAEventManager2 = this.f27516a;
            if (gAEventManager2 != null) {
                gAEventManager2.mo38400B(false);
            }
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
    }

    /* renamed from: t */
    public void mo33964t(WebView webView, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                EasypayBrowserFragment easypayBrowserFragment = this.f27515a;
                if (easypayBrowserFragment != null) {
                    easypayBrowserFragment.mo48720w0("", 3);
                    return;
                }
                return;
            }
            EasypayBrowserFragment easypayBrowserFragment2 = this.f27515a;
            if (easypayBrowserFragment2 != null) {
                easypayBrowserFragment2.mo48720w0("", 4);
                this.f27515a.mo48720w0("", 4);
            }
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
    }

    /* renamed from: u */
    public void mo34514u(String str, ew2 ew2) {
        try {
            Activity activity = this.f27511a;
            if (activity != null) {
                activity.runOnUiThread(new C5034a(ew2, str));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: v */
    public void mo33966v(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    /* renamed from: w */
    public int mo34515w() {
        return this.f27521n;
    }

    /* renamed from: x */
    public final void mo34516x(String str) {
        try {
            if (this.f27512a != null && !TextUtils.isEmpty(str)) {
                this.f27512a.evaluateJavascript(str, new C5039c());
            }
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
    }

    /* renamed from: y */
    public final void mo34517y(String str) {
        try {
            EasypayBrowserFragment easypayBrowserFragment = this.f27515a;
            if (easypayBrowserFragment == null || easypayBrowserFragment.f38689d) {
                wr0 wr0 = new wr0(this.f27511a.getApplicationContext(), "PaytmAsist");
                wr0.C7178a d = wr0.edit();
                String str2 = this.f27519b;
                HashMap hashMap = (HashMap) new fj1().mo36013o(wr0.getString(Constants.USER_ID_NET_BANK_KEY, ""), new C5043g().getType());
                fj1 fj1 = new fj1();
                if (hashMap != null) {
                    ArrayList arrayList = (ArrayList) hashMap.get(this.f27519b);
                    if (arrayList != null) {
                        if (arrayList.contains(str)) {
                            arrayList.remove(str);
                        } else if (arrayList.size() == 3) {
                            arrayList.remove(0);
                        }
                        arrayList.add(str);
                    } else {
                        arrayList = new ArrayList();
                        arrayList.add(str);
                    }
                    hashMap.put(str2, arrayList);
                } else {
                    hashMap = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(str);
                    hashMap.put(str2, arrayList2);
                }
                d.putString(Constants.USER_ID_NET_BANK_KEY, fj1.mo36024z(hashMap));
                d.apply();
            }
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
    }

    /* renamed from: z */
    public void mo34518z(HashMap<String, ew2> hashMap, C5235fb fbVar) {
        if (hashMap != null) {
            try {
                this.f27518a = hashMap;
            } catch (Exception e) {
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
                return;
            }
        }
        if (fbVar != null) {
            this.f27519b = fbVar.mo35825a();
        }
        HashMap<String, ew2> hashMap2 = this.f27518a;
        if (hashMap2 != null && hashMap2.containsKey(Constants.FILLER_FROM_WEB)) {
            mo34514u(Constants.FILLER_FROM_WEB, this.f27518a.get(Constants.FILLER_FROM_WEB));
        }
    }
}
