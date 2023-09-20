package com.onedelhi.secure;

import com.onedelhi.secure.o60;
import com.onedelhi.secure.wj0;

public class bt4 extends gx4 {

    /* renamed from: b */
    public cl0 f9963b = null;

    /* renamed from: c */
    public wj0 f9964c;

    /* renamed from: com.onedelhi.secure.bt4$a */
    public static /* synthetic */ class C1805a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9965a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.onedelhi.secure.gx4$b[] r0 = com.onedelhi.secure.gx4.C2288b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9965a = r0
                com.onedelhi.secure.gx4$b r1 = com.onedelhi.secure.gx4.C2288b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9965a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.gx4$b r1 = com.onedelhi.secure.gx4.C2288b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9965a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.gx4$b r1 = com.onedelhi.secure.gx4.C2288b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bt4.C1805a.<clinit>():void");
        }
    }

    public bt4(o60 o60) {
        super(o60);
        wj0 wj0 = new wj0(this);
        this.f9964c = wj0;
        this.f12808a.f22145a = wj0.C3842a.TOP;
        this.f12811b.f22145a = wj0.C3842a.BOTTOM;
        wj0.f22145a = wj0.C3842a.BASELINE;
        this.f12810b = 1;
    }

    /* renamed from: a */
    public void mo13813a(sj0 sj0) {
        int i;
        float f;
        int i2 = C1805a.f9965a[this.f12804a.ordinal()];
        if (i2 == 1) {
            mo17017s(sj0);
        } else if (i2 == 2) {
            mo17016r(sj0);
        } else if (i2 == 3) {
            o60 o60 = this.f12807a;
            mo17015q(sj0, o60.f17765b, o60.f17781d, 1);
            return;
        }
        cl0 cl0 = this.f12803a;
        if (cl0.f22150b && !cl0.f22152c && this.f12806a == o60.C3032b.MATCH_CONSTRAINT) {
            o60 o602 = this.f12807a;
            int i3 = o602.f17792g;
            if (i3 == 2) {
                o60 U = o602.mo21666U();
                if (U != null) {
                    cl0 cl02 = U.f17746a.f12803a;
                    if (cl02.f22152c) {
                        i = (int) ((((float) cl02.f22148b) * this.f12807a.f17763b) + 0.5f);
                    }
                }
            } else if (i3 == 3 && o602.f17750a.f12803a.f22152c) {
                int B = o602.mo21613B();
                if (B != -1) {
                    if (B == 0) {
                        o60 o603 = this.f12807a;
                        f = ((float) o603.f17750a.f12803a.f22148b) * o603.mo21610A();
                        i = (int) (f + 0.5f);
                    } else if (B != 1) {
                        i = 0;
                    }
                }
                o60 o604 = this.f12807a;
                f = ((float) o604.f17750a.f12803a.f22148b) / o604.mo21610A();
                i = (int) (f + 0.5f);
            }
            this.f12803a.mo14196e(i);
        }
        wj0 wj0 = this.f12808a;
        if (wj0.f22150b) {
            wj0 wj02 = this.f12811b;
            if (wj02.f22150b) {
                if (!wj0.f22152c || !wj02.f22152c || !this.f12803a.f22152c) {
                    if (!this.f12803a.f22152c && this.f12806a == o60.C3032b.MATCH_CONSTRAINT) {
                        o60 o605 = this.f12807a;
                        if (o605.f17788f == 0 && !o605.mo21620D0()) {
                            int i4 = this.f12808a.f22149b.get(0).f22148b;
                            wj0 wj03 = this.f12808a;
                            int i5 = i4 + wj03.f22141a;
                            int i6 = this.f12811b.f22149b.get(0).f22148b + this.f12811b.f22141a;
                            wj03.mo14196e(i5);
                            this.f12811b.mo14196e(i6);
                            this.f12803a.mo14196e(i6 - i5);
                            return;
                        }
                    }
                    if (!this.f12803a.f22152c && this.f12806a == o60.C3032b.MATCH_CONSTRAINT && this.f12802a == 1 && this.f12808a.f22149b.size() > 0 && this.f12811b.f22149b.size() > 0) {
                        int i7 = (this.f12811b.f22149b.get(0).f22148b + this.f12811b.f22141a) - (this.f12808a.f22149b.get(0).f22148b + this.f12808a.f22141a);
                        cl0 cl03 = this.f12803a;
                        int i8 = cl03.f10315d;
                        if (i7 < i8) {
                            cl03.mo14196e(i7);
                        } else {
                            cl03.mo14196e(i8);
                        }
                    }
                    if (this.f12803a.f22152c && this.f12808a.f22149b.size() > 0 && this.f12811b.f22149b.size() > 0) {
                        wj0 wj04 = this.f12808a.f22149b.get(0);
                        wj0 wj05 = this.f12811b.f22149b.get(0);
                        int i9 = wj04.f22148b + this.f12808a.f22141a;
                        int i10 = wj05.f22148b + this.f12811b.f22141a;
                        float g0 = this.f12807a.mo21703g0();
                        if (wj04 == wj05) {
                            i9 = wj04.f22148b;
                            i10 = wj05.f22148b;
                            g0 = 0.5f;
                        }
                        this.f12808a.mo14196e((int) (((float) i9) + 0.5f + (((float) ((i10 - i9) - this.f12803a.f22148b)) * g0)));
                        this.f12811b.mo14196e(this.f12808a.f22148b + this.f12803a.f22148b);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02e7, code lost:
        if (r9.f12807a.mo21734q0() != false) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0342, code lost:
        if (r0.f12806a == r1) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0374, code lost:
        if (r9.f12807a.mo21734q0() != false) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03eb, code lost:
        if (r0.f12806a == r1) goto L_0x03ed;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13814d() {
        /*
            r9 = this;
            com.onedelhi.secure.o60 r0 = r9.f12807a
            boolean r1 = r0.f17755a
            if (r1 == 0) goto L_0x000f
            com.onedelhi.secure.cl0 r1 = r9.f12803a
            int r0 = r0.mo21619D()
            r1.mo14196e(r0)
        L_0x000f:
            com.onedelhi.secure.cl0 r0 = r9.f12803a
            boolean r0 = r0.f22152c
            if (r0 != 0) goto L_0x0097
            com.onedelhi.secure.o60 r0 = r9.f12807a
            com.onedelhi.secure.o60$b r0 = r0.mo21714j0()
            r9.f12806a = r0
            com.onedelhi.secure.o60 r0 = r9.f12807a
            boolean r0 = r0.mo21734q0()
            if (r0 == 0) goto L_0x002c
            com.onedelhi.secure.xj r0 = new com.onedelhi.secure.xj
            r0.<init>(r9)
            r9.f9963b = r0
        L_0x002c:
            com.onedelhi.secure.o60$b r0 = r9.f12806a
            com.onedelhi.secure.o60$b r1 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r0 == r1) goto L_0x00d1
            com.onedelhi.secure.o60$b r1 = com.onedelhi.secure.o60.C3032b.MATCH_PARENT
            if (r0 != r1) goto L_0x0085
            com.onedelhi.secure.o60 r0 = r9.f12807a
            com.onedelhi.secure.o60 r0 = r0.mo21666U()
            if (r0 == 0) goto L_0x0085
            com.onedelhi.secure.o60$b r1 = r0.mo21714j0()
            com.onedelhi.secure.o60$b r2 = com.onedelhi.secure.o60.C3032b.FIXED
            if (r1 != r2) goto L_0x0085
            int r1 = r0.mo21619D()
            com.onedelhi.secure.o60 r2 = r9.f12807a
            com.onedelhi.secure.m60 r2 = r2.f17765b
            int r2 = r2.mo20112g()
            int r1 = r1 - r2
            com.onedelhi.secure.o60 r2 = r9.f12807a
            com.onedelhi.secure.m60 r2 = r2.f17781d
            int r2 = r2.mo20112g()
            int r1 = r1 - r2
            com.onedelhi.secure.wj0 r2 = r9.f12808a
            com.onedelhi.secure.bt4 r3 = r0.f17746a
            com.onedelhi.secure.wj0 r3 = r3.f12808a
            com.onedelhi.secure.o60 r4 = r9.f12807a
            com.onedelhi.secure.m60 r4 = r4.f17765b
            int r4 = r4.mo20112g()
            r9.mo17005b(r2, r3, r4)
            com.onedelhi.secure.wj0 r2 = r9.f12811b
            com.onedelhi.secure.bt4 r0 = r0.f17746a
            com.onedelhi.secure.wj0 r0 = r0.f12811b
            com.onedelhi.secure.o60 r3 = r9.f12807a
            com.onedelhi.secure.m60 r3 = r3.f17781d
            int r3 = r3.mo20112g()
            int r3 = -r3
            r9.mo17005b(r2, r0, r3)
            com.onedelhi.secure.cl0 r0 = r9.f12803a
            r0.mo14196e(r1)
            return
        L_0x0085:
            com.onedelhi.secure.o60$b r0 = r9.f12806a
            com.onedelhi.secure.o60$b r1 = com.onedelhi.secure.o60.C3032b.FIXED
            if (r0 != r1) goto L_0x00d1
            com.onedelhi.secure.cl0 r0 = r9.f12803a
            com.onedelhi.secure.o60 r1 = r9.f12807a
            int r1 = r1.mo21619D()
            r0.mo14196e(r1)
            goto L_0x00d1
        L_0x0097:
            com.onedelhi.secure.o60$b r0 = r9.f12806a
            com.onedelhi.secure.o60$b r1 = com.onedelhi.secure.o60.C3032b.MATCH_PARENT
            if (r0 != r1) goto L_0x00d1
            com.onedelhi.secure.o60 r0 = r9.f12807a
            com.onedelhi.secure.o60 r0 = r0.mo21666U()
            if (r0 == 0) goto L_0x00d1
            com.onedelhi.secure.o60$b r1 = r0.mo21714j0()
            com.onedelhi.secure.o60$b r2 = com.onedelhi.secure.o60.C3032b.FIXED
            if (r1 != r2) goto L_0x00d1
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            com.onedelhi.secure.bt4 r2 = r0.f17746a
            com.onedelhi.secure.wj0 r2 = r2.f12808a
            com.onedelhi.secure.o60 r3 = r9.f12807a
            com.onedelhi.secure.m60 r3 = r3.f17765b
            int r3 = r3.mo20112g()
            r9.mo17005b(r1, r2, r3)
            com.onedelhi.secure.wj0 r1 = r9.f12811b
            com.onedelhi.secure.bt4 r0 = r0.f17746a
            com.onedelhi.secure.wj0 r0 = r0.f12811b
            com.onedelhi.secure.o60 r2 = r9.f12807a
            com.onedelhi.secure.m60 r2 = r2.f17781d
            int r2 = r2.mo20112g()
            int r2 = -r2
            r9.mo17005b(r1, r0, r2)
            return
        L_0x00d1:
            com.onedelhi.secure.cl0 r0 = r9.f12803a
            boolean r1 = r0.f22152c
            r2 = 0
            r3 = 4
            r4 = 1
            r5 = 2
            r6 = 3
            if (r1 == 0) goto L_0x0239
            com.onedelhi.secure.o60 r7 = r9.f12807a
            boolean r8 = r7.f17755a
            if (r8 == 0) goto L_0x0239
            com.onedelhi.secure.m60[] r0 = r7.f17759a
            r1 = r0[r5]
            com.onedelhi.secure.m60 r1 = r1.f15915a
            if (r1 == 0) goto L_0x016a
            r1 = r0[r6]
            com.onedelhi.secure.m60 r1 = r1.f15915a
            if (r1 == 0) goto L_0x016a
            boolean r0 = r7.mo21620D0()
            if (r0 == 0) goto L_0x0114
            com.onedelhi.secure.wj0 r0 = r9.f12808a
            com.onedelhi.secure.o60 r1 = r9.f12807a
            com.onedelhi.secure.m60[] r1 = r1.f17759a
            r1 = r1[r5]
            int r1 = r1.mo20112g()
            r0.f22141a = r1
            com.onedelhi.secure.wj0 r0 = r9.f12811b
            com.onedelhi.secure.o60 r1 = r9.f12807a
            com.onedelhi.secure.m60[] r1 = r1.f17759a
            r1 = r1[r6]
            int r1 = r1.mo20112g()
            int r1 = -r1
            r0.f22141a = r1
            goto L_0x0153
        L_0x0114:
            com.onedelhi.secure.o60 r0 = r9.f12807a
            com.onedelhi.secure.m60[] r0 = r0.f17759a
            r0 = r0[r5]
            com.onedelhi.secure.wj0 r0 = r9.mo17008h(r0)
            if (r0 == 0) goto L_0x012f
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            com.onedelhi.secure.o60 r2 = r9.f12807a
            com.onedelhi.secure.m60[] r2 = r2.f17759a
            r2 = r2[r5]
            int r2 = r2.mo20112g()
            r9.mo17005b(r1, r0, r2)
        L_0x012f:
            com.onedelhi.secure.o60 r0 = r9.f12807a
            com.onedelhi.secure.m60[] r0 = r0.f17759a
            r0 = r0[r6]
            com.onedelhi.secure.wj0 r0 = r9.mo17008h(r0)
            if (r0 == 0) goto L_0x014b
            com.onedelhi.secure.wj0 r1 = r9.f12811b
            com.onedelhi.secure.o60 r2 = r9.f12807a
            com.onedelhi.secure.m60[] r2 = r2.f17759a
            r2 = r2[r6]
            int r2 = r2.mo20112g()
            int r2 = -r2
            r9.mo17005b(r1, r0, r2)
        L_0x014b:
            com.onedelhi.secure.wj0 r0 = r9.f12808a
            r0.f22147a = r4
            com.onedelhi.secure.wj0 r0 = r9.f12811b
            r0.f22147a = r4
        L_0x0153:
            com.onedelhi.secure.o60 r0 = r9.f12807a
            boolean r0 = r0.mo21734q0()
            if (r0 == 0) goto L_0x0415
        L_0x015b:
            com.onedelhi.secure.wj0 r0 = r9.f9964c
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            com.onedelhi.secure.o60 r2 = r9.f12807a
            int r2 = r2.mo21741t()
        L_0x0165:
            r9.mo17005b(r0, r1, r2)
            goto L_0x0415
        L_0x016a:
            r1 = r0[r5]
            com.onedelhi.secure.m60 r1 = r1.f15915a
            if (r1 == 0) goto L_0x019b
            r0 = r0[r5]
            com.onedelhi.secure.wj0 r0 = r9.mo17008h(r0)
            if (r0 == 0) goto L_0x0415
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            com.onedelhi.secure.o60 r2 = r9.f12807a
            com.onedelhi.secure.m60[] r2 = r2.f17759a
            r2 = r2[r5]
            int r2 = r2.mo20112g()
            r9.mo17005b(r1, r0, r2)
            com.onedelhi.secure.wj0 r0 = r9.f12811b
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            com.onedelhi.secure.cl0 r2 = r9.f12803a
            int r2 = r2.f22148b
            r9.mo17005b(r0, r1, r2)
            com.onedelhi.secure.o60 r0 = r9.f12807a
            boolean r0 = r0.mo21734q0()
            if (r0 == 0) goto L_0x0415
            goto L_0x015b
        L_0x019b:
            r1 = r0[r6]
            com.onedelhi.secure.m60 r1 = r1.f15915a
            if (r1 == 0) goto L_0x01ce
            r0 = r0[r6]
            com.onedelhi.secure.wj0 r0 = r9.mo17008h(r0)
            if (r0 == 0) goto L_0x01c5
            com.onedelhi.secure.wj0 r1 = r9.f12811b
            com.onedelhi.secure.o60 r2 = r9.f12807a
            com.onedelhi.secure.m60[] r2 = r2.f17759a
            r2 = r2[r6]
            int r2 = r2.mo20112g()
            int r2 = -r2
            r9.mo17005b(r1, r0, r2)
            com.onedelhi.secure.wj0 r0 = r9.f12808a
            com.onedelhi.secure.wj0 r1 = r9.f12811b
            com.onedelhi.secure.cl0 r2 = r9.f12803a
            int r2 = r2.f22148b
            int r2 = -r2
            r9.mo17005b(r0, r1, r2)
        L_0x01c5:
            com.onedelhi.secure.o60 r0 = r9.f12807a
            boolean r0 = r0.mo21734q0()
            if (r0 == 0) goto L_0x0415
            goto L_0x015b
        L_0x01ce:
            r1 = r0[r3]
            com.onedelhi.secure.m60 r1 = r1.f15915a
            if (r1 == 0) goto L_0x01f9
            r0 = r0[r3]
            com.onedelhi.secure.wj0 r0 = r9.mo17008h(r0)
            if (r0 == 0) goto L_0x0415
            com.onedelhi.secure.wj0 r1 = r9.f9964c
            r9.mo17005b(r1, r0, r2)
            com.onedelhi.secure.wj0 r0 = r9.f12808a
            com.onedelhi.secure.wj0 r1 = r9.f9964c
            com.onedelhi.secure.o60 r2 = r9.f12807a
            int r2 = r2.mo21741t()
            int r2 = -r2
            r9.mo17005b(r0, r1, r2)
            com.onedelhi.secure.wj0 r0 = r9.f12811b
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            com.onedelhi.secure.cl0 r2 = r9.f12803a
            int r2 = r2.f22148b
            goto L_0x0165
        L_0x01f9:
            boolean r0 = r7 instanceof com.onedelhi.secure.jl1
            if (r0 != 0) goto L_0x0415
            com.onedelhi.secure.o60 r0 = r7.mo21666U()
            if (r0 == 0) goto L_0x0415
            com.onedelhi.secure.o60 r0 = r9.f12807a
            com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.CENTER
            com.onedelhi.secure.m60 r0 = r0.mo21327r(r1)
            com.onedelhi.secure.m60 r0 = r0.f15915a
            if (r0 != 0) goto L_0x0415
            com.onedelhi.secure.o60 r0 = r9.f12807a
            com.onedelhi.secure.o60 r0 = r0.mo21666U()
            com.onedelhi.secure.bt4 r0 = r0.f17746a
            com.onedelhi.secure.wj0 r0 = r0.f12808a
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            com.onedelhi.secure.o60 r2 = r9.f12807a
            int r2 = r2.mo21731p0()
            r9.mo17005b(r1, r0, r2)
            com.onedelhi.secure.wj0 r0 = r9.f12811b
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            com.onedelhi.secure.cl0 r2 = r9.f12803a
            int r2 = r2.f22148b
            r9.mo17005b(r0, r1, r2)
            com.onedelhi.secure.o60 r0 = r9.f12807a
            boolean r0 = r0.mo21734q0()
            if (r0 == 0) goto L_0x0415
            goto L_0x015b
        L_0x0239:
            if (r1 != 0) goto L_0x0288
            com.onedelhi.secure.o60$b r1 = r9.f12806a
            com.onedelhi.secure.o60$b r7 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r1 != r7) goto L_0x0288
            com.onedelhi.secure.o60 r0 = r9.f12807a
            int r1 = r0.f17792g
            if (r1 == r5) goto L_0x025a
            if (r1 == r6) goto L_0x024a
            goto L_0x028b
        L_0x024a:
            boolean r0 = r0.mo21620D0()
            if (r0 != 0) goto L_0x028b
            com.onedelhi.secure.o60 r0 = r9.f12807a
            int r1 = r0.f17788f
            if (r1 != r6) goto L_0x0257
            goto L_0x028b
        L_0x0257:
            com.onedelhi.secure.ul1 r0 = r0.f17750a
            goto L_0x0263
        L_0x025a:
            com.onedelhi.secure.o60 r0 = r0.mo21666U()
            if (r0 != 0) goto L_0x0261
            goto L_0x028b
        L_0x0261:
            com.onedelhi.secure.bt4 r0 = r0.f17746a
        L_0x0263:
            com.onedelhi.secure.cl0 r0 = r0.f12803a
            com.onedelhi.secure.cl0 r1 = r9.f12803a
            java.util.List<com.onedelhi.secure.wj0> r1 = r1.f22149b
            r1.add(r0)
            java.util.List<com.onedelhi.secure.sj0> r0 = r0.f22146a
            com.onedelhi.secure.cl0 r1 = r9.f12803a
            r0.add(r1)
            com.onedelhi.secure.cl0 r0 = r9.f12803a
            r0.f22147a = r4
            java.util.List<com.onedelhi.secure.sj0> r0 = r0.f22146a
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            r0.add(r1)
            com.onedelhi.secure.cl0 r0 = r9.f12803a
            java.util.List<com.onedelhi.secure.sj0> r0 = r0.f22146a
            com.onedelhi.secure.wj0 r1 = r9.f12811b
            r0.add(r1)
            goto L_0x028b
        L_0x0288:
            r0.mo26584b(r9)
        L_0x028b:
            com.onedelhi.secure.o60 r0 = r9.f12807a
            com.onedelhi.secure.m60[] r1 = r0.f17759a
            r7 = r1[r5]
            com.onedelhi.secure.m60 r7 = r7.f15915a
            if (r7 == 0) goto L_0x02f4
            r7 = r1[r6]
            com.onedelhi.secure.m60 r7 = r7.f15915a
            if (r7 == 0) goto L_0x02f4
            boolean r0 = r0.mo21620D0()
            if (r0 == 0) goto L_0x02bf
            com.onedelhi.secure.wj0 r0 = r9.f12808a
            com.onedelhi.secure.o60 r1 = r9.f12807a
            com.onedelhi.secure.m60[] r1 = r1.f17759a
            r1 = r1[r5]
            int r1 = r1.mo20112g()
            r0.f22141a = r1
            com.onedelhi.secure.wj0 r0 = r9.f12811b
            com.onedelhi.secure.o60 r1 = r9.f12807a
            com.onedelhi.secure.m60[] r1 = r1.f17759a
            r1 = r1[r6]
            int r1 = r1.mo20112g()
            int r1 = -r1
            r0.f22141a = r1
            goto L_0x02e1
        L_0x02bf:
            com.onedelhi.secure.o60 r0 = r9.f12807a
            com.onedelhi.secure.m60[] r0 = r0.f17759a
            r0 = r0[r5]
            com.onedelhi.secure.wj0 r0 = r9.mo17008h(r0)
            com.onedelhi.secure.o60 r1 = r9.f12807a
            com.onedelhi.secure.m60[] r1 = r1.f17759a
            r1 = r1[r6]
            com.onedelhi.secure.wj0 r1 = r9.mo17008h(r1)
            if (r0 == 0) goto L_0x02d8
            r0.mo26584b(r9)
        L_0x02d8:
            if (r1 == 0) goto L_0x02dd
            r1.mo26584b(r9)
        L_0x02dd:
            com.onedelhi.secure.gx4$b r0 = com.onedelhi.secure.gx4.C2288b.CENTER
            r9.f12804a = r0
        L_0x02e1:
            com.onedelhi.secure.o60 r0 = r9.f12807a
            boolean r0 = r0.mo21734q0()
            if (r0 == 0) goto L_0x0407
        L_0x02e9:
            com.onedelhi.secure.wj0 r0 = r9.f9964c
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            com.onedelhi.secure.cl0 r2 = r9.f9963b
        L_0x02ef:
            r9.mo17006c(r0, r1, r4, r2)
            goto L_0x0407
        L_0x02f4:
            r7 = r1[r5]
            com.onedelhi.secure.m60 r7 = r7.f15915a
            r8 = 0
            if (r7 == 0) goto L_0x0346
            r0 = r1[r5]
            com.onedelhi.secure.wj0 r0 = r9.mo17008h(r0)
            if (r0 == 0) goto L_0x0407
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            com.onedelhi.secure.o60 r2 = r9.f12807a
            com.onedelhi.secure.m60[] r2 = r2.f17759a
            r2 = r2[r5]
            int r2 = r2.mo20112g()
            r9.mo17005b(r1, r0, r2)
            com.onedelhi.secure.wj0 r0 = r9.f12811b
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            com.onedelhi.secure.cl0 r2 = r9.f12803a
            r9.mo17006c(r0, r1, r4, r2)
            com.onedelhi.secure.o60 r0 = r9.f12807a
            boolean r0 = r0.mo21734q0()
            if (r0 == 0) goto L_0x032c
            com.onedelhi.secure.wj0 r0 = r9.f9964c
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            com.onedelhi.secure.cl0 r2 = r9.f9963b
            r9.mo17006c(r0, r1, r4, r2)
        L_0x032c:
            com.onedelhi.secure.o60$b r0 = r9.f12806a
            com.onedelhi.secure.o60$b r1 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0407
            com.onedelhi.secure.o60 r0 = r9.f12807a
            float r0 = r0.mo21610A()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0407
            com.onedelhi.secure.o60 r0 = r9.f12807a
            com.onedelhi.secure.ul1 r0 = r0.f17750a
            com.onedelhi.secure.o60$b r2 = r0.f12806a
            if (r2 != r1) goto L_0x0407
            goto L_0x03ed
        L_0x0346:
            r5 = r1[r6]
            com.onedelhi.secure.m60 r5 = r5.f15915a
            r7 = -1
            if (r5 == 0) goto L_0x0378
            r0 = r1[r6]
            com.onedelhi.secure.wj0 r0 = r9.mo17008h(r0)
            if (r0 == 0) goto L_0x0407
            com.onedelhi.secure.wj0 r1 = r9.f12811b
            com.onedelhi.secure.o60 r2 = r9.f12807a
            com.onedelhi.secure.m60[] r2 = r2.f17759a
            r2 = r2[r6]
            int r2 = r2.mo20112g()
            int r2 = -r2
            r9.mo17005b(r1, r0, r2)
            com.onedelhi.secure.wj0 r0 = r9.f12808a
            com.onedelhi.secure.wj0 r1 = r9.f12811b
            com.onedelhi.secure.cl0 r2 = r9.f12803a
            r9.mo17006c(r0, r1, r7, r2)
            com.onedelhi.secure.o60 r0 = r9.f12807a
            boolean r0 = r0.mo21734q0()
            if (r0 == 0) goto L_0x0407
            goto L_0x02e9
        L_0x0378:
            r5 = r1[r3]
            com.onedelhi.secure.m60 r5 = r5.f15915a
            if (r5 == 0) goto L_0x039c
            r0 = r1[r3]
            com.onedelhi.secure.wj0 r0 = r9.mo17008h(r0)
            if (r0 == 0) goto L_0x0407
            com.onedelhi.secure.wj0 r1 = r9.f9964c
            r9.mo17005b(r1, r0, r2)
            com.onedelhi.secure.wj0 r0 = r9.f12808a
            com.onedelhi.secure.wj0 r1 = r9.f9964c
            com.onedelhi.secure.cl0 r2 = r9.f9963b
            r9.mo17006c(r0, r1, r7, r2)
            com.onedelhi.secure.wj0 r0 = r9.f12811b
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            com.onedelhi.secure.cl0 r2 = r9.f12803a
            goto L_0x02ef
        L_0x039c:
            boolean r1 = r0 instanceof com.onedelhi.secure.jl1
            if (r1 != 0) goto L_0x0407
            com.onedelhi.secure.o60 r0 = r0.mo21666U()
            if (r0 == 0) goto L_0x0407
            com.onedelhi.secure.o60 r0 = r9.f12807a
            com.onedelhi.secure.o60 r0 = r0.mo21666U()
            com.onedelhi.secure.bt4 r0 = r0.f17746a
            com.onedelhi.secure.wj0 r0 = r0.f12808a
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            com.onedelhi.secure.o60 r2 = r9.f12807a
            int r2 = r2.mo21731p0()
            r9.mo17005b(r1, r0, r2)
            com.onedelhi.secure.wj0 r0 = r9.f12811b
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            com.onedelhi.secure.cl0 r2 = r9.f12803a
            r9.mo17006c(r0, r1, r4, r2)
            com.onedelhi.secure.o60 r0 = r9.f12807a
            boolean r0 = r0.mo21734q0()
            if (r0 == 0) goto L_0x03d5
            com.onedelhi.secure.wj0 r0 = r9.f9964c
            com.onedelhi.secure.wj0 r1 = r9.f12808a
            com.onedelhi.secure.cl0 r2 = r9.f9963b
            r9.mo17006c(r0, r1, r4, r2)
        L_0x03d5:
            com.onedelhi.secure.o60$b r0 = r9.f12806a
            com.onedelhi.secure.o60$b r1 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0407
            com.onedelhi.secure.o60 r0 = r9.f12807a
            float r0 = r0.mo21610A()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0407
            com.onedelhi.secure.o60 r0 = r9.f12807a
            com.onedelhi.secure.ul1 r0 = r0.f17750a
            com.onedelhi.secure.o60$b r2 = r0.f12806a
            if (r2 != r1) goto L_0x0407
        L_0x03ed:
            com.onedelhi.secure.cl0 r0 = r0.f12803a
            java.util.List<com.onedelhi.secure.sj0> r0 = r0.f22146a
            com.onedelhi.secure.cl0 r1 = r9.f12803a
            r0.add(r1)
            com.onedelhi.secure.cl0 r0 = r9.f12803a
            java.util.List<com.onedelhi.secure.wj0> r0 = r0.f22149b
            com.onedelhi.secure.o60 r1 = r9.f12807a
            com.onedelhi.secure.ul1 r1 = r1.f17750a
            com.onedelhi.secure.cl0 r1 = r1.f12803a
            r0.add(r1)
            com.onedelhi.secure.cl0 r0 = r9.f12803a
            r0.f22144a = r9
        L_0x0407:
            com.onedelhi.secure.cl0 r0 = r9.f12803a
            java.util.List<com.onedelhi.secure.wj0> r0 = r0.f22149b
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0415
            com.onedelhi.secure.cl0 r0 = r9.f12803a
            r0.f22150b = r4
        L_0x0415:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bt4.mo13814d():void");
    }

    /* renamed from: e */
    public void mo13815e() {
        wj0 wj0 = this.f12808a;
        if (wj0.f22152c) {
            this.f12807a.mo21705g2(wj0.f22148b);
        }
    }

    /* renamed from: f */
    public void mo13816f() {
        this.f12805a = null;
        this.f12808a.mo26585c();
        this.f12811b.mo26585c();
        this.f9964c.mo26585c();
        this.f12803a.mo26585c();
        this.f12809a = false;
    }

    /* renamed from: n */
    public void mo13817n() {
        this.f12809a = false;
        this.f12808a.mo26585c();
        this.f12808a.f22152c = false;
        this.f12811b.mo26585c();
        this.f12811b.f22152c = false;
        this.f9964c.mo26585c();
        this.f9964c.f22152c = false;
        this.f12803a.f22152c = false;
    }

    /* renamed from: p */
    public boolean mo13818p() {
        return this.f12806a != o60.C3032b.MATCH_CONSTRAINT || this.f12807a.f17792g == 0;
    }

    public String toString() {
        return "VerticalRun " + this.f12807a.mo21756y();
    }
}
