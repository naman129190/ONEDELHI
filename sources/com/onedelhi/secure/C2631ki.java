package com.onedelhi.secure;

import com.google.auto.value.AutoValue;
import com.onedelhi.secure.C3291qf;

@AutoValue
/* renamed from: com.onedelhi.secure.ki */
public abstract class C2631ki {

    @AutoValue.Builder
    /* renamed from: com.onedelhi.secure.ki$a */
    public static abstract class C2632a {
        /* renamed from: a */
        public abstract C2631ki mo19072a();

        /* renamed from: b */
        public abstract C2632a mo19073b(Iterable<uv0> iterable);

        /* renamed from: c */
        public abstract C2632a mo19074c(@ts2 byte[] bArr);
    }

    /* renamed from: a */
    public static C2632a m19805a() {
        return new C3291qf.C3293b();
    }

    /* renamed from: b */
    public static C2631ki m19806b(Iterable<uv0> iterable) {
        return m19805a().mo19073b(iterable).mo19072a();
    }

    /* renamed from: c */
    public abstract Iterable<uv0> mo19070c();

    @ts2
    /* renamed from: d */
    public abstract byte[] mo19071d();
}
