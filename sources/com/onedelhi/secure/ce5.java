package com.onedelhi.secure;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class ce5 extends ed6 {

    /* renamed from: a */
    public qd5 f10228a = ed5.f11204a;

    /* renamed from: a */
    public Boolean f10229a;

    /* renamed from: b */
    public Boolean f10230b;

    public ce5(za6 za6) {
        super(za6);
    }

    /* renamed from: I */
    public static final long m12445I() {
        return ((Long) n36.f17051d.mo18887a((Object) null)).longValue();
    }

    /* renamed from: i */
    public static final long m12446i() {
        return ((Long) n36.f17016D.mo18887a((Object) null)).longValue();
    }

    /* renamed from: A */
    public final boolean mo14109A() {
        Boolean t = mo14127t("google_analytics_adid_collection_enabled");
        return t == null || t.booleanValue();
    }

    @ly4
    /* renamed from: B */
    public final boolean mo14110B(String str, k36 k36) {
        Object a;
        if (str != null) {
            String b = this.f10228a.mo13581b(str, k36.mo18888b());
            if (!TextUtils.isEmpty(b)) {
                a = k36.mo18887a(Boolean.valueOf(mm0.f16219f.equals(b)));
                return ((Boolean) a).booleanValue();
            }
        }
        a = k36.mo18887a((Object) null);
        return ((Boolean) a).booleanValue();
    }

    /* renamed from: C */
    public final boolean mo14111C(String str) {
        return mm0.f16219f.equals(this.f10228a.mo13581b(str, "gaia_collection_enabled"));
    }

    /* renamed from: D */
    public final boolean mo14112D() {
        Boolean t = mo14127t("google_analytics_automatic_screen_reporting_enabled");
        return t == null || t.booleanValue();
    }

    /* renamed from: E */
    public final boolean mo14113E() {
        this.f11205a.mo15134c();
        Boolean t = mo14127t("firebase_analytics_collection_deactivated");
        return t != null && t.booleanValue();
    }

    /* renamed from: F */
    public final boolean mo14114F(String str) {
        return mm0.f16219f.equals(this.f10228a.mo13581b(str, "measurement.event_sampling_enabled"));
    }

    @ly4
    /* renamed from: G */
    public final boolean mo14115G() {
        if (this.f10229a == null) {
            Boolean t = mo14127t("app_measurement_lite");
            this.f10229a = t;
            if (t == null) {
                this.f10229a = Boolean.FALSE;
            }
        }
        return this.f10229a.booleanValue() || !this.f11205a.mo27888s();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    /* renamed from: H */
    public final boolean mo14116H() {
        if (this.f10230b == null) {
            synchronized (this) {
                if (this.f10230b == null) {
                    ApplicationInfo applicationInfo = this.f11205a.mo15137f().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(myProcessName)) {
                            z = true;
                        }
                        this.f10230b = Boolean.valueOf(z);
                    }
                    if (this.f10230b == null) {
                        this.f10230b = Boolean.TRUE;
                        this.f11205a.mo15136e().mo12726r().mo25379a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f10230b.booleanValue();
    }

    /* renamed from: j */
    public final String mo14117j(String str, String str2) {
        u46 u46;
        String str3;
        Class<String> cls = String.class;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            Preconditions.checkNotNull(str4);
            return str4;
        } catch (ClassNotFoundException e) {
            e = e;
            u46 = this.f11205a.mo15136e().mo12726r();
            str3 = "Could not find SystemProperties class";
            u46.mo25380b(str3, e);
            return "";
        } catch (NoSuchMethodException e2) {
            e = e2;
            u46 = this.f11205a.mo15136e().mo12726r();
            str3 = "Could not find SystemProperties.get() method";
            u46.mo25380b(str3, e);
            return "";
        } catch (IllegalAccessException e3) {
            e = e3;
            u46 = this.f11205a.mo15136e().mo12726r();
            str3 = "Could not access SystemProperties.get()";
            u46.mo25380b(str3, e);
            return "";
        } catch (InvocationTargetException e4) {
            e = e4;
            u46 = this.f11205a.mo15136e().mo12726r();
            str3 = "SystemProperties.get() threw an exception";
            u46.mo25380b(str3, e);
            return "";
        }
    }

    @ly4
    /* renamed from: k */
    public final double mo14118k(String str, k36 k36) {
        if (str != null) {
            String b = this.f10228a.mo13581b(str, k36.mo18888b());
            if (!TextUtils.isEmpty(b)) {
                try {
                    return ((Double) k36.mo18887a(Double.valueOf(Double.parseDouble(b)))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Double) k36.mo18887a((Object) null)).doubleValue();
    }

    /* renamed from: l */
    public final int mo14119l(@qz3(min = 1) String str) {
        return mo14123p(str, n36.f17024H, 500, 2000);
    }

    /* renamed from: m */
    public final int mo14120m() {
        return this.f11205a.mo27871N().mo16873X(201500000, true) ? 100 : 25;
    }

    /* renamed from: n */
    public final int mo14121n(@qz3(min = 1) String str) {
        return mo14123p(str, n36.f17025I, 25, 100);
    }

    @ly4
    /* renamed from: o */
    public final int mo14122o(String str, k36 k36) {
        if (str != null) {
            String b = this.f10228a.mo13581b(str, k36.mo18888b());
            if (!TextUtils.isEmpty(b)) {
                try {
                    return ((Integer) k36.mo18887a(Integer.valueOf(Integer.parseInt(b)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) k36.mo18887a((Object) null)).intValue();
    }

    @ly4
    /* renamed from: p */
    public final int mo14123p(String str, k36 k36, int i, int i2) {
        return Math.max(Math.min(mo14122o(str, k36), i2), i);
    }

    /* renamed from: q */
    public final long mo14124q() {
        this.f11205a.mo15134c();
        return 76003;
    }

    @ly4
    /* renamed from: r */
    public final long mo14125r(String str, k36 k36) {
        if (str != null) {
            String b = this.f10228a.mo13581b(str, k36.mo18888b());
            if (!TextUtils.isEmpty(b)) {
                try {
                    return ((Long) k36.mo18887a(Long.valueOf(Long.parseLong(b)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) k36.mo18887a((Object) null)).longValue();
    }

    @VisibleForTesting
    /* renamed from: s */
    public final Bundle mo14126s() {
        try {
            if (this.f11205a.mo15137f().getPackageManager() == null) {
                this.f11205a.mo15136e().mo12726r().mo25379a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.f11205a.mo15137f()).getApplicationInfo(this.f11205a.mo15137f().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            this.f11205a.mo15136e().mo12726r().mo25379a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.f11205a.mo15136e().mo12726r().mo25380b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: t */
    public final Boolean mo14127t(@qz3(min = 1) String str) {
        Preconditions.checkNotEmpty(str);
        Bundle s = mo14126s();
        if (s == null) {
            this.f11205a.mo15136e().mo12726r().mo25379a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!s.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(s.getBoolean(str));
        }
    }

    /* renamed from: u */
    public final String mo14128u() {
        return mo14117j("debug.firebase.analytics.app", "");
    }

    /* renamed from: v */
    public final String mo14129v() {
        return mo14117j("debug.deferred.deeplink", "");
    }

    /* renamed from: w */
    public final String mo14130w() {
        this.f11205a.mo15134c();
        return "FA";
    }

    @ly4
    /* renamed from: x */
    public final String mo14131x(String str, k36 k36) {
        return (String) k36.mo18887a(str == null ? null : this.f10228a.mo13581b(str, k36.mo18888b()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e A[SYNTHETIC, Splitter:B:8:0x002e] */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo14132y(@com.onedelhi.secure.qz3(min = 1) java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.mo14126s()
            r1 = 0
            if (r0 != 0) goto L_0x001d
            com.onedelhi.secure.za6 r4 = r3.f11205a
            com.onedelhi.secure.a56 r4 = r4.mo15136e()
            com.onedelhi.secure.u46 r4 = r4.mo12726r()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.mo25379a(r0)
        L_0x001b:
            r4 = r1
            goto L_0x002c
        L_0x001d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0024
            goto L_0x001b
        L_0x0024:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x002c:
            if (r4 == 0) goto L_0x0058
            com.onedelhi.secure.za6 r0 = r3.f11205a     // Catch:{ NotFoundException -> 0x0048 }
            android.content.Context r0 = r0.mo15137f()     // Catch:{ NotFoundException -> 0x0048 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0048 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0048 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0048 }
            if (r4 != 0) goto L_0x0043
            return r1
        L_0x0043:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0048 }
            return r4
        L_0x0048:
            r4 = move-exception
            com.onedelhi.secure.za6 r0 = r3.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12726r()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.mo25380b(r2, r4)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ce5.mo14132y(java.lang.String):java.util.List");
    }

    /* renamed from: z */
    public final void mo14133z(qd5 qd5) {
        this.f10228a = qd5;
    }
}
