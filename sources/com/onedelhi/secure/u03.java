package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.paytm.pgsdk.PaytmPGActivity;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class u03 {

    /* renamed from: a */
    public static volatile u03 f35865a = null;

    /* renamed from: g */
    public static final String f35866g = "https://pguat.paytm.com/oltp/HANDLER_INTERNAL/TXNSTATUS";

    /* renamed from: h */
    public static final String f35867h = "https://secure.paytm.in/oltp/HANDLER_INTERNAL/TXNSTATUS";

    /* renamed from: i */
    public static final String f35868i = "https://pguat.paytm.com:8448/CAS/ChecksumGenerator";

    /* renamed from: j */
    public static final String f35869j = "https://secure.paytm.in/oltp-web/generateChecksum";

    /* renamed from: k */
    public static final String f35870k = "https://pguat.paytm.com/oltp/HANDLER_INTERNAL/CANCEL_TXN";

    /* renamed from: l */
    public static final String f35871l = "https://secure.paytm.in/oltp/HANDLER_INTERNAL/CANCEL_TXN";

    /* renamed from: m */
    public static final String f35872m = "https://pguat.paytm.com/oltp-web/processTransaction";

    /* renamed from: n */
    public static final String f35873n = "https://secure.paytm.in/oltp-web/processTransaction";

    /* renamed from: o */
    public static String f35874o = "";

    /* renamed from: a */
    public volatile q03 f35875a;

    /* renamed from: a */
    public volatile t03 f35876a;

    /* renamed from: a */
    public volatile w03 f35877a;

    /* renamed from: a */
    public volatile x03 f35878a;

    /* renamed from: a */
    public volatile z03 f35879a;

    /* renamed from: a */
    public volatile String f35880a;

    /* renamed from: a */
    public volatile boolean f35881a;

    /* renamed from: b */
    public volatile String f35882b;

    /* renamed from: b */
    public boolean f35883b = true;

    /* renamed from: c */
    public volatile String f35884c;

    /* renamed from: d */
    public String f35885d;

    /* renamed from: e */
    public String f35886e;

    /* renamed from: f */
    public String f35887f;

    /* renamed from: a */
    public static String m66325a() {
        return "https://" + m66326d() + h60.f29504W;
    }

    /* renamed from: d */
    public static String m66326d() {
        if (!TextUtils.isEmpty(m66329h().f35882b)) {
            try {
                return new URL(m66329h().f35882b).getHost();
            } catch (MalformedURLException unused) {
            }
        }
        return "securegw.paytm.in";
    }

    /* renamed from: f */
    public static synchronized u03 m66327f() {
        u03 h;
        synchronized (u03.class) {
            h = m66329h();
            h.f35880a = "https://securegw.paytm.in/theia/closeOrder";
            h.f35882b = "https://securegw-preprod.paytm.in/theia/processTransaction";
            uq3.m67409a().mo45789e(true);
        }
        return h;
    }

    /* renamed from: g */
    public static synchronized u03 m66328g() {
        u03 h;
        synchronized (u03.class) {
            h = m66329h();
            h.f35880a = "https://securegw.paytm.in/theia/closeOrder";
            h.f35882b = "https://securegw.paytm.in/theia/processTransaction";
            uq3.m67409a().mo45789e(true);
        }
        return h;
    }

    /* renamed from: h */
    public static synchronized u03 m66329h() {
        u03 u03;
        synchronized (u03.class) {
            try {
                if (f35865a == null) {
                    a13.m35943a("Creating an instance of Paytm PG Service...");
                    f35865a = new u03();
                    a13.m35943a("Created a new instance of Paytm PG Service.");
                }
            } catch (Exception e) {
                C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
                a13.m35953k(e);
            }
            u03 = f35865a;
        }
        return u03;
    }

    /* renamed from: i */
    public static synchronized u03 m66330i(t03 t03, String str) {
        u03 h;
        synchronized (u03.class) {
            HashMap<String, String> a = t03.mo44723a();
            if (TextUtils.isEmpty(str)) {
                str = "https://securegw.paytm.in/theia/api/v1/showPaymentPage";
            }
            h = m66329h();
            h.f35882b = str + "?mid=" + a.get("MID") + "&orderId=" + a.get(h60.f29506a);
            uq3.m67409a().mo45789e(true);
        }
        return h;
    }

    /* renamed from: j */
    public static synchronized u03 m66331j(String str) {
        u03 h;
        String str2;
        synchronized (u03.class) {
            h = m66329h();
            h.f35884c = f35866g;
            if (!TextUtils.isEmpty(str)) {
                h.f35882b = str;
                str2 = h.f35882b;
            } else {
                h.f35882b = "https://securegw-stage.paytm.in/theia/processTransaction";
                str2 = h.f35882b;
            }
            f35874o = str2;
            uq3.m67409a().mo45789e(false);
        }
        return h;
    }

    /* renamed from: k */
    public static synchronized u03 m66332k() {
        u03 h;
        synchronized (u03.class) {
            h = m66329h();
            h.f35882b = "https://securegw-stage.paytm.in/theia/api/v1/showPaymentPage";
        }
        return h;
    }

    /* renamed from: l */
    public static String m66333l() {
        return "https://" + m66326d() + h60.f29505X;
    }

    /* renamed from: b */
    public void mo45352b(Context context) {
        ApplicationInfo c = mo45353c(context);
        boolean z = false;
        if (c != null) {
            int i = c.flags & 2;
            c.flags = i;
            if (i != 0) {
                z = true;
            }
        }
        w82.m69219f(z);
    }

    /* renamed from: c */
    public final ApplicationInfo mo45353c(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
        } catch (Exception e) {
            C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
            a13.m35943a(e.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: e */
    public String mo45354e() {
        return this.f35886e;
    }

    /* renamed from: m */
    public w03 mo45355m() {
        return this.f35877a == null ? uq3.m67409a().mo45786b() : this.f35877a;
    }

    /* renamed from: n */
    public synchronized void mo45356n(t03 t03, q03 q03) {
        this.f35876a = t03;
        if (this.f35876a.mo44723a() != null) {
            this.f35885d = this.f35876a.mo44723a().get("MID");
            this.f35886e = this.f35876a.mo44723a().get(h60.f29506a);
            this.f35887f = this.f35876a.mo44723a().get(h60.f29515j);
        }
        this.f35875a = q03;
    }

    /* renamed from: o */
    public final boolean mo45357o() {
        return this.f35883b;
    }

    /* renamed from: p */
    public void mo45358p(boolean z) {
        this.f35883b = z;
    }

    /* renamed from: q */
    public synchronized void mo45359q(Context context, boolean z, w03 w03) {
        String str;
        try {
            mo45352b(context);
            if (a13.m35950h(context)) {
                if (!this.f35881a) {
                    Bundle bundle = new Bundle();
                    bundle.putString("mid", this.f35885d);
                    bundle.putString("orderId", this.f35886e);
                    bundle.putString("txnToken", this.f35887f);
                    a13.m35943a("Starting the Service...");
                    Intent intent = new Intent(context, PaytmPGActivity.class);
                    intent.putExtra("mid", this.f35885d);
                    intent.putExtra("orderId", this.f35886e);
                    intent.putExtra(r03.f34469r, bundle);
                    intent.putExtra(r03.f34470s, z);
                    intent.putExtra(h60.f29516k, mo45357o());
                    this.f35881a = true;
                    this.f35877a = w03;
                    uq3.m67409a().mo45788d(w03);
                    ((Activity) context).startActivity(intent);
                    str = "Service Started.";
                } else {
                    str = "Service is already running.";
                }
                a13.m35943a(str);
            } else {
                mo45361s();
                w03.mo7773d();
            }
        } catch (Exception e) {
            C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
            mo45361s();
            a13.m35953k(e);
        }
        return;
    }

    /* renamed from: r */
    public synchronized void mo45360r(Context context, boolean z, boolean z2, w03 w03) {
        String str;
        try {
            mo45352b(context);
            if (!a13.m35950h(context)) {
                mo45361s();
                w03.mo7773d();
            } else if (this.f35876a == null || (this.f35876a.mo44723a() != null && this.f35876a.mo44723a().size() > 0)) {
                if (!this.f35881a) {
                    Bundle bundle = new Bundle();
                    if (this.f35876a != null) {
                        for (Map.Entry next : this.f35876a.mo44723a().entrySet()) {
                            a13.m35943a(((String) next.getKey()) + " = " + ((String) next.getValue()));
                            bundle.putString((String) next.getKey(), (String) next.getValue());
                        }
                    }
                    a13.m35943a("Starting the Service...");
                    Intent intent = new Intent(context, PaytmPGActivity.class);
                    intent.putExtra("mid", this.f35885d);
                    intent.putExtra("orderId", this.f35886e);
                    intent.putExtra(r03.f34469r, bundle);
                    intent.putExtra(r03.f34470s, z);
                    intent.putExtra(h60.f29516k, mo45357o());
                    intent.putExtra(r03.f34471t, z2);
                    this.f35881a = true;
                    this.f35877a = w03;
                    uq3.m67409a().mo45788d(w03);
                    ((Activity) context).startActivity(intent);
                    str = "Service Started.";
                } else {
                    str = "Service is already running.";
                }
                a13.m35943a(str);
            } else {
                w03.mo7770a("Invalid Params passed", (Bundle) null);
                return;
            }
        } catch (Exception e) {
            C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
            mo45361s();
            a13.m35953k(e);
        }
    }

    /* renamed from: s */
    public synchronized void mo45361s() {
        f35865a = null;
        a13.m35943a("Service Stopped.");
    }
}
