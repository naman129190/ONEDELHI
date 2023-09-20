package com.onedelhi.secure;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.yg1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

public final class uq6 extends xo6 {
    public uq6(qq6 qq6) {
        super(qq6);
    }

    /* renamed from: C */
    public static us6 m29499C(us6 us6, byte[] bArr) throws dr6 {
        oo6 a = oo6.m23967a();
        return a != null ? us6.mo21381Qe(bArr, a) : us6.mo21382wa(bArr);
    }

    /* renamed from: H */
    public static List m29500H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: L */
    public static boolean m29501L(List list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
    }

    /* renamed from: N */
    public static boolean m29502N(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: P */
    public static final void m29503P(u86 u86, String str, Object obj) {
        List F = u86.mo25443F();
        int i = 0;
        while (true) {
            if (i >= F.size()) {
                i = -1;
                break;
            } else if (str.equals(((j96) F.get(i)).mo18174H())) {
                break;
            } else {
                i++;
            }
        }
        g96 F2 = j96.m18221F();
        F2.mo16408z(str);
        if (obj instanceof Long) {
            F2.mo16407y(((Long) obj).longValue());
        }
        if (i >= 0) {
            u86.mo25454z(i, F2);
        } else {
            u86.mo25449u(F2);
        }
    }

    @ly4
    /* renamed from: m */
    public static final boolean m29504m(xj5 xj5, uy6 uy6) {
        Preconditions.checkNotNull(xj5);
        Preconditions.checkNotNull(uy6);
        return !TextUtils.isEmpty(uy6.f21560c) || !TextUtils.isEmpty(uy6.f21574h);
    }

    /* renamed from: n */
    public static final j96 m29505n(x86 x86, String str) {
        for (j96 j96 : x86.mo26820J()) {
            if (j96.mo18174H().equals(str)) {
                return j96;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static final Object m29506o(x86 x86, String str) {
        j96 n = m29505n(x86, str);
        if (n == null) {
            return null;
        }
        if (n.mo18181Y()) {
            return n.mo18175I();
        }
        if (n.mo18179W()) {
            return Long.valueOf(n.mo18173E());
        }
        if (n.mo18177U()) {
            return Double.valueOf(n.mo18170B());
        }
        if (n.mo18172D() <= 0) {
            return null;
        }
        List<j96> J = n.mo18176J();
        ArrayList arrayList = new ArrayList();
        for (j96 j96 : J) {
            if (j96 != null) {
                Bundle bundle = new Bundle();
                for (j96 j962 : j96.mo18176J()) {
                    if (j962.mo18181Y()) {
                        bundle.putString(j962.mo18174H(), j962.mo18175I());
                    } else if (j962.mo18179W()) {
                        bundle.putLong(j962.mo18174H(), j962.mo18173E());
                    } else if (j962.mo18177U()) {
                        bundle.putDouble(j962.mo18174H(), j962.mo18170B());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: r */
    public static final void m29507r(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(yg1.C3999a.f23084c);
        }
    }

    /* renamed from: s */
    public static final String m29508s(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: t */
    public static final void m29509t(StringBuilder sb, int i, String str, nb6 nb6) {
        if (nb6 != null) {
            m29507r(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (nb6.mo21064C() != 0) {
                m29507r(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l : nb6.mo21068J()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (nb6.mo21066E() != 0) {
                m29507r(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l2 : nb6.mo21070L()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (nb6.mo21063B() != 0) {
                m29507r(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (r86 r86 : nb6.mo21067I()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(r86.mo23715I() ? Integer.valueOf(r86.mo23712B()) : null);
                    sb.append(ar4.f25981a);
                    sb.append(r86.mo23714H() ? Long.valueOf(r86.mo23713C()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (nb6.mo21065D() != 0) {
                m29507r(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (tb6 tb6 : nb6.mo21069K()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(tb6.mo24837J() ? Integer.valueOf(tb6.mo24834C()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : tb6.mo24836G()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            m29507r(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: u */
    public static final void m29510u(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m29507r(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: v */
    public static final void m29511v(StringBuilder sb, int i, String str, t46 t46) {
        if (t46 != null) {
            m29507r(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (t46.mo24708H()) {
                int M = t46.mo24713M();
                m29510u(sb, i, "comparison_type", M != 1 ? M != 2 ? M != 3 ? M != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
            }
            if (t46.mo24710J()) {
                m29510u(sb, i, "match_as_float", Boolean.valueOf(t46.mo24707G()));
            }
            if (t46.mo24709I()) {
                m29510u(sb, i, "comparison_value", t46.mo24704D());
            }
            if (t46.mo24712L()) {
                m29510u(sb, i, "min_comparison_value", t46.mo24706F());
            }
            if (t46.mo24711K()) {
                m29510u(sb, i, "max_comparison_value", t46.mo24705E());
            }
            m29507r(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: w */
    public static int m29512w(va6 va6, String str) {
        for (int i = 0; i < va6.mo25971m0(); i++) {
            if (str.equals(va6.mo25965g0(i).mo27910G())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r0.get(com.onedelhi.secure.ba0.f26250a);
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.xj5 mo25692A(com.onedelhi.secure.mb5 r9) {
        /*
            r8 = this;
            java.util.Map r0 = r9.mo20287e()
            r1 = 1
            android.os.Bundle r0 = r8.mo25706y(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001c
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r1 = "app"
        L_0x001e:
            r5 = r1
            java.lang.String r1 = r9.mo20286d()
            java.lang.String r1 = com.onedelhi.secure.le6.m20591b(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r9.mo20286d()
        L_0x002d:
            r3 = r1
            com.onedelhi.secure.xj5 r1 = new com.onedelhi.secure.xj5
            com.onedelhi.secure.hj5 r4 = new com.onedelhi.secure.hj5
            r4.<init>(r0)
            long r6 = r9.mo20282a()
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.uq6.mo25692A(com.onedelhi.secure.mb5):com.onedelhi.secure.xj5");
    }

    /* renamed from: B */
    public final x86 mo25693B(ji5 ji5) {
        u86 F = x86.m31321F();
        F.mo25439B(ji5.f14185b);
        zi5 zi5 = new zi5(ji5.f14183a);
        while (zi5.hasNext()) {
            String a = zi5.next();
            g96 F2 = j96.m18221F();
            F2.mo16408z(a);
            Object O2 = ji5.f14183a.mo17317O2(a);
            Preconditions.checkNotNull(O2);
            mo25699J(F2, O2);
            F.mo25449u(F2);
        }
        return (x86) F.mo17922m();
    }

    /* renamed from: D */
    public final String mo25694D(sa6 sa6) {
        if (sa6 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (ya6 ya6 : sa6.mo24281E()) {
            if (ya6 != null) {
                m29507r(sb, 1);
                sb.append("bundle {\n");
                if (ya6.mo27304q1()) {
                    m29510u(sb, 1, "protocol_version", Integer.valueOf(ya6.mo27252A1()));
                }
                xz6.m31807c();
                if (this.f11205a.mo27891z().mo14110B(ya6.mo27287U1(), n36.f17074o0) && ya6.mo27307t1()) {
                    m29510u(sb, 1, "session_stitching_token", ya6.mo27276M());
                }
                m29510u(sb, 1, "platform", ya6.mo27272K());
                if (ya6.mo27300m1()) {
                    m29510u(sb, 1, "gmp_version", Long.valueOf(ya6.mo27269I1()));
                }
                if (ya6.mo27312y1()) {
                    m29510u(sb, 1, "uploading_gmp_version", Long.valueOf(ya6.mo27281O1()));
                }
                if (ya6.mo27298k1()) {
                    m29510u(sb, 1, "dynamite_version", Long.valueOf(ya6.mo27265G1()));
                }
                if (ya6.mo27295h1()) {
                    m29510u(sb, 1, "config_version", Long.valueOf(ya6.mo27261E1()));
                }
                m29510u(sb, 1, nh1.f32548u, ya6.mo27266H());
                m29510u(sb, 1, "admob_app_id", ya6.mo27286T1());
                m29510u(sb, 1, "app_id", ya6.mo27287U1());
                m29510u(sb, 1, "app_version", ya6.mo27256C());
                if (ya6.mo27293f1()) {
                    m29510u(sb, 1, "app_version_major", Integer.valueOf(ya6.mo27289b0()));
                }
                m29510u(sb, 1, "firebase_instance_id", ya6.mo27264G());
                if (ya6.mo27297j1()) {
                    m29510u(sb, 1, "dev_cert_hash", Long.valueOf(ya6.mo27263F1()));
                }
                m29510u(sb, 1, "app_store", ya6.mo27253B());
                if (ya6.mo27311x1()) {
                    m29510u(sb, 1, "upload_timestamp_millis", Long.valueOf(ya6.mo27279N1()));
                }
                if (ya6.mo27308u1()) {
                    m29510u(sb, 1, "start_timestamp_millis", Long.valueOf(ya6.mo27275L1()));
                }
                if (ya6.mo27299l1()) {
                    m29510u(sb, 1, "end_timestamp_millis", Long.valueOf(ya6.mo27267H1()));
                }
                if (ya6.mo27303p1()) {
                    m29510u(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(ya6.mo27273K1()));
                }
                if (ya6.mo27302o1()) {
                    m29510u(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(ya6.mo27271J1()));
                }
                m29510u(sb, 1, "app_instance_id", ya6.mo27288V1());
                m29510u(sb, 1, "resettable_device_id", ya6.mo27274L());
                m29510u(sb, 1, "ds_id", ya6.mo27262F());
                if (ya6.mo27301n1()) {
                    m29510u(sb, 1, "limited_ad_tracking", Boolean.valueOf(ya6.mo27251A0()));
                }
                m29510u(sb, 1, "os_version", ya6.mo27270J());
                m29510u(sb, 1, "device_model", ya6.mo27260E());
                m29510u(sb, 1, "user_default_language", ya6.mo27278N());
                if (ya6.mo27310w1()) {
                    m29510u(sb, 1, "time_zone_offset_minutes", Integer.valueOf(ya6.mo27257C1()));
                }
                if (ya6.mo27294g1()) {
                    m29510u(sb, 1, "bundle_sequential_index", Integer.valueOf(ya6.mo27290c1()));
                }
                if (ya6.mo27306s1()) {
                    m29510u(sb, 1, "service_upload", Boolean.valueOf(ya6.mo27254B0()));
                }
                m29510u(sb, 1, "health_monitor", ya6.mo27268I());
                if (ya6.mo27305r1()) {
                    m29510u(sb, 1, "retry_counter", Integer.valueOf(ya6.mo27255B1()));
                }
                if (ya6.mo27296i1()) {
                    m29510u(sb, 1, "consent_signals", ya6.mo27258D());
                }
                ky6.m20117c();
                if (this.f11205a.mo27891z().mo14110B((String) null, n36.f17019E0) && ya6.mo27309v1()) {
                    m29510u(sb, 1, "target_os_version", Long.valueOf(ya6.mo27277M1()));
                }
                List<zb6> Q = ya6.mo27284Q();
                if (Q != null) {
                    for (zb6 zb6 : Q) {
                        if (zb6 != null) {
                            m29507r(sb, 2);
                            sb.append("user_property {\n");
                            m29510u(sb, 2, "set_timestamp_millis", zb6.mo27914S() ? Long.valueOf(zb6.mo27909D()) : null);
                            m29510u(sb, 2, "name", this.f11205a.mo27862D().mo19282f(zb6.mo27910G()));
                            m29510u(sb, 2, "string_value", zb6.mo27911H());
                            m29510u(sb, 2, "int_value", zb6.mo27913R() ? Long.valueOf(zb6.mo27908C()) : null);
                            m29510u(sb, 2, "double_value", zb6.mo27912Q() ? Double.valueOf(zb6.mo27907B()) : null);
                            m29507r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<l86> O = ya6.mo27280O();
                if (O != null) {
                    for (l86 l86 : O) {
                        if (l86 != null) {
                            m29507r(sb, 2);
                            sb.append("audience_membership {\n");
                            if (l86.mo19335L()) {
                                m29510u(sb, 2, "audience_id", Integer.valueOf(l86.mo19331B()));
                            }
                            if (l86.mo19336M()) {
                                m29510u(sb, 2, "new_audience", Boolean.valueOf(l86.mo19334K()));
                            }
                            m29509t(sb, 2, "current_data", l86.mo19332E());
                            if (l86.mo19337N()) {
                                m29509t(sb, 2, "previous_data", l86.mo19333F());
                            }
                            m29507r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<x86> P = ya6.mo27282P();
                if (P != null) {
                    for (x86 x86 : P) {
                        if (x86 != null) {
                            m29507r(sb, 2);
                            sb.append("event {\n");
                            m29510u(sb, 2, "name", this.f11205a.mo27862D().mo19280d(x86.mo26819I()));
                            if (x86.mo26823U()) {
                                m29510u(sb, 2, "timestamp_millis", Long.valueOf(x86.mo26817E()));
                            }
                            if (x86.mo26822T()) {
                                m29510u(sb, 2, "previous_timestamp_millis", Long.valueOf(x86.mo26816D()));
                            }
                            if (x86.mo26821S()) {
                                m29510u(sb, 2, "count", Integer.valueOf(x86.mo26814B()));
                            }
                            if (x86.mo26815C() != 0) {
                                mo25703p(sb, 2, x86.mo26820J());
                            }
                            m29507r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m29507r(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: E */
    public final String mo25695E(y36 y36) {
        if (y36 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (y36.mo27189P()) {
            m29510u(sb, 0, "filter_id", Integer.valueOf(y36.mo27180C()));
        }
        m29510u(sb, 0, "event_name", this.f11205a.mo27862D().mo19280d(y36.mo27183H()));
        String s = m29508s(y36.mo27185L(), y36.mo27186M(), y36.mo27187N());
        if (!s.isEmpty()) {
            m29510u(sb, 0, "filter_type", s);
        }
        if (y36.mo27188O()) {
            m29511v(sb, 1, "event_count_filter", y36.mo27182G());
        }
        if (y36.mo27179B() > 0) {
            sb.append("  filters {\n");
            for (e46 q : y36.mo27184I()) {
                mo25704q(sb, 2, q);
            }
        }
        m29507r(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* renamed from: F */
    public final String mo25696F(z46 z46) {
        if (z46 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (z46.mo27806K()) {
            m29510u(sb, 0, "filter_id", Integer.valueOf(z46.mo27800B()));
        }
        m29510u(sb, 0, "property_name", this.f11205a.mo27862D().mo19282f(z46.mo27802F()));
        String s = m29508s(z46.mo27803H(), z46.mo27804I(), z46.mo27805J());
        if (!s.isEmpty()) {
            m29510u(sb, 0, "filter_type", s);
        }
        mo25704q(sb, 1, z46.mo27801C());
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: G */
    public final List mo25697G(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f11205a.mo15136e().mo12731w().mo25380b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f11205a.mo15136e().mo12731w().mo25381c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* renamed from: I */
    public final Map mo25698I(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(mo25698I((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(mo25698I((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(mo25698I((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: J */
    public final void mo25699J(g96 g96, Object obj) {
        Preconditions.checkNotNull(obj);
        g96.mo16405w();
        g96.mo16403u();
        g96.mo16402t();
        g96.mo16404v();
        if (obj instanceof String) {
            g96.mo16398A((String) obj);
        } else if (obj instanceof Long) {
            g96.mo16407y(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            g96.mo16406x(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    g96 F = j96.m18221F();
                    for (String str : bundle.keySet()) {
                        g96 F2 = j96.m18221F();
                        F2.mo16408z(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            F2.mo16407y(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            F2.mo16398A((String) obj2);
                        } else if (obj2 instanceof Double) {
                            F2.mo16406x(((Double) obj2).doubleValue());
                        }
                        F.mo16401s(F2);
                    }
                    if (F.mo16399q() > 0) {
                        arrayList.add((j96) F.mo17922m());
                    }
                }
            }
            g96.mo16400r(arrayList);
        } else {
            this.f11205a.mo15136e().mo12726r().mo25380b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* renamed from: K */
    public final void mo25700K(wb6 wb6, Object obj) {
        Preconditions.checkNotNull(obj);
        wb6.mo26486s();
        wb6.mo26485r();
        wb6.mo26484q();
        if (obj instanceof String) {
            wb6.mo26491x((String) obj);
        } else if (obj instanceof Long) {
            wb6.mo26488u(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            wb6.mo26487t(((Double) obj).doubleValue());
        } else {
            this.f11205a.mo15136e().mo12726r().mo25380b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* renamed from: M */
    public final boolean mo25701M(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.f11205a.mo15133a().currentTimeMillis() - j) > j2;
    }

    /* renamed from: O */
    public final byte[] mo25702O(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f11205a.mo15136e().mo12726r().mo25380b("Failed to gzip content", e);
            throw e;
        }
    }

    /* renamed from: l */
    public final boolean mo13582l() {
        return false;
    }

    /* renamed from: p */
    public final void mo25703p(StringBuilder sb, int i, List list) {
        if (list != null) {
            int i2 = i + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j96 j96 = (j96) it.next();
                if (j96 != null) {
                    m29507r(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    m29510u(sb, i2, "name", j96.mo18180X() ? this.f11205a.mo27862D().mo19281e(j96.mo18174H()) : null);
                    m29510u(sb, i2, "string_value", j96.mo18181Y() ? j96.mo18175I() : null);
                    m29510u(sb, i2, "int_value", j96.mo18179W() ? Long.valueOf(j96.mo18173E()) : null);
                    if (j96.mo18177U()) {
                        d = Double.valueOf(j96.mo18170B());
                    }
                    m29510u(sb, i2, "double_value", d);
                    if (j96.mo18172D() > 0) {
                        mo25703p(sb, i2, j96.mo18176J());
                    }
                    m29507r(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo25704q(StringBuilder sb, int i, e46 e46) {
        String str;
        if (e46 != null) {
            m29507r(sb, i);
            sb.append("filter {\n");
            if (e46.mo15044I()) {
                m29510u(sb, i, "complement", Boolean.valueOf(e46.mo15043H()));
            }
            if (e46.mo15046K()) {
                m29510u(sb, i, "param_name", this.f11205a.mo27862D().mo19281e(e46.mo15042F()));
            }
            if (e46.mo15047L()) {
                int i2 = i + 1;
                o56 E = e46.mo15041E();
                if (E != null) {
                    m29507r(sb, i2);
                    sb.append("string_filter {\n");
                    if (E.mo21608J()) {
                        switch (E.mo21609K()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        m29510u(sb, i2, "match_type", str);
                    }
                    if (E.mo21607I()) {
                        m29510u(sb, i2, "expression", E.mo21603E());
                    }
                    if (E.mo21606H()) {
                        m29510u(sb, i2, "case_sensitive", Boolean.valueOf(E.mo21605G()));
                    }
                    if (E.mo21602B() > 0) {
                        m29507r(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : E.mo21604F()) {
                            m29507r(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    m29507r(sb, i2);
                    sb.append("}\n");
                }
            }
            if (e46.mo15045J()) {
                m29511v(sb, i + 1, "number_filter", e46.mo15040D());
            }
            m29507r(sb, i);
            sb.append("}\n");
        }
    }

    @ly4
    /* renamed from: x */
    public final long mo25705x(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.f11205a.mo27871N().mo15139h();
        MessageDigest t = gr6.m16185t();
        if (t != null) {
            return gr6.m16184s0(t.digest(bArr));
        }
        this.f11205a.mo15136e().mo12726r().mo25379a("Failed to get MD5");
        return 0;
    }

    /* renamed from: y */
    public final Bundle mo25706y(Map map, boolean z) {
        String obj;
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj2 = map.get(str);
            if (obj2 == null) {
                obj = null;
            } else if (obj2 instanceof Long) {
                bundle.putLong(str, ((Long) obj2).longValue());
            } else if (obj2 instanceof Double) {
                bundle.putDouble(str, ((Double) obj2).doubleValue());
            } else if (!(obj2 instanceof ArrayList)) {
                obj = obj2.toString();
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(mo25706y((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str, obj);
        }
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f11205a.mo15136e().mo12726r().mo25379a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable mo25707z(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            com.onedelhi.secure.za6 r5 = r4.f11205a     // Catch:{ all -> 0x001a }
            com.onedelhi.secure.a56 r5 = r5.mo15136e()     // Catch:{ all -> 0x001a }
            com.onedelhi.secure.u46 r5 = r5.mo12726r()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo25379a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.uq6.mo25707z(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }
}
