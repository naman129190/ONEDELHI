package com.onedelhi.secure;

import com.onedelhi.secure.o60;
import java.util.ArrayList;

/* renamed from: com.onedelhi.secure.sv */
public class C3546sv {

    /* renamed from: a */
    public float f20524a = 0.0f;

    /* renamed from: a */
    public int f20525a;

    /* renamed from: a */
    public o60 f20526a;

    /* renamed from: a */
    public ArrayList<o60> f20527a;

    /* renamed from: a */
    public boolean f20528a;

    /* renamed from: b */
    public int f20529b;

    /* renamed from: b */
    public o60 f20530b;

    /* renamed from: b */
    public boolean f20531b;

    /* renamed from: c */
    public int f20532c;

    /* renamed from: c */
    public o60 f20533c;

    /* renamed from: c */
    public boolean f20534c;

    /* renamed from: d */
    public int f20535d;

    /* renamed from: d */
    public o60 f20536d;

    /* renamed from: d */
    public boolean f20537d;

    /* renamed from: e */
    public int f20538e;

    /* renamed from: e */
    public o60 f20539e;

    /* renamed from: e */
    public boolean f20540e;

    /* renamed from: f */
    public int f20541f;

    /* renamed from: f */
    public o60 f20542f;

    /* renamed from: f */
    public boolean f20543f;

    /* renamed from: g */
    public o60 f20544g;

    /* renamed from: g */
    public boolean f20545g;

    public C3546sv(o60 o60, int i, boolean z) {
        this.f20526a = o60;
        this.f20541f = i;
        this.f20531b = z;
    }

    /* renamed from: k */
    public static boolean m27856k(o60 o60, int i) {
        if (o60.mo21720l0() != 8 && o60.f17760a[i] == o60.C3032b.MATCH_CONSTRAINT) {
            int[] iArr = o60.f17757a;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo24562a() {
        if (!this.f20545g) {
            mo24563b();
        }
        this.f20545g = true;
    }

    /* renamed from: b */
    public final void mo24563b() {
        int i = this.f20541f * 2;
        o60 o60 = this.f20526a;
        boolean z = true;
        this.f20528a = true;
        o60 o602 = o60;
        boolean z2 = false;
        while (!z2) {
            this.f20525a++;
            o60[] o60Arr = o60.f17771b;
            int i2 = this.f20541f;
            o60 o603 = null;
            o60Arr[i2] = null;
            o60.f17761a[i2] = null;
            if (o60.mo21720l0() != 8) {
                this.f20532c++;
                o60.C3032b z3 = o60.mo21759z(this.f20541f);
                o60.C3032b bVar = o60.C3032b.MATCH_CONSTRAINT;
                if (z3 != bVar) {
                    this.f20535d += o60.mo21644M(this.f20541f);
                }
                int g = this.f20535d + o60.f17759a[i].mo20112g();
                this.f20535d = g;
                int i3 = i + 1;
                this.f20535d = g + o60.f17759a[i3].mo20112g();
                int g2 = this.f20538e + o60.f17759a[i].mo20112g();
                this.f20538e = g2;
                this.f20538e = g2 + o60.f17759a[i3].mo20112g();
                if (this.f20530b == null) {
                    this.f20530b = o60;
                }
                this.f20536d = o60;
                o60.C3032b[] bVarArr = o60.f17760a;
                int i4 = this.f20541f;
                if (bVarArr[i4] == bVar) {
                    int[] iArr = o60.f17757a;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f20529b++;
                        float[] fArr = o60.f17756a;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.f20524a += fArr[i4];
                        }
                        if (m27856k(o60, i4)) {
                            if (f < 0.0f) {
                                this.f20534c = true;
                            } else {
                                this.f20537d = true;
                            }
                            if (this.f20527a == null) {
                                this.f20527a = new ArrayList<>();
                            }
                            this.f20527a.add(o60);
                        }
                        if (this.f20542f == null) {
                            this.f20542f = o60;
                        }
                        o60 o604 = this.f20544g;
                        if (o604 != null) {
                            o604.f17761a[this.f20541f] = o60;
                        }
                        this.f20544g = o60;
                    }
                    if (this.f20541f != 0 ? !(o60.f17792g == 0 && o60.f17800j == 0 && o60.f17802k == 0) : !(o60.f17788f == 0 && o60.f17795h == 0 && o60.f17798i == 0)) {
                        this.f20528a = false;
                    }
                    if (o60.f17783e != 0.0f) {
                        this.f20528a = false;
                        this.f20543f = true;
                    }
                }
            }
            if (o602 != o60) {
                o602.f17771b[this.f20541f] = o60;
            }
            m60 m60 = o60.f17759a[i + 1].f15915a;
            if (m60 != null) {
                o60 o605 = m60.f15916a;
                m60[] m60Arr = o605.f17759a;
                if (m60Arr[i].f15915a != null && m60Arr[i].f15915a.f15916a == o60) {
                    o603 = o605;
                }
            }
            if (o603 == null) {
                o603 = o60;
                z2 = true;
            }
            o602 = o60;
            o60 = o603;
        }
        o60 o606 = this.f20530b;
        if (o606 != null) {
            this.f20535d -= o606.f17759a[i].mo20112g();
        }
        o60 o607 = this.f20536d;
        if (o607 != null) {
            this.f20535d -= o607.f17759a[i + 1].mo20112g();
        }
        this.f20533c = o60;
        if (this.f20541f != 0 || !this.f20531b) {
            this.f20539e = this.f20526a;
        } else {
            this.f20539e = o60;
        }
        if (!this.f20537d || !this.f20534c) {
            z = false;
        }
        this.f20540e = z;
    }

    /* renamed from: c */
    public o60 mo24564c() {
        return this.f20526a;
    }

    /* renamed from: d */
    public o60 mo24565d() {
        return this.f20542f;
    }

    /* renamed from: e */
    public o60 mo24566e() {
        return this.f20530b;
    }

    /* renamed from: f */
    public o60 mo24567f() {
        return this.f20539e;
    }

    /* renamed from: g */
    public o60 mo24568g() {
        return this.f20533c;
    }

    /* renamed from: h */
    public o60 mo24569h() {
        return this.f20544g;
    }

    /* renamed from: i */
    public o60 mo24570i() {
        return this.f20536d;
    }

    /* renamed from: j */
    public float mo24571j() {
        return this.f20524a;
    }
}
