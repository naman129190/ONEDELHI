package com.paytm.pgsdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.onedelhi.secure.C5871k5;
import com.onedelhi.secure.a13;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.h60;
import com.onedelhi.secure.r03;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.u03;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.vw4;
import com.onedelhi.secure.w03;
import easypay.appinvoke.manager.EasypayWebViewClient;
import easypay.appinvoke.manager.PaytmAssist;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

@TargetApi(21)
public class PaytmWebView extends WebView implements vw4 {

    /* renamed from: b */
    public static final String f38556b = "HTMLOUT";

    /* renamed from: c */
    public static final String f38557c = "javascript:window.HTMLOUT.processResponse(document.getElementById('response').value);";

    /* renamed from: d */
    public static final String f38558d = "Y";

    /* renamed from: e */
    public static final String f38559e = "01";

    /* renamed from: f */
    public static final String f38560f = "/CAS/Response";

    /* renamed from: g */
    public static final String f38561g = "theia/paytmCallback";

    /* renamed from: h */
    public static final String f38562h = "javascript:window.upiIntent.setUpiIntentApps(";

    /* renamed from: n */
    public static final int f38563n = 105;

    /* renamed from: a */
    public final PaytmPGActivity f38564a;

    /* renamed from: a */
    public HashMap<String, ResolveInfo> f38565a;

    /* renamed from: a */
    public AtomicBoolean f38566a = new AtomicBoolean(false);

    /* renamed from: b */
    public volatile boolean f38567b;

    /* renamed from: com.paytm.pgsdk.PaytmWebView$a */
    public class C7535a extends WebChromeClient {
        public C7535a() {
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            a13.m35943a("JavaScript Alert " + str);
            return super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    /* renamed from: com.paytm.pgsdk.PaytmWebView$b */
    public class C7536b implements Runnable {
        public C7536b() {
        }

        public void run() {
            PaytmWebView.this.f38564a.f38539a.setVisibility(0);
            a13.m35943a("Progress dialog started");
        }
    }

    /* renamed from: com.paytm.pgsdk.PaytmWebView$c */
    public class C7537c implements Runnable {
        public C7537c() {
        }

        public void run() {
            PaytmWebView.this.f38564a.f38539a.setVisibility(8);
            a13.m35943a("Progress dialog ended");
        }
    }

    /* renamed from: com.paytm.pgsdk.PaytmWebView$d */
    public class C7538d implements Callback {

        /* renamed from: com.paytm.pgsdk.PaytmWebView$d$a */
        public class C7539a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Response f38573a;

            public C7539a(Response response) {
                this.f38573a = response;
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(8:10|11|12|13|14|15|20|21) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x005e */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r6 = this;
                    com.onedelhi.secure.u03 r0 = com.onedelhi.secure.u03.m66329h()
                    com.onedelhi.secure.w03 r0 = r0.mo45355m()
                    r1 = 0
                    okhttp3.Response r2 = r6.f38573a     // Catch:{ Exception -> 0x007a }
                    int r2 = r2.code()     // Catch:{ Exception -> 0x007a }
                    r3 = 200(0xc8, float:2.8E-43)
                    if (r2 != r3) goto L_0x0076
                    okhttp3.Response r2 = r6.f38573a     // Catch:{ Exception -> 0x007a }
                    okhttp3.ResponseBody r2 = r2.body()     // Catch:{ Exception -> 0x007a }
                    if (r2 == 0) goto L_0x0076
                    okhttp3.Response r2 = r6.f38573a     // Catch:{ Exception -> 0x007a }
                    okhttp3.ResponseBody r2 = r2.body()     // Catch:{ Exception -> 0x007a }
                    java.lang.String r2 = r2.string()     // Catch:{ Exception -> 0x007a }
                    com.onedelhi.secure.fj1 r3 = new com.onedelhi.secure.fj1     // Catch:{ Exception -> 0x007a }
                    r3.<init>()     // Catch:{ Exception -> 0x007a }
                    java.lang.Class<com.onedelhi.secure.m53> r4 = com.onedelhi.secure.m53.class
                    java.lang.Object r2 = r3.mo36012n(r2, r4)     // Catch:{ Exception -> 0x007a }
                    com.onedelhi.secure.m53 r2 = (com.onedelhi.secure.m53) r2     // Catch:{ Exception -> 0x007a }
                    com.onedelhi.secure.hn r3 = r2.mo40503a()     // Catch:{ Exception -> 0x007a }
                    if (r3 == 0) goto L_0x0065
                    com.onedelhi.secure.hn r3 = r2.mo40503a()     // Catch:{ Exception -> 0x007a }
                    java.lang.Object r3 = r3.mo37414a()     // Catch:{ Exception -> 0x007a }
                    if (r3 == 0) goto L_0x0065
                    android.os.Bundle r3 = new android.os.Bundle     // Catch:{ Exception -> 0x007a }
                    r3.<init>()     // Catch:{ Exception -> 0x007a }
                    java.lang.String r4 = com.onedelhi.secure.h60.f29517l     // Catch:{ Exception -> 0x005e }
                    com.onedelhi.secure.fj1 r5 = new com.onedelhi.secure.fj1     // Catch:{ Exception -> 0x005e }
                    r5.<init>()     // Catch:{ Exception -> 0x005e }
                    com.onedelhi.secure.hn r2 = r2.mo40503a()     // Catch:{ Exception -> 0x005e }
                    java.lang.Object r2 = r2.mo37414a()     // Catch:{ Exception -> 0x005e }
                    java.lang.String r2 = r5.mo36024z(r2)     // Catch:{ Exception -> 0x005e }
                    r3.putString(r4, r2)     // Catch:{ Exception -> 0x005e }
                    goto L_0x0061
                L_0x005e:
                    r0.mo7776g(r1)     // Catch:{ Exception -> 0x007a }
                L_0x0061:
                    r0.mo7776g(r3)     // Catch:{ Exception -> 0x007a }
                    goto L_0x007d
                L_0x0065:
                    r0.mo7776g(r1)     // Catch:{ Exception -> 0x007a }
                    com.paytm.pgsdk.PaytmWebView$d r2 = com.paytm.pgsdk.PaytmWebView.C7538d.this     // Catch:{ Exception -> 0x007a }
                    com.paytm.pgsdk.PaytmWebView r2 = com.paytm.pgsdk.PaytmWebView.this     // Catch:{ Exception -> 0x007a }
                    android.content.Context r2 = r2.getContext()     // Catch:{ Exception -> 0x007a }
                    android.app.Activity r2 = (android.app.Activity) r2     // Catch:{ Exception -> 0x007a }
                    r2.finish()     // Catch:{ Exception -> 0x007a }
                    goto L_0x007d
                L_0x0076:
                    r0.mo7776g(r1)     // Catch:{ Exception -> 0x007a }
                    goto L_0x007d
                L_0x007a:
                    r0.mo7776g(r1)
                L_0x007d:
                    com.paytm.pgsdk.PaytmWebView$d r0 = com.paytm.pgsdk.PaytmWebView.C7538d.this
                    com.paytm.pgsdk.PaytmWebView r0 = com.paytm.pgsdk.PaytmWebView.this
                    android.content.Context r0 = r0.getContext()
                    android.app.Activity r0 = (android.app.Activity) r0
                    r0.finish()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.paytm.pgsdk.PaytmWebView.C7538d.C7539a.run():void");
            }
        }

        /* renamed from: com.paytm.pgsdk.PaytmWebView$d$b */
        public class C7540b implements Runnable {
            public C7540b() {
            }

            public void run() {
                u03.m66329h().mo45355m().mo7776g((Bundle) null);
                ((Activity) PaytmWebView.this.getContext()).finish();
            }
        }

        public C7538d() {
        }

        public void onFailure(@vr2 Call call, @vr2 IOException iOException) {
            ((Activity) PaytmWebView.this.getContext()).runOnUiThread(new C7540b());
        }

        public void onResponse(@vr2 Call call, @vr2 Response response) throws IOException {
            ((Activity) PaytmWebView.this.getContext()).runOnUiThread(new C7539a(response));
        }
    }

    /* renamed from: com.paytm.pgsdk.PaytmWebView$e */
    public class C7541e {

        /* renamed from: com.paytm.pgsdk.PaytmWebView$e$a */
        public class C7542a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ String f38577b;

            public C7542a(String str) {
                this.f38577b = str;
            }

            public void run() {
                PaytmWebView.this.loadUrl(this.f38577b);
            }
        }

        /* renamed from: com.paytm.pgsdk.PaytmWebView$e$b */
        public class C7543b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f38578a;

            /* renamed from: a */
            public final /* synthetic */ w03 f38579a;

            public C7543b(w03 w03, Bundle bundle) {
                this.f38579a = w03;
                this.f38578a = bundle;
            }

            public void run() {
                try {
                    if (this.f38579a != null) {
                        C5871k5.m54077e().mo39058h(h60.f29525t, h60.f29520o, "status", "success");
                        this.f38579a.mo7776g(this.f38578a);
                    }
                    ((Activity) PaytmWebView.this.getContext()).finish();
                } catch (Exception e) {
                    C5871k5.m54077e().mo39058h(h60.f29525t, h60.f29520o, "status", h60.f29486E);
                    C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
                    a13.m35953k(e);
                    w03 w03 = this.f38579a;
                    if (w03 != null) {
                        w03.mo7776g((Bundle) null);
                    }
                }
            }
        }

        public C7541e() {
        }

        /* renamed from: a */
        public final synchronized void mo48519a(Bundle bundle) {
            try {
                ((Activity) PaytmWebView.this.getContext()).runOnUiThread(new C7543b(u03.m66329h().mo45355m(), bundle));
            } catch (Exception e) {
                C5871k5.m54077e().mo39058h(h60.f29525t, h60.f29520o, "status", h60.f29486E);
                C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
                a13.m35953k(e);
                if (!(u03.m66329h() == null || u03.m66329h().mo45355m() == null)) {
                    u03.m66329h().mo45355m().mo7776g((Bundle) null);
                }
            }
        }

        @JavascriptInterface
        public synchronized void inVokeUpiFlow(String str) {
            try {
                if (PaytmWebView.this.f38564a != null) {
                    PaytmWebView paytmWebView = PaytmWebView.this;
                    String e = paytmWebView.mo48508i(paytmWebView.f38564a);
                    PaytmWebView.this.post(new C7542a("javascript:window.upiIntent.setUpiIntentApps('" + e + "')"));
                }
            } catch (Exception e2) {
                C5871k5.m54077e().mo39056f(h60.f29520o, e2.getMessage());
                a13.m35953k(e2);
            }
            return;
        }

        @JavascriptInterface
        public synchronized void postMobileNum(String str) {
        }

        @JavascriptInterface
        public synchronized void processResponse(String str) {
            try {
                a13.m35943a("Merchant Response is " + str);
                mo48519a(PaytmWebView.this.mo48510k(str));
                if (TextUtils.isEmpty(u03.m66329h().f35876a.mo44723a().get(h60.f29513h))) {
                    a13.m35943a("Returning the response back to Merchant Application");
                    w03 m = u03.m66329h().mo45355m();
                    if (m != null) {
                        C5871k5.m54077e().mo39058h(h60.f29525t, h60.f29520o, "status", "success");
                        m.mo7770a("no callback url", (Bundle) null);
                    }
                } else {
                    C5871k5.m54077e().mo39058h(h60.f29525t, h60.f29520o, "status", h60.f29486E);
                    a13.m35943a("Merchant Specific URL is present, So posting all parameters to Merchant specific URL");
                }
            } catch (Exception e) {
                C5871k5.m54077e().mo39058h(h60.f29525t, h60.f29520o, "status", h60.f29486E);
                C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
                a13.m35953k(e);
            }
            return;
        }

        @JavascriptInterface
        public synchronized void saveMobileNum(String str) {
        }

        @JavascriptInterface
        public synchronized void upiAppClicked(String str, String str2) {
            try {
                if (PaytmWebView.this.f38564a != null) {
                    PaytmWebView.this.f38564a.getPackageManager();
                    Intent intent = new Intent("android.intent.action.VIEW");
                    if (!PaytmWebView.this.f38565a.isEmpty()) {
                        ActivityInfo activityInfo = ((ResolveInfo) PaytmWebView.this.f38565a.get(str)).activityInfo;
                        ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                        new Uri.Builder().scheme("upi").authority("pay");
                        intent.setData(Uri.parse(Uri.parse(str2).buildUpon().toString()));
                        intent.addCategory("android.intent.category.LAUNCHER");
                        intent.setComponent(componentName);
                        a13.m35943a("App click package:" + str);
                        a13.m35943a("App click deeplink:" + str2.toString());
                        PaytmWebView.this.f38564a.startActivityForResult(intent, 105);
                    }
                }
            } catch (Exception e) {
                C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
                a13.m35953k(e);
            }
            return;
        }
    }

    /* renamed from: com.paytm.pgsdk.PaytmWebView$f */
    public class C7544f extends EasypayWebViewClient {
        public C7544f() {
            super(PaytmWebView.this.f38564a);
        }

        public void onFormResubmission(WebView webView, Message message, Message message2) {
            super.onFormResubmission(webView, message, message2);
        }

        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        public void onPageCommitVisible(WebView webView, String str) {
            a13.m35943a("onPageCommitVisible" + str);
            super.onPageCommitVisible(webView, str);
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0175, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6 A[Catch:{ all -> 0x00cb }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void onPageFinished(android.webkit.WebView r8, java.lang.String r9) {
            /*
                r7 = this;
                monitor-enter(r7)
                com.paytm.pgsdk.PaytmWebView r0 = com.paytm.pgsdk.PaytmWebView.this     // Catch:{ all -> 0x0176 }
                com.paytm.pgsdk.PaytmPGActivity r0 = r0.f38564a     // Catch:{ all -> 0x0176 }
                boolean r0 = r0.isFinishing()     // Catch:{ all -> 0x0176 }
                if (r0 != 0) goto L_0x0174
                com.onedelhi.secure.u03 r0 = com.onedelhi.secure.u03.m66329h()     // Catch:{ all -> 0x0176 }
                if (r0 == 0) goto L_0x016d
                com.onedelhi.secure.u03 r0 = com.onedelhi.secure.u03.m66329h()     // Catch:{ all -> 0x0176 }
                com.onedelhi.secure.t03 r0 = r0.f35876a     // Catch:{ all -> 0x0176 }
                if (r0 != 0) goto L_0x001d
                goto L_0x016d
            L_0x001d:
                com.onedelhi.secure.u03 r0 = com.onedelhi.secure.u03.m66329h()     // Catch:{ all -> 0x0176 }
                com.onedelhi.secure.t03 r0 = r0.f35876a     // Catch:{ all -> 0x0176 }
                java.util.HashMap r0 = r0.mo44723a()     // Catch:{ all -> 0x0176 }
                if (r0 == 0) goto L_0x014e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0176 }
                r1.<init>()     // Catch:{ all -> 0x0176 }
                java.lang.String r2 = "page finish url"
                r1.append(r2)     // Catch:{ all -> 0x0176 }
                r1.append(r9)     // Catch:{ all -> 0x0176 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0176 }
                com.onedelhi.secure.a13.m35943a(r1)     // Catch:{ all -> 0x0176 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cd }
                r1.<init>()     // Catch:{ Exception -> 0x00cd }
                java.lang.String r2 = "Page finished loading "
                r1.append(r2)     // Catch:{ Exception -> 0x00cd }
                r1.append(r9)     // Catch:{ Exception -> 0x00cd }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00cd }
                com.onedelhi.secure.a13.m35943a(r1)     // Catch:{ Exception -> 0x00cd }
                java.lang.String r1 = "CALLBACK_URL"
                java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x00cd }
                if (r1 == 0) goto L_0x007a
                java.lang.String r1 = "CALLBACK_URL"
                java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x00cd }
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x00cd }
                boolean r1 = r9.contains(r1)     // Catch:{ Exception -> 0x00cd }
                if (r1 == 0) goto L_0x007a
                java.lang.String r1 = "Merchant specific Callback Url is finished loading. Extract data now. "
                com.onedelhi.secure.a13.m35943a(r1)     // Catch:{ Exception -> 0x00cd }
                com.paytm.pgsdk.PaytmWebView r1 = com.paytm.pgsdk.PaytmWebView.this     // Catch:{ Exception -> 0x00cd }
                r2 = 1
                boolean unused = r1.f38567b = r2     // Catch:{ Exception -> 0x00cd }
                com.paytm.pgsdk.PaytmWebView r1 = com.paytm.pgsdk.PaytmWebView.this     // Catch:{ Exception -> 0x00cd }
                java.lang.String r2 = "javascript:window.HTMLOUT.processResponse(document.getElementById('response').value);"
            L_0x0076:
                r1.loadUrl(r2)     // Catch:{ Exception -> 0x00cd }
                goto L_0x009e
            L_0x007a:
                java.lang.String r1 = "/CAS/Response"
                boolean r1 = r9.endsWith(r1)     // Catch:{ Exception -> 0x00cd }
                if (r1 == 0) goto L_0x008c
                java.lang.String r1 = "CAS Callback Url is finished loading. Extract data now. "
                com.onedelhi.secure.a13.m35943a(r1)     // Catch:{ Exception -> 0x00cd }
                com.paytm.pgsdk.PaytmWebView r1 = com.paytm.pgsdk.PaytmWebView.this     // Catch:{ Exception -> 0x00cd }
                java.lang.String r2 = "javascript:window.HTMLOUT.processResponse(document.getElementById('response').value);"
                goto L_0x0076
            L_0x008c:
                java.lang.String r1 = "theia/paytmCallback"
                boolean r1 = r9.contains(r1)     // Catch:{ Exception -> 0x00cd }
                if (r1 == 0) goto L_0x009e
                java.lang.String r1 = "CAS Callback Url is finished loading. Extract data now. "
                com.onedelhi.secure.a13.m35943a(r1)     // Catch:{ Exception -> 0x00cd }
                com.paytm.pgsdk.PaytmWebView r1 = com.paytm.pgsdk.PaytmWebView.this     // Catch:{ Exception -> 0x00cd }
                java.lang.String r2 = "javascript:window.HTMLOUT.processResponse(document.getElementById('response').value);"
                goto L_0x0076
            L_0x009e:
                java.lang.String r1 = "postnotificationurl"
                java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0176 }
                if (r1 == 0) goto L_0x014e
                android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0176 }
                com.paytm.pgsdk.PaytmWebView r2 = com.paytm.pgsdk.PaytmWebView.this     // Catch:{ all -> 0x0176 }
                com.paytm.pgsdk.PaytmPGActivity r2 = r2.f38564a     // Catch:{ all -> 0x0176 }
                java.lang.Class<com.paytm.pgsdk.IntentServicePostNotification> r3 = com.paytm.pgsdk.IntentServicePostNotification.class
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0176 }
                java.lang.String r2 = "url"
                java.lang.String r3 = "postnotificationurl"
                java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0176 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0176 }
                r1.putExtra(r2, r0)     // Catch:{ all -> 0x0176 }
                com.paytm.pgsdk.PaytmWebView r0 = com.paytm.pgsdk.PaytmWebView.this     // Catch:{ all -> 0x0176 }
                com.paytm.pgsdk.PaytmPGActivity r0 = r0.f38564a     // Catch:{ all -> 0x0176 }
            L_0x00c6:
                r0.startService(r1)     // Catch:{ all -> 0x0176 }
                goto L_0x014e
            L_0x00cb:
                r8 = move-exception
                goto L_0x0122
            L_0x00cd:
                r1 = move-exception
                com.onedelhi.secure.k5 r2 = com.onedelhi.secure.C5871k5.m54077e()     // Catch:{ all -> 0x00cb }
                java.lang.String r3 = "Redirection"
                java.lang.String r4 = r1.getMessage()     // Catch:{ all -> 0x00cb }
                r2.mo39056f(r3, r4)     // Catch:{ all -> 0x00cb }
                com.onedelhi.secure.u03 r2 = com.onedelhi.secure.u03.m66329h()     // Catch:{ all -> 0x00cb }
                java.lang.String r2 = r2.f35882b     // Catch:{ all -> 0x00cb }
                boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x00cb }
                if (r2 == 0) goto L_0x00f6
                com.onedelhi.secure.k5 r2 = com.onedelhi.secure.C5871k5.m54077e()     // Catch:{ all -> 0x00cb }
                java.lang.String r3 = "Paytm_H5_Load"
                java.lang.String r4 = "Redirection"
                java.lang.String r5 = "status"
                java.lang.String r6 = "fail"
                r2.mo39058h(r3, r4, r5, r6)     // Catch:{ all -> 0x00cb }
            L_0x00f6:
                com.onedelhi.secure.a13.m35953k(r1)     // Catch:{ all -> 0x00cb }
                java.lang.String r1 = "postnotificationurl"
                java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0176 }
                if (r1 == 0) goto L_0x014e
                android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0176 }
                com.paytm.pgsdk.PaytmWebView r2 = com.paytm.pgsdk.PaytmWebView.this     // Catch:{ all -> 0x0176 }
                com.paytm.pgsdk.PaytmPGActivity r2 = r2.f38564a     // Catch:{ all -> 0x0176 }
                java.lang.Class<com.paytm.pgsdk.IntentServicePostNotification> r3 = com.paytm.pgsdk.IntentServicePostNotification.class
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0176 }
                java.lang.String r2 = "url"
                java.lang.String r3 = "postnotificationurl"
                java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0176 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0176 }
                r1.putExtra(r2, r0)     // Catch:{ all -> 0x0176 }
                com.paytm.pgsdk.PaytmWebView r0 = com.paytm.pgsdk.PaytmWebView.this     // Catch:{ all -> 0x0176 }
                com.paytm.pgsdk.PaytmPGActivity r0 = r0.f38564a     // Catch:{ all -> 0x0176 }
                goto L_0x00c6
            L_0x0122:
                java.lang.String r9 = "postnotificationurl"
                java.lang.Object r9 = r0.get(r9)     // Catch:{ all -> 0x0176 }
                if (r9 == 0) goto L_0x014d
                android.content.Intent r9 = new android.content.Intent     // Catch:{ all -> 0x0176 }
                com.paytm.pgsdk.PaytmWebView r1 = com.paytm.pgsdk.PaytmWebView.this     // Catch:{ all -> 0x0176 }
                com.paytm.pgsdk.PaytmPGActivity r1 = r1.f38564a     // Catch:{ all -> 0x0176 }
                java.lang.Class<com.paytm.pgsdk.IntentServicePostNotification> r2 = com.paytm.pgsdk.IntentServicePostNotification.class
                r9.<init>(r1, r2)     // Catch:{ all -> 0x0176 }
                java.lang.String r1 = "url"
                java.lang.String r2 = "postnotificationurl"
                java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0176 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0176 }
                r9.putExtra(r1, r0)     // Catch:{ all -> 0x0176 }
                com.paytm.pgsdk.PaytmWebView r0 = com.paytm.pgsdk.PaytmWebView.this     // Catch:{ all -> 0x0176 }
                com.paytm.pgsdk.PaytmPGActivity r0 = r0.f38564a     // Catch:{ all -> 0x0176 }
                r0.startService(r9)     // Catch:{ all -> 0x0176 }
            L_0x014d:
                throw r8     // Catch:{ all -> 0x0176 }
            L_0x014e:
                super.onPageFinished(r8, r9)     // Catch:{ all -> 0x0176 }
                com.onedelhi.secure.u03 r8 = com.onedelhi.secure.u03.m66329h()     // Catch:{ all -> 0x0176 }
                java.lang.String r8 = r8.f35882b     // Catch:{ all -> 0x0176 }
                boolean r8 = r9.equals(r8)     // Catch:{ all -> 0x0176 }
                if (r8 == 0) goto L_0x0174
                com.onedelhi.secure.k5 r8 = com.onedelhi.secure.C5871k5.m54077e()     // Catch:{ all -> 0x0176 }
                java.lang.String r9 = "Paytm_H5_Load"
                java.lang.String r0 = "Redirection"
                java.lang.String r1 = "status"
                java.lang.String r2 = "fail"
                r8.mo39058h(r9, r0, r1, r2)     // Catch:{ all -> 0x0176 }
                goto L_0x0174
            L_0x016d:
                java.lang.String r8 = "Transaction cancelled before loading web com.paytm.pgsdk.view completely."
                com.onedelhi.secure.a13.m35943a(r8)     // Catch:{ all -> 0x0176 }
                monitor-exit(r7)
                return
            L_0x0174:
                monitor-exit(r7)
                return
            L_0x0176:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.paytm.pgsdk.PaytmWebView.C7544f.onPageFinished(android.webkit.WebView, java.lang.String):void");
        }

        public synchronized void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            PaytmWebView.this.mo48506g(str);
        }

        public synchronized void onReceivedError(WebView webView, int i, String str, String str2) {
            a13.m35943a("Error occured while loading url " + str2);
            C5871k5 e = C5871k5.m54077e();
            e.mo39056f(h60.f29520o, "Error occurred while loading url " + str2);
            super.onReceivedError(webView, i, str, str2);
            if (str2.equals(u03.m66329h().f35882b)) {
                C5871k5.m54077e().mo39058h(h60.f29524s, h60.f29520o, "status", h60.f29486E);
            }
            a13.m35943a("Error code is " + i + "Description is " + str);
            if (i == -6) {
                ((Activity) PaytmWebView.this.getContext()).finish();
                w03 m = u03.m66329h().mo45355m();
                if (m != null) {
                    m.mo7777h(i, str, str2);
                }
            }
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            a13.m35943a("onReceivedError" + webResourceRequest.getUrl());
            C5871k5 e = C5871k5.m54077e();
            e.mo39056f(h60.f29520o, "onReceivedError " + webResourceRequest.getUrl());
            if (webResourceRequest.getUrl().toString().equals(u03.m66329h().f35882b)) {
                C5871k5.m54077e().mo39058h(h60.f29524s, h60.f29520o, "status", h60.f29486E);
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            a13.m35943a("onReceivedHttpError" + webResourceRequest.getUrl());
            C5871k5 e = C5871k5.m54077e();
            e.mo39056f(h60.f29520o, "onReceivedHttpError " + webResourceRequest.getUrl());
            if (webResourceRequest.getUrl().toString().equals(u03.m66329h().f35882b)) {
                C5871k5.m54077e().mo39058h(h60.f29524s, h60.f29520o, "status", h60.f29486E);
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }

        public synchronized void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            a13.m35943a("SSL Error occured " + sslError.toString());
            C5871k5 e = C5871k5.m54077e();
            e.mo39056f(h60.f29520o, "SSL Error occurred " + sslError.getUrl());
            if (sslError.getUrl().equals(u03.m66329h().f35882b)) {
                C5871k5.m54077e().mo39058h(h60.f29524s, h60.f29520o, "status", h60.f29486E);
            }
            a13.m35943a("SSL Handler is " + sslErrorHandler);
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            super.onUnhandledKeyEvent(webView, keyEvent);
        }

        @ts2
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            PaytmWebView.this.mo48506g(webResourceRequest.getUrl().toString());
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            return super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            a13.m35943a("shouldOverrideUrlLoading" + str);
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* renamed from: com.paytm.pgsdk.PaytmWebView$g */
    public interface C7545g {
        /* renamed from: a */
        void mo48541a(String str);
    }

    public PaytmWebView(Context context, Bundle bundle) {
        super(context);
        this.f38564a = (PaytmPGActivity) context;
        this.f38565a = new HashMap<>();
        setWebChromeClient(new C7535a());
        getSettings().setJavaScriptEnabled(true);
        WebView.setWebContentsDebuggingEnabled(true);
        getSettings().setMixedContentMode(0);
        addJavascriptInterface(new C7541e(), f38556b);
    }

    /* renamed from: H */
    public boolean mo33954H(WebView webView, Object obj) {
        return false;
    }

    /* renamed from: K */
    public void mo33955K(WebView webView, String str, Bitmap bitmap) {
        a13.m35943a("Wc Page Start " + str);
        mo48506g(str);
    }

    /* renamed from: V */
    public void mo33956V(WebView webView, String str) {
        mo48506g(str);
    }

    /* renamed from: g */
    public final void mo48506g(String str) {
        HashMap<String, String> a;
        if (!TextUtils.isEmpty(str) && u03.m66329h().f35876a != null && (a = u03.m66329h().f35876a.mo44723a()) != null && a.get(h60.f29513h) != null && !a.get(h60.f29513h).contains(f38561g) && str.contains(a.get(h60.f29513h))) {
            a13.m35943a("Merchant specific Callback Url is finished loading. Extract data now. ");
            this.f38567b = true;
            mo48507h();
        }
    }

    /* renamed from: h */
    public void mo48507h() {
        if (!this.f38566a.get()) {
            this.f38566a.set(true);
            u03 h = u03.m66329h();
            String l = u03.m66333l();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2.put("txnToken", h.f35876a.mo44723a().get(h60.f29515j));
                jSONObject3.put("mid", h.f35876a.mo44723a().get("MID"));
                jSONObject3.put("orderId", h.f35876a.mo44723a().get(h60.f29506a));
                jSONObject3.put("isCallbackUrlRequired", true);
                jSONObject.put("body", jSONObject3);
                jSONObject.put(h60.f29502U, jSONObject2);
                FirebasePerfOkHttpClient.enqueue(new OkHttpClient().newCall(new Request.Builder().url(l).header("content-type", "application/json").header("Accept", "application/json").post(RequestBody.create(MediaType.parse("application/json"), jSONObject.toString().getBytes())).build()), new C7538d());
            } catch (Exception e) {
                w03 m = u03.m66329h().mo45355m();
                if (m != null) {
                    m.mo7776g((Bundle) null);
                }
                C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
            }
        }
    }

    /* renamed from: i */
    public final String mo48508i(Context context) {
        if (context == null) {
            return "";
        }
        try {
            fj1 fj1 = new fj1();
            HashMap hashMap = new HashMap();
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("upi").authority("pay");
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(builder.toString()));
            PackageManager packageManager = context.getPackageManager();
            for (ResolveInfo next : packageManager.queryIntentActivities(intent, 0)) {
                hashMap.put(next.loadLabel(packageManager).toString(), next.activityInfo.packageName);
                this.f38565a.put(next.activityInfo.packageName, next);
            }
            String z = fj1.mo36024z(hashMap);
            a13.m35943a("Upi App List" + z);
            return z;
        } catch (Exception e) {
            C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: j */
    public final synchronized boolean mo48509j(Bundle bundle) {
        boolean z;
        z = false;
        if (bundle != null) {
            try {
                if (bundle.size() > 0 && bundle.containsKey(r03.f34463l) && bundle.getString(r03.f34463l).equalsIgnoreCase(f38558d)) {
                    z = true;
                }
            } catch (Exception e) {
                C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
                a13.m35953k(e);
            }
        }
        return z;
    }

    /* renamed from: k */
    public final synchronized Bundle mo48510k(String str) {
        Bundle bundle;
        a13.m35943a("Parsing the Merchant Response");
        bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() > 0) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject.getString(next);
                    a13.m35943a(next + " = " + string);
                    bundle.putString(next, string);
                }
            }
        } catch (Exception e) {
            C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
            a13.m35943a("Error while parsing the Merchant Response");
            a13.m35953k(e);
        }
        return bundle;
    }

    /* renamed from: l */
    public final synchronized void mo48511l() {
        try {
            ((Activity) getContext()).runOnUiThread(new C7536b());
        } catch (Exception e) {
            C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
            a13.m35953k(e);
        }
        return;
    }

    /* renamed from: m */
    public final synchronized void mo48512m() {
        try {
            ((Activity) getContext()).runOnUiThread(new C7537c());
        } catch (Exception e) {
            C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
            a13.m35953k(e);
        }
        return;
    }

    public void setWebCLientCallBacks() {
        setWebViewClient(PaytmAssist.getAssistInstance().getWebClientInstance());
        PaytmAssist.getAssistInstance().getWebClientInstance().addAssistWebClientListener(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33964t(android.webkit.WebView r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r10 = "CALLBACK_URL"
            java.lang.String r0 = "url"
            java.lang.String r1 = "postnotificationurl"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Wc Page finsih "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            com.onedelhi.secure.a13.m35943a(r2)
            com.paytm.pgsdk.PaytmPGActivity r2 = r9.f38564a
            boolean r2 = r2.isFinishing()
            if (r2 != 0) goto L_0x0131
            com.onedelhi.secure.u03 r2 = com.onedelhi.secure.u03.m66329h()
            if (r2 == 0) goto L_0x012c
            com.onedelhi.secure.u03 r2 = com.onedelhi.secure.u03.m66329h()
            com.onedelhi.secure.t03 r2 = r2.f35876a
            if (r2 != 0) goto L_0x0032
            goto L_0x012c
        L_0x0032:
            com.onedelhi.secure.u03 r2 = com.onedelhi.secure.u03.m66329h()
            com.onedelhi.secure.t03 r2 = r2.f35876a
            java.util.HashMap r2 = r2.mo44723a()
            java.lang.String r3 = "fail"
            java.lang.String r4 = "status"
            java.lang.String r5 = "Paytm_H5_Load"
            java.lang.String r6 = "Redirection"
            if (r2 == 0) goto L_0x0118
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "page finish url"
            r7.append(r8)
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            com.onedelhi.secure.a13.m35943a(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ba }
            r7.<init>()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r8 = "Page finished loading "
            r7.append(r8)     // Catch:{ Exception -> 0x00ba }
            r7.append(r11)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00ba }
            com.onedelhi.secure.a13.m35943a(r7)     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r7 = r2.get(r10)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r8 = "javascript:window.HTMLOUT.processResponse(document.getElementById('response').value);"
            if (r7 == 0) goto L_0x008e
            java.lang.Object r10 = r2.get(r10)     // Catch:{ Exception -> 0x00ba }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Exception -> 0x00ba }
            boolean r10 = r11.contains(r10)     // Catch:{ Exception -> 0x00ba }
            if (r10 == 0) goto L_0x008e
            java.lang.String r10 = "Merchant specific Callback Url is finished loading. Extract data now. "
            com.onedelhi.secure.a13.m35943a(r10)     // Catch:{ Exception -> 0x00ba }
            r10 = 1
            r9.f38567b = r10     // Catch:{ Exception -> 0x00ba }
        L_0x008a:
            r9.loadUrl(r8)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00a8
        L_0x008e:
            java.lang.String r10 = "/CAS/Response"
            boolean r10 = r11.endsWith(r10)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r7 = "CAS Callback Url is finished loading. Extract data now. "
            if (r10 == 0) goto L_0x009c
            com.onedelhi.secure.a13.m35943a(r7)     // Catch:{ Exception -> 0x00ba }
            goto L_0x008a
        L_0x009c:
            java.lang.String r10 = "theia/paytmCallback"
            boolean r10 = r11.contains(r10)     // Catch:{ Exception -> 0x00ba }
            if (r10 == 0) goto L_0x00a8
            com.onedelhi.secure.a13.m35943a(r7)     // Catch:{ Exception -> 0x00ba }
            goto L_0x008a
        L_0x00a8:
            java.lang.Object r10 = r2.get(r1)
            if (r10 == 0) goto L_0x0118
            android.content.Intent r10 = new android.content.Intent
            com.paytm.pgsdk.PaytmPGActivity r7 = r9.f38564a
            java.lang.Class<com.paytm.pgsdk.IntentServicePostNotification> r8 = com.paytm.pgsdk.IntentServicePostNotification.class
            r10.<init>(r7, r8)
            goto L_0x00eb
        L_0x00b8:
            r10 = move-exception
            goto L_0x00fa
        L_0x00ba:
            r10 = move-exception
            com.onedelhi.secure.k5 r7 = com.onedelhi.secure.C5871k5.m54077e()     // Catch:{ all -> 0x00b8 }
            java.lang.String r8 = r10.getMessage()     // Catch:{ all -> 0x00b8 }
            r7.mo39056f(r6, r8)     // Catch:{ all -> 0x00b8 }
            com.onedelhi.secure.u03 r7 = com.onedelhi.secure.u03.m66329h()     // Catch:{ all -> 0x00b8 }
            java.lang.String r7 = r7.f35882b     // Catch:{ all -> 0x00b8 }
            boolean r7 = r11.equals(r7)     // Catch:{ all -> 0x00b8 }
            if (r7 == 0) goto L_0x00d9
            com.onedelhi.secure.k5 r7 = com.onedelhi.secure.C5871k5.m54077e()     // Catch:{ all -> 0x00b8 }
            r7.mo39058h(r5, r6, r4, r3)     // Catch:{ all -> 0x00b8 }
        L_0x00d9:
            com.onedelhi.secure.a13.m35953k(r10)     // Catch:{ all -> 0x00b8 }
            java.lang.Object r10 = r2.get(r1)
            if (r10 == 0) goto L_0x0118
            android.content.Intent r10 = new android.content.Intent
            com.paytm.pgsdk.PaytmPGActivity r7 = r9.f38564a
            java.lang.Class<com.paytm.pgsdk.IntentServicePostNotification> r8 = com.paytm.pgsdk.IntentServicePostNotification.class
            r10.<init>(r7, r8)
        L_0x00eb:
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r10.putExtra(r0, r1)
            com.paytm.pgsdk.PaytmPGActivity r0 = r9.f38564a
            r0.startService(r10)
            goto L_0x0118
        L_0x00fa:
            java.lang.Object r11 = r2.get(r1)
            if (r11 == 0) goto L_0x0117
            android.content.Intent r11 = new android.content.Intent
            com.paytm.pgsdk.PaytmPGActivity r3 = r9.f38564a
            java.lang.Class<com.paytm.pgsdk.IntentServicePostNotification> r4 = com.paytm.pgsdk.IntentServicePostNotification.class
            r11.<init>(r3, r4)
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r11.putExtra(r0, r1)
            com.paytm.pgsdk.PaytmPGActivity r0 = r9.f38564a
            r0.startService(r11)
        L_0x0117:
            throw r10
        L_0x0118:
            com.onedelhi.secure.u03 r10 = com.onedelhi.secure.u03.m66329h()
            java.lang.String r10 = r10.f35882b
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x0131
            com.onedelhi.secure.k5 r10 = com.onedelhi.secure.C5871k5.m54077e()
            r10.mo39058h(r5, r6, r4, r3)
            goto L_0x0131
        L_0x012c:
            java.lang.String r10 = "Transaction cancelled before loading web com.paytm.pgsdk.view completely."
            com.onedelhi.secure.a13.m35943a(r10)
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paytm.pgsdk.PaytmWebView.mo33964t(android.webkit.WebView, java.lang.String):void");
    }

    /* renamed from: v */
    public void mo33966v(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C5871k5 e = C5871k5.m54077e();
        e.mo39056f(h60.f29520o, "Error occurred while loading url " + sslError.getUrl());
        a13.m35943a("Error occured while loading url " + sslError.getUrl());
        if (sslError.getUrl().equals(u03.m66329h().f35882b)) {
            C5871k5.m54077e().mo39058h(h60.f29524s, h60.f29520o, "status", h60.f29486E);
        }
    }
}
