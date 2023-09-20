package com.onedelhi.secure;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onedelhi.secure.C1767b9;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class gr6 extends hd6 {

    /* renamed from: a */
    public static final String[] f12734a = {"firebase_", "google_", "ga_"};

    /* renamed from: b */
    public static final String[] f12735b = {"_err"};

    /* renamed from: a */
    public int f12736a;

    /* renamed from: a */
    public Integer f12737a = null;

    /* renamed from: a */
    public SecureRandom f12738a;

    /* renamed from: a */
    public final AtomicLong f12739a = new AtomicLong(0);

    public gr6(za6 za6) {
        super(za6);
    }

    /* renamed from: Y */
    public static boolean m16175Y(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(db0.f27369e);
    }

    /* renamed from: Z */
    public static boolean m16176Z(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r4 = r1.getReceiverInfo(new android.content.ComponentName(r4, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
     */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m16177a0(android.content.Context r4) {
        /*
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.ActivityInfo r4 = r1.getReceiverInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            boolean r4 = r4.enabled     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            r4 = 1
            return r4
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.gr6.m16177a0(android.content.Context):boolean");
    }

    /* renamed from: b0 */
    public static boolean m16178b0(Context context, boolean z) {
        Preconditions.checkNotNull(context);
        return m16183k0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: c0 */
    public static boolean m16179c0(String str) {
        return !f12735b[0].equals(str);
    }

    /* renamed from: f0 */
    public static final boolean m16180f0(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    @VisibleForTesting
    /* renamed from: g0 */
    public static final boolean m16181g0(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: j0 */
    public static boolean m16182j0(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String a : strArr) {
            if (cr6.m12719a(str, a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r3 = r1.getServiceInfo(new android.content.ComponentName(r3, r4), 0);
     */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m16183k0(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0019 }
            r2.<init>(r3, r4)     // Catch:{ NameNotFoundException -> 0x0019 }
            android.content.pm.ServiceInfo r3 = r1.getServiceInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            boolean r3 = r3.enabled     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            r3 = 1
            return r3
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.gr6.m16183k0(android.content.Context, java.lang.String):boolean");
    }

    @VisibleForTesting
    /* renamed from: s0 */
    public static long m16184s0(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i = 0;
        Preconditions.checkState(length > 0);
        long j = 0;
        while (true) {
            length--;
            if (length < 0 || length < bArr.length - 8) {
                return j;
            }
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
        }
        return j;
    }

    /* renamed from: t */
    public static MessageDigest m16185t() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: v */
    public static ArrayList m16186v(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fc5 fc5 = (fc5) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", fc5.f12020b);
            bundle.putString("origin", fc5.f12024c);
            bundle.putLong(C1767b9.C1768a.f9764m, fc5.f12018b);
            bundle.putString("name", fc5.f12016a.f22256b);
            nd6.m22704b(bundle, Preconditions.checkNotNull(fc5.f12016a.mo26660K2()));
            bundle.putBoolean(C1767b9.C1768a.f9765n, fc5.f12021b);
            String str = fc5.f12026d;
            if (str != null) {
                bundle.putString(C1767b9.C1768a.f9755d, str);
            }
            xj5 xj5 = fc5.f12017a;
            if (xj5 != null) {
                bundle.putString(C1767b9.C1768a.f9757f, xj5.f22604b);
                hj5 hj5 = xj5.f22602a;
                if (hj5 != null) {
                    bundle.putBundle(C1767b9.C1768a.f9758g, hj5.mo17314L2());
                }
            }
            bundle.putLong(C1767b9.C1768a.f9756e, fc5.f12022c);
            xj5 xj52 = fc5.f12019b;
            if (xj52 != null) {
                bundle.putString(C1767b9.C1768a.f9759h, xj52.f22604b);
                hj5 hj52 = xj52.f22602a;
                if (hj52 != null) {
                    bundle.putBundle(C1767b9.C1768a.f9760i, hj52.mo17314L2());
                }
            }
            bundle.putLong(C1767b9.C1768a.f9766o, fc5.f12016a.f22255b);
            bundle.putLong(C1767b9.C1768a.f9761j, fc5.f12025d);
            xj5 xj53 = fc5.f12023c;
            if (xj53 != null) {
                bundle.putString(C1767b9.C1768a.f9762k, xj53.f22604b);
                hj5 hj53 = xj53.f22602a;
                if (hj53 != null) {
                    bundle.putBundle(C1767b9.C1768a.f9763l, hj53.mo17314L2());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @ly4
    /* renamed from: y */
    public static void m16187y(fj6 fj6, Bundle bundle, boolean z) {
        if (!(bundle == null || fj6 == null)) {
            if (!bundle.containsKey("_sc") || z) {
                String str = fj6.f12098a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = fj6.f12101b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", fj6.f12097a);
                return;
            }
            z = false;
        }
        if (bundle != null && fj6 == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* renamed from: A */
    public final void mo16850A(Parcelable[] parcelableArr, int i, boolean z) {
        int i2;
        Preconditions.checkNotNull(parcelableArr);
        for (Bundle bundle : parcelableArr) {
            int i3 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m16176Z(str) && !m16182j0(str, oe6.f17941d) && (i3 = i3 + 1) > i) {
                    u46 s = this.f11205a.mo15136e().mo12727s();
                    if (z) {
                        s.mo25381c("Param can't contain more than " + i + " item-scoped custom parameters", this.f11205a.mo27862D().mo19281e(str), this.f11205a.mo27862D().mo19278b(bundle));
                        i2 = 28;
                    } else {
                        s.mo25381c("Param cannot contain item-scoped custom parameters", this.f11205a.mo27862D().mo19281e(str), this.f11205a.mo27862D().mo19278b(bundle));
                        i2 = 23;
                    }
                    m16180f0(bundle, i2);
                    bundle.remove(str);
                }
            }
        }
    }

    /* renamed from: B */
    public final void mo16851B(d56 d56, int i) {
        int i2 = 0;
        for (String str : new TreeSet(d56.f10637a.keySet())) {
            if (m16176Z(str) && (i2 = i2 + 1) > i) {
                this.f11205a.mo15136e().mo12727s().mo25381c("Event can't contain more than " + i + " params", this.f11205a.mo27862D().mo19280d(d56.f10638a), this.f11205a.mo27862D().mo19278b(d56.f10637a));
                m16180f0(d56.f10637a, 5);
                d56.f10637a.remove(str);
            }
        }
    }

    /* renamed from: C */
    public final void mo16852C(er6 er6, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m16180f0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        er6.mo13092a(str, "_err", bundle);
    }

    /* renamed from: D */
    public final void mo16853D(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                this.f11205a.mo15136e().mo12732x().mo25381c("Not putting event parameter. Invalid value type. name, type", this.f11205a.mo27862D().mo19281e(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    /* renamed from: E */
    public final void mo16854E(pt5 pt5, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            pt5.mo17408W6(bundle);
        } catch (RemoteException e) {
            this.f11205a.mo15136e().mo12731w().mo25380b("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: F */
    public final void mo16855F(pt5 pt5, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            pt5.mo17408W6(bundle);
        } catch (RemoteException e) {
            this.f11205a.mo15136e().mo12731w().mo25380b("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: G */
    public final void mo16856G(pt5 pt5, Bundle bundle) {
        try {
            pt5.mo17408W6(bundle);
        } catch (RemoteException e) {
            this.f11205a.mo15136e().mo12731w().mo25380b("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: H */
    public final void mo16857H(pt5 pt5, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            pt5.mo17408W6(bundle);
        } catch (RemoteException e) {
            this.f11205a.mo15136e().mo12731w().mo25380b("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: I */
    public final void mo16858I(pt5 pt5, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            pt5.mo17408W6(bundle);
        } catch (RemoteException e) {
            this.f11205a.mo15136e().mo12731w().mo25380b("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: J */
    public final void mo16859J(pt5 pt5, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            pt5.mo17408W6(bundle);
        } catch (RemoteException e) {
            this.f11205a.mo15136e().mo12731w().mo25380b("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: K */
    public final void mo16860K(pt5 pt5, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            pt5.mo17408W6(bundle);
        } catch (RemoteException e) {
            this.f11205a.mo15136e().mo12731w().mo25380b("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: L */
    public final void mo16861L(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i;
        String str4;
        int i2;
        int i3;
        String str5;
        int i4;
        String str6 = str2;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            ce5 z2 = this.f11205a.mo27891z();
            by6.m12149c();
            String str7 = null;
            int i5 = (!z2.f11205a.mo27891z().mo14110B((String) null, n36.f17096z0) || !z2.f11205a.mo27871N().mo16873X(231100000, true)) ? 0 : 35;
            int i6 = 0;
            for (String str8 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str8)) {
                    int o0 = !z ? mo16883o0(str8) : 0;
                    if (o0 == 0) {
                        o0 = mo16881n0(str8);
                    }
                    i = o0;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    mo16897x(bundle, i, str8, str8, i == 3 ? str8 : str7);
                    bundle2.remove(str8);
                    i2 = i5;
                    str4 = str7;
                } else {
                    if (mo16871V(bundle2.get(str8))) {
                        this.f11205a.mo15136e().mo12732x().mo25382d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str6, str3, str8);
                        str5 = str8;
                        i3 = i5;
                        i4 = 22;
                    } else {
                        String str9 = str3;
                        str5 = str8;
                        i3 = i5;
                        i4 = mo16864O(str, str2, str8, bundle2.get(str8), bundle, list, z, false);
                    }
                    if (i4 != 0 && !"_ev".equals(str5)) {
                        mo16897x(bundle, i4, str5, str5, bundle2.get(str5));
                        bundle2.remove(str5);
                    } else if (m16176Z(str5) && !m16182j0(str5, oe6.f17941d)) {
                        int i7 = i6 + 1;
                        int i8 = 23;
                        if (!mo16873X(231100000, true)) {
                            this.f11205a.mo15136e().mo12727s().mo25381c("Item array not supported on client's version of Google Play Services (Android Only)", this.f11205a.mo27862D().mo19280d(str6), this.f11205a.mo27862D().mo19278b(bundle2));
                            m16180f0(bundle2, 23);
                            bundle2.remove(str5);
                            i2 = i3;
                        } else {
                            i2 = i3;
                            if (i7 > i2) {
                                by6.m12149c();
                                str4 = null;
                                if (this.f11205a.mo27891z().mo14110B((String) null, n36.f17096z0)) {
                                    u46 s = this.f11205a.mo15136e().mo12727s();
                                    s.mo25381c("Item can't contain more than " + i2 + " item-scoped custom params", this.f11205a.mo27862D().mo19280d(str6), this.f11205a.mo27862D().mo19278b(bundle2));
                                    i8 = 28;
                                } else {
                                    this.f11205a.mo15136e().mo12727s().mo25381c("Item cannot contain custom parameters", this.f11205a.mo27862D().mo19280d(str6), this.f11205a.mo27862D().mo19278b(bundle2));
                                }
                                m16180f0(bundle2, i8);
                                bundle2.remove(str5);
                                i6 = i7;
                            }
                        }
                        str4 = null;
                        i6 = i7;
                    }
                    i2 = i3;
                    str4 = null;
                }
                i5 = i2;
                str7 = str4;
            }
        }
    }

    /* renamed from: M */
    public final boolean mo16862M(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (m16181g0(str)) {
                return true;
            }
            if (this.f11205a.mo27886q()) {
                this.f11205a.mo15136e().mo12727s().mo25380b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", a56.m10802z(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f11205a.mo27886q()) {
                this.f11205a.mo15136e().mo12727s().mo25379a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (m16181g0(str2)) {
            return true;
        } else {
            this.f11205a.mo15136e().mo12727s().mo25380b("Invalid admob_app_id. Analytics disabled.", a56.m10802z(str2));
            return false;
        }
    }

    /* renamed from: N */
    public final boolean mo16863N(String str, int i, String str2) {
        if (str2 == null) {
            this.f11205a.mo15136e().mo12727s().mo25380b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            this.f11205a.mo15136e().mo12727s().mo25382d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
    @com.onedelhi.secure.ly4
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16864O(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            r13 = this;
            r7 = r13
            r8 = r16
            r0 = r17
            r1 = r18
            r13.mo15139h()
            boolean r2 = r13.mo16871V(r0)
            java.lang.String r3 = "param"
            r4 = 17
            r5 = 0
            if (r2 == 0) goto L_0x00ad
            if (r21 == 0) goto L_0x00aa
            java.lang.String[] r2 = com.onedelhi.secure.oe6.f17940c
            boolean r2 = m16182j0(r8, r2)
            if (r2 != 0) goto L_0x0022
            r0 = 20
            return r0
        L_0x0022:
            com.onedelhi.secure.za6 r2 = r7.f11205a
            com.onedelhi.secure.om6 r2 = r2.mo27869L()
            r2.mo15139h()
            r2.mo15845i()
            boolean r6 = r2.mo21993B()
            if (r6 != 0) goto L_0x0035
            goto L_0x0047
        L_0x0035:
            com.onedelhi.secure.za6 r2 = r2.f11205a
            com.onedelhi.secure.gr6 r2 = r2.mo27871N()
            int r2 = r2.mo16887q0()
            r6 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r6) goto L_0x0047
            r0 = 25
            return r0
        L_0x0047:
            com.onedelhi.secure.za6 r2 = r7.f11205a
            r2.mo27891z()
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0055
            r6 = r0
            android.os.Parcelable[] r6 = (android.os.Parcelable[]) r6
            int r6 = r6.length
            goto L_0x0060
        L_0x0055:
            boolean r6 = r0 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x00ad
            r6 = r0
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
        L_0x0060:
            r9 = 200(0xc8, float:2.8E-43)
            if (r6 <= r9) goto L_0x00ad
            com.onedelhi.secure.za6 r10 = r7.f11205a
            com.onedelhi.secure.a56 r10 = r10.mo15136e()
            com.onedelhi.secure.u46 r10 = r10.mo12732x()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r11 = "Parameter array is too long; discarded. Value kind, name, array length"
            r10.mo25382d(r11, r3, r8, r6)
            com.onedelhi.secure.za6 r6 = r7.f11205a
            r6.mo27891z()
            if (r2 == 0) goto L_0x008e
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r6 = r2.length
            if (r6 <= r9) goto L_0x00a7
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r9)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00a7
        L_0x008e:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a7
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r6 = r2.size()
            if (r6 <= r9) goto L_0x00a7
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r5, r9)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x00a7:
            r9 = 17
            goto L_0x00ae
        L_0x00aa:
            r0 = 21
            return r0
        L_0x00ad:
            r9 = 0
        L_0x00ae:
            boolean r1 = m16175Y(r15)
            if (r1 != 0) goto L_0x00c3
            boolean r1 = m16175Y(r16)
            if (r1 == 0) goto L_0x00bb
            goto L_0x00c3
        L_0x00bb:
            com.onedelhi.secure.za6 r1 = r7.f11205a
            r1.mo27891z()
            r1 = 100
            goto L_0x00ca
        L_0x00c3:
            com.onedelhi.secure.za6 r1 = r7.f11205a
            r1.mo27891z()
            r1 = 256(0x100, float:3.59E-43)
        L_0x00ca:
            boolean r1 = r13.mo16866Q(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00d1
            return r9
        L_0x00d1:
            if (r21 == 0) goto L_0x015e
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e8
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo16861L(r1, r2, r3, r4, r5, r6)
            goto L_0x015d
        L_0x00e8:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x011f
            r10 = r0
            android.os.Parcelable[] r10 = (android.os.Parcelable[]) r10
            int r11 = r10.length
            r12 = 0
        L_0x00f1:
            if (r12 >= r11) goto L_0x015d
            r0 = r10[r12]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x010d
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.a56 r1 = r1.mo15136e()
            com.onedelhi.secure.u46 r1 = r1.mo12732x()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
        L_0x0109:
            r1.mo25381c(r2, r0, r8)
            goto L_0x015e
        L_0x010d:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo16861L(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x00f1
        L_0x011f:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x015e
            r10 = r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r11 = r10.size()
            r12 = 0
        L_0x012b:
            if (r12 >= r11) goto L_0x015d
            java.lang.Object r0 = r10.get(r12)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x014b
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.a56 r1 = r1.mo15136e()
            com.onedelhi.secure.u46 r1 = r1.mo12732x()
            if (r0 == 0) goto L_0x0146
            java.lang.Class r0 = r0.getClass()
            goto L_0x0148
        L_0x0146:
            java.lang.String r0 = "null"
        L_0x0148:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            goto L_0x0109
        L_0x014b:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo16861L(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x012b
        L_0x015d:
            return r9
        L_0x015e:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.gr6.mo16864O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* renamed from: P */
    public final boolean mo16865P(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f11205a.mo15136e().mo12727s().mo25380b("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = f12734a;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.f11205a.mo15136e().mo12727s().mo25381c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m16182j0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m16182j0(str2, strArr2)) {
            return true;
        }
        this.f11205a.mo15136e().mo12727s().mo25381c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* renamed from: Q */
    public final boolean mo16866Q(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.f11205a.mo15136e().mo12732x().mo25382d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: R */
    public final boolean mo16867R(String str, String str2) {
        if (str2 == null) {
            this.f11205a.mo15136e().mo12727s().mo25380b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f11205a.mo15136e().mo12727s().mo25380b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.f11205a.mo15136e().mo12727s().mo25381c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f11205a.mo15136e().mo12727s().mo25381c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: S */
    public final boolean mo16868S(String str, String str2) {
        if (str2 == null) {
            this.f11205a.mo15136e().mo12727s().mo25380b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f11205a.mo15136e().mo12727s().mo25380b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f11205a.mo15136e().mo12727s().mo25381c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f11205a.mo15136e().mo12727s().mo25381c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    @ly4
    /* renamed from: T */
    public final boolean mo16869T(String str) {
        mo15139h();
        if (Wrappers.packageManager(this.f11205a.mo15137f()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.f11205a.mo15136e().mo12725q().mo25380b("Permission not granted", str);
        return false;
    }

    /* renamed from: U */
    public final boolean mo16870U(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u = this.f11205a.mo27891z().mo14128u();
        this.f11205a.mo15134c();
        return u.equals(str);
    }

    /* renamed from: V */
    public final boolean mo16871V(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    @VisibleForTesting
    /* renamed from: W */
    public final boolean mo16872W(Context context, String str) {
        u46 u46;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e) {
            e = e;
            u46 = this.f11205a.mo15136e().mo12726r();
            str2 = "Error obtaining certificate";
            u46.mo25380b(str2, e);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            e = e2;
            u46 = this.f11205a.mo15136e().mo12726r();
            str2 = "Package name not found";
            u46.mo25380b(str2, e);
            return true;
        }
    }

    /* renamed from: X */
    public final boolean mo16873X(int i, boolean z) {
        Boolean J = this.f11205a.mo27869L().mo21999J();
        return mo16887q0() >= i / 1000 || (J != null && !J.booleanValue());
    }

    /* renamed from: d0 */
    public final boolean mo16874d0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    /* renamed from: e0 */
    public final byte[] mo16875e0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: h0 */
    public final int mo16876h0(String str) {
        if ("_ldl".equals(str)) {
            this.f11205a.mo27891z();
            return 2048;
        } else if ("_id".equals(str)) {
            this.f11205a.mo27891z();
            return 256;
        } else if ("_lgclid".equals(str)) {
            this.f11205a.mo27891z();
            return 100;
        } else {
            this.f11205a.mo27891z();
            return 36;
        }
    }

    @ly4
    /* renamed from: i */
    public final void mo16877i() {
        mo15139h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f11205a.mo15136e().mo12731w().mo25379a("Utils falling back to Random for random id");
            }
        }
        this.f12739a.set(nextLong);
    }

    /* renamed from: i0 */
    public final Object mo16878i0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return mo16888r(obj.toString(), i, z);
            }
            if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle w0 = mo16896w0((Bundle) parcelable);
                    if (!w0.isEmpty()) {
                        arrayList.add(w0);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: j */
    public final boolean mo12724j() {
        return true;
    }

    /* renamed from: l0 */
    public final int mo16879l0(String str, Object obj) {
        String str2;
        int i;
        if ("_ldl".equals(str)) {
            i = mo16876h0(str);
            str2 = "user property referrer";
        } else {
            i = mo16876h0(str);
            str2 = "user property";
        }
        return mo16866Q(str2, str, i, obj) ? 0 : 7;
    }

    /* renamed from: m0 */
    public final int mo16880m0(String str) {
        if (!mo16867R("event", str)) {
            return 2;
        }
        if (!mo16865P("event", le6.f15331a, le6.f15332b, str)) {
            return 13;
        }
        this.f11205a.mo27891z();
        return !mo16863N("event", 40, str) ? 2 : 0;
    }

    /* renamed from: n0 */
    public final int mo16881n0(String str) {
        if (!mo16867R("event param", str)) {
            return 3;
        }
        if (!mo16865P("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f11205a.mo27891z();
        return !mo16863N("event param", 40, str) ? 3 : 0;
    }

    /* renamed from: o */
    public final Object mo16882o(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.f11205a.mo27891z();
            return mo16878i0(256, obj, true, true);
        }
        if (m16175Y(str)) {
            this.f11205a.mo27891z();
        } else {
            this.f11205a.mo27891z();
            i = 100;
        }
        return mo16878i0(i, obj, false, true);
    }

    /* renamed from: o0 */
    public final int mo16883o0(String str) {
        if (!mo16868S("event param", str)) {
            return 3;
        }
        if (!mo16865P("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f11205a.mo27891z();
        return !mo16863N("event param", 40, str) ? 3 : 0;
    }

    /* renamed from: p */
    public final Object mo16884p(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int h0 = mo16876h0(str);
        return equals ? mo16878i0(h0, obj, true, false) : mo16878i0(h0, obj, false, false);
    }

    /* renamed from: p0 */
    public final int mo16885p0(String str) {
        if (!mo16867R("user property", str)) {
            return 6;
        }
        if (!mo16865P("user property", re6.f19810a, (String[]) null, str)) {
            return 15;
        }
        this.f11205a.mo27891z();
        return !mo16863N("user property", 24, str) ? 6 : 0;
    }

    /* renamed from: q */
    public final String mo16886q() {
        byte[] bArr = new byte[16];
        mo16892u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    @EnsuresNonNull({"this.apkVersion"})
    /* renamed from: q0 */
    public final int mo16887q0() {
        if (this.f12737a == null) {
            this.f12737a = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.f11205a.mo15137f()) / 1000);
        }
        return this.f12737a.intValue();
    }

    /* renamed from: r */
    public final String mo16888r(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: r0 */
    public final int mo16889r0(int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.f11205a.mo15137f(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* renamed from: s */
    public final URL mo16890s(long j, String str, String str2, long j2) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{76003L, Integer.valueOf(mo16887q0())}), str2, str, Long.valueOf(j2)});
            if (str.equals(this.f11205a.mo27891z().mo14129v())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.f11205a.mo15136e().mo12726r().mo25380b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: t0 */
    public final long mo16891t0() {
        int i = (this.f12739a.get() > 0 ? 1 : (this.f12739a.get() == 0 ? 0 : -1));
        synchronized (this.f12739a) {
            if (i == 0) {
                long nextLong = new Random(System.nanoTime() ^ this.f11205a.mo15133a().currentTimeMillis()).nextLong();
                int i2 = this.f12736a + 1;
                this.f12736a = i2;
                long j = nextLong + ((long) i2);
                return j;
            }
            this.f12739a.compareAndSet(-1, 1);
            long andIncrement = this.f12739a.getAndIncrement();
            return andIncrement;
        }
    }

    @EnsuresNonNull({"this.secureRandom"})
    @ly4
    /* renamed from: u */
    public final SecureRandom mo16892u() {
        mo15139h();
        if (this.f12738a == null) {
            this.f12738a = new SecureRandom();
        }
        return this.f12738a;
    }

    /* renamed from: u0 */
    public final long mo16893u0(long j, long j2) {
        return (j + (j2 * jg3.f30769e)) / pr3.f18684a;
    }

    /* renamed from: v0 */
    public final Bundle mo16894v0(Uri uri, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Uri uri2 = uri;
        if (uri2 != null) {
            try {
                if (uri.isHierarchical()) {
                    str8 = uri2.getQueryParameter("utm_campaign");
                    str7 = uri2.getQueryParameter("utm_source");
                    str6 = uri2.getQueryParameter("utm_medium");
                    str5 = uri2.getQueryParameter("gclid");
                    str4 = uri2.getQueryParameter("utm_id");
                    str3 = uri2.getQueryParameter("dclid");
                    str2 = uri2.getQueryParameter("srsltid");
                    str = z ? uri2.getQueryParameter("sfmc_id") : null;
                } else {
                    str8 = null;
                    str7 = null;
                    str6 = null;
                    str5 = null;
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str8) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && (!z || TextUtils.isEmpty(str))) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str8)) {
                    bundle.putString("campaign", str8);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("source", str7);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("medium", str6);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("gclid", str5);
                }
                String queryParameter = uri2.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString(FirebaseAnalytics.C4305d.f24946O, queryParameter);
                }
                String queryParameter2 = uri2.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString(FirebaseAnalytics.C4305d.f24947P, queryParameter2);
                }
                String queryParameter3 = uri2.getQueryParameter(FirebaseAnalytics.C4305d.f24948Q);
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString(FirebaseAnalytics.C4305d.f24948Q, queryParameter3);
                }
                String queryParameter4 = uri2.getQueryParameter(FirebaseAnalytics.C4305d.f24949R);
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString(FirebaseAnalytics.C4305d.f24949R, queryParameter4);
                }
                String queryParameter5 = uri2.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("campaign_id", str4);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("dclid", str3);
                }
                String queryParameter6 = uri2.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("source_platform", queryParameter6);
                }
                String queryParameter7 = uri2.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("creative_format", queryParameter7);
                }
                String queryParameter8 = uri2.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("marketing_tactic", queryParameter8);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("srsltid", str2);
                }
                if (z && !TextUtils.isEmpty(str)) {
                    bundle.putString("sfmc_id", str);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.f11205a.mo15136e().mo12731w().mo25380b("Install referrer url isn't a hierarchical URI", e);
                return null;
            }
        } else {
            return null;
        }
    }

    @ly4
    /* renamed from: w */
    public final void mo16895w(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.f11205a.mo15136e().mo12731w().mo25380b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* renamed from: w0 */
    public final Bundle mo16896w0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object o = mo16882o(str, bundle.get(str));
                if (o == null) {
                    this.f11205a.mo15136e().mo12732x().mo25380b("Param value can't be null", this.f11205a.mo27862D().mo19281e(str));
                } else {
                    mo16853D(bundle2, str, o);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: x */
    public final void mo16897x(Bundle bundle, int i, String str, String str2, Object obj) {
        if (m16180f0(bundle, i)) {
            this.f11205a.mo27891z();
            bundle.putString("_ev", mo16888r(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) obj.toString().length());
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0106 A[SYNTHETIC] */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo16898x0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            r20 = this;
            r9 = r20
            r10 = r22
            r11 = r23
            r12 = r24
            java.lang.String[] r0 = com.onedelhi.secure.le6.f15334d
            boolean r13 = m16182j0(r10, r0)
            if (r11 == 0) goto L_0x010b
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.onedelhi.secure.za6 r0 = r9.f11205a
            com.onedelhi.secure.ce5 r0 = r0.mo27891z()
            int r8 = r0.mo14120m()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r23.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = 0
        L_0x0030:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0109
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0048
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r2 = 0
            goto L_0x0057
        L_0x0048:
            if (r25 != 0) goto L_0x004f
            int r0 = r9.mo16883o0(r7)
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 != 0) goto L_0x0056
            int r0 = r9.mo16881n0(r7)
        L_0x0056:
            r2 = r0
        L_0x0057:
            if (r2 == 0) goto L_0x006d
            r0 = 3
            if (r2 != r0) goto L_0x005e
            r5 = r7
            goto L_0x005f
        L_0x005e:
            r5 = 0
        L_0x005f:
            r0 = r20
            r1 = r15
            r3 = r7
            r4 = r7
            r0.mo16897x(r1, r2, r3, r4, r5)
            r15.remove(r7)
            r14 = r8
            goto L_0x0106
        L_0x006d:
            java.lang.Object r4 = r11.get(r7)
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r7
            r5 = r15
            r6 = r24
            r19 = r7
            r7 = r25
            r14 = r8
            r8 = r13
            int r2 = r0.mo16864O(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 17
            if (r2 != r0) goto L_0x0098
            r2 = 17
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0 = r20
            r1 = r15
            r3 = r19
            r4 = r19
            r0.mo16897x(r1, r2, r3, r4, r5)
            goto L_0x00ba
        L_0x0098:
            if (r2 == 0) goto L_0x00ba
            java.lang.String r0 = "_ev"
            r6 = r19
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00bc
            r0 = 21
            if (r2 != r0) goto L_0x00aa
            r3 = r10
            goto L_0x00ab
        L_0x00aa:
            r3 = r6
        L_0x00ab:
            java.lang.Object r5 = r11.get(r6)
            r0 = r20
            r1 = r15
            r4 = r6
            r0.mo16897x(r1, r2, r3, r4, r5)
            r15.remove(r6)
            goto L_0x0106
        L_0x00ba:
            r6 = r19
        L_0x00bc:
            boolean r0 = m16176Z(r6)
            if (r0 == 0) goto L_0x0106
            int r0 = r18 + 1
            if (r0 <= r14) goto L_0x0104
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.onedelhi.secure.za6 r2 = r9.f11205a
            com.onedelhi.secure.a56 r2 = r2.mo15136e()
            com.onedelhi.secure.u46 r2 = r2.mo12727s()
            com.onedelhi.secure.za6 r3 = r9.f11205a
            com.onedelhi.secure.l46 r3 = r3.mo27862D()
            java.lang.String r3 = r3.mo19280d(r10)
            com.onedelhi.secure.za6 r4 = r9.f11205a
            com.onedelhi.secure.l46 r4 = r4.mo27862D()
            java.lang.String r4 = r4.mo19278b(r11)
            r2.mo25381c(r1, r3, r4)
            r1 = 5
            m16180f0(r15, r1)
            r15.remove(r6)
        L_0x0104:
            r18 = r0
        L_0x0106:
            r8 = r14
            goto L_0x0030
        L_0x0109:
            r14 = r15
            goto L_0x010c
        L_0x010b:
            r14 = 0
        L_0x010c:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.gr6.mo16898x0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* renamed from: y0 */
    public final xj5 mo16899y0(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo16880m0(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString(ba0.f26250a, str3);
            Bundle x0 = mo16898x0(str, str2, bundle3, CollectionUtils.listOf(ba0.f26250a), true);
            if (z) {
                x0 = mo16896w0(x0);
            }
            Preconditions.checkNotNull(x0);
            return new xj5(str2, new hj5(x0), str3, j);
        }
        this.f11205a.mo15136e().mo12726r().mo25380b("Invalid conditional property event name", this.f11205a.mo27862D().mo19282f(str2));
        throw new IllegalArgumentException();
    }

    /* renamed from: z */
    public final void mo16900z(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    this.f11205a.mo27871N().mo16853D(bundle, str, bundle2.get(str));
                }
            }
        }
    }
}
