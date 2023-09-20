package com.phonepe.intent.sdk.p004ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import androidx.appcompat.app.C0189c;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.a05;
import com.onedelhi.secure.ae3;
import com.onedelhi.secure.b15;
import com.onedelhi.secure.d15;
import com.onedelhi.secure.h15;
import com.onedelhi.secure.jg4;
import com.onedelhi.secure.k15;
import com.onedelhi.secure.kg4;
import com.onedelhi.secure.l05;
import com.onedelhi.secure.lg4;
import com.onedelhi.secure.m05;
import com.onedelhi.secure.m95;
import com.onedelhi.secure.mg4;
import com.onedelhi.secure.ng4;
import com.onedelhi.secure.o05;
import com.onedelhi.secure.r25;
import com.onedelhi.secure.u25;
import com.onedelhi.secure.xz4;
import com.onedelhi.secure.zz4;
import java.util.ArrayList;
import java.util.List;
import jmjou.C7601c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zihjx.chmha;

/* renamed from: com.phonepe.intent.sdk.ui.TransactionActivity */
public class TransactionActivity extends chmha implements xz4 {

    /* renamed from: o */
    public static final /* synthetic */ int f38601o = 0;

    /* renamed from: a */
    public d15 f38602a;

    /* renamed from: com.phonepe.intent.sdk.ui.TransactionActivity$a */
    public class C7565a extends b15 {
        public C7565a(List<String> list) {
        }

        public void onPageFinished(WebView webView, String str) {
            d15 d15 = TransactionActivity.this.f38602a;
            if (d15 != null && str != null) {
                d15.mo30392k(str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            d15 d15 = TransactionActivity.this.f38602a;
            if (d15 != null && str != null) {
                d15.mo30385e(str);
            }
        }
    }

    /* renamed from: com.phonepe.intent.sdk.ui.TransactionActivity$b */
    public class C7566b extends WebChromeClient {
        public C7566b() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (((r25) TransactionActivity.this.f38906a.mo48873i(r25.class)).mo43795a()) {
                int i = C7567c.f38605a[consoleMessage.messageLevel().ordinal()];
                if (i == 1) {
                    String message = consoleMessage.message();
                    int lineNumber = consoleMessage.lineNumber();
                    String sourceId = consoleMessage.sourceId();
                    m05.C6076b bVar = m05.f31968a;
                    if (bVar != null) {
                        bVar.mo40412k("WebViewConsole", message, lineNumber, sourceId);
                    }
                } else if (i == 2) {
                    String message2 = consoleMessage.message();
                    int lineNumber2 = consoleMessage.lineNumber();
                    String sourceId2 = consoleMessage.sourceId();
                    m05.C6076b bVar2 = m05.f31968a;
                    if (bVar2 != null) {
                        bVar2.mo40411j("WebViewConsole", message2, lineNumber2, sourceId2);
                    }
                } else if (i == 3) {
                    String message3 = consoleMessage.message();
                    int lineNumber3 = consoleMessage.lineNumber();
                    String sourceId3 = consoleMessage.sourceId();
                    m05.C6076b bVar3 = m05.f31968a;
                    if (bVar3 != null) {
                        bVar3.mo40405d("WebViewConsole", message3, lineNumber3, sourceId3);
                    }
                } else if (i == 4) {
                    String message4 = consoleMessage.message();
                    int lineNumber4 = consoleMessage.lineNumber();
                    String sourceId4 = consoleMessage.sourceId();
                    m05.C6076b bVar4 = m05.f31968a;
                    if (bVar4 != null) {
                        bVar4.mo40406e("WebViewConsole", message4, lineNumber4, sourceId4);
                    }
                } else if (i == 5) {
                    String message5 = consoleMessage.message();
                    int lineNumber5 = consoleMessage.lineNumber();
                    String sourceId5 = consoleMessage.sourceId();
                    m05.C6076b bVar5 = m05.f31968a;
                    if (bVar5 != null) {
                        bVar5.mo40410i("WebViewConsole", message5, lineNumber5, sourceId5);
                    }
                }
            }
            zz4 zz4 = (zz4) TransactionActivity.this.f38906a.mo48873i(zz4.class);
            u25 b = zz4.mo48478b("SDK_WEB_VIEW_CONSOLE_ERROR");
            h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "errorMessage", consoleMessage.message());
            zz4.mo48477a(b);
            return false;
        }

        public void onProgressChanged(WebView webView, int i) {
            WebView webView2;
            if (!"card".matches(TransactionActivity.this.f38908e)) {
                return;
            }
            if (i < 95) {
                WebView webView3 = TransactionActivity.this.f38900a;
                if (webView3 != null && webView3.getVisibility() == 0) {
                    m05.m56772c("WEB_VIEW_FAIL", "hidding webview");
                    TransactionActivity.this.f38900a.setVisibility(4);
                }
            } else if (i >= 95 && (webView2 = TransactionActivity.this.f38900a) != null && webView2.getVisibility() != 0) {
                m05.m56772c("WEB_VIEW_FAIL", "showing webview");
                TransactionActivity.this.f38900a.setVisibility(0);
                TransactionActivity.this.mo50541i1();
            }
        }
    }

    /* renamed from: com.phonepe.intent.sdk.ui.TransactionActivity$c */
    public static /* synthetic */ class C7567c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38605a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.webkit.ConsoleMessage$MessageLevel[] r0 = android.webkit.ConsoleMessage.MessageLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38605a = r0
                android.webkit.ConsoleMessage$MessageLevel r1 = android.webkit.ConsoleMessage.MessageLevel.LOG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38605a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.webkit.ConsoleMessage$MessageLevel r1 = android.webkit.ConsoleMessage.MessageLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38605a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.webkit.ConsoleMessage$MessageLevel r1 = android.webkit.ConsoleMessage.MessageLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38605a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.webkit.ConsoleMessage$MessageLevel r1 = android.webkit.ConsoleMessage.MessageLevel.WARNING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f38605a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.webkit.ConsoleMessage$MessageLevel r1 = android.webkit.ConsoleMessage.MessageLevel.TIP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.phonepe.intent.sdk.p004ui.TransactionActivity.C7567c.<clinit>():void");
        }
    }

    /* renamed from: R */
    public void mo47496R(String str, boolean z) {
        Class cls = k15.class;
        this.f38901a.setVisibility(8);
        ((k15) this.f38906a.mo48873i(cls)).getClass();
        String str2 = "%s\nPlease try again.";
        String format = String.format(z ? str2 : "%s\nPlease try again.\n\nRedirecting back to %s.", new Object[]{str, l05.m55200d(this.f38906a, getPackageName())});
        zz4 zz4 = this.f38902a;
        u25 b = zz4.mo48478b("SDK_ERROR_TO_USER");
        h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "errorMessage", format);
        zz4.mo48477a(b);
        ((k15) this.f38906a.mo48873i(cls)).getClass();
        if (!z) {
            str2 = "%s\nPlease try again.\n\nRedirecting back to %s.";
        }
        String format2 = String.format(str2, new Object[]{str, l05.m55200d(this.f38906a, getPackageName())});
        C0189c.C0190a aVar = new C0189c.C0190a(this);
        aVar.mo954n(format2).mo944d(false);
        if (z) {
            aVar.mo928C("Retry", new kg4(this)).mo959s("Close", new mg4(this));
        }
        C0189c a = aVar.mo941a();
        a.show();
        Button j = a.mo909j(-2);
        Resources resources = getResources();
        int i = ae3.C4541d.colorText;
        j.setTextColor(resources.getColor(i));
        a.mo909j(-1).setTextColor(getResources().getColor(i));
    }

    /* renamed from: a */
    public void mo18084a(String str, String str2, String str3) {
        this.f38602a.mo30381a(str, str2, str3);
    }

    /* renamed from: b */
    public void mo18085b(String str, String str2, String str3) {
        this.f38602a.mo30382b(str, str2, str3);
    }

    /* renamed from: d */
    public void mo18087d(String str) {
        d15 d15 = this.f38602a;
        if (d15 != null) {
            d15.mo30384d(str);
        }
    }

    /* renamed from: e */
    public void mo47498e(String str) {
        mo48647u1(str, true);
    }

    /* renamed from: h */
    public void mo47499h(String str) {
        mo48647u1(str, false);
    }

    /* renamed from: i */
    public void mo47500i() {
        C0189c.C0190a aVar = new C0189c.C0190a(this);
        aVar.mo954n(getString(ae3.C4548k.cancel_confirmation)).mo944d(false).mo928C(getString(ae3.C4548k.f25820ok), new jg4(this)).mo959s(getString(ae3.C4548k.cancel), new lg4(this));
        C0189c a = aVar.mo941a();
        a.show();
        Button j = a.mo909j(-2);
        Resources resources = getResources();
        int i = ae3.C4541d.colorText;
        j.setTextColor(resources.getColor(i));
        a.mo909j(-1).setTextColor(getResources().getColor(i));
    }

    /* renamed from: j */
    public void mo18088j(o05 o05) {
        this.f38602a.mo30391j(o05);
    }

    /* renamed from: k */
    public void mo47501k(String str) {
        r25 r25 = (r25) this.f38906a.mo48873i(r25.class);
        boolean z = true;
        if (!r25.f34479a.mo48862b().getBoolean("usePrecache", true) || !l05.m55205i((Boolean) this.f38906a.mo48872h("com.phonepe.android.sdk.PreCacheEnabled"))) {
            z = false;
        }
        b15.f26101a = z;
        r25.f34480a = new ArrayList();
        String string = r25.f34479a.mo48862b().getString("fileTypes", "");
        if (string != null && !string.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    r25.f34480a.add(jSONArray.getString(i));
                }
            } catch (JSONException e) {
                m05.m56773d("SDKConfig", e.getMessage(), e);
            }
        }
        b15.f26100a = r25.f34480a;
        super.mo47501k(str);
    }

    /* renamed from: k1 */
    public void mo48630k1() {
        m05.m56772c("TransactionActivity", "initializing web views..");
        this.f38906a.getClass();
        this.f38900a.setWebViewClient(new C7565a(new ArrayList()));
        this.f38900a.setWebChromeClient(new C7566b());
        super.mo48630k1();
        m05.m56772c("TransactionActivity", "web views initialized");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = intent == null ? "null" : intent.toString();
        m05.m56772c("TransactionActivity", String.format("activity result received. requestCode = {%s}, resultCode = {%s}, Intent = {%s}.", objArr));
        if (i == 725) {
            if (i2 == 0) {
                z = true;
            }
            m95 a = m95.m57004a(intent);
            this.f38602a.mo30398q(z, a);
            mo48647u1(a != null ? a.toString() : this.f38906a.mo48876m("FAILED").toJsonString(), z);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        d15 d15 = this.f38602a;
        if (d15 != null) {
            d15.mo30388i();
        }
    }

    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Class cls = a05.class;
        getWindow().getAttributes().windowAnimations = ae3.C4549l.FadeAnimation;
        m05.m56772c("TransactionActivity", "transaction activity creating...");
        if (getIntent() == null || getIntent().getExtras() == null) {
            if (bundle != null) {
                parcelable = bundle.getParcelable("data_factory");
            }
            super.onCreate(bundle);
            this.f38602a.mo30396o(getIntent(), bundle);
            m05.m56772c("TransactionActivity", "transaction activity created.");
        }
        parcelable = getIntent().getParcelableExtra("data_factory");
        C7601c cVar = (C7601c) parcelable;
        C7601c.C7602a aVar = (C7601c.C7602a) cVar.mo48873i(C7601c.C7602a.class);
        aVar.put("trxView", this);
        aVar.put("bridgeCallback", this);
        this.f38602a = (d15) cVar.mo48874j(cls, aVar);
        super.onCreate(bundle);
        this.f38602a.mo30396o(getIntent(), bundle);
        m05.m56772c("TransactionActivity", "transaction activity created.");
    }

    public void onDestroy() {
        super.onDestroy();
        d15 d15 = this.f38602a;
        if (d15 != null) {
            d15.mo30399r();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("data_factory", this.f38906a);
        d15 d15 = this.f38602a;
        if (d15 != null) {
            d15.mo30393l(bundle);
        }
    }

    /* renamed from: p */
    public void mo47502p(boolean z) {
        if (z) {
            runOnUiThread(new ng4(this));
        } else {
            mo50541i1();
        }
    }

    /* renamed from: s */
    public void mo47503s(Uri uri) {
        m05.m56772c("TransactionActivity", String.format("request activity start for result for uri = {%s}.", new Object[]{uri}));
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage(l05.m55199c(this.f38906a));
        if (!isFinishing()) {
            m05.m56772c("TransactionActivity", String.format("starting activity for intent = {%s}.", new Object[]{intent.toString()}));
            mo50540h1();
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(intent, 725);
                return;
            }
            zz4 zz4 = (zz4) this.f38906a.mo48873i(zz4.class);
            zz4.mo48477a(zz4.mo48478b("SDK_INTENT_NOT_SUPPORTED"));
        }
    }

    /* renamed from: s1 */
    public final void mo48645s1(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f38602a.mo30394m();
    }

    /* renamed from: t1 */
    public final void mo48646t1(DialogInterface dialogInterface, int i) {
        this.f38602a.mo30395n();
        dialogInterface.cancel();
    }

    /* renamed from: u1 */
    public final void mo48647u1(String str, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("key_txn_result", str);
        setResult(z ? 0 : -1, intent);
        finish();
    }

    /* renamed from: v1 */
    public final void mo48648v1(DialogInterface dialogInterface, int i) {
        this.f38602a.mo30397p();
    }

    /* renamed from: w1 */
    public final void mo48649w1(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f38602a.mo30384d("FAILED");
    }

    /* renamed from: x1 */
    public final void mo48650x1() {
        this.f38901a.setVisibility(0);
        this.f38900a.setVisibility(4);
    }
}
