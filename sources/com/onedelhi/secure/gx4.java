package com.onedelhi.secure;

import com.onedelhi.secure.o60;

public abstract class gx4 implements sj0 {

    /* renamed from: a */
    public int f12802a;

    /* renamed from: a */
    public cl0 f12803a = new cl0(this);

    /* renamed from: a */
    public C2288b f12804a = C2288b.NONE;

    /* renamed from: a */
    public jo3 f12805a;

    /* renamed from: a */
    public o60.C3032b f12806a;

    /* renamed from: a */
    public o60 f12807a;

    /* renamed from: a */
    public wj0 f12808a = new wj0(this);

    /* renamed from: a */
    public boolean f12809a = false;

    /* renamed from: b */
    public int f12810b = 0;

    /* renamed from: b */
    public wj0 f12811b = new wj0(this);

    /* renamed from: com.onedelhi.secure.gx4$a */
    public static /* synthetic */ class C2287a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12812a;

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
                com.onedelhi.secure.m60$b[] r0 = com.onedelhi.secure.m60.C2835b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12812a = r0
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12812a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12812a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12812a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12812a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.gx4.C2287a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.gx4$b */
    public enum C2288b {
        NONE,
        START,
        END,
        CENTER
    }

    public gx4(o60 o60) {
        this.f12807a = o60;
    }

    /* renamed from: a */
    public void mo13813a(sj0 sj0) {
    }

    /* renamed from: b */
    public final void mo17005b(wj0 wj0, wj0 wj02, int i) {
        wj0.f22149b.add(wj02);
        wj0.f22141a = i;
        wj02.f22146a.add(wj0);
    }

    /* renamed from: c */
    public final void mo17006c(wj0 wj0, wj0 wj02, int i, cl0 cl0) {
        wj0.f22149b.add(wj02);
        wj0.f22149b.add(this.f12803a);
        wj0.f22151c = i;
        wj0.f22142a = cl0;
        wj02.f22146a.add(wj0);
        cl0.f22146a.add(wj0);
    }

    /* renamed from: d */
    public abstract void mo13814d();

    /* renamed from: e */
    public abstract void mo13815e();

    /* renamed from: f */
    public abstract void mo13816f();

    /* renamed from: g */
    public final int mo17007g(int i, int i2) {
        int i3;
        if (i2 == 0) {
            o60 o60 = this.f12807a;
            int i4 = o60.f17798i;
            i3 = Math.max(o60.f17795h, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            o60 o602 = this.f12807a;
            int i5 = o602.f17802k;
            int max = Math.max(o602.f17800j, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* renamed from: h */
    public final wj0 mo17008h(m60 m60) {
        gx4 gx4;
        gx4 gx42;
        m60 m602 = m60.f15915a;
        if (m602 == null) {
            return null;
        }
        o60 o60 = m602.f15916a;
        int i = C2287a.f12812a[m602.f15914a.ordinal()];
        if (i != 1) {
            if (i == 2) {
                gx42 = o60.f17750a;
            } else if (i == 3) {
                gx4 = o60.f17746a;
            } else if (i == 4) {
                return o60.f17746a.f9964c;
            } else {
                if (i != 5) {
                    return null;
                }
                gx42 = o60.f17746a;
            }
            return gx42.f12811b;
        }
        gx4 = o60.f17750a;
        return gx4.f12808a;
    }

    /* renamed from: i */
    public final wj0 mo17009i(m60 m60, int i) {
        m60 m602 = m60.f15915a;
        if (m602 == null) {
            return null;
        }
        o60 o60 = m602.f15916a;
        gx4 gx4 = i == 0 ? o60.f17750a : o60.f17746a;
        int i2 = C2287a.f12812a[m602.f15914a.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return gx4.f12811b;
        }
        return gx4.f12808a;
    }

    /* renamed from: j */
    public long mo17010j() {
        cl0 cl0 = this.f12803a;
        if (cl0.f22152c) {
            return (long) cl0.f22148b;
        }
        return 0;
    }

    /* renamed from: k */
    public boolean mo17011k() {
        int size = this.f12808a.f22149b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f12808a.f22149b.get(i2).f22143a != this) {
                i++;
            }
        }
        int size2 = this.f12811b.f22149b.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (this.f12811b.f22149b.get(i3).f22143a != this) {
                i++;
            }
        }
        return i >= 2;
    }

    /* renamed from: l */
    public boolean mo17012l() {
        return this.f12803a.f22152c;
    }

    /* renamed from: m */
    public boolean mo17013m() {
        return this.f12809a;
    }

    /* renamed from: n */
    public abstract void mo13817n();

    /* renamed from: o */
    public final void mo17014o(int i, int i2) {
        int i3;
        cl0 cl0;
        int i4 = this.f12802a;
        if (i4 != 0) {
            if (i4 == 1) {
                int g = mo17007g(this.f12803a.f10315d, i);
                cl0 = this.f12803a;
                i3 = Math.min(g, i2);
                cl0.mo14196e(i3);
            } else if (i4 == 2) {
                o60 U = this.f12807a.mo21666U();
                if (U != null) {
                    cl0 cl02 = (i == 0 ? U.f17750a : U.f17746a).f12803a;
                    if (cl02.f22152c) {
                        o60 o60 = this.f12807a;
                        i2 = (int) ((((float) cl02.f22148b) * (i == 0 ? o60.f17744a : o60.f17763b)) + 0.5f);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i4 == 3) {
                o60 o602 = this.f12807a;
                gx4 gx4 = o602.f17750a;
                o60.C3032b bVar = gx4.f12806a;
                o60.C3032b bVar2 = o60.C3032b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && gx4.f12802a == 3) {
                    bt4 bt4 = o602.f17746a;
                    if (bt4.f12806a == bVar2 && bt4.f12802a == 3) {
                        return;
                    }
                }
                if (i == 0) {
                    gx4 = o602.f17746a;
                }
                if (gx4.f12803a.f22152c) {
                    float A = o602.mo21610A();
                    this.f12803a.mo14196e(i == 1 ? (int) ((((float) gx4.f12803a.f22148b) / A) + 0.5f) : (int) ((A * ((float) gx4.f12803a.f22148b)) + 0.5f));
                    return;
                }
                return;
            } else {
                return;
            }
        }
        cl0 = this.f12803a;
        i3 = mo17007g(i2, i);
        cl0.mo14196e(i3);
    }

    /* renamed from: p */
    public abstract boolean mo13818p();

    /* renamed from: q */
    public void mo17015q(sj0 sj0, m60 m60, m60 m602, int i) {
        wj0 wj0;
        wj0 h = mo17008h(m60);
        wj0 h2 = mo17008h(m602);
        if (h.f22152c && h2.f22152c) {
            int g = h.f22148b + m60.mo20112g();
            int g2 = h2.f22148b - m602.mo20112g();
            int i2 = g2 - g;
            if (!this.f12803a.f22152c && this.f12806a == o60.C3032b.MATCH_CONSTRAINT) {
                mo17014o(i, i2);
            }
            cl0 cl0 = this.f12803a;
            if (cl0.f22152c) {
                if (cl0.f22148b == i2) {
                    this.f12808a.mo14196e(g);
                    wj0 = this.f12811b;
                } else {
                    o60 o60 = this.f12807a;
                    float E = i == 0 ? o60.mo21622E() : o60.mo21703g0();
                    if (h == h2) {
                        g = h.f22148b;
                        g2 = h2.f22148b;
                        E = 0.5f;
                    }
                    this.f12808a.mo14196e((int) (((float) g) + 0.5f + (((float) ((g2 - g) - this.f12803a.f22148b)) * E)));
                    wj0 = this.f12811b;
                    g2 = this.f12808a.f22148b + this.f12803a.f22148b;
                }
                wj0.mo14196e(g2);
            }
        }
    }

    /* renamed from: r */
    public void mo17016r(sj0 sj0) {
    }

    /* renamed from: s */
    public void mo17017s(sj0 sj0) {
    }

    /* renamed from: t */
    public long mo17018t(int i) {
        int i2;
        cl0 cl0 = this.f12803a;
        if (!cl0.f22152c) {
            return 0;
        }
        long j = (long) cl0.f22148b;
        if (mo17011k()) {
            i2 = this.f12808a.f22141a - this.f12811b.f22141a;
        } else if (i != 0) {
            return j - ((long) this.f12811b.f22141a);
        } else {
            i2 = this.f12808a.f22141a;
        }
        return j + ((long) i2);
    }
}
