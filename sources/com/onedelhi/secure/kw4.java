package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import com.onedelhi.secure.lw4;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class kw4 {

    /* renamed from: d */
    public static final int f15089d = 0;

    /* renamed from: e */
    public static final int f15090e = 1;

    /* renamed from: f */
    public static final int f15091f = 2;

    /* renamed from: a */
    public final int f15092a;

    /* renamed from: a */
    public C2675b f15093a;

    /* renamed from: a */
    public Object f15094a;

    /* renamed from: b */
    public final int f15095b;

    /* renamed from: c */
    public int f15096c;

    /* renamed from: com.onedelhi.secure.kw4$a */
    public class C2674a implements lw4.C2788b {
        public C2674a() {
        }

        /* renamed from: a */
        public void mo19224a(int i) {
            kw4.this.mo19221f(i);
        }

        /* renamed from: b */
        public void mo19225b(int i) {
            kw4.this.mo19220e(i);
        }
    }

    /* renamed from: com.onedelhi.secure.kw4$b */
    public static abstract class C2675b {
        /* renamed from: a */
        public abstract void mo517a(kw4 kw4);
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.kw4$c */
    public @interface C2676c {
    }

    public kw4(int i, int i2, int i3) {
        this.f15092a = i;
        this.f15095b = i2;
        this.f15096c = i3;
    }

    /* renamed from: a */
    public final int mo19216a() {
        return this.f15096c;
    }

    /* renamed from: b */
    public final int mo19217b() {
        return this.f15095b;
    }

    /* renamed from: c */
    public final int mo19218c() {
        return this.f15092a;
    }

    /* renamed from: d */
    public Object mo19219d() {
        if (this.f15094a == null) {
            this.f15094a = lw4.m21026a(this.f15092a, this.f15095b, this.f15096c, new C2674a());
        }
        return this.f15094a;
    }

    /* renamed from: e */
    public void mo19220e(int i) {
    }

    /* renamed from: f */
    public void mo19221f(int i) {
    }

    /* renamed from: g */
    public void mo19222g(C2675b bVar) {
        this.f15093a = bVar;
    }

    /* renamed from: h */
    public final void mo19223h(int i) {
        this.f15096c = i;
        Object d = mo19219d();
        if (d != null) {
            lw4.m21027b(d, i);
        }
        C2675b bVar = this.f15093a;
        if (bVar != null) {
            bVar.mo517a(this);
        }
    }
}
