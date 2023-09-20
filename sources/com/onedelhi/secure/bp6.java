package com.onedelhi.secure;

import android.net.Uri;
import android.text.TextUtils;
import com.paytm.pgsdk.PaytmWebView;
import java.util.HashMap;

public final class bp6 extends vo6 {
    public bp6(qq6 qq6) {
        super(qq6);
    }

    /* renamed from: i */
    public final zo6 mo13793i(String str) {
        y07.m31827c();
        zo6 zo6 = null;
        if (this.f11205a.mo27891z().mo14110B((String) null, n36.f17078q0)) {
            this.f11205a.mo15136e().mo12730v().mo25379a("sgtm feature flag enabled.");
            yd6 R = this.f21907a.mo23370W().mo26065R(str);
            if (R == null) {
                return new zo6(mo13794j(str));
            }
            if (R.mo27370O()) {
                this.f11205a.mo15136e().mo12730v().mo25379a("sgtm upload enabled in manifest.");
                g76 t = this.f21907a.mo23374a0().mo13588t(R.mo27399i0());
                if (t != null) {
                    String K = t.mo16375K();
                    if (!TextUtils.isEmpty(K)) {
                        String J = t.mo16374J();
                        this.f11205a.mo15136e().mo12730v().mo25381c("sgtm configured with upload_url, server_info", K, true != TextUtils.isEmpty(J) ? "N" : PaytmWebView.f38558d);
                        if (TextUtils.isEmpty(J)) {
                            this.f11205a.mo15134c();
                            zo6 = new zo6(K);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", J);
                            zo6 = new zo6(K, hashMap);
                        }
                    }
                }
            }
            if (zo6 != null) {
                return zo6;
            }
        }
        return new zo6(mo13794j(str));
    }

    /* renamed from: j */
    public final String mo13794j(String str) {
        String w = this.f21907a.mo23374a0().mo13591w(str);
        if (TextUtils.isEmpty(w)) {
            return (String) n36.f17077q.mo18887a((Object) null);
        }
        Uri parse = Uri.parse((String) n36.f17077q.mo18887a((Object) null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        buildUpon.authority(w + "." + authority);
        return buildUpon.build().toString();
    }
}
