package com.onedelhi.secure;

import com.onedelhi.secure.o60;

public class al0 {

    /* renamed from: b */
    public static final Object f9349b = new Object();

    /* renamed from: c */
    public static final Object f9350c = new Object();

    /* renamed from: d */
    public static final Object f9351d = new Object();

    /* renamed from: e */
    public static final Object f9352e = new Object();

    /* renamed from: f */
    public static final Object f9353f = new Object();

    /* renamed from: g */
    public static final Object f9354g = new Object();

    /* renamed from: a */
    public float f9355a;

    /* renamed from: a */
    public final int f9356a;

    /* renamed from: a */
    public Object f9357a;

    /* renamed from: a */
    public String f9358a;

    /* renamed from: a */
    public boolean f9359a;

    /* renamed from: b */
    public int f9360b;

    /* renamed from: c */
    public int f9361c;

    /* renamed from: d */
    public int f9362d;

    /* renamed from: com.onedelhi.secure.al0$a */
    public enum C1718a {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    public al0() {
        this.f9356a = -2;
        this.f9360b = 0;
        this.f9361c = Integer.MAX_VALUE;
        this.f9355a = 1.0f;
        this.f9362d = 0;
        this.f9358a = null;
        this.f9357a = f9350c;
        this.f9359a = false;
    }

    public al0(Object obj) {
        this.f9356a = -2;
        this.f9360b = 0;
        this.f9361c = Integer.MAX_VALUE;
        this.f9355a = 1.0f;
        this.f9362d = 0;
        this.f9358a = null;
        this.f9359a = false;
        this.f9357a = obj;
    }

    /* renamed from: a */
    public static al0 m11253a(int i) {
        al0 al0 = new al0(f9349b);
        al0.mo13147l(i);
        return al0;
    }

    /* renamed from: b */
    public static al0 m11254b(Object obj) {
        al0 al0 = new al0(f9349b);
        al0.mo13148m(obj);
        return al0;
    }

    /* renamed from: c */
    public static al0 m11255c() {
        return new al0(f9352e);
    }

    /* renamed from: d */
    public static al0 m11256d(Object obj, float f) {
        al0 al0 = new al0(f9353f);
        al0.mo13154s(obj, f);
        return al0;
    }

    /* renamed from: e */
    public static al0 m11257e(String str) {
        al0 al0 = new al0(f9354g);
        al0.mo13155t(str);
        return al0;
    }

    /* renamed from: f */
    public static al0 m11258f() {
        return new al0(f9351d);
    }

    /* renamed from: g */
    public static al0 m11259g(int i) {
        al0 al0 = new al0();
        al0.mo13157v(i);
        return al0;
    }

    /* renamed from: h */
    public static al0 m11260h(Object obj) {
        al0 al0 = new al0();
        al0.mo13158w(obj);
        return al0;
    }

    /* renamed from: i */
    public static al0 m11261i() {
        return new al0(f9350c);
    }

    /* renamed from: j */
    public void mo13145j(z24 z24, o60 o60, int i) {
        o60.C3032b bVar;
        o60.C3032b bVar2;
        String str = this.f9358a;
        if (str != null) {
            o60.mo21726n1(str);
        }
        int i2 = 2;
        if (i == 0) {
            if (this.f9359a) {
                o60.mo21621D1(o60.C3032b.MATCH_CONSTRAINT);
                Object obj = this.f9357a;
                if (obj == f9350c) {
                    i2 = 1;
                } else if (obj != f9353f) {
                    i2 = 0;
                }
                o60.mo21624E1(i2, this.f9360b, this.f9361c, this.f9355a);
                return;
            }
            int i3 = this.f9360b;
            if (i3 > 0) {
                o60.mo21655P1(i3);
            }
            int i4 = this.f9361c;
            if (i4 < Integer.MAX_VALUE) {
                o60.mo21646M1(i4);
            }
            Object obj2 = this.f9357a;
            if (obj2 == f9350c) {
                bVar2 = o60.C3032b.WRAP_CONTENT;
            } else if (obj2 == f9352e) {
                bVar2 = o60.C3032b.MATCH_PARENT;
            } else if (obj2 == null) {
                o60.mo21621D1(o60.C3032b.FIXED);
                o60.mo21691c2(this.f9362d);
                return;
            } else {
                return;
            }
            o60.mo21621D1(bVar2);
        } else if (this.f9359a) {
            o60.mo21679Y1(o60.C3032b.MATCH_CONSTRAINT);
            Object obj3 = this.f9357a;
            if (obj3 == f9350c) {
                i2 = 1;
            } else if (obj3 != f9353f) {
                i2 = 0;
            }
            o60.mo21682Z1(i2, this.f9360b, this.f9361c, this.f9355a);
        } else {
            int i5 = this.f9360b;
            if (i5 > 0) {
                o60.mo21652O1(i5);
            }
            int i6 = this.f9361c;
            if (i6 < Integer.MAX_VALUE) {
                o60.mo21643L1(i6);
            }
            Object obj4 = this.f9357a;
            if (obj4 == f9350c) {
                bVar = o60.C3032b.WRAP_CONTENT;
            } else if (obj4 == f9352e) {
                bVar = o60.C3032b.MATCH_PARENT;
            } else if (obj4 == null) {
                o60.mo21679Y1(o60.C3032b.FIXED);
                o60.mo21758y1(this.f9362d);
                return;
            } else {
                return;
            }
            o60.mo21679Y1(bVar);
        }
    }

    /* renamed from: k */
    public boolean mo13146k(int i) {
        return this.f9357a == null && this.f9362d == i;
    }

    /* renamed from: l */
    public al0 mo13147l(int i) {
        this.f9357a = null;
        this.f9362d = i;
        return this;
    }

    /* renamed from: m */
    public al0 mo13148m(Object obj) {
        this.f9357a = obj;
        if (obj instanceof Integer) {
            this.f9362d = ((Integer) obj).intValue();
            this.f9357a = null;
        }
        return this;
    }

    /* renamed from: n */
    public int mo13149n() {
        return this.f9362d;
    }

    /* renamed from: o */
    public al0 mo13150o(int i) {
        if (this.f9361c >= 0) {
            this.f9361c = i;
        }
        return this;
    }

    /* renamed from: p */
    public al0 mo13151p(Object obj) {
        Object obj2 = f9350c;
        if (obj == obj2 && this.f9359a) {
            this.f9357a = obj2;
            this.f9361c = Integer.MAX_VALUE;
        }
        return this;
    }

    /* renamed from: q */
    public al0 mo13152q(int i) {
        if (i >= 0) {
            this.f9360b = i;
        }
        return this;
    }

    /* renamed from: r */
    public al0 mo13153r(Object obj) {
        if (obj == f9350c) {
            this.f9360b = -2;
        }
        return this;
    }

    /* renamed from: s */
    public al0 mo13154s(Object obj, float f) {
        this.f9355a = f;
        return this;
    }

    /* renamed from: t */
    public al0 mo13155t(String str) {
        this.f9358a = str;
        return this;
    }

    /* renamed from: u */
    public void mo13156u(int i) {
        this.f9359a = false;
        this.f9357a = null;
        this.f9362d = i;
    }

    /* renamed from: v */
    public al0 mo13157v(int i) {
        this.f9359a = true;
        if (i >= 0) {
            this.f9361c = i;
        }
        return this;
    }

    /* renamed from: w */
    public al0 mo13158w(Object obj) {
        this.f9357a = obj;
        this.f9359a = true;
        return this;
    }
}
