package com.onedelhi.secure;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.paytm.pgsdk.AioMatchUserActivity;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class pg4 {

    /* renamed from: d */
    public static final String f33656d = "net.one97.paytm";

    /* renamed from: e */
    public static final String f33657e = "paytm_invoke";

    /* renamed from: f */
    public static final String f33658f = "auth_code";

    /* renamed from: g */
    public static final String f33659g = "content://net.one97.paytm.trustlogin.TrustInfo/user/token";

    /* renamed from: a */
    public Activity f33660a = null;

    /* renamed from: a */
    public final BroadcastReceiver f33661a = new C6441a();

    /* renamed from: a */
    public t03 f33662a;

    /* renamed from: a */
    public w03 f33663a;

    /* renamed from: a */
    public Integer f33664a = null;

    /* renamed from: a */
    public String f33665a = "https://securegw.paytm.in/theia/api/v1/showPaymentPage";

    /* renamed from: a */
    public boolean f33666a = true;

    /* renamed from: b */
    public String f33667b;

    /* renamed from: b */
    public boolean f33668b = true;

    /* renamed from: c */
    public String f33669c = null;

    /* renamed from: c */
    public boolean f33670c = false;

    /* renamed from: d */
    public boolean f33671d = false;

    /* renamed from: e */
    public boolean f33672e = false;

    /* renamed from: f */
    public boolean f33673f = true;

    /* renamed from: com.onedelhi.secure.pg4$a */
    public class C6441a extends BroadcastReceiver {
        public C6441a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x008f, code lost:
            if (r4 != false) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
            if (r4 != false) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
            r4 = r3.f33674a;
            com.onedelhi.secure.pg4.m61011d(r4, com.onedelhi.secure.pg4.m61009b(r4));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r4, android.content.Intent r5) {
            /*
                r3 = this;
                java.lang.String r0 = r5.getAction()
                java.lang.String r1 = "user_match_result_action"
                boolean r0 = r1.equals(r0)
                r1 = 0
                if (r0 == 0) goto L_0x0054
                android.content.Context r4 = r4.getApplicationContext()
                com.onedelhi.secure.n62 r4 = com.onedelhi.secure.n62.m22447b(r4)
                com.onedelhi.secure.pg4 r0 = com.onedelhi.secure.pg4.this
                android.content.BroadcastReceiver r0 = r0.f33661a
                r4.mo20964f(r0)
                java.lang.String r4 = "user_matches"
                boolean r4 = r5.getBooleanExtra(r4, r1)
                com.onedelhi.secure.pg4 r5 = com.onedelhi.secure.pg4.this
                android.app.Activity r5 = r5.f33660a
                if (r5 == 0) goto L_0x00ab
                com.onedelhi.secure.pg4 r5 = com.onedelhi.secure.pg4.this
                java.lang.Integer r5 = r5.f33664a
                if (r5 == 0) goto L_0x00ab
                if (r4 == 0) goto L_0x004a
            L_0x0036:
                com.onedelhi.secure.pg4 r4 = com.onedelhi.secure.pg4.this
                android.app.Activity r5 = r4.f33660a
                com.onedelhi.secure.pg4 r0 = com.onedelhi.secure.pg4.this
                java.lang.Integer r0 = r0.f33664a
                int r0 = r0.intValue()
                r4.mo42614y(r5, r0)
                goto L_0x00ab
            L_0x004a:
                com.onedelhi.secure.pg4 r4 = com.onedelhi.secure.pg4.this
                android.app.Activity r5 = r4.f33660a
                r4.mo42613x(r5)
                goto L_0x00ab
            L_0x0054:
                java.lang.String r0 = r5.getAction()
                java.lang.String r2 = "user_login_status_action"
                boolean r0 = r2.equalsIgnoreCase(r0)
                if (r0 == 0) goto L_0x00ab
                android.content.Context r4 = r4.getApplicationContext()
                com.onedelhi.secure.n62 r4 = com.onedelhi.secure.n62.m22447b(r4)
                com.onedelhi.secure.pg4 r0 = com.onedelhi.secure.pg4.this
                android.content.BroadcastReceiver r0 = r0.f33661a
                r4.mo20964f(r0)
                java.lang.String r4 = "feature_available_in_app"
                boolean r4 = r5.getBooleanExtra(r4, r1)
                if (r4 == 0) goto L_0x0092
                java.lang.String r4 = "user_logged_in"
                boolean r4 = r5.getBooleanExtra(r4, r1)
                com.onedelhi.secure.pg4 r5 = com.onedelhi.secure.pg4.this
                android.app.Activity r5 = r5.f33660a
                if (r5 == 0) goto L_0x00ab
                com.onedelhi.secure.pg4 r5 = com.onedelhi.secure.pg4.this
                java.lang.Integer r5 = r5.f33664a
                if (r5 == 0) goto L_0x00ab
                if (r4 == 0) goto L_0x004a
                goto L_0x0036
            L_0x0092:
                com.onedelhi.secure.pg4 r4 = com.onedelhi.secure.pg4.this
                android.app.Activity r5 = r4.f33660a
                com.onedelhi.secure.pg4 r0 = com.onedelhi.secure.pg4.this
                java.lang.Integer r0 = r0.f33664a
                int r0 = r0.intValue()
                com.onedelhi.secure.pg4 r1 = com.onedelhi.secure.pg4.this
                java.lang.String r1 = r1.f33669c
                r4.mo42594D(r5, r0, r1)
            L_0x00ab:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.pg4.C6441a.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: com.onedelhi.secure.pg4$b */
    public class C6442b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f33675a;

        public C6442b(Activity activity) {
            this.f33675a = activity;
        }

        public void run() {
            pg4.this.mo42613x(this.f33675a);
        }
    }

    public pg4() {
    }

    public pg4(t03 t03, w03 w03) {
        if (t03 != null) {
            this.f33663a = w03;
            this.f33662a = t03;
            return;
        }
        throw new IllegalArgumentException("Transaction params cannot be null");
    }

    /* renamed from: A */
    public void mo42591A(Activity activity, boolean z, String str, String str2, int i) {
        boolean n = mo42603n(activity);
        if (TextUtils.isEmpty(str) || !n || !this.f33666a || !z) {
            mo42614y(activity, i);
            return;
        }
        this.f33660a = activity;
        this.f33664a = Integer.valueOf(i);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(h60.f29489H);
        n62.m22447b(activity.getApplicationContext()).mo20961c(this.f33661a, intentFilter);
        Intent intent = new Intent(activity, AioMatchUserActivity.class);
        intent.putExtra(h60.f29494M, str);
        intent.putExtra(h60.f29495N, str2);
        activity.startActivity(intent);
    }

    /* renamed from: B */
    public void mo42592B(Activity activity, String str, int i) {
        if (!mo42603n(activity) || !this.f33666a) {
            mo42614y(activity, i);
            return;
        }
        this.f33660a = activity;
        this.f33664a = Integer.valueOf(i);
        this.f33669c = str;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(h60.f29490I);
        n62.m22447b(activity.getApplicationContext()).mo20961c(this.f33661a, intentFilter);
        Intent intent = new Intent(activity, AioMatchUserActivity.class);
        intent.putExtra(AioMatchUserActivity.f38525e, true);
        activity.startActivity(intent);
    }

    /* renamed from: C */
    public void mo42593C(Activity activity, int i) {
        mo42615z(activity, i, "8.12.8");
    }

    /* renamed from: D */
    public final void mo42594D(Activity activity, int i, String str) {
        if (!TextUtils.isEmpty(mo42596g(activity, str))) {
            mo42614y(activity, i);
        } else if (this.f33672e) {
            new Handler().postDelayed(new C6442b(activity), rf4.f19821b);
        } else {
            mo42613x(activity);
        }
    }

    /* renamed from: E */
    public final int mo42595E(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 1;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (i < split.length && i < split2.length && split[i].equalsIgnoreCase(split2[i])) {
            i++;
        }
        return Integer.signum((i >= split.length || i >= split2.length) ? split.length - split2.length : Integer.valueOf(split[i]).compareTo(Integer.valueOf(split2[i])));
    }

    @ts2
    /* renamed from: g */
    public final String mo42596g(Context context, String str) {
        String str2;
        if (!mo42603n(context) && this.f33666a) {
            return null;
        }
        this.f33672e = false;
        Cursor j = mo42599j(context, str);
        String h = mo42597h(j);
        if (j != null && TextUtils.isEmpty(h)) {
            return null;
        }
        if (j == null || TextUtils.isEmpty(h)) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(f33656d, "net.one97.paytm.nativesdk.InvokePaytmTransparentActivity"));
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    this.f33672e = true;
                    context.startActivity(intent);
                    h = mo42597h(mo42599j(context, str));
                }
            } catch (Exception e) {
                a13.m35953k(e);
            }
        }
        if (!TextUtils.isEmpty(h)) {
            str2 = "Auth Code: " + h;
        } else {
            str2 = "Auth Code is EMPTY";
        }
        a13.m35943a(str2);
        return h;
    }

    @ts2
    /* renamed from: h */
    public final String mo42597h(@ts2 Cursor cursor) {
        String string;
        if (cursor == null) {
            return null;
        }
        cursor.moveToFirst();
        do {
            string = cursor.getString(cursor.getColumnIndex("auth_code"));
            a13.m35943a("Found Authtoken credential as " + string);
        } while (cursor.moveToNext());
        cursor.close();
        return string;
    }

    /* renamed from: i */
    public String mo42598i() {
        return this.f33667b;
    }

    @ts2
    /* renamed from: j */
    public final Cursor mo42599j(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_id", str);
            jSONObject.put("isTrusted", true);
            jSONObject.put("shouldMatchMobile", false);
            jSONObject.put("package", "net.one97.paytm.nativesdk");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return context.getContentResolver().query(Uri.parse(f33659g), (String[]) null, jSONObject.toString(), (String[]) null, (String) null);
    }

    /* renamed from: k */
    public final HashMap<String, Object> mo42600k() {
        HashMap<String, Object> hashMap = new HashMap<>();
        String str = this.f33667b;
        if (str != null && !str.isEmpty()) {
            hashMap.put("hybridPlatform", this.f33667b);
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    /* renamed from: l */
    public final String mo42601l(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(f33656d, 0).versionName;
        } catch (Exception e) {
            C5871k5.m54077e().mo39056f(h60.f29519n, e.getMessage());
            a13.m35943a("Paytm app not installed");
            return null;
        }
    }

    /* renamed from: m */
    public final boolean mo42602m() {
        return this.f33673f;
    }

    /* renamed from: n */
    public final boolean mo42603n(Context context) {
        try {
            context.getPackageManager().getPackageInfo(f33656d, 0);
            C5871k5.m54077e().mo39058h(h60.f29522q, h60.f29519n, h60.f29482A, h60.f29487F);
            return true;
        } catch (Exception unused) {
            C5871k5.m54077e().mo39058h(h60.f29522q, h60.f29519n, h60.f29482A, h60.f29488G);
            a13.m35943a("Paytm app not installed");
            return false;
        }
    }

    /* renamed from: o */
    public final boolean mo42604o() {
        return this.f33670c;
    }

    /* renamed from: p */
    public void mo42605p(boolean z) {
        this.f33666a = z;
    }

    /* renamed from: q */
    public void mo42606q(String str) {
        this.f33667b = str;
        C5871k5.m54077e().mo39061k(str);
    }

    /* renamed from: r */
    public void mo42607r(boolean z) {
        this.f33673f = z;
    }

    /* renamed from: s */
    public void mo42608s(boolean z) {
        this.f33671d = z;
    }

    /* renamed from: t */
    public void mo42609t(boolean z) {
        this.f33668b = z;
    }

    /* renamed from: u */
    public void mo42610u(String str) {
        this.f33665a = str;
    }

    /* renamed from: v */
    public void mo42611v(boolean z) {
        this.f33670c = z;
    }

    /* renamed from: w */
    public final void mo42612w(Activity activity, int i) {
        double d;
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        HashMap<String, String> a = this.f33662a.mo44723a();
        String str = a.get(h60.f29508c);
        try {
            d = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            C5871k5.m54077e().mo39056f(h60.f29519n, e.getMessage());
            d = 0.0d;
        }
        bundle.putBoolean("nativeSdkEnabled", true);
        bundle.putString("orderid", a.get(h60.f29506a));
        bundle.putString("txnToken", a.get(h60.f29515j));
        String str2 = "isFromAIO";
        bundle.putString("mid", a.get("MID"));
        bundle.putDouble("nativeSdkForMerchantAmount", d);
        String l = mo42601l(activity);
        Bundle bundle2 = bundle;
        C5871k5.m54077e().mo39060j(h60.f29528w, h60.f29519n, C5871k5.m54077e().mo39054c(this.f33662a), l);
        try {
            if (mo42595E(l, "8.6.0") < 0) {
                intent.setComponent(new ComponentName(f33656d, "net.one97.paytm.AJRJarvisSplash"));
            } else {
                intent.setComponent(new ComponentName(f33656d, "net.one97.paytm.AJRRechargePaymentActivity"));
                intent.putExtra("enable_paytm_invoke", true);
                intent.putExtra(f33657e, true);
                intent.putExtra(FirebaseAnalytics.C4305d.f24933B, str);
                intent.putExtra("nativeSdkEnabled", true);
                intent.putExtra("orderid", a.get(h60.f29506a));
                intent.putExtra("txnToken", a.get(h60.f29515j));
                intent.putExtra("mid", a.get("MID"));
                intent.addFlags(134217728);
            }
            String str3 = str2;
            intent.putExtra(str3, true);
            intent.putExtra("paymentmode", 2);
            intent.putExtra("bill", bundle2);
            intent.putExtra(str3, true);
            HashMap<String, Object> k = mo42600k();
            if (k != null) {
                intent.putExtra("extraParams", k);
            }
            C5871k5.m54077e().mo39059i(h60.f29523r, h60.f29519n, "status", "success", l);
            try {
                activity.startActivityForResult(intent, i);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            Activity activity2 = activity;
            C5871k5.m54077e().mo39059i(h60.f29523r, h60.f29519n, "status", h60.f29486E, l);
            mo42613x(activity);
        }
    }

    /* renamed from: x */
    public final void mo42613x(Context context) {
        u03 i = u03.m66330i(this.f33662a, this.f33665a);
        i.mo45356n(this.f33662a, (q03) null);
        i.mo45358p(mo42602m());
        i.mo45359q(context, true, this.f33663a);
    }

    /* renamed from: y */
    public void mo42614y(Activity activity, int i) {
        mo42615z(activity, i, "0.0.0");
    }

    /* renamed from: z */
    public void mo42615z(Activity activity, int i, String str) {
        C5871k5.m54077e().mo39057g(h60.f29521p, "", C5871k5.m54077e().mo39054c(this.f33662a));
        String l = mo42601l(activity);
        if (!a13.m35951i(activity) || !this.f33666a || mo42595E(l, str) < 0) {
            if (this.f33668b) {
                C5871k5.m54077e().mo39058h(h60.f29523r, h60.f29519n, "status", h60.f29486E);
                C5871k5.m54077e().mo39057g(h60.f29527v, h60.f29520o, C5871k5.m54077e().mo39054c(this.f33662a));
            } else {
                this.f33663a.mo7774e("Some Error Occurred in Selected payment Flow . Please  enableRedirectionFlow true ");
                a13.m35943a("No payment flow opted");
                return;
            }
        } else if ((!mo42604o() || mo42595E(l, "8.10.8") >= 0) && (!this.f33671d || mo42595E(l, "9.0.0") >= 0)) {
            mo42612w(activity, i);
            return;
        }
        mo42613x(activity);
    }
}
