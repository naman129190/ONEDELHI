package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.HashMap;

public class z24 {

    /* renamed from: a */
    public static final Integer f23382a = 0;

    /* renamed from: b */
    public static final int f23383b = -1;

    /* renamed from: c */
    public static final int f23384c = 0;

    /* renamed from: d */
    public static final int f23385d = 1;

    /* renamed from: e */
    public static final int f23386e = 2;

    /* renamed from: a */
    public int f23387a;

    /* renamed from: a */
    public final n60 f23388a;

    /* renamed from: a */
    public HashMap<Object, zg3> f23389a = new HashMap<>();

    /* renamed from: b */
    public HashMap<Object, kl1> f23390b = new HashMap<>();

    /* renamed from: c */
    public HashMap<String, ArrayList<String>> f23391c = new HashMap<>();

    /* renamed from: com.onedelhi.secure.z24$a */
    public static /* synthetic */ class C4039a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23392a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onedelhi.secure.z24$e[] r0 = com.onedelhi.secure.z24.C4043e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23392a = r0
                com.onedelhi.secure.z24$e r1 = com.onedelhi.secure.z24.C4043e.HORIZONTAL_CHAIN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23392a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.z24$e r1 = com.onedelhi.secure.z24.C4043e.VERTICAL_CHAIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23392a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.z24$e r1 = com.onedelhi.secure.z24.C4043e.ALIGN_HORIZONTALLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23392a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.z24$e r1 = com.onedelhi.secure.z24.C4043e.ALIGN_VERTICALLY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23392a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.z24$e r1 = com.onedelhi.secure.z24.C4043e.BARRIER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.z24.C4039a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.z24$b */
    public enum C4040b {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    /* renamed from: com.onedelhi.secure.z24$c */
    public enum C4041c {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    /* renamed from: com.onedelhi.secure.z24$d */
    public enum C4042d {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    /* renamed from: com.onedelhi.secure.z24$e */
    public enum C4043e {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    public z24() {
        n60 n60 = new n60(this);
        this.f23388a = n60;
        this.f23387a = 0;
        this.f23389a.put(f23382a, n60);
    }

    /* renamed from: A */
    public pj1 mo27760A(Object obj) {
        return mo27772k(obj, 1);
    }

    /* renamed from: B */
    public z24 mo27761B(al0 al0) {
        return mo27785x(al0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0149, code lost:
        r1 = (com.onedelhi.secure.kl1) r0.mo20910d();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27762a(com.onedelhi.secure.p60 r8) {
        /*
            r7 = this;
            r8.mo14937p2()
            com.onedelhi.secure.n60 r0 = r7.f23388a
            com.onedelhi.secure.al0 r0 = r0.mo20902V()
            r1 = 0
            r0.mo13145j(r7, r8, r1)
            com.onedelhi.secure.n60 r0 = r7.f23388a
            com.onedelhi.secure.al0 r0 = r0.mo20876D()
            r1 = 1
            r0.mo13145j(r7, r8, r1)
            java.util.HashMap<java.lang.Object, com.onedelhi.secure.kl1> r0 = r7.f23390b
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0021:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x004b
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, com.onedelhi.secure.kl1> r2 = r7.f23390b
            java.lang.Object r2 = r2.get(r1)
            com.onedelhi.secure.kl1 r2 = (com.onedelhi.secure.kl1) r2
            com.onedelhi.secure.ml1 r2 = r2.mo15961M0()
            if (r2 == 0) goto L_0x0021
            java.util.HashMap<java.lang.Object, com.onedelhi.secure.zg3> r3 = r7.f23389a
            java.lang.Object r3 = r3.get(r1)
            com.onedelhi.secure.zg3 r3 = (com.onedelhi.secure.zg3) r3
            if (r3 != 0) goto L_0x0047
            com.onedelhi.secure.n60 r3 = r7.mo27766e(r1)
        L_0x0047:
            r3.mo20909c(r2)
            goto L_0x0021
        L_0x004b:
            java.util.HashMap<java.lang.Object, com.onedelhi.secure.zg3> r0 = r7.f23389a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0055:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0091
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, com.onedelhi.secure.zg3> r2 = r7.f23389a
            java.lang.Object r2 = r2.get(r1)
            com.onedelhi.secure.zg3 r2 = (com.onedelhi.secure.zg3) r2
            com.onedelhi.secure.n60 r3 = r7.f23388a
            if (r2 == r3) goto L_0x0055
            com.onedelhi.secure.jz0 r3 = r2.mo20910d()
            boolean r3 = r3 instanceof com.onedelhi.secure.kl1
            if (r3 == 0) goto L_0x0055
            com.onedelhi.secure.jz0 r2 = r2.mo20910d()
            com.onedelhi.secure.kl1 r2 = (com.onedelhi.secure.kl1) r2
            com.onedelhi.secure.ml1 r2 = r2.mo15961M0()
            if (r2 == 0) goto L_0x0055
            java.util.HashMap<java.lang.Object, com.onedelhi.secure.zg3> r3 = r7.f23389a
            java.lang.Object r3 = r3.get(r1)
            com.onedelhi.secure.zg3 r3 = (com.onedelhi.secure.zg3) r3
            if (r3 != 0) goto L_0x008d
            com.onedelhi.secure.n60 r3 = r7.mo27766e(r1)
        L_0x008d:
            r3.mo20909c(r2)
            goto L_0x0055
        L_0x0091:
            java.util.HashMap<java.lang.Object, com.onedelhi.secure.zg3> r0 = r7.f23389a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x009b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d7
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, com.onedelhi.secure.zg3> r2 = r7.f23389a
            java.lang.Object r1 = r2.get(r1)
            com.onedelhi.secure.zg3 r1 = (com.onedelhi.secure.zg3) r1
            com.onedelhi.secure.n60 r2 = r7.f23388a
            if (r1 == r2) goto L_0x00d3
            com.onedelhi.secure.o60 r2 = r1.mo18814a()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = r3.toString()
            r2.mo21715j1(r3)
            r3 = 0
            r2.mo21662S1(r3)
            com.onedelhi.secure.jz0 r3 = r1.mo20910d()
            boolean r3 = r3 instanceof com.onedelhi.secure.pj1
            if (r3 == 0) goto L_0x00cf
            r1.apply()
        L_0x00cf:
            r8.mo14931b(r2)
            goto L_0x009b
        L_0x00d3:
            r1.mo20909c(r8)
            goto L_0x009b
        L_0x00d7:
            java.util.HashMap<java.lang.Object, com.onedelhi.secure.kl1> r8 = r7.f23390b
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x00e1:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0121
            java.lang.Object r0 = r8.next()
            java.util.HashMap<java.lang.Object, com.onedelhi.secure.kl1> r1 = r7.f23390b
            java.lang.Object r0 = r1.get(r0)
            com.onedelhi.secure.kl1 r0 = (com.onedelhi.secure.kl1) r0
            com.onedelhi.secure.ml1 r1 = r0.mo15961M0()
            if (r1 == 0) goto L_0x011d
            java.util.ArrayList<java.lang.Object> r1 = r0.f14963a
            java.util.Iterator r1 = r1.iterator()
        L_0x00ff:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x011d
            java.lang.Object r2 = r1.next()
            java.util.HashMap<java.lang.Object, com.onedelhi.secure.zg3> r3 = r7.f23389a
            java.lang.Object r2 = r3.get(r2)
            com.onedelhi.secure.zg3 r2 = (com.onedelhi.secure.zg3) r2
            com.onedelhi.secure.ml1 r3 = r0.mo15961M0()
            com.onedelhi.secure.o60 r2 = r2.mo18814a()
            r3.mo18469b(r2)
            goto L_0x00ff
        L_0x011d:
            r0.apply()
            goto L_0x00e1
        L_0x0121:
            java.util.HashMap<java.lang.Object, com.onedelhi.secure.zg3> r8 = r7.f23389a
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x012b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x019d
            java.lang.Object r0 = r8.next()
            java.util.HashMap<java.lang.Object, com.onedelhi.secure.zg3> r1 = r7.f23389a
            java.lang.Object r0 = r1.get(r0)
            com.onedelhi.secure.zg3 r0 = (com.onedelhi.secure.zg3) r0
            com.onedelhi.secure.n60 r1 = r7.f23388a
            if (r0 == r1) goto L_0x012b
            com.onedelhi.secure.jz0 r1 = r0.mo20910d()
            boolean r1 = r1 instanceof com.onedelhi.secure.kl1
            if (r1 == 0) goto L_0x012b
            com.onedelhi.secure.jz0 r1 = r0.mo20910d()
            com.onedelhi.secure.kl1 r1 = (com.onedelhi.secure.kl1) r1
            com.onedelhi.secure.ml1 r2 = r1.mo15961M0()
            if (r2 == 0) goto L_0x012b
            java.util.ArrayList<java.lang.Object> r1 = r1.f14963a
            java.util.Iterator r1 = r1.iterator()
        L_0x015b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0199
            java.lang.Object r3 = r1.next()
            java.util.HashMap<java.lang.Object, com.onedelhi.secure.zg3> r4 = r7.f23389a
            java.lang.Object r4 = r4.get(r3)
            com.onedelhi.secure.zg3 r4 = (com.onedelhi.secure.zg3) r4
            if (r4 == 0) goto L_0x0177
            com.onedelhi.secure.o60 r3 = r4.mo18814a()
        L_0x0173:
            r2.mo18469b(r3)
            goto L_0x015b
        L_0x0177:
            boolean r4 = r3 instanceof com.onedelhi.secure.zg3
            if (r4 == 0) goto L_0x0182
            com.onedelhi.secure.zg3 r3 = (com.onedelhi.secure.zg3) r3
            com.onedelhi.secure.o60 r3 = r3.mo18814a()
            goto L_0x0173
        L_0x0182:
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "couldn't find reference for "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.println(r3)
            goto L_0x015b
        L_0x0199:
            r0.apply()
            goto L_0x012b
        L_0x019d:
            java.util.HashMap<java.lang.Object, com.onedelhi.secure.zg3> r8 = r7.f23389a
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x01a7:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r0 = r8.next()
            java.util.HashMap<java.lang.Object, com.onedelhi.secure.zg3> r1 = r7.f23389a
            java.lang.Object r1 = r1.get(r0)
            com.onedelhi.secure.zg3 r1 = (com.onedelhi.secure.zg3) r1
            r1.apply()
            com.onedelhi.secure.o60 r1 = r1.mo18814a()
            if (r1 == 0) goto L_0x01a7
            if (r0 == 0) goto L_0x01a7
            java.lang.String r0 = r0.toString()
            r1.f17753a = r0
            goto L_0x01a7
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.z24.mo27762a(com.onedelhi.secure.p60):void");
    }

    /* renamed from: b */
    public C2171fj mo27763b(Object obj, C4042d dVar) {
        n60 e = mo27766e(obj);
        if (e.mo20910d() == null || !(e.mo20910d() instanceof C2171fj)) {
            C2171fj fjVar = new C2171fj(this);
            fjVar.mo15962P0(dVar);
            e.mo20936p0(fjVar);
        }
        return (C2171fj) e.mo20910d();
    }

    /* renamed from: c */
    public C3029o4 mo27764c(Object... objArr) {
        C3029o4 o4Var = (C3029o4) mo27774m((Object) null, C4043e.ALIGN_HORIZONTALLY);
        o4Var.mo19146L0(objArr);
        return o4Var;
    }

    /* renamed from: d */
    public C3126p4 mo27765d(Object... objArr) {
        C3126p4 p4Var = (C3126p4) mo27774m((Object) null, C4043e.ALIGN_VERTICALLY);
        p4Var.mo19146L0(objArr);
        return p4Var;
    }

    /* renamed from: e */
    public n60 mo27766e(Object obj) {
        zg3 zg3 = this.f23389a.get(obj);
        if (zg3 == null) {
            zg3 = mo27768g(obj);
            this.f23389a.put(obj, zg3);
            zg3.mo20908b(obj);
        }
        if (zg3 instanceof n60) {
            return (n60) zg3;
        }
        return null;
    }

    /* renamed from: f */
    public int mo27767f(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    /* renamed from: g */
    public n60 mo27768g(Object obj) {
        return new n60(this);
    }

    /* renamed from: h */
    public final String mo27769h() {
        StringBuilder sb = new StringBuilder();
        sb.append("__HELPER_KEY_");
        int i = this.f23387a;
        this.f23387a = i + 1;
        sb.append(i);
        sb.append("__");
        return sb.toString();
    }

    /* renamed from: i */
    public void mo27770i() {
        for (Object next : this.f23389a.keySet()) {
            n60 e = mo27766e(next);
            if (e instanceof n60) {
                e.mo20950w0(next);
            }
        }
    }

    /* renamed from: j */
    public ArrayList<String> mo27771j(String str) {
        if (this.f23391c.containsKey(str)) {
            return this.f23391c.get(str);
        }
        return null;
    }

    /* renamed from: k */
    public pj1 mo27772k(Object obj, int i) {
        n60 e = mo27766e(obj);
        if (e.mo20910d() == null || !(e.mo20910d() instanceof pj1)) {
            pj1 pj1 = new pj1(this);
            pj1.mo22463h(i);
            pj1.mo20908b(obj);
            e.mo20936p0(pj1);
        }
        return (pj1) e.mo20910d();
    }

    /* renamed from: l */
    public z24 mo27773l(al0 al0) {
        return mo27783v(al0);
    }

    /* renamed from: m */
    public kl1 mo27774m(Object obj, C4043e eVar) {
        kl1 kl1;
        if (obj == null) {
            obj = mo27769h();
        }
        kl1 kl12 = this.f23390b.get(obj);
        if (kl12 == null) {
            int i = C4039a.f23392a[eVar.ordinal()];
            if (i == 1) {
                kl1 = new tl1(this);
            } else if (i == 2) {
                kl1 = new at4(this);
            } else if (i == 3) {
                kl1 = new C3029o4(this);
            } else if (i == 4) {
                kl1 = new C3126p4(this);
            } else if (i != 5) {
                kl12 = new kl1(this, eVar);
                kl12.mo20908b(obj);
                this.f23390b.put(obj, kl12);
            } else {
                kl1 = new C2171fj(this);
            }
            kl12 = kl1;
            kl12.mo20908b(obj);
            this.f23390b.put(obj, kl12);
        }
        return kl12;
    }

    /* renamed from: n */
    public tl1 mo27775n() {
        return (tl1) mo27774m((Object) null, C4043e.HORIZONTAL_CHAIN);
    }

    /* renamed from: o */
    public tl1 mo27776o(Object... objArr) {
        tl1 tl1 = (tl1) mo27774m((Object) null, C4043e.HORIZONTAL_CHAIN);
        tl1.mo19146L0(objArr);
        return tl1;
    }

    /* renamed from: p */
    public pj1 mo27777p(Object obj) {
        return mo27772k(obj, 0);
    }

    /* renamed from: q */
    public void mo27778q(Object obj, Object obj2) {
        n60 e = mo27766e(obj);
        if (e instanceof n60) {
            e.mo20950w0(obj2);
        }
    }

    /* renamed from: r */
    public zg3 mo27779r(Object obj) {
        return this.f23389a.get(obj);
    }

    /* renamed from: s */
    public void mo27780s() {
        this.f23390b.clear();
        this.f23391c.clear();
    }

    /* renamed from: t */
    public boolean mo27781t(int i) {
        return this.f23388a.mo20876D().mo13146k(i);
    }

    /* renamed from: u */
    public boolean mo27782u(int i) {
        return this.f23388a.mo20902V().mo13146k(i);
    }

    /* renamed from: v */
    public z24 mo27783v(al0 al0) {
        this.f23388a.mo20938q0(al0);
        return this;
    }

    /* renamed from: w */
    public void mo27784w(String str, String str2) {
        ArrayList arrayList;
        n60 e = mo27766e(str);
        if (e instanceof n60) {
            e.mo20944t0(str2);
            if (!this.f23391c.containsKey(str2)) {
                arrayList = new ArrayList();
                this.f23391c.put(str2, arrayList);
            } else {
                arrayList = this.f23391c.get(str2);
            }
            arrayList.add(str);
        }
    }

    /* renamed from: x */
    public z24 mo27785x(al0 al0) {
        this.f23388a.mo20952x0(al0);
        return this;
    }

    /* renamed from: y */
    public at4 mo27786y() {
        return (at4) mo27774m((Object) null, C4043e.VERTICAL_CHAIN);
    }

    /* renamed from: z */
    public at4 mo27787z(Object... objArr) {
        at4 at4 = (at4) mo27774m((Object) null, C4043e.VERTICAL_CHAIN);
        at4.mo19146L0(objArr);
        return at4;
    }
}
