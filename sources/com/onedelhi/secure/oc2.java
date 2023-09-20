package com.onedelhi.secure;

import com.onedelhi.secure.wx4;
import com.onedelhi.secure.yh2;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

public class oc2<K, V> {

    /* renamed from: a */
    public static final int f32984a = 1;

    /* renamed from: b */
    public static final int f32985b = 2;

    /* renamed from: a */
    public final C6267b<K, V> f32986a;

    /* renamed from: a */
    public final K f32987a;

    /* renamed from: b */
    public final V f32988b;

    /* renamed from: com.onedelhi.secure.oc2$a */
    public static /* synthetic */ class C6266a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32989a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.onedelhi.secure.wx4$b[] r0 = com.onedelhi.secure.wx4.C7195b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32989a = r0
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32989a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32989a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.GROUP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.oc2.C6266a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.oc2$b */
    public static class C6267b<K, V> {

        /* renamed from: a */
        public final wx4.C7195b f32990a;

        /* renamed from: a */
        public final K f32991a;

        /* renamed from: b */
        public final wx4.C7195b f32992b;

        /* renamed from: b */
        public final V f32993b;

        public C6267b(wx4.C7195b bVar, K k, wx4.C7195b bVar2, V v) {
            this.f32990a = bVar;
            this.f32991a = k;
            this.f32992b = bVar2;
            this.f32993b = v;
        }
    }

    public oc2(C6267b<K, V> bVar, K k, V v) {
        this.f32986a = bVar;
        this.f32987a = k;
        this.f32988b = v;
    }

    public oc2(wx4.C7195b bVar, K k, wx4.C7195b bVar2, V v) {
        this.f32986a = new C6267b<>(bVar, k, bVar2, v);
        this.f32987a = k;
        this.f32988b = v;
    }

    /* renamed from: b */
    public static <K, V> int m59241b(C6267b<K, V> bVar, K k, V v) {
        return f21.m47483o(bVar.f32990a, 1, k) + f21.m47483o(bVar.f32992b, 2, v);
    }

    /* renamed from: f */
    public static <K, V> oc2<K, V> m59242f(wx4.C7195b bVar, K k, wx4.C7195b bVar2, V v) {
        return new oc2<>(bVar, k, bVar2, v);
    }

    /* renamed from: h */
    public static <K, V> Map.Entry<K, V> m59243h(g00 g00, C6267b<K, V> bVar, zy0 zy0) throws IOException {
        K k = bVar.f32991a;
        V v = bVar.f32993b;
        while (true) {
            int Y = g00.mo36433Y();
            if (Y == 0) {
                break;
            } else if (Y == wx4.m69700c(1, bVar.f32990a.mo46918b())) {
                k = m59244i(g00, zy0, bVar.f32990a, k);
            } else if (Y == wx4.m69700c(2, bVar.f32992b.mo46918b())) {
                v = m59244i(g00, zy0, bVar.f32992b, v);
            } else if (!g00.mo36446g0(Y)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(k, v);
    }

    /* renamed from: i */
    public static <T> T m59244i(g00 g00, zy0 zy0, wx4.C7195b bVar, T t) throws IOException {
        int i = C6266a.f32989a[bVar.ordinal()];
        if (i == 1) {
            yh2.C7362a Ud = ((yh2) t).mo43349Ud();
            g00.mo36419I(Ud, zy0);
            return Ud.mo43377Ja();
        } else if (i == 2) {
            return Integer.valueOf(g00.mo36461z());
        } else {
            if (i != 3) {
                return f21.m47469N(g00, bVar, true);
            }
            throw new RuntimeException("Groups are not allowed in maps.");
        }
    }

    /* renamed from: l */
    public static <K, V> void m59245l(i00 i00, C6267b<K, V> bVar, K k, V v) throws IOException {
        f21.m47470R(i00, bVar.f32990a, 1, k);
        f21.m47470R(i00, bVar.f32992b, 2, v);
    }

    /* renamed from: a */
    public int mo41670a(int i, K k, V v) {
        return i00.m51411X0(i) + i00.m51391D0(m59241b(this.f32986a, k, v));
    }

    /* renamed from: c */
    public K mo41671c() {
        return this.f32987a;
    }

    /* renamed from: d */
    public C6267b<K, V> mo41672d() {
        return this.f32986a;
    }

    /* renamed from: e */
    public V mo41673e() {
        return this.f32988b;
    }

    /* renamed from: g */
    public Map.Entry<K, V> mo41674g(C5173er erVar, zy0 zy0) throws IOException {
        return m59243h(erVar.mo34537L(), this.f32986a, zy0);
    }

    /* renamed from: j */
    public void mo41675j(rc2<K, V> rc2, g00 g00, zy0 zy0) throws IOException {
        int t = g00.mo36455t(g00.mo36424N());
        C6267b<K, V> bVar = this.f32986a;
        K k = bVar.f32991a;
        V v = bVar.f32993b;
        while (true) {
            int Y = g00.mo36433Y();
            if (Y == 0) {
                break;
            } else if (Y == wx4.m69700c(1, this.f32986a.f32990a.mo46918b())) {
                k = m59244i(g00, zy0, this.f32986a.f32990a, k);
            } else if (Y == wx4.m69700c(2, this.f32986a.f32992b.mo46918b())) {
                v = m59244i(g00, zy0, this.f32986a.f32992b, v);
            } else if (!g00.mo36446g0(Y)) {
                break;
            }
        }
        g00.mo36435a(0);
        g00.mo36454s(t);
        rc2.put(k, v);
    }

    /* renamed from: k */
    public void mo41676k(i00 i00, int i, K k, V v) throws IOException {
        i00.mo37776g2(i, 2);
        i00.mo37779h2(m59241b(this.f32986a, k, v));
        m59245l(i00, this.f32986a, k, v);
    }
}
