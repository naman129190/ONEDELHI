package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d64 implements wh2 {

    /* renamed from: a */
    public final n63 f27260a;

    /* renamed from: a */
    public final yh2 f27261a;

    /* renamed from: a */
    public final boolean f27262a;

    /* renamed from: a */
    public final int[] f27263a;

    /* renamed from: a */
    public final w11[] f27264a;

    /* renamed from: com.onedelhi.secure.d64$a */
    public static final class C4962a {

        /* renamed from: a */
        public n63 f27265a;

        /* renamed from: a */
        public Object f27266a;

        /* renamed from: a */
        public final List<w11> f27267a;

        /* renamed from: a */
        public boolean f27268a;

        /* renamed from: a */
        public int[] f27269a;

        /* renamed from: b */
        public boolean f27270b;

        public C4962a() {
            this.f27269a = null;
            this.f27267a = new ArrayList();
        }

        public C4962a(int i) {
            this.f27269a = null;
            this.f27267a = new ArrayList(i);
        }

        /* renamed from: a */
        public d64 mo34234a() {
            if (this.f27268a) {
                throw new IllegalStateException("Builder can only build once");
            } else if (this.f27265a != null) {
                this.f27268a = true;
                Collections.sort(this.f27267a);
                return new d64(this.f27265a, this.f27270b, this.f27269a, (w11[]) this.f27267a.toArray(new w11[0]), this.f27266a);
            } else {
                throw new IllegalStateException("Must specify a proto syntax");
            }
        }

        /* renamed from: b */
        public void mo34235b(int[] iArr) {
            this.f27269a = iArr;
        }

        /* renamed from: c */
        public void mo34236c(Object obj) {
            this.f27266a = obj;
        }

        /* renamed from: d */
        public void mo34237d(w11 w11) {
            if (!this.f27268a) {
                this.f27267a.add(w11);
                return;
            }
            throw new IllegalStateException("Builder can only build once");
        }

        /* renamed from: e */
        public void mo34238e(boolean z) {
            this.f27270b = z;
        }

        /* renamed from: f */
        public void mo34239f(n63 n63) {
            this.f27265a = (n63) vs1.m68433e(n63, "syntax");
        }
    }

    public d64(n63 n63, boolean z, int[] iArr, w11[] w11Arr, Object obj) {
        this.f27260a = n63;
        this.f27262a = z;
        this.f27263a = iArr;
        this.f27264a = w11Arr;
        this.f27261a = (yh2) vs1.m68433e(obj, "defaultInstance");
    }

    /* renamed from: f */
    public static C4962a m44779f() {
        return new C4962a();
    }

    /* renamed from: g */
    public static C4962a m44780g(int i) {
        return new C4962a(i);
    }

    /* renamed from: a */
    public boolean mo34229a() {
        return this.f27262a;
    }

    /* renamed from: b */
    public n63 mo34230b() {
        return this.f27260a;
    }

    /* renamed from: c */
    public yh2 mo34231c() {
        return this.f27261a;
    }

    /* renamed from: d */
    public int[] mo34232d() {
        return this.f27263a;
    }

    /* renamed from: e */
    public w11[] mo34233e() {
        return this.f27264a;
    }
}
