package com.onedelhi.secure;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gv1 extends ov1 implements Iterable<ov1> {

    /* renamed from: a */
    public final List<ov1> f29327a;

    public gv1() {
        this.f29327a = new ArrayList();
    }

    public gv1(int i) {
        this.f29327a = new ArrayList(i);
    }

    /* renamed from: C */
    public void mo36892C(ov1 ov1) {
        if (ov1 == null) {
            ov1 = rv1.f34755a;
        }
        this.f29327a.add(ov1);
    }

    /* renamed from: D */
    public void mo36893D(Boolean bool) {
        this.f29327a.add(bool == null ? rv1.f34755a : new vv1(bool));
    }

    /* renamed from: F */
    public void mo36894F(Character ch) {
        this.f29327a.add(ch == null ? rv1.f34755a : new vv1(ch));
    }

    /* renamed from: G */
    public void mo36895G(Number number) {
        this.f29327a.add(number == null ? rv1.f34755a : new vv1(number));
    }

    /* renamed from: I */
    public void mo36896I(String str) {
        this.f29327a.add(str == null ? rv1.f34755a : new vv1(str));
    }

    /* renamed from: J */
    public void mo36897J(gv1 gv1) {
        this.f29327a.addAll(gv1.f29327a);
    }

    /* renamed from: L */
    public boolean mo36898L(ov1 ov1) {
        return this.f29327a.contains(ov1);
    }

    /* renamed from: N */
    public gv1 mo36904b() {
        if (this.f29327a.isEmpty()) {
            return new gv1();
        }
        gv1 gv1 = new gv1(this.f29327a.size());
        for (ov1 b : this.f29327a) {
            gv1.mo36892C(b.mo36904b());
        }
        return gv1;
    }

    /* renamed from: O */
    public ov1 mo36900O(int i) {
        return this.f29327a.get(i);
    }

    /* renamed from: P */
    public ov1 mo36901P(int i) {
        return this.f29327a.remove(i);
    }

    /* renamed from: Q */
    public boolean mo36902Q(ov1 ov1) {
        return this.f29327a.remove(ov1);
    }

    /* renamed from: R */
    public ov1 mo36903R(int i, ov1 ov1) {
        return this.f29327a.set(i, ov1);
    }

    /* renamed from: e */
    public BigDecimal mo36905e() {
        if (this.f29327a.size() == 1) {
            return this.f29327a.get(0).mo36905e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof gv1) && ((gv1) obj).f29327a.equals(this.f29327a));
    }

    /* renamed from: f */
    public BigInteger mo36907f() {
        if (this.f29327a.size() == 1) {
            return this.f29327a.get(0).mo36907f();
        }
        throw new IllegalStateException();
    }

    /* renamed from: g */
    public boolean mo36908g() {
        if (this.f29327a.size() == 1) {
            return this.f29327a.get(0).mo36908g();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f29327a.hashCode();
    }

    /* renamed from: i */
    public byte mo36910i() {
        if (this.f29327a.size() == 1) {
            return this.f29327a.get(0).mo36910i();
        }
        throw new IllegalStateException();
    }

    public boolean isEmpty() {
        return this.f29327a.isEmpty();
    }

    public Iterator<ov1> iterator() {
        return this.f29327a.iterator();
    }

    /* renamed from: j */
    public char mo36913j() {
        if (this.f29327a.size() == 1) {
            return this.f29327a.get(0).mo36913j();
        }
        throw new IllegalStateException();
    }

    /* renamed from: k */
    public double mo36914k() {
        if (this.f29327a.size() == 1) {
            return this.f29327a.get(0).mo36914k();
        }
        throw new IllegalStateException();
    }

    /* renamed from: l */
    public float mo36915l() {
        if (this.f29327a.size() == 1) {
            return this.f29327a.get(0).mo36915l();
        }
        throw new IllegalStateException();
    }

    /* renamed from: n */
    public int mo36916n() {
        if (this.f29327a.size() == 1) {
            return this.f29327a.get(0).mo36916n();
        }
        throw new IllegalStateException();
    }

    public int size() {
        return this.f29327a.size();
    }

    /* renamed from: u */
    public long mo36918u() {
        if (this.f29327a.size() == 1) {
            return this.f29327a.get(0).mo36918u();
        }
        throw new IllegalStateException();
    }

    /* renamed from: v */
    public Number mo36919v() {
        if (this.f29327a.size() == 1) {
            return this.f29327a.get(0).mo36919v();
        }
        throw new IllegalStateException();
    }

    /* renamed from: w */
    public short mo36920w() {
        if (this.f29327a.size() == 1) {
            return this.f29327a.get(0).mo36920w();
        }
        throw new IllegalStateException();
    }

    /* renamed from: x */
    public String mo36921x() {
        if (this.f29327a.size() == 1) {
            return this.f29327a.get(0).mo36921x();
        }
        throw new IllegalStateException();
    }
}
