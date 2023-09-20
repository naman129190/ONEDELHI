package com.onedelhi.secure;

public class pz3 implements Comparable<pz3> {

    /* renamed from: n */
    public final int f33850n;

    /* renamed from: o */
    public final int f33851o;

    public pz3(int i, int i2) {
        this.f33850n = i;
        this.f33851o = i2;
    }

    /* renamed from: a */
    public int compareTo(@mr2 pz3 pz3) {
        int i = this.f33851o * this.f33850n;
        int i2 = pz3.f33851o * pz3.f33850n;
        if (i2 < i) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* renamed from: b */
    public boolean mo42985b(pz3 pz3) {
        return this.f33850n <= pz3.f33850n && this.f33851o <= pz3.f33851o;
    }

    /* renamed from: e */
    public pz3 mo42987e() {
        return new pz3(this.f33851o, this.f33850n);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pz3 pz3 = (pz3) obj;
        return this.f33850n == pz3.f33850n && this.f33851o == pz3.f33851o;
    }

    /* renamed from: g */
    public pz3 mo42989g(int i, int i2) {
        return new pz3((this.f33850n * i) / i2, (this.f33851o * i) / i2);
    }

    public int hashCode() {
        return (this.f33850n * 31) + this.f33851o;
    }

    /* renamed from: l */
    public pz3 mo42991l(pz3 pz3) {
        int i = this.f33850n;
        int i2 = pz3.f33851o;
        int i3 = i * i2;
        int i4 = pz3.f33850n;
        int i5 = this.f33851o;
        return i3 <= i4 * i5 ? new pz3(i4, (i5 * i4) / i) : new pz3((i * i2) / i5, i2);
    }

    /* renamed from: q */
    public pz3 mo42992q(pz3 pz3) {
        int i = this.f33850n;
        int i2 = pz3.f33851o;
        int i3 = i * i2;
        int i4 = pz3.f33850n;
        int i5 = this.f33851o;
        return i3 >= i4 * i5 ? new pz3(i4, (i5 * i4) / i) : new pz3((i * i2) / i5, i2);
    }

    public String toString() {
        return this.f33850n + "x" + this.f33851o;
    }
}
