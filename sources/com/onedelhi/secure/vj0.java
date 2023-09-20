package com.onedelhi.secure;

import com.onedelhi.secure.C1788bk;
import com.onedelhi.secure.o60;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class vj0 {

    /* renamed from: c */
    public static final boolean f21820c = true;

    /* renamed from: a */
    public C1788bk.C1789a f21821a = new C1788bk.C1789a();

    /* renamed from: a */
    public C1788bk.C1790b f21822a = null;

    /* renamed from: a */
    public p60 f21823a;

    /* renamed from: a */
    public ArrayList<gx4> f21824a = new ArrayList<>();

    /* renamed from: a */
    public boolean f21825a = true;

    /* renamed from: b */
    public p60 f21826b;

    /* renamed from: b */
    public ArrayList<jo3> f21827b = new ArrayList<>();

    /* renamed from: b */
    public boolean f21828b = true;

    /* renamed from: c */
    public ArrayList<jo3> f21829c = new ArrayList<>();

    public vj0(p60 p60) {
        this.f21823a = p60;
        this.f21826b = p60;
    }

    /* renamed from: a */
    public final void mo26118a(wj0 wj0, int i, int i2, wj0 wj02, ArrayList<jo3> arrayList, jo3 jo3) {
        gx4 gx4 = wj0.f22143a;
        if (gx4.f12805a == null) {
            p60 p60 = this.f21823a;
            if (gx4 != p60.f17750a && gx4 != p60.f17746a) {
                if (jo3 == null) {
                    jo3 = new jo3(gx4, i2);
                    arrayList.add(jo3);
                }
                gx4.f12805a = jo3;
                jo3.mo18524a(gx4);
                for (sj0 next : gx4.f12808a.f22146a) {
                    if (next instanceof wj0) {
                        mo26118a((wj0) next, i, 0, wj02, arrayList, jo3);
                    }
                }
                for (sj0 next2 : gx4.f12811b.f22146a) {
                    if (next2 instanceof wj0) {
                        mo26118a((wj0) next2, i, 1, wj02, arrayList, jo3);
                    }
                }
                if (i == 1 && (gx4 instanceof bt4)) {
                    for (sj0 next3 : ((bt4) gx4).f9964c.f22146a) {
                        if (next3 instanceof wj0) {
                            mo26118a((wj0) next3, i, 2, wj02, arrayList, jo3);
                        }
                    }
                }
                for (wj0 next4 : gx4.f12808a.f22149b) {
                    if (next4 == wj02) {
                        jo3.f14355a = true;
                    }
                    mo26118a(next4, i, 0, wj02, arrayList, jo3);
                }
                for (wj0 next5 : gx4.f12811b.f22149b) {
                    if (next5 == wj02) {
                        jo3.f14355a = true;
                    }
                    mo26118a(next5, i, 1, wj02, arrayList, jo3);
                }
                if (i == 1 && (gx4 instanceof bt4)) {
                    for (wj0 a : ((bt4) gx4).f9964c.f22149b) {
                        mo26118a(a, i, 2, wj02, arrayList, jo3);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01da, code lost:
        r4 = r0.f17760a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0074, code lost:
        if (r2.f17792g == 0) goto L_0x0065;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo26119b(com.onedelhi.secure.p60 r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<com.onedelhi.secure.o60> r1 = r0.f10993b
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0269
            java.lang.Object r2 = r1.next()
            com.onedelhi.secure.o60 r2 = (com.onedelhi.secure.o60) r2
            com.onedelhi.secure.o60$b[] r4 = r2.f17760a
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.mo21720l0()
            r7 = 8
            if (r6 != r7) goto L_0x0027
        L_0x0024:
            r2.f17755a = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.f17744a
            r11 = 1065353216(0x3f800000, float:1.0)
            r7 = 2
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0036
            com.onedelhi.secure.o60$b r6 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.f17788f = r7
        L_0x0036:
            float r6 = r2.f17763b
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            com.onedelhi.secure.o60$b r6 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.f17792g = r7
        L_0x0042:
            float r6 = r2.mo21610A()
            r8 = 0
            r9 = 3
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0077
            com.onedelhi.secure.o60$b r6 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            com.onedelhi.secure.o60$b r8 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r4 == r8) goto L_0x0058
            com.onedelhi.secure.o60$b r8 = com.onedelhi.secure.o60.C3032b.FIXED
            if (r4 != r8) goto L_0x005b
        L_0x0058:
            r2.f17788f = r9
            goto L_0x0077
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            com.onedelhi.secure.o60$b r8 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r5 == r8) goto L_0x0065
            com.onedelhi.secure.o60$b r8 = com.onedelhi.secure.o60.C3032b.FIXED
            if (r5 != r8) goto L_0x0068
        L_0x0065:
            r2.f17792g = r9
            goto L_0x0077
        L_0x0068:
            if (r5 != r6) goto L_0x0077
            if (r4 != r6) goto L_0x0077
            int r6 = r2.f17788f
            if (r6 != 0) goto L_0x0072
            r2.f17788f = r9
        L_0x0072:
            int r6 = r2.f17792g
            if (r6 != 0) goto L_0x0077
            goto L_0x0065
        L_0x0077:
            com.onedelhi.secure.o60$b r6 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008d
            int r8 = r2.f17788f
            if (r8 != r10) goto L_0x008d
            com.onedelhi.secure.m60 r8 = r2.f17748a
            com.onedelhi.secure.m60 r8 = r8.f15915a
            if (r8 == 0) goto L_0x008b
            com.onedelhi.secure.m60 r8 = r2.f17775c
            com.onedelhi.secure.m60 r8 = r8.f15915a
            if (r8 != 0) goto L_0x008d
        L_0x008b:
            com.onedelhi.secure.o60$b r5 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
        L_0x008d:
            r8 = r5
            if (r4 != r6) goto L_0x00a2
            int r5 = r2.f17792g
            if (r5 != r10) goto L_0x00a2
            com.onedelhi.secure.m60 r5 = r2.f17765b
            com.onedelhi.secure.m60 r5 = r5.f15915a
            if (r5 == 0) goto L_0x00a0
            com.onedelhi.secure.m60 r5 = r2.f17781d
            com.onedelhi.secure.m60 r5 = r5.f15915a
            if (r5 != 0) goto L_0x00a2
        L_0x00a0:
            com.onedelhi.secure.o60$b r4 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
        L_0x00a2:
            r12 = r4
            com.onedelhi.secure.ul1 r4 = r2.f17750a
            r4.f12806a = r8
            int r5 = r2.f17788f
            r4.f12802a = r5
            com.onedelhi.secure.bt4 r4 = r2.f17746a
            r4.f12806a = r12
            int r13 = r2.f17792g
            r4.f12802a = r13
            com.onedelhi.secure.o60$b r4 = com.onedelhi.secure.o60.C3032b.MATCH_PARENT
            if (r8 == r4) goto L_0x00bf
            com.onedelhi.secure.o60$b r14 = com.onedelhi.secure.o60.C3032b.FIXED
            if (r8 == r14) goto L_0x00bf
            com.onedelhi.secure.o60$b r14 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r8 != r14) goto L_0x00cb
        L_0x00bf:
            if (r12 == r4) goto L_0x0215
            com.onedelhi.secure.o60$b r14 = com.onedelhi.secure.o60.C3032b.FIXED
            if (r12 == r14) goto L_0x0215
            com.onedelhi.secure.o60$b r14 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cb
            goto L_0x0215
        L_0x00cb:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r8 != r6) goto L_0x014a
            com.onedelhi.secure.o60$b r15 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d7
            com.onedelhi.secure.o60$b r11 = com.onedelhi.secure.o60.C3032b.FIXED
            if (r12 != r11) goto L_0x014a
        L_0x00d7:
            if (r5 != r9) goto L_0x00f8
            if (r12 != r15) goto L_0x00e5
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.mo26135r(r5, r6, r7, r8, r9)
        L_0x00e5:
            int r9 = r2.mo21619D()
            float r3 = (float) r9
            float r4 = r2.f17783e
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
        L_0x00f0:
            com.onedelhi.secure.o60$b r8 = com.onedelhi.secure.o60.C3032b.FIXED
        L_0x00f2:
            r4 = r16
            r5 = r2
            r6 = r8
            goto L_0x024e
        L_0x00f8:
            if (r5 != r10) goto L_0x0110
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.mo26135r(r5, r6, r7, r8, r9)
            com.onedelhi.secure.ul1 r3 = r2.f17750a
            com.onedelhi.secure.cl0 r3 = r3.f12803a
            int r2 = r2.mo21723m0()
        L_0x010c:
            r3.f10315d = r2
            goto L_0x0008
        L_0x0110:
            if (r5 != r7) goto L_0x0133
            com.onedelhi.secure.o60$b[] r11 = r0.f17760a
            r15 = r11[r3]
            com.onedelhi.secure.o60$b r7 = com.onedelhi.secure.o60.C3032b.FIXED
            if (r15 == r7) goto L_0x011e
            r11 = r11[r3]
            if (r11 != r4) goto L_0x014a
        L_0x011e:
            float r3 = r2.f17744a
            int r4 = r17.mo21723m0()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            int r9 = r2.mo21619D()
            r4 = r16
            r5 = r2
            r6 = r7
            r7 = r3
            goto L_0x0147
        L_0x0133:
            com.onedelhi.secure.m60[] r7 = r2.f17759a
            r11 = r7[r3]
            com.onedelhi.secure.m60 r11 = r11.f15915a
            if (r11 == 0) goto L_0x0141
            r7 = r7[r10]
            com.onedelhi.secure.m60 r7 = r7.f15915a
            if (r7 != 0) goto L_0x014a
        L_0x0141:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
        L_0x0147:
            r8 = r12
            goto L_0x024e
        L_0x014a:
            if (r12 != r6) goto L_0x01cc
            com.onedelhi.secure.o60$b r11 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r8 == r11) goto L_0x0154
            com.onedelhi.secure.o60$b r7 = com.onedelhi.secure.o60.C3032b.FIXED
            if (r8 != r7) goto L_0x01cc
        L_0x0154:
            if (r13 != r9) goto L_0x017a
            if (r8 != r11) goto L_0x0162
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.mo26135r(r5, r6, r7, r8, r9)
        L_0x0162:
            int r7 = r2.mo21723m0()
            float r3 = r2.f17783e
            int r4 = r2.mo21613B()
            r5 = -1
            if (r4 != r5) goto L_0x0173
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x0173:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            goto L_0x00f0
        L_0x017a:
            if (r13 != r10) goto L_0x0190
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r8 = r11
            r4.mo26135r(r5, r6, r7, r8, r9)
        L_0x0186:
            com.onedelhi.secure.bt4 r3 = r2.f17746a
            com.onedelhi.secure.cl0 r3 = r3.f12803a
            int r2 = r2.mo21619D()
            goto L_0x010c
        L_0x0190:
            r7 = 2
            if (r13 != r7) goto L_0x01b5
            com.onedelhi.secure.o60$b[] r7 = r0.f17760a
            r9 = r7[r10]
            com.onedelhi.secure.o60$b r11 = com.onedelhi.secure.o60.C3032b.FIXED
            if (r9 == r11) goto L_0x019f
            r7 = r7[r10]
            if (r7 != r4) goto L_0x01cc
        L_0x019f:
            float r3 = r2.f17763b
            int r7 = r2.mo21723m0()
            int r4 = r17.mo21619D()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r9 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r8
            r8 = r11
            goto L_0x024e
        L_0x01b5:
            com.onedelhi.secure.m60[] r4 = r2.f17759a
            r7 = 2
            r15 = r4[r7]
            com.onedelhi.secure.m60 r7 = r15.f15915a
            if (r7 == 0) goto L_0x01c4
            r4 = r4[r9]
            com.onedelhi.secure.m60 r4 = r4.f15915a
            if (r4 != 0) goto L_0x01cc
        L_0x01c4:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            goto L_0x0147
        L_0x01cc:
            if (r8 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x01fe
            if (r13 != r10) goto L_0x01d5
            goto L_0x01fe
        L_0x01d5:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            com.onedelhi.secure.o60$b[] r4 = r0.f17760a
            r3 = r4[r3]
            com.onedelhi.secure.o60$b r8 = com.onedelhi.secure.o60.C3032b.FIXED
            if (r3 != r8) goto L_0x0008
            r3 = r4[r10]
            if (r3 != r8) goto L_0x0008
            float r3 = r2.f17744a
            float r4 = r2.f17763b
            int r5 = r17.mo21723m0()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.mo21619D()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            goto L_0x00f2
        L_0x01fe:
            com.onedelhi.secure.o60$b r8 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.mo26135r(r5, r6, r7, r8, r9)
            com.onedelhi.secure.ul1 r3 = r2.f17750a
            com.onedelhi.secure.cl0 r3 = r3.f12803a
            int r4 = r2.mo21723m0()
            r3.f10315d = r4
            goto L_0x0186
        L_0x0215:
            int r3 = r2.mo21723m0()
            if (r8 != r4) goto L_0x022e
            int r3 = r17.mo21723m0()
            com.onedelhi.secure.m60 r5 = r2.f17748a
            int r5 = r5.f15920b
            int r3 = r3 - r5
            com.onedelhi.secure.m60 r5 = r2.f17775c
            int r5 = r5.f15920b
            int r3 = r3 - r5
            com.onedelhi.secure.o60$b r5 = com.onedelhi.secure.o60.C3032b.FIXED
            r7 = r3
            r6 = r5
            goto L_0x0230
        L_0x022e:
            r7 = r3
            r6 = r8
        L_0x0230:
            int r3 = r2.mo21619D()
            if (r12 != r4) goto L_0x0249
            int r3 = r17.mo21619D()
            com.onedelhi.secure.m60 r4 = r2.f17765b
            int r4 = r4.f15920b
            int r3 = r3 - r4
            com.onedelhi.secure.m60 r4 = r2.f17781d
            int r4 = r4.f15920b
            int r3 = r3 - r4
            com.onedelhi.secure.o60$b r4 = com.onedelhi.secure.o60.C3032b.FIXED
            r9 = r3
            r8 = r4
            goto L_0x024b
        L_0x0249:
            r9 = r3
            r8 = r12
        L_0x024b:
            r4 = r16
            r5 = r2
        L_0x024e:
            r4.mo26135r(r5, r6, r7, r8, r9)
            com.onedelhi.secure.ul1 r3 = r2.f17750a
            com.onedelhi.secure.cl0 r3 = r3.f12803a
            int r4 = r2.mo21723m0()
            r3.mo14196e(r4)
            com.onedelhi.secure.bt4 r3 = r2.f17746a
            com.onedelhi.secure.cl0 r3 = r3.f12803a
            int r4 = r2.mo21619D()
            r3.mo14196e(r4)
            goto L_0x0024
        L_0x0269:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vj0.mo26119b(com.onedelhi.secure.p60):boolean");
    }

    /* renamed from: c */
    public void mo26120c() {
        mo26121d(this.f21824a);
        this.f21829c.clear();
        jo3.f14351g = 0;
        mo26128k(this.f21823a.f17750a, 0, this.f21829c);
        mo26128k(this.f21823a.f17746a, 1, this.f21829c);
        this.f21825a = false;
    }

    /* renamed from: d */
    public void mo26121d(ArrayList<gx4> arrayList) {
        Object ll1;
        arrayList.clear();
        this.f21826b.f17750a.mo13816f();
        this.f21826b.f17746a.mo13816f();
        arrayList.add(this.f21826b.f17750a);
        arrayList.add(this.f21826b.f17746a);
        Iterator<o60> it = this.f21826b.f10993b.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            o60 next = it.next();
            if (next instanceof nj1) {
                ll1 = new oj1(next);
            } else {
                if (next.mo21614B0()) {
                    if (next.f17751a == null) {
                        next.f17751a = new C3746uv(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f17751a);
                } else {
                    arrayList.add(next.f17750a);
                }
                if (next.mo21620D0()) {
                    if (next.f17767b == null) {
                        next.f17767b = new C3746uv(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f17767b);
                } else {
                    arrayList.add(next.f17746a);
                }
                if (next instanceof ml1) {
                    ll1 = new ll1(next);
                }
            }
            arrayList.add(ll1);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<gx4> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo13816f();
        }
        Iterator<gx4> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            gx4 next2 = it3.next();
            if (next2.f12807a != this.f21826b) {
                next2.mo13814d();
            }
        }
    }

    /* renamed from: e */
    public final int mo26122e(p60 p60, int i) {
        int size = this.f21829c.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f21829c.get(i2).mo18525b(p60, i));
        }
        return (int) j;
    }

    /* renamed from: f */
    public void mo26123f(o60.C3032b bVar, o60.C3032b bVar2) {
        if (this.f21825a) {
            mo26120c();
            Iterator<o60> it = this.f21823a.f10993b.iterator();
            boolean z = false;
            while (it.hasNext()) {
                o60 next = it.next();
                boolean[] zArr = next.f17762a;
                zArr[0] = true;
                zArr[1] = true;
                if (next instanceof C2063ej) {
                    z = true;
                }
            }
            if (!z) {
                Iterator<jo3> it2 = this.f21829c.iterator();
                while (it2.hasNext()) {
                    jo3 next2 = it2.next();
                    o60.C3032b bVar3 = o60.C3032b.WRAP_CONTENT;
                    next2.mo18527d(bVar == bVar3, bVar2 == bVar3);
                }
            }
        }
    }

    /* renamed from: g */
    public boolean mo26124g(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f21825a || this.f21828b) {
            Iterator<o60> it = this.f21823a.f10993b.iterator();
            while (it.hasNext()) {
                o60 next = it.next();
                next.mo21733q();
                next.f17755a = false;
                next.f17750a.mo13817n();
                next.f17746a.mo13817n();
            }
            this.f21823a.mo21733q();
            p60 p60 = this.f21823a;
            p60.f17755a = false;
            p60.f17750a.mo13817n();
            this.f21823a.f17746a.mo13817n();
            this.f21828b = false;
        }
        if (mo26119b(this.f21826b)) {
            return false;
        }
        this.f21823a.mo21702f2(0);
        this.f21823a.mo21705g2(0);
        o60.C3032b z5 = this.f21823a.mo21759z(0);
        o60.C3032b z6 = this.f21823a.mo21759z(1);
        if (this.f21825a) {
            mo26120c();
        }
        int o0 = this.f21823a.mo21728o0();
        int p0 = this.f21823a.mo21731p0();
        this.f21823a.f17750a.f12808a.mo14196e(o0);
        this.f21823a.f17746a.f12808a.mo14196e(p0);
        mo26136s();
        o60.C3032b bVar = o60.C3032b.WRAP_CONTENT;
        if (z5 == bVar || z6 == bVar) {
            if (z4) {
                Iterator<gx4> it2 = this.f21824a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().mo13818p()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && z5 == o60.C3032b.WRAP_CONTENT) {
                this.f21823a.mo21621D1(o60.C3032b.FIXED);
                p60 p602 = this.f21823a;
                p602.mo21691c2(mo26122e(p602, 0));
                p60 p603 = this.f21823a;
                p603.f17750a.f12803a.mo14196e(p603.mo21723m0());
            }
            if (z4 && z6 == o60.C3032b.WRAP_CONTENT) {
                this.f21823a.mo21679Y1(o60.C3032b.FIXED);
                p60 p604 = this.f21823a;
                p604.mo21758y1(mo26122e(p604, 1));
                p60 p605 = this.f21823a;
                p605.f17746a.f12803a.mo14196e(p605.mo21619D());
            }
        }
        p60 p606 = this.f21823a;
        o60.C3032b[] bVarArr = p606.f17760a;
        o60.C3032b bVar2 = bVarArr[0];
        o60.C3032b bVar3 = o60.C3032b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == o60.C3032b.MATCH_PARENT) {
            int m0 = p606.mo21723m0() + o0;
            this.f21823a.f17750a.f12811b.mo14196e(m0);
            this.f21823a.f17750a.f12803a.mo14196e(m0 - o0);
            mo26136s();
            p60 p607 = this.f21823a;
            o60.C3032b[] bVarArr2 = p607.f17760a;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == o60.C3032b.MATCH_PARENT) {
                int D = p607.mo21619D() + p0;
                this.f21823a.f17746a.f12811b.mo14196e(D);
                this.f21823a.f17746a.f12803a.mo14196e(D - p0);
            }
            mo26136s();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<gx4> it3 = this.f21824a.iterator();
        while (it3.hasNext()) {
            gx4 next2 = it3.next();
            if (next2.f12807a != this.f21823a || next2.f12809a) {
                next2.mo13815e();
            }
        }
        Iterator<gx4> it4 = this.f21824a.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            gx4 next3 = it4.next();
            if ((z2 || next3.f12807a != this.f21823a) && (!next3.f12808a.f22152c || ((!next3.f12811b.f22152c && !(next3 instanceof oj1)) || (!next3.f12803a.f22152c && !(next3 instanceof C3746uv) && !(next3 instanceof oj1))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.f21823a.mo21621D1(z5);
        this.f21823a.mo21679Y1(z6);
        return z3;
    }

    /* renamed from: h */
    public boolean mo26125h(boolean z) {
        if (this.f21825a) {
            Iterator<o60> it = this.f21823a.f10993b.iterator();
            while (it.hasNext()) {
                o60 next = it.next();
                next.mo21733q();
                next.f17755a = false;
                ul1 ul1 = next.f17750a;
                ul1.f12803a.f22152c = false;
                ul1.f12809a = false;
                ul1.mo13817n();
                bt4 bt4 = next.f17746a;
                bt4.f12803a.f22152c = false;
                bt4.f12809a = false;
                bt4.mo13817n();
            }
            this.f21823a.mo21733q();
            p60 p60 = this.f21823a;
            p60.f17755a = false;
            ul1 ul12 = p60.f17750a;
            ul12.f12803a.f22152c = false;
            ul12.f12809a = false;
            ul12.mo13817n();
            bt4 bt42 = this.f21823a.f17746a;
            bt42.f12803a.f22152c = false;
            bt42.f12809a = false;
            bt42.mo13817n();
            mo26120c();
        }
        if (mo26119b(this.f21826b)) {
            return false;
        }
        this.f21823a.mo21702f2(0);
        this.f21823a.mo21705g2(0);
        this.f21823a.f17750a.f12808a.mo14196e(0);
        this.f21823a.f17746a.f12808a.mo14196e(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013e A[EDGE_INSN: B:78:0x013e->B:64:0x013e ?: BREAK  , SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo26126i(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            com.onedelhi.secure.p60 r1 = r9.f21823a
            r2 = 0
            com.onedelhi.secure.o60$b r1 = r1.mo21759z(r2)
            com.onedelhi.secure.p60 r3 = r9.f21823a
            com.onedelhi.secure.o60$b r3 = r3.mo21759z(r0)
            com.onedelhi.secure.p60 r4 = r9.f21823a
            int r4 = r4.mo21728o0()
            com.onedelhi.secure.p60 r5 = r9.f21823a
            int r5 = r5.mo21731p0()
            if (r10 == 0) goto L_0x0086
            com.onedelhi.secure.o60$b r6 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0086
        L_0x0023:
            java.util.ArrayList<com.onedelhi.secure.gx4> r6 = r9.f21824a
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            com.onedelhi.secure.gx4 r7 = (com.onedelhi.secure.gx4) r7
            int r8 = r7.f12810b
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.mo13818p()
            if (r7 != 0) goto L_0x0029
            r10 = 0
        L_0x0040:
            if (r11 != 0) goto L_0x0063
            if (r10 == 0) goto L_0x0086
            com.onedelhi.secure.o60$b r10 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r1 != r10) goto L_0x0086
            com.onedelhi.secure.p60 r10 = r9.f21823a
            com.onedelhi.secure.o60$b r6 = com.onedelhi.secure.o60.C3032b.FIXED
            r10.mo21621D1(r6)
            com.onedelhi.secure.p60 r10 = r9.f21823a
            int r6 = r9.mo26122e(r10, r2)
            r10.mo21691c2(r6)
            com.onedelhi.secure.p60 r10 = r9.f21823a
            com.onedelhi.secure.ul1 r6 = r10.f17750a
            com.onedelhi.secure.cl0 r6 = r6.f12803a
            int r10 = r10.mo21723m0()
            goto L_0x0083
        L_0x0063:
            if (r10 == 0) goto L_0x0086
            com.onedelhi.secure.o60$b r10 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r3 != r10) goto L_0x0086
            com.onedelhi.secure.p60 r10 = r9.f21823a
            com.onedelhi.secure.o60$b r6 = com.onedelhi.secure.o60.C3032b.FIXED
            r10.mo21679Y1(r6)
            com.onedelhi.secure.p60 r10 = r9.f21823a
            int r6 = r9.mo26122e(r10, r0)
            r10.mo21758y1(r6)
            com.onedelhi.secure.p60 r10 = r9.f21823a
            com.onedelhi.secure.bt4 r6 = r10.f17746a
            com.onedelhi.secure.cl0 r6 = r6.f12803a
            int r10 = r10.mo21619D()
        L_0x0083:
            r6.mo14196e(r10)
        L_0x0086:
            com.onedelhi.secure.p60 r10 = r9.f21823a
            if (r11 != 0) goto L_0x00b1
            com.onedelhi.secure.o60$b[] r5 = r10.f17760a
            r6 = r5[r2]
            com.onedelhi.secure.o60$b r7 = com.onedelhi.secure.o60.C3032b.FIXED
            if (r6 == r7) goto L_0x0098
            r5 = r5[r2]
            com.onedelhi.secure.o60$b r6 = com.onedelhi.secure.o60.C3032b.MATCH_PARENT
            if (r5 != r6) goto L_0x00c0
        L_0x0098:
            int r10 = r10.mo21723m0()
            int r10 = r10 + r4
            com.onedelhi.secure.p60 r5 = r9.f21823a
            com.onedelhi.secure.ul1 r5 = r5.f17750a
            com.onedelhi.secure.wj0 r5 = r5.f12811b
            r5.mo14196e(r10)
            com.onedelhi.secure.p60 r5 = r9.f21823a
            com.onedelhi.secure.ul1 r5 = r5.f17750a
            com.onedelhi.secure.cl0 r5 = r5.f12803a
            int r10 = r10 - r4
            r5.mo14196e(r10)
            goto L_0x00da
        L_0x00b1:
            com.onedelhi.secure.o60$b[] r4 = r10.f17760a
            r6 = r4[r0]
            com.onedelhi.secure.o60$b r7 = com.onedelhi.secure.o60.C3032b.FIXED
            if (r6 == r7) goto L_0x00c2
            r4 = r4[r0]
            com.onedelhi.secure.o60$b r6 = com.onedelhi.secure.o60.C3032b.MATCH_PARENT
            if (r4 != r6) goto L_0x00c0
            goto L_0x00c2
        L_0x00c0:
            r10 = 0
            goto L_0x00db
        L_0x00c2:
            int r10 = r10.mo21619D()
            int r10 = r10 + r5
            com.onedelhi.secure.p60 r4 = r9.f21823a
            com.onedelhi.secure.bt4 r4 = r4.f17746a
            com.onedelhi.secure.wj0 r4 = r4.f12811b
            r4.mo14196e(r10)
            com.onedelhi.secure.p60 r4 = r9.f21823a
            com.onedelhi.secure.bt4 r4 = r4.f17746a
            com.onedelhi.secure.cl0 r4 = r4.f12803a
            int r10 = r10 - r5
            r4.mo14196e(r10)
        L_0x00da:
            r10 = 1
        L_0x00db:
            r9.mo26136s()
            java.util.ArrayList<com.onedelhi.secure.gx4> r4 = r9.f21824a
            java.util.Iterator r4 = r4.iterator()
        L_0x00e4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0104
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.gx4 r5 = (com.onedelhi.secure.gx4) r5
            int r6 = r5.f12810b
            if (r6 == r11) goto L_0x00f5
            goto L_0x00e4
        L_0x00f5:
            com.onedelhi.secure.o60 r6 = r5.f12807a
            com.onedelhi.secure.p60 r7 = r9.f21823a
            if (r6 != r7) goto L_0x0100
            boolean r6 = r5.f12809a
            if (r6 != 0) goto L_0x0100
            goto L_0x00e4
        L_0x0100:
            r5.mo13815e()
            goto L_0x00e4
        L_0x0104:
            java.util.ArrayList<com.onedelhi.secure.gx4> r4 = r9.f21824a
            java.util.Iterator r4 = r4.iterator()
        L_0x010a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013e
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.gx4 r5 = (com.onedelhi.secure.gx4) r5
            int r6 = r5.f12810b
            if (r6 == r11) goto L_0x011b
            goto L_0x010a
        L_0x011b:
            if (r10 != 0) goto L_0x0124
            com.onedelhi.secure.o60 r6 = r5.f12807a
            com.onedelhi.secure.p60 r7 = r9.f21823a
            if (r6 != r7) goto L_0x0124
            goto L_0x010a
        L_0x0124:
            com.onedelhi.secure.wj0 r6 = r5.f12808a
            boolean r6 = r6.f22152c
            if (r6 != 0) goto L_0x012c
        L_0x012a:
            r0 = 0
            goto L_0x013e
        L_0x012c:
            com.onedelhi.secure.wj0 r6 = r5.f12811b
            boolean r6 = r6.f22152c
            if (r6 != 0) goto L_0x0133
            goto L_0x012a
        L_0x0133:
            boolean r6 = r5 instanceof com.onedelhi.secure.C3746uv
            if (r6 != 0) goto L_0x010a
            com.onedelhi.secure.cl0 r5 = r5.f12803a
            boolean r5 = r5.f22152c
            if (r5 != 0) goto L_0x010a
            goto L_0x012a
        L_0x013e:
            com.onedelhi.secure.p60 r10 = r9.f21823a
            r10.mo21621D1(r1)
            com.onedelhi.secure.p60 r10 = r9.f21823a
            r10.mo21679Y1(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vj0.mo26126i(boolean, int):boolean");
    }

    /* renamed from: j */
    public final void mo26127j() {
        Iterator<gx4> it = this.f21824a.iterator();
        String str = "digraph {\n";
        while (it.hasNext()) {
            str = mo26130m(it.next(), str);
        }
        String str2 = str + "\n}\n";
        System.out.println("content:<<\n" + str2 + "\n>>");
    }

    /* renamed from: k */
    public final void mo26128k(gx4 gx4, int i, ArrayList<jo3> arrayList) {
        for (sj0 next : gx4.f12808a.f22146a) {
            if (next instanceof wj0) {
                mo26118a((wj0) next, i, 0, gx4.f12811b, arrayList, (jo3) null);
            } else if (next instanceof gx4) {
                mo26118a(((gx4) next).f12808a, i, 0, gx4.f12811b, arrayList, (jo3) null);
            }
        }
        for (sj0 next2 : gx4.f12811b.f22146a) {
            if (next2 instanceof wj0) {
                mo26118a((wj0) next2, i, 1, gx4.f12808a, arrayList, (jo3) null);
            } else if (next2 instanceof gx4) {
                mo26118a(((gx4) next2).f12811b, i, 1, gx4.f12808a, arrayList, (jo3) null);
            }
        }
        if (i == 1) {
            for (sj0 next3 : ((bt4) gx4).f9964c.f22146a) {
                if (next3 instanceof wj0) {
                    mo26118a((wj0) next3, i, 2, (wj0) null, arrayList, (jo3) null);
                }
            }
        }
    }

    /* renamed from: l */
    public final String mo26129l(C3746uv uvVar, String str) {
        int i = uvVar.f12810b;
        StringBuilder sb = new StringBuilder("subgraph ");
        sb.append("cluster_");
        sb.append(uvVar.f12807a.mo21756y());
        sb.append(i == 0 ? "_h" : "_v");
        sb.append(" {\n");
        Iterator<gx4> it = uvVar.f21529a.iterator();
        String str2 = "";
        while (it.hasNext()) {
            gx4 next = it.next();
            sb.append(next.f12807a.mo21756y());
            sb.append(i == 0 ? "_HORIZONTAL" : "_VERTICAL");
            sb.append(";\n");
            str2 = mo26130m(next, str2);
        }
        sb.append("}\n");
        return str + str2 + sb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e4, code lost:
        if (r1.f22149b.isEmpty() == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e6, code lost:
        r2.append("\n");
        r2.append(r0.mo26586d());
        r2.append(" -> ");
        r0 = r1.mo26586d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0153, code lost:
        if (r1.f22149b.isEmpty() == false) goto L_0x00e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0161  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo26130m(com.onedelhi.secure.gx4 r10, java.lang.String r11) {
        /*
            r9 = this;
            com.onedelhi.secure.wj0 r0 = r10.f12808a
            com.onedelhi.secure.wj0 r1 = r10.f12811b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            boolean r3 = r10 instanceof com.onedelhi.secure.ll1
            if (r3 != 0) goto L_0x002d
            java.util.List<com.onedelhi.secure.sj0> r3 = r0.f22146a
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x002d
            java.util.List<com.onedelhi.secure.sj0> r3 = r1.f22146a
            boolean r3 = r3.isEmpty()
            java.util.List<com.onedelhi.secure.wj0> r4 = r0.f22149b
            boolean r4 = r4.isEmpty()
            r3 = r3 & r4
            if (r3 == 0) goto L_0x002d
            java.util.List<com.onedelhi.secure.wj0> r3 = r1.f22149b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x002d
            return r11
        L_0x002d:
            java.lang.String r3 = r9.mo26137t(r10)
            r2.append(r3)
            boolean r3 = r9.mo26134q(r0, r1)
            java.lang.String r11 = r9.mo26131n(r0, r3, r11)
            java.lang.String r11 = r9.mo26131n(r1, r3, r11)
            boolean r4 = r10 instanceof com.onedelhi.secure.bt4
            if (r4 == 0) goto L_0x004d
            r5 = r10
            com.onedelhi.secure.bt4 r5 = (com.onedelhi.secure.bt4) r5
            com.onedelhi.secure.wj0 r5 = r5.f9964c
            java.lang.String r11 = r9.mo26131n(r5, r3, r11)
        L_0x004d:
            boolean r3 = r10 instanceof com.onedelhi.secure.ul1
            r5 = 0
            java.lang.String r6 = " -> "
            java.lang.String r7 = "\n"
            if (r3 != 0) goto L_0x00f8
            boolean r3 = r10 instanceof com.onedelhi.secure.C3746uv
            if (r3 == 0) goto L_0x0063
            r8 = r10
            com.onedelhi.secure.uv r8 = (com.onedelhi.secure.C3746uv) r8
            int r8 = r8.f12810b
            if (r8 != 0) goto L_0x0063
            goto L_0x00f8
        L_0x0063:
            if (r4 != 0) goto L_0x006f
            if (r3 == 0) goto L_0x0156
            r3 = r10
            com.onedelhi.secure.uv r3 = (com.onedelhi.secure.C3746uv) r3
            int r3 = r3.f12810b
            r4 = 1
            if (r3 != r4) goto L_0x0156
        L_0x006f:
            com.onedelhi.secure.o60 r3 = r10.f12807a
            com.onedelhi.secure.o60$b r3 = r3.mo21714j0()
            com.onedelhi.secure.o60$b r4 = com.onedelhi.secure.o60.C3032b.FIXED
            if (r3 == r4) goto L_0x00ad
            com.onedelhi.secure.o60$b r4 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r3 != r4) goto L_0x007e
            goto L_0x00ad
        L_0x007e:
            com.onedelhi.secure.o60$b r0 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r3 != r0) goto L_0x0156
            com.onedelhi.secure.o60 r0 = r10.f12807a
            float r0 = r0.mo21610A()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0156
            r2.append(r7)
            com.onedelhi.secure.o60 r0 = r10.f12807a
            java.lang.String r0 = r0.mo21756y()
            r2.append(r0)
            java.lang.String r0 = "_VERTICAL -> "
            r2.append(r0)
            com.onedelhi.secure.o60 r0 = r10.f12807a
            java.lang.String r0 = r0.mo21756y()
            r2.append(r0)
            java.lang.String r0 = "_HORIZONTAL;\n"
        L_0x00a8:
            r2.append(r0)
            goto L_0x0156
        L_0x00ad:
            java.util.List<com.onedelhi.secure.wj0> r3 = r0.f22149b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x00d6
            java.util.List<com.onedelhi.secure.wj0> r3 = r1.f22149b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00d6
        L_0x00bd:
            r2.append(r7)
            java.lang.String r1 = r1.mo26586d()
            r2.append(r1)
            r2.append(r6)
            java.lang.String r0 = r0.mo26586d()
        L_0x00ce:
            r2.append(r0)
            r2.append(r7)
            goto L_0x0156
        L_0x00d6:
            java.util.List<com.onedelhi.secure.wj0> r3 = r0.f22149b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0156
            java.util.List<com.onedelhi.secure.wj0> r3 = r1.f22149b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0156
        L_0x00e6:
            r2.append(r7)
            java.lang.String r0 = r0.mo26586d()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r1.mo26586d()
            goto L_0x00ce
        L_0x00f8:
            com.onedelhi.secure.o60 r3 = r10.f12807a
            com.onedelhi.secure.o60$b r3 = r3.mo21630H()
            com.onedelhi.secure.o60$b r4 = com.onedelhi.secure.o60.C3032b.FIXED
            if (r3 == r4) goto L_0x0133
            com.onedelhi.secure.o60$b r4 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r3 != r4) goto L_0x0107
            goto L_0x0133
        L_0x0107:
            com.onedelhi.secure.o60$b r0 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r3 != r0) goto L_0x0156
            com.onedelhi.secure.o60 r0 = r10.f12807a
            float r0 = r0.mo21610A()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0156
            r2.append(r7)
            com.onedelhi.secure.o60 r0 = r10.f12807a
            java.lang.String r0 = r0.mo21756y()
            r2.append(r0)
            java.lang.String r0 = "_HORIZONTAL -> "
            r2.append(r0)
            com.onedelhi.secure.o60 r0 = r10.f12807a
            java.lang.String r0 = r0.mo21756y()
            r2.append(r0)
            java.lang.String r0 = "_VERTICAL;\n"
            goto L_0x00a8
        L_0x0133:
            java.util.List<com.onedelhi.secure.wj0> r3 = r0.f22149b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0145
            java.util.List<com.onedelhi.secure.wj0> r3 = r1.f22149b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0145
            goto L_0x00bd
        L_0x0145:
            java.util.List<com.onedelhi.secure.wj0> r3 = r0.f22149b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0156
            java.util.List<com.onedelhi.secure.wj0> r3 = r1.f22149b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0156
            goto L_0x00e6
        L_0x0156:
            boolean r0 = r10 instanceof com.onedelhi.secure.C3746uv
            if (r0 == 0) goto L_0x0161
            com.onedelhi.secure.uv r10 = (com.onedelhi.secure.C3746uv) r10
            java.lang.String r10 = r9.mo26129l(r10, r11)
            return r10
        L_0x0161:
            java.lang.String r10 = r2.toString()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vj0.mo26130m(com.onedelhi.secure.gx4, java.lang.String):java.lang.String");
    }

    /* renamed from: n */
    public final String mo26131n(wj0 wj0, boolean z, String str) {
        StringBuilder sb = new StringBuilder(str);
        for (wj0 d : wj0.f22149b) {
            String str2 = ("\n" + wj0.mo26586d()) + " -> " + d.mo26586d();
            if (wj0.f22141a > 0 || z || (wj0.f22143a instanceof ll1)) {
                String str3 = str2 + "[";
                if (wj0.f22141a > 0) {
                    str3 = str3 + "label=\"" + wj0.f22141a + "\"";
                    if (z) {
                        str3 = str3 + vf4.f36537c;
                    }
                }
                if (z) {
                    str3 = str3 + " style=dashed ";
                }
                if (wj0.f22143a instanceof ll1) {
                    str3 = str3 + " style=bold,color=gray ";
                }
                str2 = str3 + "]";
            }
            sb.append(str2 + "\n");
        }
        return sb.toString();
    }

    /* renamed from: o */
    public void mo26132o() {
        this.f21825a = true;
    }

    /* renamed from: p */
    public void mo26133p() {
        this.f21828b = true;
    }

    /* renamed from: q */
    public final boolean mo26134q(wj0 wj0, wj0 wj02) {
        int i = 0;
        for (wj0 wj03 : wj0.f22149b) {
            if (wj03 != wj02) {
                i++;
            }
        }
        int i2 = 0;
        for (wj0 wj04 : wj02.f22149b) {
            if (wj04 != wj0) {
                i2++;
            }
        }
        return i > 0 && i2 > 0;
    }

    /* renamed from: r */
    public final void mo26135r(o60 o60, o60.C3032b bVar, int i, o60.C3032b bVar2, int i2) {
        C1788bk.C1789a aVar = this.f21821a;
        aVar.f9865a = bVar;
        aVar.f9868b = bVar2;
        aVar.f9864a = i;
        aVar.f9867b = i2;
        this.f21822a.mo3259a(o60, aVar);
        o60.mo21691c2(this.f21821a.f9870c);
        o60.mo21758y1(this.f21821a.f9871d);
        o60.mo21755x1(this.f21821a.f9866a);
        o60.mo21704g1(this.f21821a.f9872e);
    }

    /* renamed from: s */
    public void mo26136s() {
        cl0 cl0;
        cl0 cl02;
        int m0;
        cl0 cl03;
        int m02;
        Iterator<o60> it = this.f21823a.f10993b.iterator();
        while (it.hasNext()) {
            o60 next = it.next();
            if (!next.f17755a) {
                o60.C3032b[] bVarArr = next.f17760a;
                boolean z = false;
                o60.C3032b bVar = bVarArr[0];
                o60.C3032b bVar2 = bVarArr[1];
                int i = next.f17788f;
                int i2 = next.f17792g;
                o60.C3032b bVar3 = o60.C3032b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == o60.C3032b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == bVar3 || (bVar2 == o60.C3032b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                cl0 cl04 = next.f17750a.f12803a;
                boolean z3 = cl04.f22152c;
                cl0 cl05 = next.f17746a.f12803a;
                boolean z4 = cl05.f22152c;
                if (!z3 || !z4) {
                    if (!z3 || !z) {
                        if (z4 && z2) {
                            mo26135r(next, bVar3, cl04.f22148b, o60.C3032b.FIXED, cl05.f22148b);
                            if (bVar == o60.C3032b.MATCH_CONSTRAINT) {
                                cl03 = next.f17750a.f12803a;
                                m02 = next.mo21723m0();
                            } else {
                                cl02 = next.f17750a.f12803a;
                                m0 = next.mo21723m0();
                                cl02.mo14196e(m0);
                            }
                        }
                        if (next.f17755a && (cl0 = next.f17746a.f9963b) != null) {
                            cl0.mo14196e(next.mo21741t());
                        }
                    } else {
                        mo26135r(next, o60.C3032b.FIXED, cl04.f22148b, bVar3, cl05.f22148b);
                        if (bVar2 == o60.C3032b.MATCH_CONSTRAINT) {
                            cl03 = next.f17746a.f12803a;
                            m02 = next.mo21619D();
                        } else {
                            cl02 = next.f17746a.f12803a;
                            m0 = next.mo21619D();
                            cl02.mo14196e(m0);
                        }
                    }
                    cl03.f10315d = m02;
                    cl0.mo14196e(next.mo21741t());
                } else {
                    o60.C3032b bVar4 = o60.C3032b.FIXED;
                    mo26135r(next, bVar4, cl04.f22148b, bVar4, cl05.f22148b);
                }
                next.f17755a = true;
                cl0.mo14196e(next.mo21741t());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c0  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo26137t(com.onedelhi.secure.gx4 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.onedelhi.secure.bt4
            com.onedelhi.secure.o60 r1 = r10.f12807a
            java.lang.String r1 = r1.mo21756y()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            com.onedelhi.secure.o60 r3 = r10.f12807a
            if (r0 != 0) goto L_0x0016
            com.onedelhi.secure.o60$b r3 = r3.mo21630H()
            goto L_0x001a
        L_0x0016:
            com.onedelhi.secure.o60$b r3 = r3.mo21714j0()
        L_0x001a:
            com.onedelhi.secure.jo3 r4 = r10.f12805a
            if (r0 != 0) goto L_0x0021
            java.lang.String r5 = "_HORIZONTAL"
            goto L_0x0023
        L_0x0021:
            java.lang.String r5 = "_VERTICAL"
        L_0x0023:
            r2.append(r5)
            java.lang.String r5 = " [shape=none, label=<"
            r2.append(r5)
            java.lang.String r5 = "<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">"
            r2.append(r5)
            java.lang.String r5 = "  <TR>"
            r2.append(r5)
            java.lang.String r5 = " BGCOLOR=\"green\""
            java.lang.String r6 = "    <TD "
            r2.append(r6)
            com.onedelhi.secure.wj0 r7 = r10.f12808a
            boolean r7 = r7.f22152c
            if (r0 != 0) goto L_0x004a
            if (r7 == 0) goto L_0x0047
            r2.append(r5)
        L_0x0047:
            java.lang.String r7 = " PORT=\"LEFT\" BORDER=\"1\">L</TD>"
            goto L_0x0051
        L_0x004a:
            if (r7 == 0) goto L_0x004f
            r2.append(r5)
        L_0x004f:
            java.lang.String r7 = " PORT=\"TOP\" BORDER=\"1\">T</TD>"
        L_0x0051:
            r2.append(r7)
            java.lang.String r7 = "    <TD BORDER=\"1\" "
            r2.append(r7)
            com.onedelhi.secure.cl0 r7 = r10.f12803a
            boolean r7 = r7.f22152c
            if (r7 == 0) goto L_0x0068
            com.onedelhi.secure.o60 r8 = r10.f12807a
            boolean r8 = r8.f17755a
            if (r8 != 0) goto L_0x0068
            java.lang.String r7 = " BGCOLOR=\"green\" "
            goto L_0x006c
        L_0x0068:
            if (r7 == 0) goto L_0x0070
            java.lang.String r7 = " BGCOLOR=\"lightgray\" "
        L_0x006c:
            r2.append(r7)
            goto L_0x0079
        L_0x0070:
            com.onedelhi.secure.o60 r7 = r10.f12807a
            boolean r7 = r7.f17755a
            if (r7 == 0) goto L_0x0079
            java.lang.String r7 = " BGCOLOR=\"yellow\" "
            goto L_0x006c
        L_0x0079:
            com.onedelhi.secure.o60$b r7 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r3 != r7) goto L_0x0082
            java.lang.String r3 = "style=\"dashed\""
            r2.append(r3)
        L_0x0082:
            java.lang.String r3 = ">"
            r2.append(r3)
            r2.append(r1)
            if (r4 == 0) goto L_0x00a7
            java.lang.String r1 = " ["
            r2.append(r1)
            int r1 = r4.f14356b
            int r1 = r1 + 1
            r2.append(r1)
            java.lang.String r1 = "/"
            r2.append(r1)
            int r1 = com.onedelhi.secure.jo3.f14351g
            r2.append(r1)
            java.lang.String r1 = "]"
            r2.append(r1)
        L_0x00a7:
            java.lang.String r1 = " </TD>"
            r2.append(r1)
            r2.append(r6)
            if (r0 != 0) goto L_0x00c0
            com.onedelhi.secure.wj0 r10 = r10.f12811b
            boolean r10 = r10.f22152c
            if (r10 == 0) goto L_0x00ba
            r2.append(r5)
        L_0x00ba:
            java.lang.String r10 = " PORT=\"RIGHT\" BORDER=\"1\">R</TD>"
        L_0x00bc:
            r2.append(r10)
            goto L_0x00e0
        L_0x00c0:
            r0 = r10
            com.onedelhi.secure.bt4 r0 = (com.onedelhi.secure.bt4) r0
            com.onedelhi.secure.wj0 r0 = r0.f9964c
            boolean r0 = r0.f22152c
            if (r0 == 0) goto L_0x00cc
            r2.append(r5)
        L_0x00cc:
            java.lang.String r0 = " PORT=\"BASELINE\" BORDER=\"1\">b</TD>"
            r2.append(r0)
            r2.append(r6)
            com.onedelhi.secure.wj0 r10 = r10.f12811b
            boolean r10 = r10.f22152c
            if (r10 == 0) goto L_0x00dd
            r2.append(r5)
        L_0x00dd:
            java.lang.String r10 = " PORT=\"BOTTOM\" BORDER=\"1\">B</TD>"
            goto L_0x00bc
        L_0x00e0:
            java.lang.String r10 = "  </TR></TABLE>"
            r2.append(r10)
            java.lang.String r10 = ">];\n"
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vj0.mo26137t(com.onedelhi.secure.gx4):java.lang.String");
    }

    /* renamed from: u */
    public void mo26138u(C1788bk.C1790b bVar) {
        this.f21822a = bVar;
    }
}
