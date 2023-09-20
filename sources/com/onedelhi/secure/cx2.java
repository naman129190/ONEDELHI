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
import android.telephony.SmsMessage;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.onedelhi.secure.de3;
import easypay.appinvoke.actions.EasypayBrowserFragment;
import easypay.appinvoke.actions.GAEventManager;
import easypay.appinvoke.manager.EasypayWebViewClient;
import easypay.appinvoke.manager.PaytmAssist;
import java.util.Map;
import java.util.Timer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cx2 implements vw4 {

    /* renamed from: a */
    public Activity f27088a;

    /* renamed from: a */
    public BroadcastReceiver f27089a = new C4923c();

    /* renamed from: a */
    public TextWatcher f27090a;

    /* renamed from: a */
    public WebView f27091a;

    /* renamed from: a */
    public EditText f27092a;

    /* renamed from: a */
    public TextView f27093a;

    /* renamed from: a */
    public EasypayBrowserFragment f27094a;

    /* renamed from: a */
    public GAEventManager f27095a;

    /* renamed from: a */
    public EasypayWebViewClient f27096a;

    /* renamed from: a */
    public Boolean f27097a = Boolean.FALSE;

    /* renamed from: a */
    public Map<String, String> f27098a;

    /* renamed from: a */
    public Timer f27099a;

    /* renamed from: b */
    public BroadcastReceiver f27100b = new C4924d();

    /* renamed from: b */
    public EditText f27101b;

    /* renamed from: b */
    public Boolean f27102b;

    /* renamed from: b */
    public String f27103b;

    /* renamed from: b */
    public Timer f27104b;

    /* renamed from: b */
    public boolean f27105b;

    /* renamed from: c */
    public String f27106c;

    /* renamed from: c */
    public boolean f27107c;

    /* renamed from: d */
    public String f27108d;

    /* renamed from: d */
    public boolean f27109d;

    /* renamed from: e */
    public String f27110e;

    /* renamed from: e */
    public boolean f27111e;

    /* renamed from: f */
    public String f27112f;

    /* renamed from: n */
    public int f27113n = 0;

    /* renamed from: com.onedelhi.secure.cx2$a */
    public class C4921a implements Runnable {
        public C4921a() {
        }

        public void run() {
            try {
                if (!TextUtils.isEmpty(cx2.this.f27106c)) {
                    cx2.this.f27101b.setText(cx2.this.f27106c);
                    cx2.this.f27101b.setSelection(cx2.this.f27101b.getText().length());
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: com.onedelhi.secure.cx2$b */
    public class C4922b implements Runnable {
        public C4922b() {
        }

        public void run() {
            cx2.this.f27094a.mo48690P0(de3.C5007h.otpHelper, Boolean.FALSE);
        }
    }

    /* renamed from: com.onedelhi.secure.cx2$c */
    public class C4923c extends BroadcastReceiver {
        public C4923c() {
        }

        public void onReceive(Context context, Intent intent) {
            try {
                if (intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) {
                    Bundle extras = intent.getExtras();
                    SmsMessage[] smsMessageArr = null;
                    if (extras != null) {
                        Object[] objArr = (Object[]) extras.get("pdus");
                        if (objArr != null) {
                            smsMessageArr = new SmsMessage[objArr.length];
                        }
                        if (smsMessageArr != null) {
                            for (int i = 0; i < smsMessageArr.length; i++) {
                                smsMessageArr[i] = SmsMessage.createFromPdu((byte[]) objArr[i]);
                                String originatingAddress = smsMessageArr[i].getOriginatingAddress();
                                cx2.this.mo33962r(smsMessageArr[i].getMessageBody(), originatingAddress);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.onedelhi.secure.cx2$d */
    public class C4924d extends BroadcastReceiver {
        public C4924d() {
        }

        public void onReceive(Context context, Intent intent) {
            try {
                String string = intent.getExtras().getString("eventName");
                if (string != null) {
                    char c = 65535;
                    switch (string.hashCode()) {
                        case -51042937:
                            if (string.equals("focusOtpField")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 853955742:
                            if (string.equals("approveOtp")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1392020230:
                            if (string.equals("activateOtpHelper")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 2018704624:
                            if (string.equals("resendOtp")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        ((InputMethodManager) cx2.this.f27088a.getSystemService("input_method")).showSoftInput(cx2.this.f27092a, 1);
                    } else if (c == 1) {
                        cx2.this.mo33957m();
                    } else if (c == 2) {
                        cx2.this.mo33958n();
                    } else if (c == 3) {
                        cx2.this.mo33967w();
                        cx2.this.f27094a.logEvent("resendOTP", (String) cx2.this.f27098a.get("id"));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.onedelhi.secure.cx2$e */
    public class C4925e implements View.OnFocusChangeListener {
        public C4925e() {
        }

        public void onFocusChange(View view, boolean z) {
            cx2.this.f27101b.setHint(z ? "" : "Enter OTP");
        }
    }

    /* renamed from: com.onedelhi.secure.cx2$f */
    public class C4926f implements Runnable {

        /* renamed from: com.onedelhi.secure.cx2$f$a */
        public class C4927a implements Runnable {

            /* renamed from: com.onedelhi.secure.cx2$f$a$a */
            public class C4928a implements ValueCallback<String> {
                public C4928a() {
                }

                /* renamed from: a */
                public void onReceiveValue(String str) {
                }
            }

            public C4927a() {
            }

            public void run() {
                cx2.this.f27091a.evaluateJavascript(cx2.this.f27108d, new C4928a());
            }
        }

        public C4926f() {
        }

        public void run() {
            cx2.this.f27091a.post(new C4927a());
        }
    }

    /* renamed from: com.onedelhi.secure.cx2$g */
    public class C4929g implements Runnable {

        /* renamed from: com.onedelhi.secure.cx2$g$a */
        public class C4930a implements Runnable {

            /* renamed from: com.onedelhi.secure.cx2$g$a$a */
            public class C4931a implements ValueCallback<String> {
                public C4931a() {
                }

                /* renamed from: a */
                public void onReceiveValue(String str) {
                }
            }

            public C4930a() {
            }

            public void run() {
                cx2.this.f27091a.evaluateJavascript(cx2.this.f27108d, new C4931a());
            }
        }

        public C4929g() {
        }

        public void run() {
            cx2.this.f27091a.post(new C4930a());
        }
    }

    /* renamed from: com.onedelhi.secure.cx2$h */
    public class C4932h implements Runnable {
        public C4932h() {
        }

        public void run() {
            try {
                cx2.this.f27094a.mo48690P0(de3.C5007h.otpHelper, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.onedelhi.secure.cx2$i */
    public class C4933i implements TextWatcher {
        public C4933i() {
        }

        public void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            obj.length();
            String str = "javascript:" + ((String) cx2.this.f27098a.get("functionStart"));
            cx2.this.f27091a.loadUrl((str + (cx2.this.f27103b + "if(fields.length){fields[0].value='" + obj + "';};")) + ((String) cx2.this.f27098a.get("functionEnd")));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.onedelhi.secure.cx2$j */
    public class C4934j implements Runnable {

        /* renamed from: com.onedelhi.secure.cx2$j$a */
        public class C4935a implements Runnable {
            public C4935a() {
            }

            public void run() {
                cx2.this.f27101b.setHint("Enter OTP");
                if (TextUtils.isEmpty(cx2.this.f27101b.getText())) {
                    cx2.this.f27093a.setText("Message not detected,Enter OTP Manually");
                }
            }
        }

        public C4934j() {
        }

        public void run() {
            if (cx2.this.f27088a != null) {
                cx2.this.f27088a.runOnUiThread(new C4935a());
            }
        }
    }

    /* renamed from: com.onedelhi.secure.cx2$k */
    public class C4936k implements Runnable {

        /* renamed from: com.onedelhi.secure.cx2$k$a */
        public class C4937a implements ValueCallback<String> {
            public C4937a() {
            }

            /* renamed from: a */
            public void onReceiveValue(String str) {
            }
        }

        public C4936k() {
        }

        public void run() {
            try {
                String str = (String) cx2.this.f27098a.get("receivedOtp");
                boolean unused = cx2.this.f27111e = true;
                if (cx2.this.f27095a != null) {
                    cx2.this.f27095a.mo38418f(true);
                }
                cx2.this.f27093a.setText("OTP detected, press submit to continue");
                if (cx2.this.f27093a != null) {
                    cx2.this.f27101b.setText(str);
                    cx2.this.f27101b.setSelection(str.length());
                    cx2.this.f27101b.setTypeface((Typeface) null, 1);
                }
                cx2.this.f27091a.evaluateJavascript("javascript:" + ("autoFillOtp('" + str + "');"), new C4937a());
            } catch (Exception | NullPointerException unused2) {
            }
        }
    }

    public cx2(Activity activity, WebView webView, EasypayBrowserFragment easypayBrowserFragment, Map<String, String> map, String str, String str2, String str3, EasypayWebViewClient easypayWebViewClient) {
        this.f27088a = activity;
        this.f27094a = easypayBrowserFragment;
        this.f27110e = str;
        this.f27112f = str3;
        this.f27098a = map;
        this.f27091a = webView;
        this.f27096a = PaytmAssist.getAssistInstance().getWebClientInstance();
        this.f27095a = PaytmAssist.getAssistInstance().getmAnalyticsManager();
        try {
            EditText editText = this.f27101b;
            if (editText != null) {
                editText.setOnFocusChangeListener(new C4925e());
                View currentFocus = this.f27094a.getActivity().getCurrentFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) this.f27094a.getActivity().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
            }
        } catch (NullPointerException unused) {
        }
        if (easypayWebViewClient != null) {
            easypayWebViewClient.addAssistWebClientListener(this);
        }
        try {
            this.f27088a.registerReceiver(this.f27100b, new IntentFilter("com.paytm.com.paytm.pgsdk.easypay.appinvoke.CUSTOM_EVENT"));
            this.f27107c = true;
        } catch (Exception unused2) {
        }
        if (this.f27091a != null) {
            this.f27108d = "javascript:";
            this.f27108d += " document.addEventListener(\"DOMContentLoaded\", Android.sendEvent('FIRE ELEMENT', 0, 0), false);";
            new Handler().postDelayed(new C4926f(), 20);
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

    /* renamed from: m */
    public void mo33957m() {
        this.f27088a.runOnUiThread(new C4932h());
        Activity activity = this.f27088a;
        if (activity != null || !activity.isFinishing()) {
            C4933i iVar = new C4933i();
            this.f27090a = iVar;
            try {
                EditText editText = this.f27101b;
                if (editText != null) {
                    editText.addTextChangedListener(iVar);
                    new Handler().postDelayed(new C4934j(), 10000);
                }
                mo33959o(this.f27088a);
                if (!this.f27102b.booleanValue()) {
                    this.f27102b = Boolean.valueOf(mo33969y());
                }
            } catch (Exception unused) {
            }
            this.f27097a = Boolean.TRUE;
        }
    }

    /* renamed from: n */
    public void mo33958n() {
        StringBuilder sb;
        String str;
        GAEventManager gAEventManager = this.f27095a;
        if (gAEventManager != null) {
            gAEventManager.mo38404F(true);
        }
        String str2 = "javascript:";
        if (this.f27098a.get("action").equals("otphelper")) {
            sb = new StringBuilder();
            sb.append(str2);
            str = "Android.showLog('approve otp- '+ typeof(autoSubmitForm));autoSubmitForm();";
        } else {
            if (this.f27098a.get("submitJs") != null) {
                str2 = str2 + this.f27098a.get("submitJs");
                this.f27094a.f38682b = false;
            } else if (this.f27098a.get("customjs") != null) {
                sb = new StringBuilder();
                sb.append(str2);
                str = this.f27098a.get("customjs");
            }
            this.f27091a.evaluateJavascript(str2, (ValueCallback) null);
            this.f27109d = !this.f27098a.get("bank").equals("sbi-nb");
        }
        sb.append(str);
        str2 = sb.toString();
        this.f27091a.evaluateJavascript(str2, (ValueCallback) null);
        this.f27109d = !this.f27098a.get("bank").equals("sbi-nb");
    }

    /* renamed from: o */
    public final void mo33959o(Activity activity) {
        if (activity != null) {
            try {
                ContentResolver contentResolver = activity.getContentResolver();
                Uri parse = Uri.parse("content://sms/inbox");
                Cursor query = contentResolver.query(parse, (String[]) null, "date>=?", new String[]{EasypayWebViewClient.smsTrackingTime + ""}, (String) null);
                if (query != null) {
                    while (query.moveToNext()) {
                        mo33962r(query.getString(query.getColumnIndex("body")), query.getString(query.getColumnIndex("address")));
                    }
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: p */
    public final boolean mo33960p(String str) {
        if (TextUtils.isEmpty(this.f27112f)) {
            return true;
        }
        String[] split = this.f27112f.split(vf4.f36537c);
        if (split.length > 0) {
            String replaceAll = str.replaceAll(" ", "").replaceAll("-", "");
            for (String str2 : split) {
                if (replaceAll != null && replaceAll.toLowerCase().contains(str2.toLowerCase())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: q */
    public final boolean mo33961q(String str) {
        if (TextUtils.isEmpty(this.f27110e)) {
            return true;
        }
        String[] split = this.f27110e.split(vf4.f36537c);
        if (split.length > 0) {
            int length = split.length;
            int i = 0;
            while (i < length) {
                String str2 = split[i];
                if (str == null || !str.toLowerCase().contains(str2.toLowerCase())) {
                    i++;
                } else {
                    GAEventManager gAEventManager = this.f27095a;
                    if (gAEventManager == null) {
                        return true;
                    }
                    gAEventManager.mo38416d(str2.toUpperCase());
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: r */
    public void mo33962r(String str, String str2) {
        if (mo33961q(str2) && mo33960p(str)) {
            Pattern compile = Pattern.compile("\\b\\d{6}\\b");
            Pattern compile2 = Pattern.compile("\\b\\d{4}\\b");
            Pattern compile3 = Pattern.compile("(|^)\\d{8}");
            Matcher matcher = compile.matcher(str);
            compile2.matcher(str);
            compile3.matcher(str);
            if (matcher.find()) {
                Timer timer = this.f27099a;
                if (timer != null) {
                    timer.cancel();
                }
                this.f27098a.put("receivedOtp", matcher.group(0));
                this.f27088a.runOnUiThread(new C4936k());
            }
        }
    }

    /* renamed from: s */
    public void mo33963s() {
        this.f27105b = true;
        this.f27103b = this.f27098a.get("fields");
        this.f27108d += this.f27098a.get("functionStart") + (this.f27103b + "var a = fields; if(a.length&&!(fields[0].offsetParent == null)){Android.sendEvent('activateOtpHelper', 0, 0); var aa=a; autoFillOtp=function(value){ aa[0].value = value; }; }") + "" + "if(fields.length){ fields[0].addEventListener('input', function(e){Android.logTempData(this.value)});}" + this.f27098a.get("functionEnd");
        new Handler().postDelayed(new C4929g(), 20);
    }

    /* renamed from: t */
    public void mo33964t(WebView webView, String str) {
        v82.m67793c("otphelper", "otp helper Wc page finish" + str);
        if (this.f27109d) {
            this.f27088a.runOnUiThread(new C4922b());
        }
    }

    /* renamed from: u */
    public void mo33965u(String str) {
        this.f27106c = str;
        this.f27088a.runOnUiThread(new C4921a());
    }

    /* renamed from: v */
    public void mo33966v(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    /* renamed from: w */
    public void mo33967w() {
        this.f27091a.loadUrl("javascript:" + "Android.showLog('resend otp- '+ typeof(autoResendOtp));autoResendOtp();");
        mo33970z(Boolean.TRUE);
    }

    /* renamed from: x */
    public void mo33968x() {
        TextView textView;
        this.f27094a.mo48690P0(de3.C5007h.otpHelper, Boolean.FALSE);
        mo33970z(Boolean.TRUE);
        try {
            Activity activity = this.f27088a;
            if (activity != null && (textView = this.f27093a) != null) {
                textView.setText(activity.getString(de3.C5011l.wait_otp));
            }
        } catch (Exception e) {
            v82.m67793c("kanish", "exception" + e.getStackTrace());
        }
    }

    /* renamed from: y */
    public final boolean mo33969y() {
        if (!PaytmAssist.isEasyPayEnabled) {
            return false;
        }
        this.f27088a.registerReceiver(this.f27089a, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
        return true;
    }

    /* renamed from: z */
    public void mo33970z(Boolean bool) {
    }
}
