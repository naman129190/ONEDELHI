package com.onedelhi.secure;

import com.onedelhi.secure.xh0;

public class xw2<T> implements b73<T>, xh0<T> {

    /* renamed from: b */
    public static final b73<Object> f37649b = ww2.f37152a;

    /* renamed from: b */
    public static final xh0.C7255a<Object> f37650b = vw2.f36731a;

    /* renamed from: a */
    public volatile b73<T> f37651a;
    @mj1("this")

    /* renamed from: a */
    public xh0.C7255a<T> f37652a;

    public xw2(xh0.C7255a<T> aVar, b73<T> b73) {
        this.f37652a = aVar;
        this.f37651a = b73;
    }

    /* renamed from: e */
    public static <T> xw2<T> m70894e() {
        return new xw2<>(f37650b, f37649b);
    }

    /* renamed from: f */
    public static /* synthetic */ void m70895f(b73 b73) {
    }

    /* renamed from: g */
    public static /* synthetic */ Object m70896g() {
        return null;
    }

    /* renamed from: h */
    public static /* synthetic */ void m70897h(xh0.C7255a aVar, xh0.C7255a aVar2, b73 b73) {
        aVar.mo35777a(b73);
        aVar2.mo35777a(b73);
    }

    /* renamed from: i */
    public static <T> xw2<T> m70898i(b73<T> b73) {
        return new xw2<>((xh0.C7255a) null, b73);
    }

    /* renamed from: a */
    public void mo47184a(@mr2 xh0.C7255a<T> aVar) {
        b73<T> b73;
        b73<T> b732 = this.f37651a;
        b73<Object> b733 = f37649b;
        if (b732 != b733) {
            aVar.mo35777a(b732);
            return;
        }
        b73<T> b734 = null;
        synchronized (this) {
            b73 = this.f37651a;
            if (b73 != b733) {
                b734 = b73;
            } else {
                this.f37652a = new uw2(this.f37652a, aVar);
            }
        }
        if (b734 != null) {
            aVar.mo35777a(b73);
        }
    }

    public T get() {
        return this.f37651a.get();
    }

    /* renamed from: j */
    public void mo47424j(b73<T> b73) {
        xh0.C7255a<T> aVar;
        if (this.f37651a == f37649b) {
            synchronized (this) {
                aVar = this.f37652a;
                this.f37652a = null;
                this.f37651a = b73;
            }
            aVar.mo35777a(b73);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
