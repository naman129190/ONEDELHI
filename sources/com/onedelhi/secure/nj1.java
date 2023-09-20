package com.onedelhi.secure;

import com.onedelhi.secure.m60;
import com.onedelhi.secure.o60;
import java.util.HashMap;

public class nj1 extends o60 {

    /* renamed from: r0 */
    public static final int f17455r0 = 0;

    /* renamed from: s0 */
    public static final int f17456s0 = 1;

    /* renamed from: t0 */
    public static final int f17457t0 = 0;

    /* renamed from: u0 */
    public static final int f17458u0 = 1;

    /* renamed from: v0 */
    public static final int f17459v0 = 2;

    /* renamed from: w0 */
    public static final int f17460w0 = -1;

    /* renamed from: A */
    public boolean f17461A = true;

    /* renamed from: B */
    public boolean f17462B;

    /* renamed from: i */
    public float f17463i = -1.0f;

    /* renamed from: i */
    public m60 f17464i = this.f17765b;

    /* renamed from: n0 */
    public int f17465n0 = -1;

    /* renamed from: o0 */
    public int f17466o0 = -1;

    /* renamed from: p0 */
    public int f17467p0;

    /* renamed from: q0 */
    public int f17468q0;

    /* renamed from: com.onedelhi.secure.nj1$a */
    public static /* synthetic */ class C2983a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17469a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onedelhi.secure.m60$b[] r0 = com.onedelhi.secure.m60.C2835b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17469a = r0
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17469a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17469a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17469a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17469a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f17469a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f17469a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f17469a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f17469a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.nj1.C2983a.<clinit>():void");
        }
    }

    public nj1() {
        this.f17467p0 = 0;
        this.f17468q0 = 0;
        this.f17754a.clear();
        this.f17754a.add(this.f17464i);
        int length = this.f17759a.length;
        for (int i = 0; i < length; i++) {
            this.f17759a[i] = this.f17464i;
        }
    }

    /* renamed from: A2 */
    public void mo21316A2(int i) {
        this.f17468q0 = i;
    }

    /* renamed from: B2 */
    public void mo21317B2(int i) {
        if (this.f17467p0 != i) {
            this.f17467p0 = i;
            this.f17754a.clear();
            this.f17464i = this.f17467p0 == 1 ? this.f17748a : this.f17765b;
            this.f17754a.add(this.f17464i);
            int length = this.f17759a.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f17759a[i2] = this.f17464i;
            }
        }
    }

    /* renamed from: G0 */
    public boolean mo15197G0() {
        return this.f17462B;
    }

    /* renamed from: H0 */
    public boolean mo15198H0() {
        return this.f17462B;
    }

    /* renamed from: f0 */
    public String mo21318f0() {
        return "Guideline";
    }

    /* renamed from: g */
    public void mo15199g(p32 p32, boolean z) {
        p60 p60 = (p60) mo21666U();
        if (p60 != null) {
            m60 r = p60.mo21327r(m60.C2835b.LEFT);
            m60 r2 = p60.mo21327r(m60.C2835b.RIGHT);
            o60 o60 = this.f17749a;
            boolean z2 = true;
            boolean z3 = o60 != null && o60.f17760a[0] == o60.C3032b.WRAP_CONTENT;
            if (this.f17467p0 == 0) {
                r = p60.mo21327r(m60.C2835b.TOP);
                r2 = p60.mo21327r(m60.C2835b.BOTTOM);
                o60 o602 = this.f17749a;
                if (o602 == null || o602.f17760a[1] != o60.C3032b.WRAP_CONTENT) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (this.f17462B && this.f17464i.mo20120o()) {
                v04 u = p32.mo22291u(this.f17464i);
                p32.mo22276f(u, this.f17464i.mo20111f());
                if (this.f17465n0 != -1) {
                    if (z3) {
                        p32.mo22279i(p32.mo22291u(r2), u, 0, 5);
                    }
                } else if (this.f17466o0 != -1 && z3) {
                    v04 u2 = p32.mo22291u(r2);
                    p32.mo22279i(u, p32.mo22291u(r), 0, 5);
                    p32.mo22279i(u2, u, 0, 5);
                }
                this.f17462B = false;
            } else if (this.f17465n0 != -1) {
                v04 u3 = p32.mo22291u(this.f17464i);
                p32.mo22275e(u3, p32.mo22291u(r), this.f17465n0, 8);
                if (z3) {
                    p32.mo22279i(p32.mo22291u(r2), u3, 0, 5);
                }
            } else if (this.f17466o0 != -1) {
                v04 u4 = p32.mo22291u(this.f17464i);
                v04 u5 = p32.mo22291u(r2);
                p32.mo22275e(u4, u5, -this.f17466o0, 8);
                if (z3) {
                    p32.mo22279i(u4, p32.mo22291u(r), 0, 5);
                    p32.mo22279i(u5, u4, 0, 5);
                }
            } else if (this.f17463i != -1.0f) {
                p32.mo22274d(p32.m24398w(p32, p32.mo22291u(this.f17464i), p32.mo22291u(r2), this.f17463i));
            }
        }
    }

    /* renamed from: h */
    public boolean mo15200h() {
        return true;
    }

    /* renamed from: j2 */
    public void mo21319j2(p32 p32, boolean z) {
        if (mo21666U() != null) {
            int O = p32.mo22260O(this.f17464i);
            if (this.f17467p0 == 1) {
                mo21702f2(O);
                mo21705g2(0);
                mo21758y1(mo21666U().mo21619D());
                mo21691c2(0);
                return;
            }
            mo21702f2(0);
            mo21705g2(O);
            mo21691c2(mo21666U().mo21723m0());
            mo21758y1(0);
        }
    }

    /* renamed from: k2 */
    public void mo21320k2() {
        if (this.f17465n0 != -1) {
            mo21330t2();
        } else if (this.f17463i != -1.0f) {
            mo21329s2();
        } else if (this.f17466o0 != -1) {
            mo21328r2();
        }
    }

    /* renamed from: l2 */
    public m60 mo21321l2() {
        return this.f17464i;
    }

    /* renamed from: m2 */
    public int mo21322m2() {
        return this.f17467p0;
    }

    /* renamed from: n */
    public void mo15202n(o60 o60, HashMap<o60, o60> hashMap) {
        super.mo15202n(o60, hashMap);
        nj1 nj1 = (nj1) o60;
        this.f17463i = nj1.f17463i;
        this.f17465n0 = nj1.f17465n0;
        this.f17466o0 = nj1.f17466o0;
        this.f17461A = nj1.f17461A;
        mo21317B2(nj1.f17467p0);
    }

    /* renamed from: n2 */
    public int mo21323n2() {
        return this.f17465n0;
    }

    /* renamed from: o2 */
    public int mo21324o2() {
        if (this.f17463i != -1.0f) {
            return 0;
        }
        if (this.f17465n0 != -1) {
            return 1;
        }
        return this.f17466o0 != -1 ? 2 : -1;
    }

    /* renamed from: p2 */
    public int mo21325p2() {
        return this.f17466o0;
    }

    /* renamed from: q2 */
    public float mo21326q2() {
        return this.f17463i;
    }

    /* renamed from: r */
    public m60 mo21327r(m60.C2835b bVar) {
        int i = C2983a.f17469a[bVar.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f17467p0 == 1) {
                return this.f17464i;
            }
            return null;
        } else if ((i == 3 || i == 4) && this.f17467p0 == 0) {
            return this.f17464i;
        } else {
            return null;
        }
    }

    /* renamed from: r2 */
    public void mo21328r2() {
        int o0 = mo21728o0();
        if (this.f17467p0 == 0) {
            o0 = mo21731p0();
        }
        mo21333w2(o0);
    }

    /* renamed from: s2 */
    public void mo21329s2() {
        int m0 = mo21666U().mo21723m0() - mo21728o0();
        if (this.f17467p0 == 0) {
            m0 = mo21666U().mo21619D() - mo21731p0();
        }
        mo21334x2(m0);
    }

    /* renamed from: t2 */
    public void mo21330t2() {
        float o0 = ((float) mo21728o0()) / ((float) mo21666U().mo21723m0());
        if (this.f17467p0 == 0) {
            o0 = ((float) mo21731p0()) / ((float) mo21666U().mo21619D());
        }
        mo21335y2(o0);
    }

    /* renamed from: u2 */
    public boolean mo21331u2() {
        return this.f17463i != -1.0f && this.f17465n0 == -1 && this.f17466o0 == -1;
    }

    /* renamed from: v2 */
    public void mo21332v2(int i) {
        this.f17464i.mo20103A(i);
        this.f17462B = true;
    }

    /* renamed from: w2 */
    public void mo21333w2(int i) {
        if (i > -1) {
            this.f17463i = -1.0f;
            this.f17465n0 = i;
            this.f17466o0 = -1;
        }
    }

    /* renamed from: x2 */
    public void mo21334x2(int i) {
        if (i > -1) {
            this.f17463i = -1.0f;
            this.f17465n0 = -1;
            this.f17466o0 = i;
        }
    }

    /* renamed from: y2 */
    public void mo21335y2(float f) {
        if (f > -1.0f) {
            this.f17463i = f;
            this.f17465n0 = -1;
            this.f17466o0 = -1;
        }
    }

    /* renamed from: z2 */
    public void mo21336z2(int i) {
        mo21335y2(((float) i) / 100.0f);
    }
}
