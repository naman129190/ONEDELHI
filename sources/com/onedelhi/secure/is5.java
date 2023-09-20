package com.onedelhi.secure;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.C4311b;
import com.google.firebase.messaging.FirebaseMessaging;

public final class is5 {

    /* renamed from: a */
    public static final /* synthetic */ int f30448a = 0;

    /* renamed from: a */
    public static final vk6 f30449a = vk6.m30221o("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: a */
    public static final xk6 f30450a = xk6.m31520n("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.C4304c.f24912g, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b */
    public static final vk6 f30451b = vk6.m30220n(bf0.f26274c, FirebaseMessaging.f25020d, "am");

    /* renamed from: c */
    public static final vk6 f30452c = vk6.m30219l("_r", "_dbg");

    /* renamed from: d */
    public static final vk6 f30453d;

    /* renamed from: e */
    public static final vk6 f30454e = vk6.m30219l("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    static {
        wj6 wj6 = new wj6();
        wj6.mo26612a(re6.f19810a);
        wj6.mo26612a(re6.f19811b);
        f30453d = wj6.mo26613b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0073  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m52646a(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r6 = r0.equals(r6)
            r0 = 1
            if (r6 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r6 = m52649d(r5)
            r1 = 0
            if (r6 != 0) goto L_0x0012
            return r1
        L_0x0012:
            if (r7 != 0) goto L_0x0015
            return r1
        L_0x0015:
            com.onedelhi.secure.vk6 r6 = f30452c
            int r2 = r6.size()
            r3 = 0
        L_0x001c:
            if (r3 >= r2) goto L_0x002d
            java.lang.Object r4 = r6.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r7.containsKey(r4)
            int r3 = r3 + 1
            if (r4 == 0) goto L_0x001c
            return r1
        L_0x002d:
            int r6 = r5.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r6 == r2) goto L_0x0056
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r6 == r2) goto L_0x004c
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r6 == r2) goto L_0x0042
            goto L_0x0060
        L_0x0042:
            java.lang.String r6 = "fiam"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0060
            r5 = 2
            goto L_0x0061
        L_0x004c:
            java.lang.String r6 = "fdl"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0060
            r5 = 1
            goto L_0x0061
        L_0x0056:
            java.lang.String r6 = "fcm"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0060
            r5 = 0
            goto L_0x0061
        L_0x0060:
            r5 = -1
        L_0x0061:
            java.lang.String r6 = "_cis"
            if (r5 == 0) goto L_0x0073
            if (r5 == r0) goto L_0x0070
            if (r5 == r3) goto L_0x006a
            return r1
        L_0x006a:
            java.lang.String r5 = "fiam_integration"
        L_0x006c:
            r7.putString(r6, r5)
            return r0
        L_0x0070:
            java.lang.String r5 = "fdl_integration"
            goto L_0x006c
        L_0x0073:
            java.lang.String r5 = "fcm_integration"
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.is5.m52646a(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }

    /* renamed from: b */
    public static boolean m52647b(String str, Bundle bundle) {
        if (f30449a.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        vk6 vk6 = f30452c;
        int size = vk6.size();
        int i = 0;
        while (i < size) {
            boolean containsKey = bundle.containsKey((String) vk6.get(i));
            i++;
            if (containsKey) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m52648c(String str) {
        return !f30450a.contains(str);
    }

    /* renamed from: d */
    public static boolean m52649d(String str) {
        return !f30451b.contains(str);
    }

    /* renamed from: e */
    public static boolean m52650e(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if (C4311b.C4317f.f25147q.equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f30453d.contains(str2)) {
            return false;
        }
        vk6 vk6 = f30454e;
        int size = vk6.size();
        int i = 0;
        while (i < size) {
            boolean matches = str2.matches((String) vk6.get(i));
            i++;
            if (matches) {
                return false;
            }
        }
        return true;
    }
}
