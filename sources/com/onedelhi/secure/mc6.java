package com.onedelhi.secure;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class mc6 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ bd6 f16076a;

    /* renamed from: a */
    public final /* synthetic */ xj5 f16077a;

    /* renamed from: a */
    public final /* synthetic */ String f16078a;

    public mc6(bd6 bd6, xj5 xj5, String str) {
        this.f16076a = bd6;
        this.f16077a = xj5;
        this.f16078a = str;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        ar6 ar6;
        pa6 pa6;
        va6 va6;
        Bundle bundle;
        String str;
        yd6 yd6;
        long j;
        String str2;
        ri5 ri5;
        this.f16076a.f9796a.mo23375b();
        bj6 d0 = this.f16076a.f9796a.mo23377d0();
        xj5 xj5 = this.f16077a;
        String str3 = this.f16078a;
        d0.mo15139h();
        za6.m32971t();
        Preconditions.checkNotNull(xj5);
        Preconditions.checkNotEmpty(str3);
        if (!d0.f11205a.mo27891z().mo14110B(str3, n36.f17037U)) {
            d0.f11205a.mo15136e().mo12725q().mo25380b("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        } else if ("_iap".equals(xj5.f22604b) || "_iapx".equals(xj5.f22604b)) {
            pa6 B = sa6.m27406B();
            d0.f21907a.mo23370W().mo26077e0();
            try {
                yd6 R = d0.f21907a.mo23370W().mo26065R(str3);
                if (R == null) {
                    d0.f11205a.mo15136e().mo12725q().mo25380b("Log and bundle not available. package_name", str3);
                } else if (!R.mo27368M()) {
                    d0.f11205a.mo15136e().mo12725q().mo25380b("Log and bundle disabled. package_name", str3);
                } else {
                    va6 Q1 = ya6.m32031Q1();
                    Q1.mo25953U(1);
                    Q1.mo25948P("android");
                    if (!TextUtils.isEmpty(R.mo27399i0())) {
                        Q1.mo25981t(R.mo27399i0());
                    }
                    if (!TextUtils.isEmpty(R.mo27403k0())) {
                        Q1.mo25985v((String) Preconditions.checkNotNull(R.mo27403k0()));
                    }
                    if (!TextUtils.isEmpty(R.mo27405l0())) {
                        Q1.mo25987w((String) Preconditions.checkNotNull(R.mo27405l0()));
                    }
                    if (R.mo27371P() != -2147483648L) {
                        Q1.mo25989x((int) R.mo27371P());
                    }
                    Q1.mo25944L(R.mo27383a0());
                    Q1.mo25932F(R.mo27380Y());
                    String n0 = R.mo27409n0();
                    String g0 = R.mo27395g0();
                    if (!TextUtils.isEmpty(n0)) {
                        Q1.mo25942K(n0);
                    } else if (!TextUtils.isEmpty(g0)) {
                        Q1.mo25979s(g0);
                    }
                    ky6.m20117c();
                    if (d0.f11205a.mo27891z().mo14110B((String) null, n36.f17019E0)) {
                        Q1.mo25959a0(R.mo27391e0());
                    }
                    ye5 V = d0.f21907a.mo23369V(str3);
                    Q1.mo25926C(R.mo27379X());
                    if (d0.f11205a.mo27884o() && d0.f11205a.mo27891z().mo14111C(Q1.mo25966h0()) && V.mo27438i(ne5.AD_STORAGE) && !TextUtils.isEmpty((CharSequence) null)) {
                        Q1.mo25930E((String) null);
                    }
                    Q1.mo25924B(V.mo27436h());
                    if (V.mo27438i(ne5.AD_STORAGE) && R.mo27367L()) {
                        Pair n = d0.f21907a.mo23378e0().mo24483n(R.mo27399i0(), V);
                        if (R.mo27367L() && !TextUtils.isEmpty((CharSequence) n.first)) {
                            Q1.mo25954V(bj6.m11931b((String) n.first, Long.toString(xj5.f22603b)));
                            Object obj = n.second;
                            if (obj != null) {
                                Q1.mo25946N(((Boolean) obj).booleanValue());
                            }
                        }
                    }
                    d0.f11205a.mo27859A().mo17201k();
                    Q1.mo25928D(Build.MODEL);
                    d0.f11205a.mo27859A().mo17201k();
                    Q1.mo25947O(Build.VERSION.RELEASE);
                    Q1.mo25960b0((int) d0.f11205a.mo27859A().mo13730p());
                    Q1.mo25964f0(d0.f11205a.mo27859A().mo13731q());
                    try {
                        if (V.mo27438i(ne5.ANALYTICS_STORAGE) && R.mo27401j0() != null) {
                            Q1.mo25983u(bj6.m11931b((String) Preconditions.checkNotNull(R.mo27401j0()), Long.toString(xj5.f22603b)));
                        }
                        if (!TextUtils.isEmpty(R.mo27407m0())) {
                            Q1.mo25940J((String) Preconditions.checkNotNull(R.mo27407m0()));
                        }
                        String i0 = R.mo27399i0();
                        List c0 = d0.f21907a.mo23370W().mo26075c0(i0);
                        Iterator it = c0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                ar6 = null;
                                break;
                            }
                            ar6 = (ar6) it.next();
                            if ("_lte".equals(ar6.f9510c)) {
                                break;
                            }
                        }
                        if (ar6 == null || ar6.f9507a == null) {
                            ar6 ar62 = new ar6(i0, bf0.f26274c, "_lte", d0.f11205a.mo15133a().currentTimeMillis(), 0L);
                            c0.add(ar62);
                            d0.f21907a.mo23370W().mo26092x(ar62);
                        }
                        uq6 g02 = d0.f21907a.mo23380g0();
                        g02.f11205a.mo15136e().mo12730v().mo25379a("Checking account type status for ad personalization signals");
                        if (g02.f11205a.mo27859A().mo13733s()) {
                            String i02 = R.mo27399i0();
                            Preconditions.checkNotNull(i02);
                            if (R.mo27367L() && g02.f21907a.mo23374a0().mo13568B(i02)) {
                                g02.f11205a.mo15136e().mo12725q().mo25379a("Turning off ad personalization due to account type");
                                Iterator it2 = c0.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((ar6) it2.next()).f9510c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                c0.add(new ar6(i02, bf0.f26274c, "_npa", g02.f11205a.mo15133a().currentTimeMillis(), 1L));
                            }
                        }
                        zb6[] zb6Arr = new zb6[c0.size()];
                        for (int i = 0; i < c0.size(); i++) {
                            wb6 E = zb6.m33030E();
                            E.mo26489v(((ar6) c0.get(i)).f9510c);
                            E.mo26490w(((ar6) c0.get(i)).f9506a);
                            d0.f21907a.mo23380g0().mo25700K(E, ((ar6) c0.get(i)).f9507a);
                            zb6Arr[i] = (zb6) E.mo17922m();
                        }
                        Q1.mo25984u0(Arrays.asList(zb6Arr));
                        d56 b = d56.m12971b(xj5);
                        d0.f11205a.mo27871N().mo16900z(b.f10637a, d0.f21907a.mo23370W().mo26064Q(str3));
                        d0.f11205a.mo27871N().mo16851B(b, d0.f11205a.mo27891z().mo14121n(str3));
                        Bundle bundle2 = b.f10637a;
                        bundle2.putLong("_c", 1);
                        d0.f11205a.mo15136e().mo12725q().mo25379a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1);
                        bundle2.putString(ba0.f26250a, xj5.f22605c);
                        if (d0.f11205a.mo27871N().mo16870U(Q1.mo25966h0())) {
                            d0.f11205a.mo27871N().mo16853D(bundle2, "_dbg", 1L);
                            d0.f11205a.mo27871N().mo16853D(bundle2, "_r", 1L);
                        }
                        ri5 V2 = d0.f21907a.mo23370W().mo26069V(str3, xj5.f22604b);
                        if (V2 == null) {
                            va6 = Q1;
                            yd6 = R;
                            pa6 = B;
                            str = str3;
                            bundle = bundle2;
                            str2 = null;
                            ri5 = new ri5(str3, xj5.f22604b, 0, 0, 0, xj5.f22603b, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                            j = 0;
                        } else {
                            yd6 = R;
                            pa6 = B;
                            str = str3;
                            bundle = bundle2;
                            va6 = Q1;
                            str2 = null;
                            long j2 = V2.f19883d;
                            ri5 = V2.mo23874c(xj5.f22603b);
                            j = j2;
                        }
                        d0.f21907a.mo23370W().mo26085q(ri5);
                        ji5 ji5 = new ji5(d0.f11205a, xj5.f22605c, str, xj5.f22604b, xj5.f22603b, j, bundle);
                        u86 F = x86.m31321F();
                        F.mo25440C(ji5.f14182a);
                        F.mo25453y(ji5.f14186b);
                        F.mo25439B(ji5.f14185b);
                        zi5 zi5 = new zi5(ji5.f14183a);
                        while (zi5.hasNext()) {
                            String a = zi5.next();
                            g96 F2 = j96.m18221F();
                            F2.mo16408z(a);
                            Object O2 = ji5.f14183a.mo17317O2(a);
                            if (O2 != null) {
                                d0.f21907a.mo23380g0().mo25699J(F2, O2);
                                F.mo25449u(F2);
                            }
                        }
                        va6 va62 = va6;
                        va62.mo25986v0(F);
                        bb6 B2 = hb6.m16622B();
                        a96 B3 = d96.m13010B();
                        B3.mo12872q(ri5.f19874a);
                        B3.mo12873r(xj5.f22604b);
                        B2.mo13616q(B3);
                        va62.mo25950R(B2);
                        va62.mo25976q0(d0.f21907a.mo23367T().mo14591m(yd6.mo27399i0(), Collections.emptyList(), va62.mo25970l0(), Long.valueOf(F.mo25447s()), Long.valueOf(F.mo25447s())));
                        if (F.mo25444G()) {
                            va62.mo25958Z(F.mo25447s());
                            va62.mo25934G(F.mo25447s());
                        }
                        long b0 = yd6.mo27385b0();
                        int i2 = (b0 > 0 ? 1 : (b0 == 0 ? 0 : -1));
                        if (i2 != 0) {
                            va62.mo25951S(b0);
                        }
                        long d02 = yd6.mo27389d0();
                        if (d02 != 0) {
                            va62.mo25952T(d02);
                        } else if (i2 != 0) {
                            va62.mo25952T(b0);
                        }
                        String c = yd6.mo27386c();
                        xz6.m31807c();
                        String str4 = str;
                        if (d0.f11205a.mo27891z().mo14110B(str4, n36.f17074o0) && c != null) {
                            va62.mo25957Y(c);
                        }
                        yd6.mo27392f();
                        va62.mo25991y((int) yd6.mo27387c0());
                        d0.f11205a.mo27891z().mo14124q();
                        va62.mo25962d0(76003);
                        va62.mo25961c0(d0.f11205a.mo15133a().currentTimeMillis());
                        va62.mo25956X(true);
                        if (d0.f11205a.mo27891z().mo14110B(str2, n36.f17082s0)) {
                            d0.f21907a.mo23381h(va62.mo25966h0(), va62);
                        }
                        pa6 pa62 = pa6;
                        pa62.mo22364q(va62);
                        yd6 yd62 = yd6;
                        yd62.mo27359D(va62.mo25973o0());
                        yd62.mo27357B(va62.mo25972n0());
                        d0.f21907a.mo23370W().mo26084p(yd62);
                        d0.f21907a.mo23370W().mo26083o();
                        d0.f21907a.mo23370W().mo26078f0();
                        try {
                            return d0.f21907a.mo23380g0().mo25702O(((sa6) pa62.mo17922m()).mo22497h());
                        } catch (IOException e) {
                            d0.f11205a.mo15136e().mo12726r().mo25381c("Data loss. Failed to bundle and serialize. appId", a56.m10802z(str4), e);
                            return str2;
                        }
                    } catch (SecurityException e2) {
                        d0.f11205a.mo15136e().mo12725q().mo25380b("app instance id encryption failed", e2.getMessage());
                        bArr = new byte[0];
                    }
                }
            } catch (SecurityException e3) {
                d0.f11205a.mo15136e().mo12725q().mo25380b("Resettable device id encryption failed", e3.getMessage());
            } catch (Throwable th) {
                d0.f21907a.mo23370W().mo26078f0();
                throw th;
            }
            bArr = new byte[0];
            d0.f21907a.mo23370W().mo26078f0();
            return bArr;
        } else {
            d0.f11205a.mo15136e().mo12725q().mo25381c("Generating a payload for this event is not available. package_name, event_name", str3, xj5.f22604b);
            return null;
        }
    }
}
