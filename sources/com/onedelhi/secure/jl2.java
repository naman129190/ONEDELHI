package com.onedelhi.secure;

import java.util.HashMap;
import java.util.HashSet;

public class jl2 extends fl2 {

    /* renamed from: m */
    public static final int f14229m = 3;

    /* renamed from: p */
    public static final String f14230p = "KeyTimeCycle";

    /* renamed from: q */
    public static final String f14231q = "KeyTimeCycle";

    /* renamed from: a */
    public float f14232a = Float.NaN;

    /* renamed from: b */
    public float f14233b = Float.NaN;

    /* renamed from: c */
    public float f14234c = Float.NaN;

    /* renamed from: d */
    public float f14235d = Float.NaN;

    /* renamed from: e */
    public float f14236e = Float.NaN;

    /* renamed from: f */
    public float f14237f = Float.NaN;

    /* renamed from: g */
    public float f14238g = Float.NaN;

    /* renamed from: h */
    public float f14239h = Float.NaN;

    /* renamed from: i */
    public float f14240i = Float.NaN;

    /* renamed from: j */
    public float f14241j = Float.NaN;

    /* renamed from: k */
    public float f14242k = Float.NaN;

    /* renamed from: k */
    public int f14243k = -1;

    /* renamed from: l */
    public float f14244l = Float.NaN;

    /* renamed from: l */
    public int f14245l = 0;

    /* renamed from: m */
    public float f14246m = Float.NaN;

    /* renamed from: n */
    public float f14247n = 0.0f;

    /* renamed from: n */
    public String f14248n;

    /* renamed from: o */
    public String f14249o = null;

    public jl2() {
        this.f12144i = 3;
        this.f12140a = new HashMap<>();
    }

    /* renamed from: a */
    public boolean mo13120a(int i, int i2) {
        if (i == 100) {
            this.f12142g = i2;
            return true;
        } else if (i != 421) {
            return super.mo13120a(i, i2);
        } else {
            this.f14245l = i2;
            return true;
        }
    }

    /* renamed from: b */
    public int mo13121b(String str) {
        return ck4.m12518a(str);
    }

    /* renamed from: c */
    public boolean mo13122c(int i, float f) {
        if (i == 315) {
            this.f14244l = mo16055t(Float.valueOf(f));
            return true;
        } else if (i == 401) {
            this.f14243k = mo16056u(Float.valueOf(f));
            return true;
        } else if (i == 403) {
            this.f14232a = f;
            return true;
        } else if (i == 416) {
            this.f14237f = mo16055t(Float.valueOf(f));
            return true;
        } else if (i == 423) {
            this.f14246m = mo16055t(Float.valueOf(f));
            return true;
        } else if (i != 424) {
            switch (i) {
                case 304:
                    this.f14240i = mo16055t(Float.valueOf(f));
                    return true;
                case 305:
                    this.f14241j = mo16055t(Float.valueOf(f));
                    return true;
                case 306:
                    this.f14242k = mo16055t(Float.valueOf(f));
                    return true;
                case 307:
                    this.f14233b = mo16055t(Float.valueOf(f));
                    return true;
                case 308:
                    this.f14235d = mo16055t(Float.valueOf(f));
                    return true;
                case 309:
                    this.f14236e = mo16055t(Float.valueOf(f));
                    return true;
                case 310:
                    this.f14234c = mo16055t(Float.valueOf(f));
                    return true;
                case 311:
                    this.f14238g = mo16055t(Float.valueOf(f));
                    return true;
                case 312:
                    this.f14239h = mo16055t(Float.valueOf(f));
                    return true;
                default:
                    return super.mo13122c(i, f);
            }
        } else {
            this.f14247n = mo16055t(Float.valueOf(f));
            return true;
        }
    }

    /* renamed from: d */
    public boolean mo13123d(int i, boolean z) {
        return super.mo13123d(i, z);
    }

    /* renamed from: e */
    public boolean mo13124e(int i, String str) {
        if (i == 420) {
            this.f14248n = str;
            return true;
        } else if (i != 421) {
            return super.mo13124e(i, str);
        } else {
            this.f14245l = 7;
            this.f14249o = str;
            return true;
        }
    }

    /* renamed from: f */
    public void mo16041f(HashMap<String, x14> hashMap) {
    }

    /* renamed from: g */
    public fl2 clone() {
        return new jl2().mo16043h(this);
    }

    /* renamed from: i */
    public void mo16044i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f14232a)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f14233b)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f14234c)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f14235d)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f14236e)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f14238g)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f14239h)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f14237f)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f14240i)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f14241j)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f14242k)) {
            hashSet.add("translationZ");
        }
        if (this.f12140a.size() > 0) {
            for (String str : this.f12140a.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (r1.equals("scaleX") == false) goto L_0x004d;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18470v(java.util.HashMap<java.lang.String, com.onedelhi.secure.pd4> r11) {
        /*
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x019c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            com.onedelhi.secure.pd4 r3 = (com.onedelhi.secure.pd4) r3
            if (r3 != 0) goto L_0x001e
            goto L_0x0008
        L_0x001e:
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0045
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.qc0> r2 = r10.f12140a
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            com.onedelhi.secure.qc0 r6 = (com.onedelhi.secure.qc0) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            com.onedelhi.secure.pd4$b r4 = (com.onedelhi.secure.pd4.C3146b) r4
            int r5 = r10.f12142g
            float r7 = r10.f14246m
            int r8 = r10.f14245l
            float r9 = r10.f14247n
            r4.mo22399g(r5, r6, r7, r8, r9)
            goto L_0x0008
        L_0x0045:
            r2 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00ce;
                case -1249320805: goto L_0x00c3;
                case -1249320804: goto L_0x00b8;
                case -1225497657: goto L_0x00ad;
                case -1225497656: goto L_0x00a2;
                case -1225497655: goto L_0x0097;
                case -1001078227: goto L_0x008c;
                case -908189618: goto L_0x0083;
                case -908189617: goto L_0x0077;
                case -4379043: goto L_0x006a;
                case 92909918: goto L_0x005d;
                case 803192288: goto L_0x0050;
                default: goto L_0x004d;
            }
        L_0x004d:
            r4 = -1
            goto L_0x00d9
        L_0x0050:
            java.lang.String r4 = "pathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0059
            goto L_0x004d
        L_0x0059:
            r4 = 11
            goto L_0x00d9
        L_0x005d:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0066
            goto L_0x004d
        L_0x0066:
            r4 = 10
            goto L_0x00d9
        L_0x006a:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0073
            goto L_0x004d
        L_0x0073:
            r4 = 9
            goto L_0x00d9
        L_0x0077:
            java.lang.String r4 = "scaleY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0080
            goto L_0x004d
        L_0x0080:
            r4 = 8
            goto L_0x00d9
        L_0x0083:
            java.lang.String r5 = "scaleX"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00d9
            goto L_0x004d
        L_0x008c:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0095
            goto L_0x004d
        L_0x0095:
            r4 = 6
            goto L_0x00d9
        L_0x0097:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a0
            goto L_0x004d
        L_0x00a0:
            r4 = 5
            goto L_0x00d9
        L_0x00a2:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00ab
            goto L_0x004d
        L_0x00ab:
            r4 = 4
            goto L_0x00d9
        L_0x00ad:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b6
            goto L_0x004d
        L_0x00b6:
            r4 = 3
            goto L_0x00d9
        L_0x00b8:
            java.lang.String r4 = "rotationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c1
            goto L_0x004d
        L_0x00c1:
            r4 = 2
            goto L_0x00d9
        L_0x00c3:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00cc
            goto L_0x004d
        L_0x00cc:
            r4 = 1
            goto L_0x00d9
        L_0x00ce:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00d8
            goto L_0x004d
        L_0x00d8:
            r4 = 0
        L_0x00d9:
            switch(r4) {
                case 0: goto L_0x018e;
                case 1: goto L_0x0181;
                case 2: goto L_0x0174;
                case 3: goto L_0x0167;
                case 4: goto L_0x015a;
                case 5: goto L_0x014d;
                case 6: goto L_0x0140;
                case 7: goto L_0x0133;
                case 8: goto L_0x0126;
                case 9: goto L_0x011d;
                case 10: goto L_0x0106;
                case 11: goto L_0x00f9;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyTimeCycles"
            com.onedelhi.secure.xq4.m31634f(r2, r1)
            goto L_0x0008
        L_0x00f9:
            float r1 = r10.f14237f
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f12142g
            float r5 = r10.f14237f
            goto L_0x0112
        L_0x0106:
            float r1 = r10.f14232a
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f12142g
            float r5 = r10.f14232a
        L_0x0112:
            float r6 = r10.f14246m
            int r7 = r10.f14245l
            float r8 = r10.f14247n
            r3.mo17458c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x011d:
            float r1 = r10.f14242k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            goto L_0x0155
        L_0x0126:
            float r1 = r10.f14239h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f12142g
            float r5 = r10.f14239h
            goto L_0x0112
        L_0x0133:
            float r1 = r10.f14238g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f12142g
            float r5 = r10.f14238g
            goto L_0x0112
        L_0x0140:
            float r1 = r10.f14244l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f12142g
            float r5 = r10.f14244l
            goto L_0x0112
        L_0x014d:
            float r1 = r10.f14242k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
        L_0x0155:
            int r4 = r10.f12142g
            float r5 = r10.f14242k
            goto L_0x0112
        L_0x015a:
            float r1 = r10.f14241j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f12142g
            float r5 = r10.f14241j
            goto L_0x0112
        L_0x0167:
            float r1 = r10.f14240i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f12142g
            float r5 = r10.f14240i
            goto L_0x0112
        L_0x0174:
            float r1 = r10.f14234c
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f12142g
            float r5 = r10.f14234c
            goto L_0x0112
        L_0x0181:
            float r1 = r10.f14236e
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f12142g
            float r5 = r10.f14236e
            goto L_0x0112
        L_0x018e:
            float r1 = r10.f14235d
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f12142g
            float r5 = r10.f14235d
            goto L_0x0112
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.jl2.mo18470v(java.util.HashMap):void");
    }

    /* renamed from: w */
    public jl2 mo16043h(fl2 fl2) {
        super.mo16043h(fl2);
        jl2 jl2 = (jl2) fl2;
        this.f14248n = jl2.f14248n;
        this.f14243k = jl2.f14243k;
        this.f14245l = jl2.f14245l;
        this.f14246m = jl2.f14246m;
        this.f14247n = jl2.f14247n;
        this.f14244l = jl2.f14244l;
        this.f14232a = jl2.f14232a;
        this.f14233b = jl2.f14233b;
        this.f14234c = jl2.f14234c;
        this.f14237f = jl2.f14237f;
        this.f14235d = jl2.f14235d;
        this.f14236e = jl2.f14236e;
        this.f14238g = jl2.f14238g;
        this.f14239h = jl2.f14239h;
        this.f14240i = jl2.f14240i;
        this.f14241j = jl2.f14241j;
        this.f14242k = jl2.f14242k;
        return this;
    }
}
