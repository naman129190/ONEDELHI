package com.onedelhi.secure;

import com.onedelhi.secure.m60;
import com.onedelhi.secure.o60;
import java.util.HashMap;

/* renamed from: com.onedelhi.secure.ej */
public class C2063ej extends ml1 {

    /* renamed from: C */
    public static final boolean f11249C = true;

    /* renamed from: D */
    public static final boolean f11250D = false;

    /* renamed from: q0 */
    public static final int f11251q0 = 0;

    /* renamed from: r0 */
    public static final int f11252r0 = 1;

    /* renamed from: s0 */
    public static final int f11253s0 = 2;

    /* renamed from: t0 */
    public static final int f11254t0 = 3;

    /* renamed from: A */
    public boolean f11255A = true;

    /* renamed from: B */
    public boolean f11256B = false;

    /* renamed from: o0 */
    public int f11257o0 = 0;

    /* renamed from: p0 */
    public int f11258p0 = 0;

    public C2063ej() {
    }

    public C2063ej(String str) {
        mo21715j1(str);
    }

    /* renamed from: G0 */
    public boolean mo15197G0() {
        return this.f11256B;
    }

    /* renamed from: H0 */
    public boolean mo15198H0() {
        return this.f11256B;
    }

    /* renamed from: g */
    public void mo15199g(p32 p32, boolean z) {
        m60[] m60Arr;
        boolean z2;
        v04 v04;
        m60 m60;
        int i;
        int i2;
        int i3;
        v04 v042;
        int i4;
        m60[] m60Arr2 = this.f17759a;
        m60Arr2[0] = this.f17748a;
        m60Arr2[2] = this.f17765b;
        m60Arr2[1] = this.f17775c;
        m60Arr2[3] = this.f17781d;
        int i5 = 0;
        while (true) {
            m60Arr = this.f17759a;
            if (i5 >= m60Arr.length) {
                break;
            }
            m60Arr[i5].f15917a = p32.mo22291u(m60Arr[i5]);
            i5++;
        }
        int i6 = this.f11257o0;
        if (i6 >= 0 && i6 < 4) {
            m60 m602 = m60Arr[i6];
            if (!this.f11256B) {
                mo15201m2();
            }
            if (this.f11256B) {
                this.f11256B = false;
                int i7 = this.f11257o0;
                if (i7 == 0 || i7 == 1) {
                    p32.mo22276f(this.f17748a.f15917a, this.f17816r);
                    v042 = this.f17775c.f15917a;
                    i4 = this.f17816r;
                } else if (i7 == 2 || i7 == 3) {
                    p32.mo22276f(this.f17765b.f15917a, this.f17818s);
                    v042 = this.f17781d.f15917a;
                    i4 = this.f17818s;
                } else {
                    return;
                }
                p32.mo22276f(v042, i4);
                return;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= this.f16180n0) {
                    z2 = false;
                    break;
                }
                o60 o60 = this.f16179c[i8];
                if ((this.f11255A || o60.mo15200h()) && ((((i2 = this.f11257o0) == 0 || i2 == 1) && o60.mo21630H() == o60.C3032b.MATCH_CONSTRAINT && o60.f17748a.f15915a != null && o60.f17775c.f15915a != null) || (((i3 = this.f11257o0) == 2 || i3 == 3) && o60.mo21714j0() == o60.C3032b.MATCH_CONSTRAINT && o60.f17765b.f15915a != null && o60.f17781d.f15915a != null))) {
                    z2 = true;
                } else {
                    i8++;
                }
            }
            z2 = true;
            boolean z3 = this.f17748a.mo20118m() || this.f17775c.mo20118m();
            boolean z4 = this.f17765b.mo20118m() || this.f17781d.mo20118m();
            boolean z5 = !z2 && (((i = this.f11257o0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))));
            int i9 = 5;
            if (!z5) {
                i9 = 4;
            }
            for (int i10 = 0; i10 < this.f16180n0; i10++) {
                o60 o602 = this.f16179c[i10];
                if (this.f11255A || o602.mo15200h()) {
                    v04 u = p32.mo22291u(o602.f17759a[this.f11257o0]);
                    m60[] m60Arr3 = o602.f17759a;
                    int i11 = this.f11257o0;
                    m60Arr3[i11].f15917a = u;
                    int i12 = (m60Arr3[i11].f15915a == null || m60Arr3[i11].f15915a.f15916a != this) ? 0 : m60Arr3[i11].f15920b + 0;
                    if (i11 == 0 || i11 == 2) {
                        p32.mo22280j(m602.f15917a, u, this.f11258p0 - i12, z2);
                    } else {
                        p32.mo22278h(m602.f15917a, u, this.f11258p0 + i12, z2);
                    }
                    p32.mo22275e(m602.f15917a, u, this.f11258p0 + i12, i9);
                }
            }
            int i13 = this.f11257o0;
            if (i13 == 0) {
                p32.mo22275e(this.f17775c.f15917a, this.f17748a.f15917a, 0, 8);
                p32.mo22275e(this.f17748a.f15917a, this.f17749a.f17775c.f15917a, 0, 4);
                v04 = this.f17748a.f15917a;
                m60 = this.f17749a.f17748a;
            } else if (i13 == 1) {
                p32.mo22275e(this.f17748a.f15917a, this.f17775c.f15917a, 0, 8);
                p32.mo22275e(this.f17748a.f15917a, this.f17749a.f17748a.f15917a, 0, 4);
                v04 = this.f17748a.f15917a;
                m60 = this.f17749a.f17775c;
            } else if (i13 == 2) {
                p32.mo22275e(this.f17781d.f15917a, this.f17765b.f15917a, 0, 8);
                p32.mo22275e(this.f17765b.f15917a, this.f17749a.f17781d.f15917a, 0, 4);
                v04 = this.f17765b.f15917a;
                m60 = this.f17749a.f17765b;
            } else if (i13 == 3) {
                p32.mo22275e(this.f17765b.f15917a, this.f17781d.f15917a, 0, 8);
                p32.mo22275e(this.f17765b.f15917a, this.f17749a.f17765b.f15917a, 0, 4);
                v04 = this.f17765b.f15917a;
                m60 = this.f17749a.f17781d;
            } else {
                return;
            }
            p32.mo22275e(v04, m60.f15917a, 0, 0);
        }
    }

    /* renamed from: h */
    public boolean mo15200h() {
        return true;
    }

    /* renamed from: m2 */
    public boolean mo15201m2() {
        int i;
        m60.C2835b bVar;
        m60.C2835b bVar2;
        m60.C2835b bVar3;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f16180n0;
            if (i4 >= i) {
                break;
            }
            o60 o60 = this.f16179c[i4];
            if ((this.f11255A || o60.mo15200h()) && ((((i2 = this.f11257o0) == 0 || i2 == 1) && !o60.mo15197G0()) || (((i3 = this.f11257o0) == 2 || i3 == 3) && !o60.mo15198H0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f16180n0; i6++) {
            o60 o602 = this.f16179c[i6];
            if (this.f11255A || o602.mo15200h()) {
                if (!z2) {
                    int i7 = this.f11257o0;
                    if (i7 == 0) {
                        bVar3 = m60.C2835b.LEFT;
                    } else if (i7 == 1) {
                        bVar3 = m60.C2835b.RIGHT;
                    } else if (i7 == 2) {
                        bVar3 = m60.C2835b.TOP;
                    } else {
                        if (i7 == 3) {
                            bVar3 = m60.C2835b.BOTTOM;
                        }
                        z2 = true;
                    }
                    i5 = o602.mo21327r(bVar3).mo20111f();
                    z2 = true;
                }
                int i8 = this.f11257o0;
                if (i8 == 0) {
                    bVar2 = m60.C2835b.LEFT;
                } else {
                    if (i8 == 1) {
                        bVar = m60.C2835b.RIGHT;
                    } else if (i8 == 2) {
                        bVar2 = m60.C2835b.TOP;
                    } else if (i8 == 3) {
                        bVar = m60.C2835b.BOTTOM;
                    }
                    i5 = Math.max(i5, o602.mo21327r(bVar).mo20111f());
                }
                i5 = Math.min(i5, o602.mo21327r(bVar2).mo20111f());
            }
        }
        int i9 = i5 + this.f11258p0;
        int i10 = this.f11257o0;
        if (i10 == 0 || i10 == 1) {
            mo21735q1(i9, i9);
        } else {
            mo21743t1(i9, i9);
        }
        this.f11256B = true;
        return true;
    }

    /* renamed from: n */
    public void mo15202n(o60 o60, HashMap<o60, o60> hashMap) {
        super.mo15202n(o60, hashMap);
        C2063ej ejVar = (C2063ej) o60;
        this.f11257o0 = ejVar.f11257o0;
        this.f11255A = ejVar.f11255A;
        this.f11258p0 = ejVar.f11258p0;
    }

    @Deprecated
    /* renamed from: n2 */
    public boolean mo15203n2() {
        return this.f11255A;
    }

    /* renamed from: o2 */
    public boolean mo15204o2() {
        return this.f11255A;
    }

    /* renamed from: p2 */
    public int mo15205p2() {
        return this.f11257o0;
    }

    /* renamed from: q2 */
    public int mo15206q2() {
        return this.f11258p0;
    }

    /* renamed from: r2 */
    public int mo15207r2() {
        int i = this.f11257o0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* renamed from: s2 */
    public void mo15208s2() {
        for (int i = 0; i < this.f16180n0; i++) {
            o60 o60 = this.f16179c[i];
            if (this.f11255A || o60.mo15200h()) {
                int i2 = this.f11257o0;
                if (i2 == 0 || i2 == 1) {
                    o60.mo21629G1(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    o60.mo21629G1(1, true);
                }
            }
        }
    }

    /* renamed from: t2 */
    public void mo15209t2(boolean z) {
        this.f11255A = z;
    }

    public String toString() {
        String str = "[Barrier] " + mo21756y() + " {";
        for (int i = 0; i < this.f16180n0; i++) {
            o60 o60 = this.f16179c[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + o60.mo21756y();
        }
        return str + "}";
    }

    /* renamed from: u2 */
    public void mo15211u2(int i) {
        this.f11257o0 = i;
    }

    /* renamed from: v2 */
    public void mo15212v2(int i) {
        this.f11258p0 = i;
    }
}
