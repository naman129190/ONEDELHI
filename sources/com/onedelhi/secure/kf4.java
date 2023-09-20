package com.onedelhi.secure;

import com.google.auto.value.AutoValue;
import com.onedelhi.secure.C6443ph;

@AutoValue
public abstract class kf4 {

    @AutoValue.Builder
    /* renamed from: com.onedelhi.secure.kf4$a */
    public static abstract class C5898a {
        @mr2
        /* renamed from: a */
        public abstract kf4 mo39238a();

        @mr2
        /* renamed from: b */
        public abstract C5898a mo39239b(@mr2 C5899b bVar);

        @mr2
        /* renamed from: c */
        public abstract C5898a mo39240c(@mr2 String str);

        @mr2
        /* renamed from: d */
        public abstract C5898a mo39241d(long j);
    }

    /* renamed from: com.onedelhi.secure.kf4$b */
    public enum C5899b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @mr2
    /* renamed from: a */
    public static C5898a m54387a() {
        return new C6443ph.C6445b().mo39241d(0);
    }

    @ts2
    /* renamed from: b */
    public abstract C5899b mo39234b();

    @ts2
    /* renamed from: c */
    public abstract String mo39235c();

    @mr2
    /* renamed from: d */
    public abstract long mo39236d();

    @mr2
    /* renamed from: e */
    public abstract C5898a mo39237e();
}
