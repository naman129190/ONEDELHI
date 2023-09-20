package com.onedelhi.secure;

import java.util.ArrayList;

public class jo3 {

    /* renamed from: d */
    public static final int f14348d = 0;

    /* renamed from: e */
    public static final int f14349e = 1;

    /* renamed from: f */
    public static final int f14350f = 2;

    /* renamed from: g */
    public static int f14351g;

    /* renamed from: a */
    public int f14352a = 0;

    /* renamed from: a */
    public gx4 f14353a = null;

    /* renamed from: a */
    public ArrayList<gx4> f14354a = new ArrayList<>();

    /* renamed from: a */
    public boolean f14355a = false;

    /* renamed from: b */
    public int f14356b;

    /* renamed from: b */
    public gx4 f14357b = null;

    /* renamed from: c */
    public int f14358c;

    public jo3(gx4 gx4, int i) {
        int i2 = f14351g;
        this.f14356b = i2;
        f14351g = i2 + 1;
        this.f14353a = gx4;
        this.f14357b = gx4;
        this.f14358c = i;
    }

    /* renamed from: a */
    public void mo18524a(gx4 gx4) {
        this.f14354a.add(gx4);
        this.f14357b = gx4;
    }

    /* renamed from: b */
    public long mo18525b(p60 p60, int i) {
        gx4 gx4;
        long j;
        long j2;
        long j3;
        gx4 gx42 = this.f14353a;
        long j4 = 0;
        if (gx42 instanceof C3746uv) {
            if (((C3746uv) gx42).f12810b != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(gx42 instanceof ul1)) {
                return 0;
            }
        } else if (!(gx42 instanceof bt4)) {
            return 0;
        }
        wj0 wj0 = (i == 0 ? p60.f17750a : p60.f17746a).f12808a;
        wj0 wj02 = (i == 0 ? p60.f17750a : p60.f17746a).f12811b;
        boolean contains = gx42.f12808a.f22149b.contains(wj0);
        boolean contains2 = this.f14353a.f12811b.f22149b.contains(wj02);
        long j5 = this.f14353a.mo17010j();
        if (!contains || !contains2) {
            if (contains) {
                wj0 wj03 = this.f14353a.f12808a;
                j3 = mo18529f(wj03, (long) wj03.f22141a);
                j2 = ((long) this.f14353a.f12808a.f22141a) + j5;
            } else if (contains2) {
                wj0 wj04 = this.f14353a.f12811b;
                long e = mo18528e(wj04, (long) wj04.f22141a);
                j2 = ((long) (-this.f14353a.f12811b.f22141a)) + j5;
                j3 = -e;
            } else {
                gx4 gx43 = this.f14353a;
                j = ((long) gx43.f12808a.f22141a) + gx43.mo17010j();
                gx4 = this.f14353a;
            }
            return Math.max(j3, j2);
        }
        long f = mo18529f(this.f14353a.f12808a, 0);
        long e2 = mo18528e(this.f14353a.f12811b, 0);
        long j6 = f - j5;
        gx4 gx44 = this.f14353a;
        int i2 = gx44.f12811b.f22141a;
        if (j6 >= ((long) (-i2))) {
            j6 += (long) i2;
        }
        int i3 = gx44.f12808a.f22141a;
        long j7 = ((-e2) - j5) - ((long) i3);
        if (j7 >= ((long) i3)) {
            j7 -= (long) i3;
        }
        float u = gx44.f12807a.mo21744u(i);
        if (u > 0.0f) {
            j4 = (long) ((((float) j7) / u) + (((float) j6) / (1.0f - u)));
        }
        float f2 = (float) j4;
        long j8 = ((long) ((f2 * u) + 0.5f)) + j5 + ((long) ((f2 * (1.0f - u)) + 0.5f));
        gx4 = this.f14353a;
        j = ((long) gx4.f12808a.f22141a) + j8;
        return j - ((long) gx4.f12811b.f22141a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        r2 = (com.onedelhi.secure.wj0) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r2 = (com.onedelhi.secure.wj0) r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18526c(com.onedelhi.secure.gx4 r6, int r7) {
        /*
            r5 = this;
            com.onedelhi.secure.o60 r0 = r6.f12807a
            boolean[] r0 = r0.f17762a
            boolean r0 = r0[r7]
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            com.onedelhi.secure.wj0 r0 = r6.f12808a
            java.util.List<com.onedelhi.secure.sj0> r0 = r0.f22146a
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x005a
            java.lang.Object r2 = r0.next()
            com.onedelhi.secure.sj0 r2 = (com.onedelhi.secure.sj0) r2
            boolean r3 = r2 instanceof com.onedelhi.secure.wj0
            if (r3 == 0) goto L_0x0012
            com.onedelhi.secure.wj0 r2 = (com.onedelhi.secure.wj0) r2
            com.onedelhi.secure.gx4 r3 = r2.f22143a
            if (r3 != r6) goto L_0x0029
            goto L_0x0012
        L_0x0029:
            com.onedelhi.secure.wj0 r3 = r3.f12808a
            if (r2 != r3) goto L_0x0012
            boolean r3 = r6 instanceof com.onedelhi.secure.C3746uv
            if (r3 == 0) goto L_0x004a
            r3 = r6
            com.onedelhi.secure.uv r3 = (com.onedelhi.secure.C3746uv) r3
            java.util.ArrayList<com.onedelhi.secure.gx4> r3 = r3.f21529a
            java.util.Iterator r3 = r3.iterator()
        L_0x003a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0054
            java.lang.Object r4 = r3.next()
            com.onedelhi.secure.gx4 r4 = (com.onedelhi.secure.gx4) r4
            r5.mo18526c(r4, r7)
            goto L_0x003a
        L_0x004a:
            boolean r3 = r6 instanceof com.onedelhi.secure.ll1
            if (r3 != 0) goto L_0x0054
            com.onedelhi.secure.o60 r3 = r6.f12807a
            boolean[] r3 = r3.f17762a
            r3[r7] = r1
        L_0x0054:
            com.onedelhi.secure.gx4 r2 = r2.f22143a
            r5.mo18526c(r2, r7)
            goto L_0x0012
        L_0x005a:
            com.onedelhi.secure.wj0 r0 = r6.f12811b
            java.util.List<com.onedelhi.secure.sj0> r0 = r0.f22146a
            java.util.Iterator r0 = r0.iterator()
        L_0x0062:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00aa
            java.lang.Object r2 = r0.next()
            com.onedelhi.secure.sj0 r2 = (com.onedelhi.secure.sj0) r2
            boolean r3 = r2 instanceof com.onedelhi.secure.wj0
            if (r3 == 0) goto L_0x0062
            com.onedelhi.secure.wj0 r2 = (com.onedelhi.secure.wj0) r2
            com.onedelhi.secure.gx4 r3 = r2.f22143a
            if (r3 != r6) goto L_0x0079
            goto L_0x0062
        L_0x0079:
            com.onedelhi.secure.wj0 r3 = r3.f12808a
            if (r2 != r3) goto L_0x0062
            boolean r3 = r6 instanceof com.onedelhi.secure.C3746uv
            if (r3 == 0) goto L_0x009a
            r3 = r6
            com.onedelhi.secure.uv r3 = (com.onedelhi.secure.C3746uv) r3
            java.util.ArrayList<com.onedelhi.secure.gx4> r3 = r3.f21529a
            java.util.Iterator r3 = r3.iterator()
        L_0x008a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00a4
            java.lang.Object r4 = r3.next()
            com.onedelhi.secure.gx4 r4 = (com.onedelhi.secure.gx4) r4
            r5.mo18526c(r4, r7)
            goto L_0x008a
        L_0x009a:
            boolean r3 = r6 instanceof com.onedelhi.secure.ll1
            if (r3 != 0) goto L_0x00a4
            com.onedelhi.secure.o60 r3 = r6.f12807a
            boolean[] r3 = r3.f17762a
            r3[r7] = r1
        L_0x00a4:
            com.onedelhi.secure.gx4 r2 = r2.f22143a
            r5.mo18526c(r2, r7)
            goto L_0x0062
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.jo3.mo18526c(com.onedelhi.secure.gx4, int):boolean");
    }

    /* renamed from: d */
    public void mo18527d(boolean z, boolean z2) {
        if (z) {
            gx4 gx4 = this.f14353a;
            if (gx4 instanceof ul1) {
                mo18526c(gx4, 0);
            }
        }
        if (z2) {
            gx4 gx42 = this.f14353a;
            if (gx42 instanceof bt4) {
                mo18526c(gx42, 1);
            }
        }
    }

    /* renamed from: e */
    public final long mo18528e(wj0 wj0, long j) {
        gx4 gx4 = wj0.f22143a;
        if (gx4 instanceof ll1) {
            return j;
        }
        int size = wj0.f22146a.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            sj0 sj0 = wj0.f22146a.get(i);
            if (sj0 instanceof wj0) {
                wj0 wj02 = (wj0) sj0;
                if (wj02.f22143a != gx4) {
                    j2 = Math.min(j2, mo18528e(wj02, ((long) wj02.f22141a) + j));
                }
            }
        }
        if (wj0 != gx4.f12811b) {
            return j2;
        }
        long j3 = j - gx4.mo17010j();
        return Math.min(Math.min(j2, mo18528e(gx4.f12808a, j3)), j3 - ((long) gx4.f12808a.f22141a));
    }

    /* renamed from: f */
    public final long mo18529f(wj0 wj0, long j) {
        gx4 gx4 = wj0.f22143a;
        if (gx4 instanceof ll1) {
            return j;
        }
        int size = wj0.f22146a.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            sj0 sj0 = wj0.f22146a.get(i);
            if (sj0 instanceof wj0) {
                wj0 wj02 = (wj0) sj0;
                if (wj02.f22143a != gx4) {
                    j2 = Math.max(j2, mo18529f(wj02, ((long) wj02.f22141a) + j));
                }
            }
        }
        if (wj0 != gx4.f12808a) {
            return j2;
        }
        long j3 = j + gx4.mo17010j();
        return Math.max(Math.max(j2, mo18529f(gx4.f12811b, j3)), j3 - ((long) gx4.f12811b.f22141a));
    }
}
