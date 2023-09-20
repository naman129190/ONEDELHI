package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.ek */
public class C2064ek implements h42 {

    /* renamed from: q */
    public static final int f11260q = 0;

    /* renamed from: r */
    public static final int f11261r = 1;

    /* renamed from: s */
    public static final int f11262s = 2;

    /* renamed from: t */
    public static final int f11263t = 3;

    /* renamed from: a */
    public final h42 f11264a;

    /* renamed from: a */
    public Object f11265a = null;

    /* renamed from: n */
    public int f11266n = 0;

    /* renamed from: o */
    public int f11267o = -1;

    /* renamed from: p */
    public int f11268p = -1;

    public C2064ek(@mr2 h42 h42) {
        this.f11264a = h42;
    }

    /* renamed from: a */
    public void mo6146a(int i, int i2, Object obj) {
        int i3;
        if (this.f11266n == 3) {
            int i4 = this.f11267o;
            int i5 = this.f11268p;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f11265a == obj) {
                this.f11267o = Math.min(i, i4);
                this.f11268p = Math.max(i5 + i4, i3) - this.f11267o;
                return;
            }
        }
        mo15216e();
        this.f11267o = i;
        this.f11268p = i2;
        this.f11265a = obj;
        this.f11266n = 3;
    }

    /* renamed from: b */
    public void mo6147b(int i, int i2) {
        int i3;
        if (this.f11266n != 2 || (i3 = this.f11267o) < i || i3 > i + i2) {
            mo15216e();
            this.f11267o = i;
            this.f11268p = i2;
            this.f11266n = 2;
            return;
        }
        this.f11268p += i2;
        this.f11267o = i;
    }

    /* renamed from: c */
    public void mo6148c(int i, int i2) {
        int i3;
        if (this.f11266n == 1 && i >= (i3 = this.f11267o)) {
            int i4 = this.f11268p;
            if (i <= i3 + i4) {
                this.f11268p = i4 + i2;
                this.f11267o = Math.min(i, i3);
                return;
            }
        }
        mo15216e();
        this.f11267o = i;
        this.f11268p = i2;
        this.f11266n = 1;
    }

    /* renamed from: d */
    public void mo6149d(int i, int i2) {
        mo15216e();
        this.f11264a.mo6149d(i, i2);
    }

    /* renamed from: e */
    public void mo15216e() {
        int i = this.f11266n;
        if (i != 0) {
            if (i == 1) {
                this.f11264a.mo6148c(this.f11267o, this.f11268p);
            } else if (i == 2) {
                this.f11264a.mo6147b(this.f11267o, this.f11268p);
            } else if (i == 3) {
                this.f11264a.mo6146a(this.f11267o, this.f11268p, this.f11265a);
            }
            this.f11265a = null;
            this.f11266n = 0;
        }
    }
}
