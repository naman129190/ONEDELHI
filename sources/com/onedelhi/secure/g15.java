package com.onedelhi.secure;

import android.os.Build;
import com.onedelhi.secure.d35;
import com.phonepe.intent.sdk.api.AvailabilityCheckRequest;
import com.phonepe.intent.sdk.api.B2BPGRequest;
import com.phonepe.intent.sdk.api.TransactionRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import jmjou.C7601c;
import jmjou.C7606e;

public class g15 implements C7606e {

    /* renamed from: a */
    public g35 f28861a;

    /* renamed from: a */
    public q15 f28862a;

    /* renamed from: a */
    public C7601c f28863a;

    /* renamed from: com.onedelhi.secure.g15$a */
    public interface C5355a {
        /* renamed from: a */
        void mo36534a(Map<String, String> map);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m49016f(String str, String str2, t25 t25, Map map) {
        this.f28862a.mo43082a(str, map, str2, t25, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m49017g(String str, String str2, t25 t25, Map map) {
        this.f28862a.mo43082a(str, map, str2, t25, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m49018l(String str, String str2, t25 t25, Map map) {
        this.f28862a.mo43082a(str, map, str2, t25, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m49019o(String str, String str2, t25 t25, Map map) {
        this.f28862a.mo43082a(str, map, str2, t25, false);
    }

    /* renamed from: h */
    public void mo36528h(w15 w15, n95 n95, @mr2 t25 t25) {
        boolean i = l05.m55205i((Boolean) this.f28863a.mo48872h("com.phonepe.android.sdk.isUAT"));
        String str = d35.m44668a(i).f27213b + "/apis/v2/sdk/config";
        this.f28863a.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("X-SDK-CHECKSUM", l05.m55201e(this.f28863a, "/apis/v2/sdk/config", (String) null));
        i15 i15 = (i15) this.f28863a.mo48873i(i15.class);
        i15.mo37813a(w15);
        i15.mo37814b(n95);
        mo36532m(hashMap, new u05(this, str, i15.toJsonString(), t25));
    }

    /* renamed from: i */
    public void mo36529i(AvailabilityCheckRequest availabilityCheckRequest, w15 w15, n95 n95, @mr2 t25 t25) {
        boolean i = l05.m55205i((Boolean) this.f28863a.mo48872h("com.phonepe.android.sdk.isUAT"));
        e05 e05 = (e05) this.f28863a.mo48873i(e05.class);
        e05.mo37815c(availabilityCheckRequest.getData());
        e05.mo37813a(w15);
        e05.mo37814b(n95);
        mo36532m(availabilityCheckRequest.getHeaderMap(), new w05(this, d35.m44668a(i).f27213b + "/v3/availabilitycheck", e05.toJsonString(), t25));
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        this.f28862a = cVar == null ? null : (uz4) cVar.mo48873i(uz4.class);
        this.f28861a = (g35) cVar.mo48873i(g35.class);
        this.f28863a = cVar;
    }

    public boolean isCachingAllowed() {
        return true;
    }

    /* renamed from: j */
    public void mo36530j(B2BPGRequest b2BPGRequest, w15 w15, n95 n95, t25 t25) {
        String apiUrl = b2BPGRequest.getApiUrl();
        if (apiUrl == null) {
            apiUrl = "/pg/v1/pay";
        }
        boolean i = l05.m55205i((Boolean) this.f28863a.mo48872h("com.phonepe.android.sdk.isUAT"));
        StringBuilder sb = new StringBuilder();
        Set<String> set = d35.f27206a;
        sb.append((i ? d35.C4952a.API_UAT : d35.C4952a.API_PRODUCTION).f27213b);
        sb.append("/apis/hermes");
        sb.append(apiUrl);
        String sb2 = sb.toString();
        wz4 wz4 = (wz4) this.f28863a.mo48873i(wz4.class);
        wz4.mo37815c(b2BPGRequest.getData());
        wz4.mo37813a(w15);
        mo36532m(b2BPGRequest.getHeaderMaps(), new x05(this, sb2, wz4.toJsonString(), t25));
    }

    /* renamed from: k */
    public void mo36531k(TransactionRequest transactionRequest, w15 w15, n95 n95, @mr2 t25 t25) {
        String aPIUrl = transactionRequest.getAPIUrl();
        boolean i = l05.m55205i((Boolean) this.f28863a.mo48872h("com.phonepe.android.sdk.isUAT"));
        String str = d35.m44668a(i).f27215d + "debit";
        if (aPIUrl != null) {
            str = d35.m44668a(i).f27213b + aPIUrl;
        }
        f35 f35 = (f35) this.f28863a.mo48873i(f35.class);
        f35.mo37815c(transactionRequest.getData());
        f35.mo37813a(w15);
        mo36532m(transactionRequest.getHeaderMap(), new v05(this, str, f35.toJsonString(), t25));
    }

    /* renamed from: m */
    public void mo36532m(Map<String, String> map, C5355a aVar) {
        String str;
        map.put("Content-Type", "application/json");
        map.put("X-CHANNEL-ID", "phonepe_android_sdk");
        map.put("X-SOURCE-VERSION", "1.6.7");
        g35 g35 = this.f28861a;
        g35.getClass();
        try {
            str = g35.mo36562a().getPackageManager().getPackageInfo(g35.mo36562a().getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = dv0.f10947b;
        }
        map.put("X-APP-VERSION", str);
        this.f28861a.getClass();
        map.put("X-OS-VERSION", String.valueOf(Build.VERSION.SDK_INT));
        this.f28861a.getClass();
        map.put("X-DEVICE-MODEL", Build.MODEL);
        this.f28861a.getClass();
        map.put("X-DEVICE-MANUFACTURER", Build.MANUFACTURER);
        g35 g352 = this.f28861a;
        g352.getClass();
        String str2 = null;
        try {
            str2 = g352.mo36562a().getPackageManager().getPackageInfo(g352.mo36562a().getPackageName(), 0).packageName;
        } catch (Exception unused2) {
        }
        map.put("X-MERCHANT-APP-ID", str2);
        if (!l05.m55207k(this.f28861a.mo36563b())) {
            map.put("X-APP-ID", this.f28861a.mo36563b());
        }
        this.f28863a.getClass();
        map.put("X-SDK-SESSION-ID", C7601c.f38778b);
        g35 g353 = this.f28861a;
        g353.f28935a.mo46505b(false, new y05(this, map, aVar));
    }

    /* renamed from: n */
    public final void mo36533n(Map map, C5355a aVar, String str) {
        if (str != null && !str.isEmpty()) {
            map.put("X-DEVICE-ID", str);
            this.f28861a.getClass();
            if (str.length() > 35) {
                str = str.replace("-", "").toUpperCase();
            }
            map.put("X-DEVICE-UPI-ID", str.substring(0, Math.min(35, str.length())));
        }
        aVar.mo36534a(map);
    }
}
