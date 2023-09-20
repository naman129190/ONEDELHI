package com.onedelhi.secure;

import java.util.Map;
import java.util.Set;

public final class sv1 extends ov1 {

    /* renamed from: a */
    public final t32<String, ov1> f35200a = new t32<>();

    /* renamed from: C */
    public void mo44555C(String str, ov1 ov1) {
        t32<String, ov1> t32 = this.f35200a;
        if (ov1 == null) {
            ov1 = rv1.f34755a;
        }
        t32.put(str, ov1);
    }

    /* renamed from: D */
    public void mo44556D(String str, Boolean bool) {
        mo44555C(str, bool == null ? rv1.f34755a : new vv1(bool));
    }

    /* renamed from: F */
    public void mo44557F(String str, Character ch) {
        mo44555C(str, ch == null ? rv1.f34755a : new vv1(ch));
    }

    /* renamed from: G */
    public void mo44558G(String str, Number number) {
        mo44555C(str, number == null ? rv1.f34755a : new vv1(number));
    }

    /* renamed from: I */
    public void mo44559I(String str, String str2) {
        mo44555C(str, str2 == null ? rv1.f34755a : new vv1(str2));
    }

    /* renamed from: J */
    public sv1 mo36904b() {
        sv1 sv1 = new sv1();
        for (Map.Entry next : this.f35200a.entrySet()) {
            sv1.mo44555C((String) next.getKey(), ((ov1) next.getValue()).mo36904b());
        }
        return sv1;
    }

    /* renamed from: L */
    public Set<Map.Entry<String, ov1>> mo44561L() {
        return this.f35200a.entrySet();
    }

    /* renamed from: N */
    public ov1 mo44562N(String str) {
        return this.f35200a.get(str);
    }

    /* renamed from: O */
    public gv1 mo44563O(String str) {
        return (gv1) this.f35200a.get(str);
    }

    /* renamed from: P */
    public sv1 mo44564P(String str) {
        return (sv1) this.f35200a.get(str);
    }

    /* renamed from: Q */
    public vv1 mo44565Q(String str) {
        return (vv1) this.f35200a.get(str);
    }

    /* renamed from: R */
    public boolean mo44566R(String str) {
        return this.f35200a.containsKey(str);
    }

    /* renamed from: S */
    public Set<String> mo44567S() {
        return this.f35200a.keySet();
    }

    /* renamed from: T */
    public ov1 mo44568T(String str) {
        return this.f35200a.remove(str);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof sv1) && ((sv1) obj).f35200a.equals(this.f35200a));
    }

    public int hashCode() {
        return this.f35200a.hashCode();
    }

    public int size() {
        return this.f35200a.size();
    }
}
