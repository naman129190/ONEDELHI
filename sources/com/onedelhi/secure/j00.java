package com.onedelhi.secure;

import com.onedelhi.secure.oc2;
import com.onedelhi.secure.ty4;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class j00 implements ty4 {

    /* renamed from: a */
    public final i00 f30533a;

    /* renamed from: com.onedelhi.secure.j00$a */
    public static /* synthetic */ class C5758a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30534a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onedelhi.secure.wx4$b[] r0 = com.onedelhi.secure.wx4.C7195b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30534a = r0
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30534a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30534a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30534a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30534a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30534a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30534a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f30534a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f30534a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f30534a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f30534a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f30534a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.j00.C5758a.<clinit>():void");
        }
    }

    public j00(i00 i00) {
        i00 i002 = (i00) vs1.m68433e(i00, "output");
        this.f30533a = i002;
        i002.f30019a = this;
    }

    /* renamed from: T */
    public static j00 m52795T(i00 i00) {
        j00 j00 = i00.f30019a;
        return j00 != null ? j00 : new j00(i00);
    }

    /* renamed from: A */
    public void mo38314A(int i, long j) throws IOException {
        this.f30533a.mo37732A(i, j);
    }

    /* renamed from: B */
    public void mo38315B(int i, double d) throws IOException {
        this.f30533a.mo37734B(i, d);
    }

    /* renamed from: C */
    public void mo38316C(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30533a.mo37776g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += i00.m51414Z0(list.get(i4).intValue());
            }
            this.f30533a.mo37779h2(i3);
            while (i2 < list.size()) {
                this.f30533a.mo37779h2(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30533a.mo37783o(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: D */
    public void mo38317D(int i, float f) throws IOException {
        this.f30533a.mo37737D(i, f);
    }

    /* renamed from: E */
    public void mo38318E(int i, List<?> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo38361v(i, list.get(i2));
        }
    }

    /* renamed from: F */
    public void mo38319F(int i, List<?> list, xr3 xr3) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo38352m(i, list.get(i2), xr3);
        }
    }

    /* renamed from: G */
    public void mo38320G(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30533a.mo37776g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += i00.m51441p0(list.get(i4).longValue());
            }
            this.f30533a.mo37779h2(i3);
            while (i2 < list.size()) {
                this.f30533a.mo37738D1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30533a.mo37792w(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: H */
    public void mo38321H(int i, Object obj) throws IOException {
        this.f30533a.mo37740F1(i, (yh2) obj);
    }

    /* renamed from: I */
    public void mo38322I(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30533a.mo37776g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += i00.m51406S0(list.get(i4).intValue());
            }
            this.f30533a.mo37779h2(i3);
            while (i2 < list.size()) {
                this.f30533a.mo37769d2(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30533a.mo37780i(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public void mo38323J(int i, List<C5173er> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f30533a.mo37772f(i, list.get(i2));
        }
    }

    /* renamed from: K */
    public void mo38324K(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30533a.mo37776g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += i00.m51433l0(list.get(i4).intValue());
            }
            this.f30533a.mo37779h2(i3);
            while (i2 < list.size()) {
                this.f30533a.mo37735B1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30533a.mo37763a(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: L */
    public void mo38325L(int i, int i2) throws IOException {
        this.f30533a.mo37746L(i, i2);
    }

    /* renamed from: M */
    public void mo38326M(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30533a.mo37776g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += i00.m51402O0(list.get(i4).intValue());
            }
            this.f30533a.mo37779h2(i3);
            while (i2 < list.size()) {
                this.f30533a.mo37765b2(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30533a.mo37746L(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: N */
    public void mo38327N(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30533a.mo37776g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += i00.m51408U0(list.get(i4).longValue());
            }
            this.f30533a.mo37779h2(i3);
            while (i2 < list.size()) {
                this.f30533a.mo37771e2(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30533a.mo37786s(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: O */
    public void mo38328O(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30533a.mo37776g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += i00.m51429j0(list.get(i4).doubleValue());
            }
            this.f30533a.mo37779h2(i3);
            while (i2 < list.size()) {
                this.f30533a.mo37733A1(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30533a.mo37734B(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: P */
    public <K, V> void mo38329P(int i, oc2.C6267b<K, V> bVar, Map<K, V> map) throws IOException {
        if (this.f30533a.mo37778h1()) {
            mo38337Y(i, bVar, map);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            this.f30533a.mo37776g2(i, 2);
            this.f30533a.mo37779h2(oc2.m59241b(bVar, next.getKey(), next.getValue()));
            oc2.m59245l(this.f30533a, bVar, next.getKey(), next.getValue());
        }
    }

    /* renamed from: Q */
    public void mo38330Q(int i, List<?> list, xr3 xr3) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo38341b(i, list.get(i2), xr3);
        }
    }

    /* renamed from: R */
    public void mo38331R(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30533a.mo37776g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += i00.m51453z0(list.get(i4).longValue());
            }
            this.f30533a.mo37779h2(i3);
            while (i2 < list.size()) {
                this.f30533a.mo37745K1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30533a.mo37777h(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: S */
    public void mo38332S(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30533a.mo37776g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += i00.m51451x0(list.get(i4).intValue());
            }
            this.f30533a.mo37779h2(i3);
            while (i2 < list.size()) {
                this.f30533a.mo37744J1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30533a.mo37788t(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: U */
    public int mo38333U() {
        return this.f30533a.mo37773f1();
    }

    /* renamed from: V */
    public final <V> void mo38334V(int i, boolean z, V v, oc2.C6267b<Boolean, V> bVar) throws IOException {
        this.f30533a.mo37776g2(i, 2);
        this.f30533a.mo37779h2(oc2.m59241b(bVar, Boolean.valueOf(z), v));
        oc2.m59245l(this.f30533a, bVar, Boolean.valueOf(z), v);
    }

    /* renamed from: W */
    public final <V> void mo38335W(int i, oc2.C6267b<Integer, V> bVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i2] = intValue.intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.f30533a.mo37776g2(i, 2);
            this.f30533a.mo37779h2(oc2.m59241b(bVar, Integer.valueOf(i4), v));
            oc2.m59245l(this.f30533a, bVar, Integer.valueOf(i4), v);
        }
    }

    /* renamed from: X */
    public final <V> void mo38336X(int i, oc2.C6267b<Long, V> bVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i2] = longValue.longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.f30533a.mo37776g2(i, 2);
            this.f30533a.mo37779h2(oc2.m59241b(bVar, Long.valueOf(j), v));
            oc2.m59245l(this.f30533a, bVar, Long.valueOf(j), v);
        }
    }

    /* renamed from: Y */
    public final <K, V> void mo38337Y(int i, oc2.C6267b<K, V> bVar, Map<K, V> map) throws IOException {
        switch (C5758a.f30534a[bVar.f32990a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    mo38334V(i, false, v, bVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    mo38334V(i, true, v2, bVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                mo38335W(i, bVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                mo38336X(i, bVar, map);
                return;
            case 12:
                mo38338Z(i, bVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + bVar.f32990a);
        }
    }

    /* renamed from: Z */
    public final <V> void mo38338Z(int i, oc2.C6267b<String, V> bVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        int i2 = 0;
        for (String str : map.keySet()) {
            strArr[i2] = str;
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = strArr[i3];
            V v = map.get(str2);
            this.f30533a.mo37776g2(i, 2);
            this.f30533a.mo37779h2(oc2.m59241b(bVar, str2, v));
            oc2.m59245l(this.f30533a, bVar, str2, v);
        }
    }

    /* renamed from: a */
    public void mo38339a(int i, int i2) throws IOException {
        this.f30533a.mo37763a(i, i2);
    }

    /* renamed from: a0 */
    public final void mo38340a0(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f30533a.mo37784p(i, (String) obj);
        } else {
            this.f30533a.mo37772f(i, (C5173er) obj);
        }
    }

    /* renamed from: b */
    public void mo38341b(int i, Object obj, xr3 xr3) throws IOException {
        this.f30533a.mo37741G1(i, (yh2) obj, xr3);
    }

    /* renamed from: c */
    public void mo38342c(int i, boolean z) throws IOException {
        this.f30533a.mo37766c(i, z);
    }

    /* renamed from: d */
    public void mo38343d(int i, long j) throws IOException {
        this.f30533a.mo37768d(i, j);
    }

    /* renamed from: e */
    public void mo38344e(int i) throws IOException {
        this.f30533a.mo37776g2(i, 4);
    }

    /* renamed from: f */
    public void mo38345f(int i, C5173er erVar) throws IOException {
        this.f30533a.mo37772f(i, erVar);
    }

    /* renamed from: g */
    public void mo38346g(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30533a.mo37776g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += i00.m51437n0(list.get(i4).intValue());
            }
            this.f30533a.mo37779h2(i3);
            while (i2 < list.size()) {
                this.f30533a.mo37736C1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30533a.mo37782l(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: h */
    public void mo38347h(int i, long j) throws IOException {
        this.f30533a.mo37777h(i, j);
    }

    /* renamed from: i */
    public void mo38348i(int i, int i2) throws IOException {
        this.f30533a.mo37780i(i, i2);
    }

    /* renamed from: j */
    public void mo38349j(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof n22) {
            n22 n22 = (n22) list;
            while (i2 < list.size()) {
                mo38340a0(i, n22.mo36162g2(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30533a.mo37784p(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: k */
    public void mo38350k(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30533a.mo37776g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += i00.m51417b0(list.get(i4).booleanValue());
            }
            this.f30533a.mo37779h2(i3);
            while (i2 < list.size()) {
                this.f30533a.mo37789t1(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30533a.mo37766c(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: l */
    public void mo38351l(int i, int i2) throws IOException {
        this.f30533a.mo37782l(i, i2);
    }

    /* renamed from: m */
    public void mo38352m(int i, Object obj, xr3 xr3) throws IOException {
        this.f30533a.mo37748M1(i, (yh2) obj, xr3);
    }

    /* renamed from: n */
    public void mo38353n(int i) throws IOException {
        this.f30533a.mo37776g2(i, 3);
    }

    /* renamed from: o */
    public void mo38354o(int i, int i2) throws IOException {
        this.f30533a.mo37783o(i, i2);
    }

    /* renamed from: p */
    public void mo38355p(int i, String str) throws IOException {
        this.f30533a.mo37784p(i, str);
    }

    /* renamed from: q */
    public final void mo38356q(int i, Object obj) throws IOException {
        if (obj instanceof C5173er) {
            this.f30533a.mo37760Y1(i, (C5173er) obj);
        } else {
            this.f30533a.mo37751P1(i, (yh2) obj);
        }
    }

    /* renamed from: r */
    public void mo38357r(int i, List<?> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo38321H(i, list.get(i2));
        }
    }

    /* renamed from: s */
    public void mo38358s(int i, long j) throws IOException {
        this.f30533a.mo37786s(i, j);
    }

    /* renamed from: t */
    public void mo38359t(int i, int i2) throws IOException {
        this.f30533a.mo37788t(i, i2);
    }

    /* renamed from: u */
    public void mo38360u(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30533a.mo37776g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += i00.m51418b1(list.get(i4).longValue());
            }
            this.f30533a.mo37779h2(i3);
            while (i2 < list.size()) {
                this.f30533a.mo37781i2(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30533a.mo37732A(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: v */
    public void mo38361v(int i, Object obj) throws IOException {
        this.f30533a.mo37747L1(i, (yh2) obj);
    }

    /* renamed from: w */
    public void mo38362w(int i, long j) throws IOException {
        this.f30533a.mo37792w(i, j);
    }

    /* renamed from: x */
    public void mo38363x(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30533a.mo37776g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += i00.m51445r0(list.get(i4).floatValue());
            }
            this.f30533a.mo37779h2(i3);
            while (i2 < list.size()) {
                this.f30533a.mo37739E1(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30533a.mo37737D(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: y */
    public ty4.C6908a mo38364y() {
        return ty4.C6908a.ASCENDING;
    }

    /* renamed from: z */
    public void mo38365z(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30533a.mo37776g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += i00.m51404Q0(list.get(i4).longValue());
            }
            this.f30533a.mo37779h2(i3);
            while (i2 < list.size()) {
                this.f30533a.mo37767c2(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30533a.mo37768d(i, list.get(i2).longValue());
            i2++;
        }
    }
}
