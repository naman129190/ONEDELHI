package com.onedelhi.secure;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.onedelhi.secure.de3;
import easypay.appinvoke.actions.EasypayBrowserFragment;
import easypay.appinvoke.actions.GAEventManager;
import easypay.appinvoke.manager.Constants;
import easypay.appinvoke.manager.EasypayWebViewClient;
import easypay.appinvoke.manager.PaytmAssist;
import easypay.appinvoke.widget.OtpEditText;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class vq2 implements vw4, lu1, TextWatcher, C4474a8 {

    /* renamed from: a */
    public Activity f36620a;

    /* renamed from: a */
    public final BroadcastReceiver f36621a = new C7067a();

    /* renamed from: a */
    public WebView f36622a;

    /* renamed from: a */
    public ew2 f36623a;

    /* renamed from: a */
    public EasypayBrowserFragment f36624a;

    /* renamed from: a */
    public GAEventManager f36625a;

    /* renamed from: a */
    public EasypayWebViewClient f36626a;

    /* renamed from: a */
    public HashMap<String, ew2> f36627a = new HashMap<>();

    /* renamed from: b */
    public String f36628b;

    /* renamed from: b */
    public boolean f36629b;

    /* renamed from: c */
    public boolean f36630c;

    /* renamed from: d */
    public boolean f36631d = false;

    /* renamed from: e */
    public boolean f36632e;

    /* renamed from: f */
    public boolean f36633f;

    /* renamed from: n */
    public int f36634n = 0;

    /* renamed from: com.onedelhi.secure.vq2$a */
    public class C7067a extends BroadcastReceiver {
        public C7067a() {
        }

        public void onReceive(Context context, Intent intent) {
            try {
                C5706ib.m51978a("Otp message received", this);
                if (intent != null) {
                    if (intent.getAction() != null) {
                        boolean unused = vq2.this.f36630c = true;
                    }
                    if (intent.getAction() != null && intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) {
                        String str = "";
                        for (SmsMessage smsMessage : Telephony.Sms.Intents.getMessagesFromIntent(intent)) {
                            String displayOriginatingAddress = smsMessage.getDisplayOriginatingAddress();
                            str = str + smsMessage.getMessageBody();
                            C5706ib.m51978a("Calling checkSms from broadcast receiver", this);
                            vq2.this.mo46299w(str, displayOriginatingAddress);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.vq2$b */
    public class C7068b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f36637b;

        public C7068b(String str) {
            this.f36637b = str;
        }

        public void run() {
            if (vq2.this.f36624a != null && vq2.this.f36624a.isResumed()) {
                C5706ib.m51978a("Show Log Called :Minimizing Assist:Reason = " + this.f36637b, this);
                vq2.this.f36624a.mo48675B0();
            }
        }
    }

    /* renamed from: com.onedelhi.secure.vq2$c */
    public class C7069c implements Runnable {

        /* renamed from: n */
        public final /* synthetic */ int f36639n;

        public C7069c(int i) {
            this.f36639n = i;
        }

        public void run() {
            try {
                C5706ib.m51978a("insideSuccessEvent : Event value passed = " + this.f36639n, this);
                vq2.this.mo46297s();
                if (r70.m26348a(vq2.this.f36620a, "android.permission.READ_SMS") == 0) {
                    if (vq2.this.f36627a.get(Constants.READ_OTP) == null) {
                        C5706ib.m51978a("Reading existing messages.", this);
                        if (!vq2.this.f36633f) {
                            vq2 vq2 = vq2.this;
                            vq2.mo46298u(vq2.f36620a);
                        }
                    } else {
                        C5706ib.m51978a("Reading current message.", this);
                        vq2.this.mo46300x(Constants.READ_OTP);
                    }
                }
                vq2.this.mo46300x(Constants.SUBMIT_BTN);
                vq2.this.mo46300x(Constants.FILLER_FROM_CODE);
                vq2.this.mo46300x(Constants.RESEND_BTN);
            } catch (Exception e) {
                C5706ib.m51978a("Any Exception in OTP Flow" + e.getMessage(), this);
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.vq2$d */
    public class C7070d implements ValueCallback<String> {
        public C7070d() {
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
        }
    }

    /* renamed from: com.onedelhi.secure.vq2$e */
    public class C7071e implements Runnable {

        /* renamed from: com.onedelhi.secure.vq2$e$a */
        public class C7072a implements Runnable {

            /* renamed from: com.onedelhi.secure.vq2$e$a$a */
            public class C7073a implements Runnable {
                public C7073a() {
                }

                public void run() {
                    if (vq2.this.f36620a != null) {
                        C5706ib.m51978a("About to fire OTP not detcted ", this);
                        if (!vq2.this.f36620a.isFinishing() && vq2.this.f36624a.isAdded() && !vq2.this.f36630c) {
                            C5706ib.m51978a("OTP not detcted ", this);
                            vq2.this.mo46282B();
                        }
                    }
                }
            }

            public C7072a() {
            }

            public void run() {
                if (vq2.this.f36620a != null) {
                    vq2.this.f36620a.runOnUiThread(new C7073a());
                }
            }
        }

        public C7071e() {
        }

        public void run() {
            try {
                if (vq2.this.f36624a != null && vq2.this.f36624a.isAdded()) {
                    C5706ib.m51978a("Activating otphelper", this);
                    vq2.this.f36624a.mo48679F0(vq2.this.f36620a.getString(de3.C5011l.waiting_for_otp_label, new Object[]{PaytmAssist.getAssistInstance().geTxnBank()}));
                    vq2.this.f36624a.mo48690P0(de3.C5007h.otpHelper, Boolean.TRUE);
                    new Handler().postDelayed(new C7072a(), 10000);
                }
            } catch (Exception e) {
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.vq2$f */
    public class C7074f implements ValueCallback<String> {
        public C7074f() {
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
        }
    }

    /* renamed from: com.onedelhi.secure.vq2$g */
    public class C7075g implements Runnable {
        public C7075g() {
        }

        public void run() {
            try {
                vq2.this.f36624a.mo48679F0(vq2.this.f36620a.getString(de3.C5011l.otp_detected));
                boolean unused = vq2.this.f36629b = true;
                if (vq2.this.f36624a.f38663a != null) {
                    vq2.this.f36624a.f38663a.setText(vq2.this.f36628b);
                    if (vq2.this.f36625a != null) {
                        vq2.this.f36625a.mo38408J(true);
                    }
                }
                vq2.this.f36624a.mo48681H0(vq2.this.f36632e);
            } catch (Exception e) {
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.vq2$h */
    public class C7076h implements Runnable {
        public C7076h() {
        }

        public void run() {
            EasypayWebViewClient.smsTrackingTime = System.currentTimeMillis();
            vq2.this.f36624a.mo48694b0();
            vq2.this.f36624a.mo48690P0(de3.C5007h.otpHelper, Boolean.FALSE);
        }
    }

    public vq2(Activity activity, WebView webView, EasypayBrowserFragment easypayBrowserFragment, EasypayWebViewClient easypayWebViewClient) {
        if (activity != null) {
            try {
                this.f36620a = activity;
                this.f36624a = easypayBrowserFragment;
                this.f36622a = webView;
                if (easypayWebViewClient == null) {
                    this.f36626a = PaytmAssist.getAssistInstance().getWebClientInstance();
                } else {
                    this.f36626a = easypayWebViewClient;
                }
                PaytmAssist.getAssistInstance().getEasyPayHelper().addJsCallListener(this);
                this.f36625a = PaytmAssist.getAssistInstance().getmAnalyticsManager();
                PaytmAssist.getAssistInstance().registerSMSCallBack(this);
            } catch (Exception e) {
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
            }
            EasypayWebViewClient easypayWebViewClient2 = this.f36626a;
            if (easypayWebViewClient2 != null) {
                easypayWebViewClient2.addAssistWebClientListener(this);
            }
        }
    }

    /* renamed from: A */
    public final void mo46281A(String str) {
        JSONObject jSONObject;
        OtpEditText otpEditText = this.f36624a.f38663a;
        String str2 = null;
        if ((otpEditText != null ? otpEditText.getTag() : null) != null) {
            ew2 ew2 = (ew2) this.f36624a.f38663a.getTag();
            try {
                jSONObject = new JSONObject(ew2.mo35648a());
            } catch (JSONException e) {
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
                jSONObject = null;
            }
            fj1 fj1 = new fj1();
            if (jSONObject != null) {
                str2 = jSONObject.toString();
            }
            mo46302z(((C5809jb) fj1.mo36012n(str2, C5809jb.class)).mo38595b(), ew2.mo35650c(), str);
        }
    }

    /* renamed from: B */
    public final void mo46282B() {
        try {
            EasypayBrowserFragment easypayBrowserFragment = this.f36624a;
            if (easypayBrowserFragment != null && easypayBrowserFragment.isVisible() && this.f36624a.isAdded() && this.f36624a.getUserVisibleHint()) {
                this.f36624a.mo48679F0(this.f36620a.getString(de3.C5011l.otp_could_not_detcted));
                GAEventManager gAEventManager = this.f36625a;
                if (gAEventManager != null) {
                    gAEventManager.mo38405G(false);
                }
                this.f36624a.mo48719v0();
            }
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
    }

    /* renamed from: C */
    public final void mo46283C(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                Object[] objArr = (Object[]) extras.get("pdus");
                SmsMessage[] smsMessageArr = objArr != null ? new SmsMessage[objArr.length] : null;
                if (smsMessageArr != null) {
                    for (int i = 0; i < smsMessageArr.length; i++) {
                        smsMessageArr[i] = SmsMessage.createFromPdu((byte[]) objArr[i]);
                        mo46299w(smsMessageArr[i].getMessageBody(), smsMessageArr[i].getOriginatingAddress());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
            }
        }
    }

    /* renamed from: D */
    public final boolean mo46284D() {
        return r70.m26348a(this.f36620a, "android.permission.READ_SMS") == 0 && r70.m26348a(this.f36620a, "android.permission.RECEIVE_SMS") == 0;
    }

    /* renamed from: E */
    public void mo46285E(String str) {
        EasypayBrowserFragment easypayBrowserFragment;
        if (this.f36620a != null && (easypayBrowserFragment = this.f36624a) != null && easypayBrowserFragment.isAdded()) {
            this.f36628b = str;
        }
    }

    /* renamed from: F */
    public final void mo46286F() {
        try {
            if (!C3962y2.m31865M(this.f36620a, "android.permission.READ_SMS")) {
                C3962y2.m31859G(this.f36620a, new String[]{"android.permission.READ_SMS", "android.permission.RECEIVE_SMS"}, 102);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: G */
    public void mo46287G(HashMap<String, ew2> hashMap) {
        this.f36627a = hashMap;
        mo46290L();
        mo46288I(this.f36627a.get(Constants.FILLER_FROM_CODE));
    }

    /* renamed from: H */
    public boolean mo33954H(WebView webView, Object obj) {
        return false;
    }

    /* renamed from: I */
    public final void mo46288I(ew2 ew2) {
        try {
            EasypayBrowserFragment easypayBrowserFragment = this.f36624a;
            if (easypayBrowserFragment != null && easypayBrowserFragment.isVisible() && this.f36624a.isAdded()) {
                this.f36623a = ew2;
                if (this.f36624a.f38663a != null) {
                    C5706ib.m51978a("Text Watcher", this);
                    this.f36624a.f38663a.addTextChangedListener(this);
                    this.f36624a.f38663a.setTag(ew2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
    }

    /* renamed from: J */
    public final void mo46289J(String str) {
        try {
            Activity activity = this.f36620a;
            if (activity != null) {
                activity.runOnUiThread(new C7068b(str));
            }
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
    }

    /* renamed from: K */
    public void mo33955K(WebView webView, String str, Bitmap bitmap) {
    }

    /* renamed from: L */
    public final void mo46290L() {
        if (PaytmAssist.isEasyPayEnabled) {
            if (!mo46284D()) {
                mo46286F();
            }
            this.f36620a.registerReceiver(this.f36621a, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
        }
    }

    /* renamed from: M */
    public void mo46291M(ew2 ew2) {
        if (!PaytmAssist.getAssistInstance().isFragmentPaused() && !this.f36624a.f38686c) {
            if (ew2 == null) {
                try {
                    GAEventManager gAEventManager = this.f36625a;
                    if (gAEventManager != null) {
                        gAEventManager.mo38404F(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    C5706ib.m51978a("EXCEPTION", e);
                }
            } else {
                String c = ew2.mo35650c();
                GAEventManager gAEventManager2 = this.f36625a;
                if (gAEventManager2 != null) {
                    gAEventManager2.mo38404F(true);
                }
                this.f36622a.evaluateJavascript(c, new C7074f());
                this.f36633f = true;
            }
        }
    }

    /* renamed from: N */
    public final void mo46292N(int i) {
        this.f36620a.runOnUiThread(new C7069c(i));
    }

    /* renamed from: O */
    public void mo46293O() {
        Activity activity = this.f36620a;
        if (activity != null) {
            activity.unregisterReceiver(this.f36621a);
        }
    }

    /* renamed from: V */
    public void mo33956V(WebView webView, String str) {
    }

    /* renamed from: a */
    public void mo34510a(String str, String str2, int i) {
        if (i == 158) {
            EasypayBrowserFragment easypayBrowserFragment = this.f36624a;
            if (easypayBrowserFragment != null) {
                easypayBrowserFragment.mo48694b0();
            }
        } else if (i == 201) {
            this.f36631d = true;
        } else if (i == 221) {
            EasypayBrowserFragment easypayBrowserFragment2 = this.f36624a;
            if (easypayBrowserFragment2 != null) {
                easypayBrowserFragment2.mo48713r0();
            }
        } else if (i != 222) {
            switch (i) {
                case 107:
                    C5706ib.m51978a("Success Event called", this);
                    mo46292N(i);
                    return;
                case 108:
                    mo46285E(str2);
                    return;
                case 109:
                    try {
                        mo46289J(str2);
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                default:
                    return;
            }
        } else {
            EasypayBrowserFragment easypayBrowserFragment3 = this.f36624a;
            if (easypayBrowserFragment3 != null) {
                easypayBrowserFragment3.mo48712q0();
            }
        }
    }

    public void afterTextChanged(Editable editable) {
        JSONObject jSONObject;
        GAEventManager gAEventManager;
        OtpEditText otpEditText;
        GAEventManager gAEventManager2;
        if (this.f36623a != null) {
            try {
                String obj = editable.toString();
                C5706ib.m51978a("Text Change:" + obj, this);
                String str = null;
                if (obj.length() > 5) {
                    try {
                        if (!this.f36629b && (gAEventManager2 = this.f36625a) != null) {
                            gAEventManager2.mo38431s(true);
                        }
                        if (this.f36629b && (otpEditText = this.f36624a.f38663a) != null) {
                            otpEditText.setTypeface((Typeface) null, 1);
                        }
                        if (!this.f36629b && (gAEventManager = this.f36625a) != null) {
                            gAEventManager.mo38431s(true);
                        }
                    } catch (NullPointerException e) {
                        e.printStackTrace();
                        return;
                    }
                } else {
                    OtpEditText otpEditText2 = this.f36624a.f38663a;
                    if (otpEditText2 != null) {
                        otpEditText2.setTypeface((Typeface) null, 0);
                    }
                }
                OtpEditText otpEditText3 = this.f36624a.f38663a;
                if (otpEditText3 != null) {
                    ew2 ew2 = (ew2) otpEditText3.getTag();
                    try {
                        jSONObject = new JSONObject(ew2.mo35648a());
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        jSONObject = null;
                    }
                    fj1 fj1 = new fj1();
                    if (jSONObject != null) {
                        str = jSONObject.toString();
                    }
                    mo46302z(((C5809jb) fj1.mo36012n(str, C5809jb.class)).mo38595b(), ew2.mo35650c(), obj);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo34511b(String str, String str2, int i) {
        if (i == 300) {
            try {
                this.f36632e = true;
            } catch (Exception e) {
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: r */
    public void mo30481r(String str) {
        mo46299w(str, "na");
    }

    /* renamed from: s */
    public final void mo46297s() {
        try {
            Activity activity = this.f36620a;
            if (activity != null) {
                activity.runOnUiThread(new C7071e());
            }
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
    }

    /* renamed from: t */
    public void mo33964t(WebView webView, String str) {
        try {
            if (this.f36620a != null && this.f36624a != null && str.contains("transactionStatus")) {
                this.f36620a.runOnUiThread(new C7076h());
            }
        } catch (Exception e) {
            C5706ib.m51978a("EXCEPTION", e);
        }
    }

    /* renamed from: u */
    public final void mo46298u(Activity activity) {
        if (activity != null) {
            try {
                ContentResolver contentResolver = activity.getContentResolver();
                Uri uri = Telephony.Sms.Inbox.CONTENT_URI;
                Cursor query = contentResolver.query(uri, (String[]) null, "date>=?", new String[]{EasypayWebViewClient.smsTrackingTime + ""}, (String) null);
                if (query != null) {
                    while (query.moveToNext()) {
                        mo46299w(query.getString(query.getColumnIndex("body")), query.getString(query.getColumnIndex("address")));
                    }
                } else {
                    C5706ib.m51978a("cursor is null", this);
                }
                if (query != null) {
                    query.close();
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
            }
        } else {
            C5706ib.m51978a("activity is null", this);
        }
    }

    /* renamed from: v */
    public void mo33966v(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    /* renamed from: w */
    public final void mo46299w(String str, String str2) {
        this.f36634n++;
        C5706ib.m51978a("Check sms called: " + this.f36634n + " time", this);
        C5706ib.m51978a("Message received: " + str + "\n From:" + str2, this);
        Matcher matcher = Pattern.compile("\\d{6}").matcher(str);
        if (matcher.find()) {
            Matcher matcher2 = Pattern.compile("\\d{6}").matcher(matcher.group(0));
            if (matcher2.find()) {
                String group = matcher2.group(0);
                this.f36628b = group;
                if (this.f36631d) {
                    mo46281A(group);
                }
                C5706ib.m51978a("OTP found: " + this.f36628b, this);
                this.f36630c = true;
                GAEventManager gAEventManager = this.f36625a;
                if (gAEventManager != null) {
                    gAEventManager.mo38418f(true);
                    this.f36625a.mo38405G(true);
                }
                mo46301y();
                return;
            }
            mo46282B();
            return;
        }
        GAEventManager gAEventManager2 = this.f36625a;
        if (gAEventManager2 != null) {
            gAEventManager2.mo38418f(false);
        }
    }

    /* renamed from: x */
    public void mo46300x(String str) {
        ew2 ew2 = this.f36627a.get(str);
        if (ew2 != null && !TextUtils.isEmpty(ew2.mo35648a())) {
            str.hashCode();
            if (str.equals(Constants.READ_OTP)) {
                mo46298u(this.f36620a);
            } else if (str.equals(Constants.FILLER_FROM_WEB)) {
                C5706ib.m51978a("New otphelper:FILLER_FROM_WEB", this);
                String c = ew2.mo35650c();
                if (this.f36622a != null && !TextUtils.isEmpty(c)) {
                    this.f36622a.evaluateJavascript(c, new C7070d());
                }
            }
        }
    }

    /* renamed from: y */
    public final void mo46301y() {
        try {
            C5706ib.m51978a("After Sms :fill otp on assist:isAssistVisible" + this.f36624a.f38691e, this);
            if (this.f36620a == null || !this.f36624a.isAdded() || !this.f36624a.f38691e) {
                GAEventManager gAEventManager = this.f36625a;
                if (gAEventManager != null) {
                    gAEventManager.mo38408J(false);
                    return;
                }
                return;
            }
            this.f36620a.runOnUiThread(new C7075g());
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
    }

    /* renamed from: z */
    public final void mo46302z(String str, String str2, String str3) {
        C5706ib.m51978a("Filler from Code " + str3, this);
        String replace = str2.replace(str, str3);
        C5706ib.m51978a("Filler from Code " + replace, this);
        WebView webView = this.f36622a;
        if (webView != null) {
            webView.loadUrl(replace);
        }
    }
}
