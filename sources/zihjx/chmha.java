package zihjx;

import android.annotation.SuppressLint;
import android.net.http.HttpResponseCache;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import com.onedelhi.secure.j15;
import com.onedelhi.secure.k15;
import com.onedelhi.secure.m05;
import com.onedelhi.secure.m15;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qz4;
import com.onedelhi.secure.r15;
import com.onedelhi.secure.r25;
import com.onedelhi.secure.rz4;
import com.onedelhi.secure.sz4;
import com.onedelhi.secure.x25;
import com.onedelhi.secure.zz4;
import com.phonepe.intent.sdk.bridges.BridgeHandler;
import com.phonepe.intent.sdk.bridges.DataStore;
import com.phonepe.intent.sdk.bridges.PermissionsHandler;
import jmjou.C7601c;
import jmjou.C7605d;

public abstract class chmha extends AppCompatActivity implements j15 {

    /* renamed from: a */
    public WebView f38900a;

    /* renamed from: a */
    public ProgressBar f38901a;

    /* renamed from: a */
    public zz4 f38902a;

    /* renamed from: a */
    public BridgeHandler f38903a;

    /* renamed from: a */
    public DataStore f38904a;

    /* renamed from: a */
    public PermissionsHandler f38905a;

    /* renamed from: a */
    public C7601c f38906a;

    /* renamed from: a */
    public C7605d f38907a;

    /* renamed from: e */
    public String f38908e;

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public /* synthetic */ void m74737j1() {
        this.f38901a.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ void m74738l1() {
        this.f38901a.setVisibility(8);
        this.f38900a.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ void m74739m1(String str) {
        this.f38900a.loadUrl(str);
    }

    /* renamed from: c */
    public void mo18086c(String str, String str2, String str3, String str4, String str5) {
        ((k15) this.f38906a.mo48873i(k15.class)).getClass();
        boolean z = false;
        String format = String.format("javascript:%s('%s'  , '%s' , '%s' , '%s')", new Object[]{str, str2, str3, str4, str5});
        WebView webView = this.f38900a;
        if (webView != null && webView.getVisibility() == 0) {
            z = true;
        }
        if (!isFinishing() || z) {
            runOnUiThread(new sz4(this, format));
        }
    }

    /* renamed from: h1 */
    public void mo50540h1() {
        runOnUiThread(new rz4(this));
    }

    /* renamed from: i1 */
    public void mo50541i1() {
        runOnUiThread(new qz4(this));
    }

    /* renamed from: k */
    public void mo47501k(String str) {
        try {
            this.f38900a.getSettings().setCacheMode(!((r25) this.f38906a.mo48873i(r25.class)).f34479a.mo48862b().getBoolean("isWebViewCacheEnabled", true) ? 2 : -1);
        } catch (Exception e) {
            m05.m56773d("BaseWebActivity", e.getMessage(), e);
        }
        int cacheMode = this.f38900a.getSettings().getCacheMode();
        m05.m56772c("CacheMode", "CacheMode: " + cacheMode);
        this.f38900a.loadUrl(str);
    }

    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: k1 */
    public void mo48630k1() {
        this.f38900a.addJavascriptInterface(this.f38904a, DataStore.TAG);
        this.f38900a.addJavascriptInterface(this.f38903a, BridgeHandler.TAG);
        this.f38900a.addJavascriptInterface(this.f38907a, "SMSManager");
        this.f38900a.addJavascriptInterface(this.f38905a, PermissionsHandler.TAG);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a2 A[Catch:{ Exception -> 0x0084 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            java.lang.String r0 = "mode"
            java.lang.String r1 = "paymentSources"
            super.onCreate(r7)
            int r7 = com.onedelhi.secure.ae3.C4546i.activity_phonepe_web
            r6.setContentView((int) r7)
            int r7 = com.onedelhi.secure.ae3.C4544g.phonepe_webview
            android.view.View r7 = r6.findViewById(r7)
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            r6.f38900a = r7
            int r7 = com.onedelhi.secure.ae3.C4544g.progressBar
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ProgressBar r7 = (android.widget.ProgressBar) r7
            r6.f38901a = r7
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r2 = "data_factory"
            android.os.Parcelable r7 = r7.getParcelableExtra(r2)
            jmjou.c r7 = (jmjou.C7601c) r7
            r6.f38906a = r7
            android.content.Context r7 = r6.getApplicationContext()
            jmjou.C7601c.f38776a = r7
            jmjou.c r7 = r6.f38906a
            java.lang.Class<jmjou.c$a> r2 = jmjou.C7601c.C7602a.class
            jmjou.e r7 = r7.mo48873i(r2)
            jmjou.c$a r7 = (jmjou.C7601c.C7602a) r7
            android.content.Intent r2 = r6.getIntent()
            java.lang.String r3 = "request"
            android.os.Parcelable r2 = r2.getParcelableExtra(r3)
            boolean r2 = r2 instanceof com.phonepe.intent.sdk.api.TransactionRequest
            r4 = 0
            if (r2 == 0) goto L_0x0059
            android.content.Intent r2 = r6.getIntent()
            android.os.Parcelable r2 = r2.getParcelableExtra(r3)
            com.phonepe.intent.sdk.api.TransactionRequest r2 = (com.phonepe.intent.sdk.api.TransactionRequest) r2
            r3 = r4
            goto L_0x0074
        L_0x0059:
            android.content.Intent r2 = r6.getIntent()
            android.os.Parcelable r2 = r2.getParcelableExtra(r3)
            boolean r2 = r2 instanceof com.phonepe.intent.sdk.api.B2BPGRequest
            if (r2 == 0) goto L_0x0072
            android.content.Intent r2 = r6.getIntent()
            android.os.Parcelable r2 = r2.getParcelableExtra(r3)
            com.phonepe.intent.sdk.api.B2BPGRequest r2 = (com.phonepe.intent.sdk.api.B2BPGRequest) r2
            r3 = r2
            r2 = r4
            goto L_0x0074
        L_0x0072:
            r2 = r4
            r3 = r2
        L_0x0074:
            java.lang.String r5 = "default"
            r6.f38908e = r5
            if (r2 != 0) goto L_0x007c
            if (r3 == 0) goto L_0x00c0
        L_0x007c:
            if (r2 == 0) goto L_0x0086
            java.lang.String r2 = r2.getData()     // Catch:{ Exception -> 0x0084 }
        L_0x0082:
            r4 = r2
            goto L_0x008d
        L_0x0084:
            r0 = move-exception
            goto L_0x00b7
        L_0x0086:
            if (r3 == 0) goto L_0x008d
            java.lang.String r2 = r3.getData()     // Catch:{ Exception -> 0x0084 }
            goto L_0x0082
        L_0x008d:
            java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x0084 }
            r3 = 0
            byte[] r4 = android.util.Base64.decode(r4, r3)     // Catch:{ Exception -> 0x0084 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0084 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0084 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x0084 }
            boolean r2 = r4.has(r1)     // Catch:{ Exception -> 0x0084 }
            if (r2 == 0) goto L_0x00c0
            org.json.JSONArray r1 = r4.getJSONArray(r1)     // Catch:{ Exception -> 0x0084 }
            org.json.JSONObject r1 = r1.getJSONObject(r3)     // Catch:{ Exception -> 0x0084 }
            boolean r2 = r1.has(r0)     // Catch:{ Exception -> 0x0084 }
            if (r2 == 0) goto L_0x00c0
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x0084 }
            r6.f38908e = r0     // Catch:{ Exception -> 0x0084 }
            goto L_0x00c0
        L_0x00b7:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "BaseWebActivity"
            com.onedelhi.secure.m05.m56773d(r2, r1, r0)
        L_0x00c0:
            java.lang.String r0 = "activity"
            r7.put(r0, r6)
            java.lang.String r0 = "bridgeCallback"
            r7.put(r0, r6)
            java.lang.String r0 = "nativeCardCallback"
            r7.put(r0, r6)
            jmjou.c r0 = r6.f38906a
            java.lang.String r1 = "ObjectFactory"
            r7.put(r1, r0)
            jmjou.c r0 = r6.f38906a
            java.lang.Class<jmjou.d> r1 = jmjou.C7605d.class
            jmjou.e r0 = r0.mo48874j(r1, r7)
            jmjou.d r0 = (jmjou.C7605d) r0
            r6.f38907a = r0
            jmjou.c r0 = r6.f38906a
            java.lang.Class<com.phonepe.intent.sdk.bridges.BridgeHandler> r1 = com.phonepe.intent.sdk.bridges.BridgeHandler.class
            jmjou.e r0 = r0.mo48874j(r1, r7)
            com.phonepe.intent.sdk.bridges.BridgeHandler r0 = (com.phonepe.intent.sdk.bridges.BridgeHandler) r0
            r6.f38903a = r0
            jmjou.c r0 = r6.f38906a
            java.lang.Class<com.phonepe.intent.sdk.bridges.PermissionsHandler> r1 = com.phonepe.intent.sdk.bridges.PermissionsHandler.class
            jmjou.e r0 = r0.mo48874j(r1, r7)
            com.phonepe.intent.sdk.bridges.PermissionsHandler r0 = (com.phonepe.intent.sdk.bridges.PermissionsHandler) r0
            r6.f38905a = r0
            jmjou.c r0 = r6.f38906a
            java.lang.Class<com.phonepe.intent.sdk.bridges.DataStore> r1 = com.phonepe.intent.sdk.bridges.DataStore.class
            jmjou.e r7 = r0.mo48874j(r1, r7)
            com.phonepe.intent.sdk.bridges.DataStore r7 = (com.phonepe.intent.sdk.bridges.DataStore) r7
            r6.f38904a = r7
            jmjou.c r7 = r6.f38906a
            java.lang.Class<com.onedelhi.secure.zz4> r0 = com.onedelhi.secure.zz4.class
            jmjou.e r7 = r7.mo48873i(r0)
            com.onedelhi.secure.zz4 r7 = (com.onedelhi.secure.zz4) r7
            r6.f38902a = r7
            java.lang.String r0 = "SDK_BASE_WEB_ACTIVITY_CREATED"
            com.onedelhi.secure.u25 r0 = r7.mo48478b(r0)
            r7.mo48477a(r0)
            jmjou.c r7 = r6.f38906a
            com.onedelhi.secure.l05.m55197a(r7)
            r6.mo48630k1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zihjx.chmha.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        HttpResponseCache httpResponseCache = (HttpResponseCache) this.f38906a.mo48872h(HttpResponseCache.class.getCanonicalName());
        if (httpResponseCache == null) {
            m05.m56771b("Utils", "http response cache is not installed, can not flush");
        } else {
            httpResponseCache.flush();
            m05.m56774e("Utils", "http response cache is flushed");
        }
        this.f38900a.removeJavascriptInterface("SMSManager");
        this.f38900a.removeJavascriptInterface(PermissionsHandler.TAG);
        this.f38900a.removeJavascriptInterface(BridgeHandler.TAG);
        this.f38900a.removeJavascriptInterface(DataStore.TAG);
        this.f38907a.stopListeningToOTP();
    }

    public void onRequestPermissionsResult(int i, @mr2 String[] strArr, @mr2 int[] iArr) {
        String str;
        if (i != 1011) {
            switch (i) {
                case 456:
                case 457:
                case 458:
                    C7605d dVar = this.f38907a;
                    dVar.getClass();
                    if (iArr.length > 0) {
                        if (!(iArr[0] == 0)) {
                            String str2 = strArr[0];
                            str2.getClass();
                            char c = 65535;
                            switch (str2.hashCode()) {
                                case -2062386608:
                                    if (str2.equals("android.permission.READ_SMS")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case -5573545:
                                    if (str2.equals("android.permission.READ_PHONE_STATE")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 52602690:
                                    if (str2.equals("android.permission.SEND_SMS")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    str = "PERMISSION_DENIED_READ_SMS";
                                    break;
                                case 1:
                                    str = "PERMISSION_DENIED_READ_PHONE_STATE";
                                    break;
                                case 2:
                                    str = "PERMISSION_DENIED_SEND_SMS";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            m15 m15 = (m15) dVar.f38782a.mo48873i(m15.class);
                            m15.put("code", str);
                            String jsonString = m15.toJsonString();
                            r15 r15 = (r15) dVar.f38782a.mo48873i(r15.class);
                            r15.mo43794a((x25) dVar.f38782a.mo48873i(x25.class));
                            String jsonString2 = r15.toJsonString();
                            m05.m56772c("SMSManager", String.format("calling onBridgeCallBack  callback = {%s}, error = {%s}, response={%s}, context={%s}, body={%s}.", new Object[]{dVar.f38784b, jsonString, null, dVar.f38785c, jsonString2}));
                            dVar.f38781a.mo18086c(dVar.f38784b, jsonString, (String) null, dVar.f38785c, jsonString2);
                            return;
                        }
                        String str3 = strArr[0];
                        str3.getClass();
                        if (str3.equals("android.permission.READ_SMS")) {
                            dVar.mo48881a();
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            PermissionsHandler permissionsHandler = this.f38905a;
            if (permissionsHandler != null) {
                permissionsHandler.onPermissionReceived(strArr, iArr);
            }
        }
    }

    public void onStop() {
        super.onStop();
        this.f38901a.setVisibility(8);
    }
}
