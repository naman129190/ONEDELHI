package com.onedelhi.secure;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Bundle;
import android.os.Handler;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.m05;
import com.phonepe.intent.sdk.api.TransactionRequest;
import java.util.List;
import jmjou.C7599a;
import jmjou.C7601c;
import jmjou.C7606e;
import org.json.JSONObject;

public class a05 implements d15, C7606e, t25 {

    /* renamed from: a */
    public g15 f25690a;

    /* renamed from: a */
    public w15 f25691a;

    /* renamed from: a */
    public xz4 f25692a;

    /* renamed from: a */
    public z15 f25693a;

    /* renamed from: a */
    public zz4 f25694a;

    /* renamed from: a */
    public TransactionRequest f25695a;

    /* renamed from: a */
    public C7599a f25696a;

    /* renamed from: a */
    public C7601c f25697a;

    /* renamed from: b */
    public String f25698b;

    /* renamed from: b */
    public boolean f25699b = false;

    /* renamed from: c */
    public boolean f25700c = false;

    /* renamed from: n */
    public int f25701n;

    /* renamed from: o */
    public int f25702o;

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m35663t() {
        mo30384d("FAILED");
    }

    /* renamed from: a */
    public void mo30381a(String str, String str2, String str3) {
        this.f25699b = ((Boolean) ((u15) h15.fromJsonString(str2, this.f25697a, u15.class)).get("isJSLoaded")).booleanValue();
        if (this.f25692a != null) {
            this.f25692a.mo47497c(str3, (String) null, this.f25697a.mo48876m("SUCCESS").toJsonString(), str, ((r15) this.f25697a.mo48873i(r15.class)).toJsonString());
        }
    }

    /* renamed from: b */
    public void mo30382b(String str, String str2, String str3) {
        boolean booleanValue = ((Boolean) ((c35) h15.fromJsonString(str2, this.f25697a, c35.class)).get("showLoader")).booleanValue();
        xz4 xz4 = this.f25692a;
        if (xz4 != null) {
            xz4.mo47502p(booleanValue);
            this.f25692a.mo47497c(str3, (String) null, this.f25697a.mo48876m("SUCCESS").toJsonString(), str, ((r15) this.f25697a.mo48873i(r15.class)).toJsonString());
        }
    }

    /* renamed from: c */
    public void mo30383c(int i, String str) {
        if (!l05.m55206j(this.f25692a, "TransactionPresenter", "transactionView")) {
            this.f25690a.f28863a.getClass();
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) C7601c.f38776a.getSystemService("connectivity")).getActiveNetworkInfo();
            String str2 = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting() ? "Transaction could not be initiated." : "Network unavailable.";
            if (this.f25702o >= this.f25701n) {
                mo30402v("Transaction could not be initiated.");
                return;
            }
            xz4 xz4 = this.f25692a;
            if (xz4 != null) {
                xz4.mo47496R(str2, true);
            }
        }
    }

    /* renamed from: d */
    public void mo30384d(String str) {
        if (!l05.m55206j(this.f25692a, "TransactionPresenter", "transactionView")) {
            mo30401u("SDK_MERCHANT_CALLBACK_SENT");
            h35 h35 = (h35) h15.fromJsonString(str, this.f25697a, h35.class);
            if (h35 == null || h35.get("statusCode") == null || !"USER_CANCEL".matches((String) h35.get("statusCode"))) {
                this.f25692a.mo47499h(str);
            } else {
                this.f25692a.mo47498e(this.f25697a.mo48876m("USER_CANCEL").toJsonString());
            }
        }
    }

    /* renamed from: e */
    public void mo30385e(String str) {
        if (this.f25692a != null && str.equals((Object) null)) {
            zz4 zz4 = this.f25694a;
            zz4.mo48477a(zz4.mo48478b("SDK_RENDER_START"));
        }
    }

    /* renamed from: g */
    public final <T> T mo30386g(Bundle bundle, Intent intent, String str) {
        T t = (bundle == null || !bundle.containsKey(str)) ? null : bundle.get(str);
        if (t != null) {
            return t;
        }
        if (intent == null || intent.getExtras() == null) {
            return null;
        }
        return intent.getParcelableExtra(str);
    }

    /* renamed from: h */
    public void mo30387h(String str) {
        Boolean bool;
        m05.m56772c("V3/DEBIT", "Got v3/debit response");
        if (!l05.m55206j(this.f25692a, "TransactionPresenter", "transactionView")) {
            try {
                r25 r25 = (r25) this.f25697a.mo48873i(r25.class);
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(C4311b.C4317f.C4318a.f25149a)) {
                    r25.mo43798d(jSONObject.getJSONObject(C4311b.C4317f.C4318a.f25149a));
                }
                if (r25.f34479a.mo48862b().getBoolean("isCacheReportingEnabled", false)) {
                    u25 b = this.f25694a.mo48478b("SDK_PRE_CACHE_METRICS");
                    if (l05.m55205i((Boolean) this.f25697a.mo48872h("com.phonepe.android.sdk.PreCacheEnabled"))) {
                        HttpResponseCache installed = HttpResponseCache.getInstalled();
                        h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "requestCount", Integer.valueOf(installed.getRequestCount()));
                        h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "hitCount", Integer.valueOf(installed.getHitCount()));
                        h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "networkCount", Integer.valueOf(installed.getNetworkCount()));
                        h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "size", Long.valueOf(installed.size()));
                        h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "maxSize", Long.valueOf(installed.maxSize()));
                        bool = Boolean.TRUE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "preCacheEnabled", bool);
                    this.f25694a.mo48477a(b);
                }
            } catch (Exception e) {
                m05.m56773d("TransactionPresenter", e.getMessage(), e);
            }
            z15 z15 = l05.m55206j(str, "TransactionPresenter", "res") ? null : (z15) h15.fromJsonString(str, this.f25697a, z15.class);
            this.f25693a = z15;
            if (z15 == null) {
                if (this.f25702o >= this.f25701n) {
                    mo30402v("Transaction could not be initiated.");
                } else {
                    xz4 xz4 = this.f25692a;
                    if (xz4 != null) {
                        xz4.mo47496R("Transaction could not be initiated.", true);
                    }
                }
                this.f25692a.mo47502p(false);
                return;
            }
            mo30400s(z15);
        }
    }

    /* renamed from: i */
    public void mo30388i() {
        if (this.f25692a == null) {
            String format = String.format("{%s} is null, returning from the function {%s}", new Object[]{"transactionView", "onBackPressed"});
            m05.C6076b bVar = m05.f31968a;
            if (bVar != null) {
                bVar.mo40403b("TransactionPresenter", format);
                return;
            }
            return;
        }
        mo30401u("SDK_BACK_BUTTON_CLICKED");
        if (this.f25699b) {
            u25 b = ((zz4) this.f25697a.mo48873i(zz4.class)).mo48478b("BACK_PRESSED");
            h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "action", "back press");
            C7599a aVar = this.f25696a;
            String jsonString = b.toJsonString();
            aVar.f38773a.mo18086c("eventBridge", (String) null, aVar.f38774a.mo48876m("SUCCESS").toJsonString(), (String) null, jsonString);
            return;
        }
        this.f25692a.mo47500i();
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        this.f25690a = (g15) cVar.mo48873i(g15.class);
        this.f25692a = (xz4) (aVar.containsKey("trxView") ? aVar.get("trxView") : null);
        this.f25696a = (C7599a) cVar.mo48874j(C7599a.class, aVar);
        ((k15) cVar.mo48873i(k15.class)).getClass();
        this.f25701n = 1;
        this.f25697a = cVar;
        this.f25694a = (zz4) cVar.mo48873i(zz4.class);
    }

    public boolean isCachingAllowed() {
        return false;
    }

    /* renamed from: j */
    public void mo30391j(o05 o05) {
        String str;
        String str2;
        if (o05 != null && this.f25692a != null) {
            String str3 = d35.m44668a(l05.m55205i((Boolean) this.f25697a.mo48872h("com.phonepe.android.sdk.isUAT"))).f27213b;
            if (o05.f32872a != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(o05.f32872a);
                List<n05> list = o05.f32873a;
                if (list == null || list.isEmpty()) {
                    str2 = "";
                } else {
                    StringBuilder sb2 = new StringBuilder("?");
                    for (int i = 0; i < list.size(); i++) {
                        sb2.append(((String) list.get(i).get("key")) + a13.f25713a + ((String) list.get(i).get("value")) + a13.f25714b);
                    }
                    sb2.setLength(sb2.length() - 1);
                    str2 = sb2.toString();
                }
                sb.append(str2);
                str = sb.toString();
            } else {
                str = null;
            }
            this.f25698b = str;
        }
    }

    /* renamed from: k */
    public void mo30392k(String str) {
        if (str.toLowerCase().startsWith("https://") && str.toLowerCase().contains(".phonepe.com") && !str.toLowerCase().contains("javascript")) {
            this.f25698b = str;
        }
        if (this.f25692a != null && str.equals((Object) null)) {
            mo30401u("SDK_PAGE_LOAD_COMPLETE");
        }
    }

    /* renamed from: l */
    public void mo30393l(Bundle bundle) {
        if (!l05.m55206j(bundle, "TransactionPresenter", "bundle")) {
            bundle.putParcelable("request", this.f25695a);
            bundle.putParcelable("key_debit_response", this.f25693a);
            bundle.putString("key_last_url", this.f25698b);
            bundle.putParcelable("sdk_context", this.f25691a);
            bundle.putBoolean("deeplink_launched", this.f25700c);
        }
    }

    /* renamed from: m */
    public void mo30394m() {
        if (!l05.m55206j(this.f25692a, "TransactionPresenter", "transactionView")) {
            this.f25692a.mo47502p(true);
            this.f25702o++;
            TransactionRequest transactionRequest = this.f25695a;
            m05.m56772c("V3/DEBIT", "Starting v3/debit call");
            this.f25691a.mo46494a();
            this.f25690a.mo36531k(transactionRequest, this.f25691a, (n95) null, this);
        }
    }

    /* renamed from: n */
    public void mo30395n() {
        if (this.f25692a != null) {
            mo30401u("SDK_BACK_CANCELLED");
        }
    }

    /* renamed from: o */
    public void mo30396o(Intent intent, Bundle bundle) {
        this.f25695a = (TransactionRequest) mo30386g(bundle, intent, "request");
        this.f25693a = (z15) mo30386g(bundle, intent, "key_debit_response");
        this.f25698b = (String) ((bundle == null || !bundle.containsKey("key_last_url")) ? null : bundle.get("key_last_url"));
        this.f25691a = (w15) mo30386g(bundle, intent, "sdk_context");
        Boolean bool = (Boolean) mo30386g(bundle, intent, "deeplink_launched");
        if (bool != null) {
            this.f25700c = bool.booleanValue();
        }
        this.f25692a.mo47502p(true);
        if (!this.f25700c) {
            String str = this.f25698b;
            if (str == null || str.isEmpty()) {
                z15 z15 = this.f25693a;
                if (z15 != null) {
                    mo30400s(z15);
                    return;
                }
                TransactionRequest transactionRequest = this.f25695a;
                if (transactionRequest == null) {
                    xz4 xz4 = this.f25692a;
                    if (xz4 != null) {
                        xz4.mo47496R("Invalid data.", true);
                    }
                } else if (transactionRequest.getRedirectUrl() != null) {
                    this.f25692a.mo47501k(transactionRequest.getRedirectUrl());
                } else {
                    m05.m56772c("V3/DEBIT", "Starting v3/debit call");
                    this.f25691a.mo46494a();
                    this.f25690a.mo36531k(transactionRequest, this.f25691a, (n95) null, this);
                }
            } else {
                this.f25692a.mo47501k(this.f25698b);
            }
        }
    }

    /* renamed from: p */
    public void mo30397p() {
        if (this.f25692a != null) {
            mo30401u("SDK_BACK_CONFIRMED");
            this.f25692a.mo47498e(this.f25697a.mo48876m("USER_CANCEL").toJsonString());
            u25 b = this.f25694a.mo48478b("SDK_MERCHANT_CALLBACK_SENT");
            h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "sdkTransactionStatus", "USER_CANCEL");
            ((zz4) this.f25697a.mo48873i(zz4.class)).mo48477a(b);
        }
    }

    /* renamed from: q */
    public void mo30398q(boolean z, m95 m95) {
        u25 b = this.f25694a.mo48478b("PHONEPE_APP_RETURNED_RESULT");
        h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "wasCanceled", String.valueOf(z));
        if (m95 != null) {
            h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "result", m95.toString());
        }
        ((zz4) this.f25697a.mo48873i(zz4.class)).mo48477a(b);
    }

    /* renamed from: r */
    public void mo30399r() {
        this.f25692a = null;
    }

    /* renamed from: s */
    public final void mo30400s(z15 z15) {
        String str;
        if (z15.mo48121c() != null && (z15.mo48121c().matches("SUCCESS") || z15.mo48121c().matches("PAYMENT_INITIATED"))) {
            mo30401u("SDK_TRANSACTION_TOKEN_RECEIVED");
            int ordinal = j05.valueOf((String) h15.get(z15.mo48120b(), "redirectType")).ordinal();
            if (ordinal == 0) {
                this.f25692a.mo47501k(z15.mo48119a());
            } else if (ordinal == 1) {
                String a = z15.mo48119a();
                if (!this.f25700c) {
                    m05.m56774e("TransactionPresenter", "Opening PP App with Url: " + a);
                    u25 b = this.f25694a.mo48478b("PHONEPE_APP_OPENED_FOR_RESULT");
                    h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "intentUrl", a);
                    ((zz4) this.f25697a.mo48873i(zz4.class)).mo48477a(b);
                    if (Uri.parse(a) != null) {
                        this.f25700c = true;
                        this.f25692a.mo47503s(Uri.parse(a));
                        return;
                    }
                    xz4 xz4 = this.f25692a;
                    if (xz4 != null) {
                        xz4.mo47496R("Invalid redirection information.", true);
                    }
                    this.f25692a.mo47502p(false);
                }
            }
        } else {
            try {
                str = (String) z15.get("message");
            } catch (Exception unused) {
                str = "Something went wrong";
            }
            mo30402v(str);
        }
    }

    /* renamed from: u */
    public final void mo30401u(String str) {
        ((zz4) this.f25697a.mo48873i(zz4.class)).mo48477a(this.f25694a.mo48478b(str));
    }

    /* renamed from: v */
    public final void mo30402v(String str) {
        this.f25692a.mo47496R(str, false);
        this.f25697a.getClass();
        new Handler().postDelayed(new yz4(this), 1500);
    }
}
