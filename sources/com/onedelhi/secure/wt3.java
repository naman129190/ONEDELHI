package com.onedelhi.secure;

import com.google.auto.value.AutoValue;
import com.onedelhi.secure.C2516jh;

@AutoValue
public abstract class wt3 {

    @AutoValue.Builder
    /* renamed from: com.onedelhi.secure.wt3$a */
    public static abstract class C3873a {
        /* renamed from: a */
        public abstract wt3 mo18414a();

        /* renamed from: b */
        public abstract C3873a mo18415b(hu0 hu0);

        /* renamed from: c */
        public abstract C3873a mo18416c(qv0<?> qv0);

        /* renamed from: d */
        public <T> C3873a mo26685d(qv0<T> qv0, hu0 hu0, wg4<T, byte[]> wg4) {
            mo18416c(qv0);
            mo18415b(hu0);
            mo18417e(wg4);
            return this;
        }

        /* renamed from: e */
        public abstract C3873a mo18417e(wg4<?, byte[]> wg4);

        /* renamed from: f */
        public abstract C3873a mo18418f(xh4 xh4);

        /* renamed from: g */
        public abstract C3873a mo18419g(String str);
    }

    /* renamed from: a */
    public static C3873a m31084a() {
        return new C2516jh.C2518b();
    }

    /* renamed from: b */
    public abstract hu0 mo18406b();

    /* renamed from: c */
    public abstract qv0<?> mo18407c();

    /* renamed from: d */
    public byte[] mo26684d() {
        return mo18408e().mo26530a(mo18407c().mo23458b());
    }

    /* renamed from: e */
    public abstract wg4<?, byte[]> mo18408e();

    /* renamed from: f */
    public abstract xh4 mo18410f();

    /* renamed from: g */
    public abstract String mo18411g();
}
